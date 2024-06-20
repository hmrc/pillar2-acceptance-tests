@tests
Feature: Repayment Journey
  As a registered and subscribed user
  I should be able to access repayment journey pages

  @batch2
  Scenario: 1 - Verify that Organisation User navigates to repayment journey contact name and email pages
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service
    When I access Repayment contact page
    And I provide Repayment contact as Repayment Contact Name
    Then I should be on Repayment Contact Email Page
    When I provide Repayment contact email as repayment@email.com
    Then I should be on under construction page
    When I select back link
    Then I should be on Repayment Contact Email Page
    When I select back link
    Then I should be on Repayment Contact Page

  @batch2
  Scenario: 2 - Verify that Agent User navigates to repayment journey contact name and email pages
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service
    And I access Agent Repayment contact page
    And I provide Repayment contact as Repayment Contact Name
    Then I should be on Repayment Contact Email Page
    When I provide Repayment contact email as repayment@email.com
    Then I should be on under construction page
    When I select back link
    Then I should be on Repayment Contact Email Page
    When I select back link
    Then I should be on Repayment Contact Page


