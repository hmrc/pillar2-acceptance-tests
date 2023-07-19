@tests @zap_accessibility
Feature: Global gross revenue EQ
  As a MNE user
  I want to answer the Global gross revenue EQ

  Scenario: 1 - User navigates to next eligibility question page
    Given I am on Global gross revenue Page
    And The caption should be Check if the group needs to register
    And The Heading should be Has the group had global revenues of €750 million or more in at least 2 of the previous 4 accounting periods?
    When I choose Yes and continue
    Then I should navigate to confirmation page
    And The Heading should be You need to register this group for Pillar 2 top-up tax
    And The Body content should be You will now need to sign in to HMRC online services to register.
    When I continue
    Then I should be on auth-login page

  Scenario: 2 - User navigates to guidance page
    Given I am on Global gross revenue Page
    And The caption should be Check if the group needs to register
    And The Heading should be Has the group had global revenues of €750 million or more in at least 2 of the previous 4 accounting periods?
    When I choose No and continue
    Then I should navigate to GGR guidance page
    And The Heading should be Based on your answers, this group does not need to register for Pillar 2 top-up tax
    And The Body content should be Pillar 2 top-up tax applies to groups that have global revenues of €750 million or more in at least two of the previous four accounting periods.
    And The Body content should be You may need to register for Pillar 2 top-up tax if the global turnover meets the €750 million threshold in future accounting periods.
    When I select back link
    Then I should navigate to Global gross revenue
    When I choose No and continue
    Then I should navigate to GGR guidance page
    When I click Go back to the start page for more information link
    Then I should navigate to gov uk guidance page

  Scenario: 3 - Display an error message, when user continue without selecting an option
    Given I clear the cache
    Given I am on Global gross revenue Page
    And The caption should be Check if the group needs to register
    And The Heading should be Has the group had global revenues of €750 million or more in at least 2 of the previous 4 accounting periods?
    When I continue without selecting an option
    Then I should see error message Select yes if the group had global revenues of €750 million or more in at least 2 of the previous 4 accounting periods on the Global gross revenue Page
