@tests
Feature: Business activity within UK EQs
  As a MNE user
  I want to answer the Business activity within UK EQ

  Scenario: 1 - User navigates to next eligibility question page
    Given I am on Business activity EQ Page
    And The caption should be Check if your group is liable
    And The Heading should be Does any business in your group have business activity in the UK?
    When I choose Yes and continue
    Then I should navigate to next EQ page

  Scenario: 2 - User navigates to guidance page
    Given I am on Business activity EQ Page
    And The caption should be Check if your group is liable
    And The Body content should be Does any business in your group have business activity in the UK?
    When I choose No and continue
    Then I should navigate to guidance page

  Scenario: 3 - Display an error message, when user continue without selecting an option
    Given I am on Business activity EQ Page
    And The caption should be Check if your group is liable
    And The Body content should be Does any business in your group have business activity in the UK?
    When I continue without selecting an option
    Then I should see error message Select yes if your group has business activities in the UK on the Business activity EQ Page

  Scenario: 4 - User navigates to previous eligibility question
    Given I am on Business activity EQ Page
    And The caption should be Check if your group is liable
    And The Heading should be Does any business in your group have business activity in the UK?
    When I choose Yes and continue
    Then I should navigate to next EQ page
    When I select back link
    Then I should navigate to business EQ page