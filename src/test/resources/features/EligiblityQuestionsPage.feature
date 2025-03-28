@tests @zap_accessibility
Feature: Eligibility Questions for Pillar 2
  As a MNE user
  I should be navigated to all the Eligibility questions

  @batch1
  Scenario: 1 - User navigates to next eligibility question page by selecting yes option
    Given I clear the cache
    Given I am on UPE EQ Page
    And The caption should be Check if you need to report Pillar 2 Top-up Taxes
    And The Heading should be Are you registering as the group’s Ultimate Parent Entity?
    And The Body content should be An Ultimate Parent Entity is not a subsidiary and controls one or more other entities. In a multi-parent group, only one Ultimate Parent Entity needs to register.
    When I continue without selecting an option
    Then I should see error message Select yes if you are registering as the group’s ultimate parent on the Eligibility question Page
    When I choose Yes and continue
    Then I should navigate to business EQ page
    And The caption should be Check if you need to report Pillar 2 Top-up Taxes
    And The Heading should be Does the group have an entity located in the UK?
    And The Body content should be Pillar 2 Top-up Taxes may be collected if you have an entity located in the UK.
    When I choose Yes and continue
    Then I should navigate to Global gross revenue
    And The caption should be Check if you need to report Pillar 2 Top-up Taxes
    And The Heading should be Does the group have consolidated annual revenues of €750 million or more in at least 2 of the previous 4 accounting periods?
    And The Body content should be If the group’s accounting period is not 365 days, you can calculate the threshold by multiplying €750 million by the number of days in your accounting period and dividing it by 365.
    When I continue without selecting an option
    Then I should see error message Select yes if the group has consolidated annual revenues of €750 million or more in at least 2 of the previous 4 accounting periods on the Global gross revenue Page
    When I choose Yes and continue
    Then I should navigate to confirmation page
    And The Heading should be You need to register this group to report Pillar 2 Top-up Taxes
    And The Body content should be You now need to sign in with a Government Gateway user ID associated with the filing member.
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
    And The caption should be Check if you need to report Pillar 2 Top-up Taxes
    And The Heading should be Are you registering as the group’s nominated filing member?
    And The Body content should be The nominated filing member is responsible for managing the group’s Pillar 2 Top-up Taxes returns and keeping business records.
    When I continue without selecting an option
    Then I should see error message Select yes if you are registering as the group’s nominated filing member on the Eligibility question Page
    When I choose Eligibility No NFM and continue
    Then I should navigate to NFM guidance page
    And The Heading should be Based on your answers, you cannot register this group to report Pillar 2 Top-up Taxes
    And The Body content should be Only the ultimate parent or nominated filing member for an eligible group can register to report Pillar 2 Top-up Taxes.
    And The Body content should be This group may still need to register.
    When I click Find out more about who can use this service link
    Then I should navigate to guidance page
    When I click the browser back button
    Then I should navigate to NFM guidance page
    When I select back link
    Then I should navigate to NFM EQ page
    When I choose Eligibility Yes NFM and continue
    Then I am on Business activity EQ Page
    When I continue without selecting an option
    Then I should see error message Select yes if the group has an entity located in the UK on the Eligibility question Page
    When I choose No and continue
    Then I should navigate to BA guidance page
    And The Heading should be Based on your answers, this group does not need to report Pillar 2 Top-up Taxes in the UK
    And The Body content should be Pillar 2 Top-up Taxes may be collected when you have an entity located in the UK.
    And The Body content should be If your group members are only located outside the UK, you should check where any liability may apply.
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
    And The Heading should be Based on your answers, this group does not need to report Pillar 2 Top-up Taxes
    And The Body content should be Pillar 2 Top-up Taxes apply to groups that have consolidated global revenues of €750 million or more in at least 2 of the previous 4 accounting periods.
    And The Body content should be You may need to report Pillar 2 Top-up Taxes if the global turnover meets the €750 million threshold in future accounting periods.
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
