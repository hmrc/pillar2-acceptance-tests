@tests @zap_accessibility
Feature: Global gross revenue EQ
  As a MNE user
  I want to answer the Global gross revenue EQ

  Scenario: 1 - Display an error message, when user continue without selecting an option
    Given I am on Global gross revenue Page
    And The caption should be Check if your group is liable
    And The Body content should be Has your group had revenue of more than 750 million euros in 2 of the last 4 accounting periods?
    When I continue without selecting an option
    Then I should see error message Select yes if your group had more than 750 million euros in 2 of the last 4 accounting periods on the Global gross revenue Page

  Scenario: 2 - User navigates to next eligibility question page
    Given I am on Global gross revenue Page
    And The caption should be Check if your group is liable
    And The Heading should be Has your group had revenue of more than 750 million euros in 2 of the last 4 accounting periods?
    When I choose Yes and continue
    Then I should navigate to confirmation page

  Scenario: 3 - User navigates to guidance page
    Given I am on Global gross revenue Page
    And The caption should be Check if your group is liable
    And The Body content should be Has your group had revenue of more than 750 million euros in 2 of the last 4 accounting periods?
    When I choose No and continue
    Then I should navigate to GGR guidance page
    And The Heading should be Based on your answers, you do not need to pay Pillar 2 top-up tax
    And The Body content should be Pillar 2 top-up tax may apply to businesses with revenue of over 750 million euros in 2 of the last 4 accounting periods.
    And The Body content should be You will not be covered by this law if your revenue is lower.
    When I select back link
    Then I should navigate to Global gross revenue
    When I choose No and continue
    Then I should navigate to GGR guidance page
    When I click More about Pillar 2 top-up tax link
    Then I should navigate to gov uk guidance page