@tests
Feature: RFM Start page
  As a New Filing member
  I want to access start page of Replace Filing Member(RFM) journey

  @zap_accessibility
  Scenario: 1 - Verify RFM start page and validations
    Given I access RFM start page
    Then I should be on RFM start page
    And The caption must be Replace filing member
    And The Heading should be Replace the filing member for a Pillar 2 top-up taxes account
    And I should see 4 sections on RFM start page
    And I should see the section 1 as Not yet registered to report Pillar 2 top-up taxes
    And I should see the section 2 as Who can replace a filing member
    And I should see the section 3 as Before you start
    And I should see the section 4 as Replace a filing member
    And I should see go back to the service start page for more information link
    And I should see confirmation checkbox
    When I click on Continue button
    Then I should see error message You must select the checkbox to continue on the RFM start Page
    When I click go back to the service start page for more information link
    Then I should navigate to gov uk guidance page3
    When I click the browser back button
    Then I should be on RFM start page
    When I select confirmation checkbox
    And I click on Continue button
    Then I should be on under construction page
    When I select back link
    Then I should be on RFM start page

