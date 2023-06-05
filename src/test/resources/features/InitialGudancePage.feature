@tests1
Feature: Initial Guidance Page
As an eligible authenticated user
  I should be able to navigate to Links on Task list page.

  Scenario: 1 - User navigates to next page from initial guidance page
    Given I am on Initial Guidance Page
    And The caption should be Business details
    And The Heading should be We need to match the details of this ultimate parent entity to HMRC records
    And The Body content should be We will ask you for several pieces of identifying information about the ultimate parent of this group so that we can best match the ultimate parent to our records.
    When I click Continue button
    Then I should navigate to first question of task 1
    And The Heading should be Under Construction





