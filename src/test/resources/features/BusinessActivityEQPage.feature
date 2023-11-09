@tests @zap_accessibility
Feature: Business activity within UK EQs
  As a MNE user
  I want to answer the Business activity within UK EQ

  Scenario: 1 - User navigates to next eligibility question page
    Given I am on Business activity EQ Page
    And The caption should be Check if the group needs to register
    And The Heading should be Does the group have business activities in the UK?
    When I choose Yes and continue
    Then I should navigate to Global gross revenue

  Scenario: 2 - User navigates to guidance page
    Given I am on Business activity EQ Page
    And The caption should be Check if the group needs to register
    And The Heading should be Does the group have business activities in the UK?
    When I choose No and continue
    Then I should navigate to BA guidance page
    And The Heading should be Based on your answers, this group does not need to register for Pillar 2 top-up tax
    And The Body content should be Pillar 2 top-up tax may be collected in the UK when you have business activity here.
    And The Body content should be If your group only operates in other countries, you should check where any liability might apply.
    When I select back link
    Then I should navigate to business EQ page
    When I choose No and continue
    Then I should navigate to BA guidance page
    When I click Go back to the start page for more information link
    Then I should navigate to gov uk guidance page

  Scenario: 3 - Display an error message, when user continue without selecting an option
    Given I clear the cache
    And I am on Business activity EQ Page
    And The caption should be Check if the group needs to register
    And The Heading should be Does the group have business activities in the UK?
    When I continue without selecting an option
    Then I should see error message Select yes if the group has business activities in the UK on the Business activity EQ Page

  Scenario: 4 - User navigates to previous eligibility question
    Given I am on Business activity EQ Page
    And The caption should be Check if the group needs to register
    And The Heading should be Does the group have business activities in the UK?
    When I choose Yes and continue
    Then I should navigate to Global gross revenue
    When I select back link
    Then I should navigate to business EQ page
