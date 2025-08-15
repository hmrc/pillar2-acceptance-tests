@tests
Feature: RFM Start page
  As a New Filing member
  I want to access start page of Replace Filing Member(RFM) journey

  @zap_accessibility @batch3
  Scenario: 1 - Verify Individual RFM KB page
    Given I access RFM start page
    Then I should be on RFM start page
    And I click on Continue button
    When Individual User logs in with rfm URL to Pillar2
    Then I should be on Individual RFM KB Page
    When I click sign in to Government Gateway with an organisation account link
    Then I should be on auth-login page
    When I click the browser back button
    Then I should be on Individual RFM KB Page
    When I click Find out more about who can use this service link
    Then I should be on RFM start page
    When I select back link
    Then I should be on Individual RFM KB Page
    When I select back link
    Then I should be on auth-login page

  @zap_accessibility @batch3
  Scenario: 2 - Verify Agent RFM KB page
    Given Agent User logs in with rfm URL to Pillar2
    Then I should be on Agent RFM KB Page
    When I click Find out more about who can use this service link
    Then I should be on RFM start page
    When I select back link
    Then I should be on Agent RFM KB Page
    When I select back link
    Then I should be on auth-login page

  @zap_accessibility @batch3
  Scenario: 3 - Verify Organisation Assistant User RFM KB page
    Given Assistant User logs in with rfm URL to Pillar2
    Then I should be on Assistant User RFM KB Page
    When I click Find out more about who can use this service link
    Then I should be on RFM start page
    When I select back link
    Then I should be on Assistant User RFM KB Page
    When I select back link
    Then I should be on auth-login page

  @zap_accessibility @batch3
  Scenario: 4 - Verify already enrolled Organisation User KB page
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 with rfm URL to Pillar2 service
    Then I should be on Duplicate RFM KB Page
    When I click Find out more about who can use this service link
    Then I should be on RFM start page
    When I select back link
    Then I should be on Duplicate RFM KB Page
    When I select back link
    Then I should be on auth-login page

#    Add groupId to user to match stub
  @zap_accessibility @batch3
  Scenario: 5 - Verify existing FM (with same group id) trying to access RFM journey and getting redirected to KB page
    Given I clear the cache
    Given Organisation User logs in and navigates to RFM start page without Pillar2 enrolment with groupId 879D6270-E9C2-4092-AC91-21C61B69D1E7
    And I click on Continue button
    Then I should be on RFM enter pillar2 id page
    When I provide RFM pillar2 id as XMPLR0123456789
    Then I should be on RFM Existing Member KB Page
    When I select back link
    Then I should be on RFM enter pillar2 id page
    And I click on Continue button
    And I click go to your business tax account link
    When I click the browser back button
    And I click Sign out link