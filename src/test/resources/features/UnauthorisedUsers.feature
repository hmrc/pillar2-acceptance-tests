@test @ZAP
Feature: Unauthorised user should go to You can’t access page

  Scenario: 1 - Individual login
    Given Individual User logs in to register for Pillar2
    Then The Heading should be Sorry, you’re unable to use this service
    And I click sign in with your organisation’s Government Gateway details
    Then the user should be on the new window with heading Authority Wizard

  Scenario: 2 - Organisation assistant login
    Given Assistant User logs in to register for Pillar2
    Then The Heading should be Sorry, you’re unable to use this service
    And I click business tax account (opens in new tab)
    Then the user should be on the new window with heading Sign in to your HMRC business tax account