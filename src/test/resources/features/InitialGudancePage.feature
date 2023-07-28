@tests @zap_accessibility
Feature: Initial Guidance Page
As an eligible authenticated user
  I should be able to navigate to Links on Task list page.

  Scenario: 1 - User navigates to next page from initial guidance page
    Given Organisation User logs in to subscribe for Pillar2
    Then I should be on Task list page
    And The Heading should be Register for Pillar 2 top-up tax
    When I click Add ultimate parent's details link
    Then I should navigate to Initial guidance Page
    And The caption must be Business details
    And The Heading should be We need to match the details of this ultimate parent entity to HMRC records
    And The Body content should be We will ask you for several pieces of identifying information about the ultimate parent of this group so that we can best match the ultimate parent to our records.
    When I click on Continue button
    Then I should navigate to UPE business page
    And The caption must be Business details
    And The Heading should be Is the ultimate parent entity registered in the UK?


  Scenario: 2 - User navigates back to Task List from initial guidance page
    Given Organisation User logs in to subscribe for Pillar2
    Then I should be on Task list page
    And The Heading should be Register for Pillar 2 top-up tax
    When I click Add ultimate parent's details link
    Then I should navigate to Initial guidance Page
    Then The caption must be Business details
    And The Heading should be We need to match the details of this ultimate parent entity to HMRC records
    When I select back link
    Then I should navigate to Task list page
    And The Heading should be Register for Pillar 2 top-up tax



