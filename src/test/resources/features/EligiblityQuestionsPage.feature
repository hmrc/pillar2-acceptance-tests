@tests @zap_accessibility
Feature: Eligibility Questions for Pillar 2
  As a MNE user
  I should be navigated to all the Eligibility questions

  @batch1
  Scenario: 1 - User navigates to next eligibility question page by selecting yes option
    Given I clear the cache
    Given I am on UPE EQ Page
    When I continue without selecting an option
    When I choose Yes and continue
    Then I should navigate to business EQ page
    When I choose Yes and continue
    Then I should navigate to Global gross revenue
    When I continue without selecting an option
    #Then I should see error message Select yes if the group has consolidated annual revenues of €750 million or more in at least 2 of the previous 4 accounting periods on the Global gross revenue Page
    When I choose Yes and continue
    Then I should navigate to confirmation page
    When I click Report Pillar 2 Top-up Taxes link
    Then I should navigate to guidance page
    When I click the browser back button
    Then I should be on confirmation page
    When I continue
    Then I should be on auth-login page

  @batch2
  Scenario: 2 - User navigates to guidance page by selecting No option in eligibility questions
    Given I clear the cache
    Given I am on UPE EQ Page
    When I choose No and continue
    Then I should navigate to NFM EQ page
    When I choose Eligibility No NFM and continue
    Then I should navigate to NFM guidance page
    When I click Find out more about who can use this service link
    Then I should navigate to guidance page
    When I click the browser back button
    Then I should navigate to NFM guidance page
    When I select back link
    Then I should navigate to NFM EQ page
    When I choose Eligibility Yes NFM and continue
    Then I am on Business activity EQ Page
    When I continue without selecting an option
    #Then I should see error message Select yes if the group has an entity located in the UK on the Eligibility question Page
    When I choose No and continue
    Then I should navigate to BA guidance page
    When I click Find out more about who is eligible for Pillar 2 Top-up Taxes link
    Then I should navigate to guidance page
    When I click the browser back button
    Then I should navigate to BA guidance page
    When I select back link
    Then I should navigate to business EQ page
    When I choose Yes and continue
    Then I am on Global gross revenue Page
    When I choose No and continue
    Then I should navigate to GGR guidance page
    When I click Find out more about who is eligible for Pillar 2 Top-up Taxes link
    Then I should navigate to guidance page
    When I click the browser back button
    Then I should navigate to GGR guidance page
    When I select back link
    Then I should navigate to Global gross revenue
    When I click Report Pillar 2 Top-up Taxes link
    Then I should navigate to guidance page

  @e2e
  Scenario: 3 - User navigates to next eligibility question page by selecting yes option
    Given I clear the cache
    Given I am on UPE EQ Page
    When I choose Yes and continue
    Then I should navigate to business EQ page
    When I choose Yes and continue
    Then I should navigate to Global gross revenue
    When I choose Yes and continue
    Then I should navigate to confirmation page
    When I click Report Pillar 2 Top-up Taxes link
    Then I should navigate to guidance page
    When I click the browser back button
    Then I should be on confirmation page
    When I continue
    Then I should be on auth-login page

  @e2e
  Scenario: 4 - User navigates to guidance page by selecting No option in eligibility questions
    Given I clear the cache
    Given I am on UPE EQ Page
    When I choose No and continue
    Then I should navigate to NFM EQ page
    When I choose Eligibility No NFM and continue
    Then I should navigate to NFM guidance page
    When I click Find out more about who can use this service link
    Then I should navigate to guidance page
    When I click the browser back button
    Then I should navigate to NFM guidance page
    When I select back link
    Then I should navigate to NFM EQ page
    When I choose Eligibility Yes NFM and continue
    Then I am on Business activity EQ Page
    When I choose No and continue
    Then I should navigate to BA guidance page
    When I click Find out more about who is eligible for Pillar 2 Top-up Taxes link
    Then I should navigate to guidance page
    When I click the browser back button
    Then I should navigate to BA guidance page
    When I select back link
    Then I should navigate to business EQ page
    When I choose Yes and continue
    Then I am on Global gross revenue Page
    When I choose No and continue
    Then I should navigate to GGR guidance page
    When I click Find out more about who is eligible for Pillar 2 Top-up Taxes link
    Then I should navigate to guidance page
    When I click the browser back button
    Then I should navigate to GGR guidance page
    When I select back link
    Then I should navigate to Global gross revenue
    When I click Report Pillar 2 Top-up Taxes link
    Then I should navigate to guidance page