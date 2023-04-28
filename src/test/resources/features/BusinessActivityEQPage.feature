@wip1
Feature: Business activity within UK EQs
  As a MNE user
  I want to answer the Business activity within UK EQ
  @wip
  Scenario: 1 - User navigates to next eligibility question page
    Given I am on Business activity within UK EQ Page
    And I have the facility to answer the Business activity within UK EQ
    And The Heading should be Check if your group is liable
    And The Body content should be Does any business in your group have business activity in the UK?
    When I select Yes option and continue
    Then I should navigate to next EQ page

  Scenario: 2 - User navigates to guidance page
    Given I am on Business activity within UK EQ Page
    And I have the facility to answer the Business activity within UK EQ
    And The Heading should be Check if your group is liable
    And The Body content should be Does any business in your group have business activity in the UK?
    When I select No and continue
    Then I should navigate to guidance page

  Scenario: 3 - Display an error message, when user continue without selecting an option
    Given I am on Business activity within UK EQ Page
    And I have the facility to answer the Business activity within UK EQ
    And The Heading should be Check if your group is liable
    And The Body content should be Does any business in your group have business activity in the UK?
    When I continue without selecting an option
    Then I should see an error message Select yes if your group has business activites in the UK

  Scenario: 4 - User navigates to previous eligibility question
    Given I am on Business activity within UK EQ Page
    And I have the facility to answer the Business activity within UK EQ
    And The Heading should be Check if your group is liable
    And The Body content should be Does any business in your group have business activity in the UK?
    When I select back link
    Then I should navigate to previous eligibility question page

