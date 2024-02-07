@tests @zap_accessibility
Feature: Eligibility Questions for Pillar 2
  As a MNE user
  I should be navigated to all the Eligibility questions

  Scenario: 1 - User navigates to next eligibility question page by selecting yes option
    Given I am on UPE EQ Page
    And The caption should be Check if the group needs to report
    And The Heading should be Are you registering as the ultimate parent of this group?
    And The Body content should be An ultimate parent is not a subsidiary of any other company and has a controlling interest in one or more other entities.
    When I continue without selecting an option
    Then I should see error message Select yes if you are registering as the ultimate parent of this group on the Eligibility question Page
    When I choose Yes and continue
    Then I should navigate to business EQ page
    And The caption should be Check if the group needs to report
    And The Heading should be Does the group have business operations in the UK?
    And The Body content should be Business operations refer to activities that businesses engage in to increase the value of the enterprise.
    When I choose Yes and continue
    Then I should navigate to Global gross revenue
    And The caption should be Check if the group needs to report
    And The Heading should be Has the group had consolidated annual revenues of €750 million or more in at least 2 of the previous 4 accounting periods?
    And The Body content should be If the group accounting period is not 365 days, you can calculate the threshold by multiplying €750 million by the number of days in your accounting period and dividing it by 365
    When I continue without selecting an option
    Then I should see error message Select yes if the group had consolidated annual revenues of €750 million or more in at least 2 of the previous 4 accounting periods on the Global gross revenue Page
    When I choose Yes and continue
    Then I should navigate to confirmation page
    And The Heading should be You need to register this group to report Pillar 2 top-up taxes
    And The Body content should be You now need to sign in with a Government Gateway user ID associated with the filling member.
    When I continue
    Then I should be on auth-login page

  Scenario: 2 - User navigates to guidance page by selecting No option in eligibility questions
    Given I am on UPE EQ Page
    When I choose No and continue
    Then I should navigate to NFM EQ page
    And The caption should be Check if the group needs to report
    And The Heading should be Are you registering to report Pillar 2 top-up taxes as the nominated filing member for this group?
    And The Body content should be The nominated filing member is responsible for managing the group’s tax returns and keeping business records.
    When I continue without selecting an option
    Then I should see error message Select yes if you are registering as the nominated filing member for this group on the Eligibility question Page
    When I choose No and continue
    Then I should navigate to NFM guidance page
    And The Heading should be Based on your answers, you cannot register this group to report Pillar 2 top-up taxes
    And The Body content should be Only the ultimate parent or nominated filing member for an eligible group can register to report Pillar 2 top-up tax.
    And The Body content should be This group may still need to register.
    When I click Go back to the start page for more information link
    Then I should navigate to gov uk guidance page1
    When I click the browser back button
    Then I should navigate to NFM guidance page
    When I select back link
    Then I should navigate to NFM EQ page
    When I choose Yes and continue
    Then I am on Business activity EQ Page
    When I continue without selecting an option
    Then I should see error message Select yes if the group has business operations in the UK on the Eligibility question Page
    When I choose No and continue
    Then I should navigate to BA guidance page
    And The Heading should be Based on your answers, this group does not need to report Pillar 2 top-up taxes in the UK
    And The Body content should be Pillar 2 top-up taxes may be collected in the UK when you have business operations here.
    And The Body content should be If your group only operates in other jurisdictions, you should check where any liability might apply.
    When I click Go back to the start page for more information link
    Then I should navigate to gov uk guidance page1
    When I click the browser back button
    Then I should navigate to BA guidance page
    When I select back link
    Then I should navigate to business EQ page
    When I choose Yes and continue
    Then I am on Global gross revenue Page
    When I choose No and continue
    Then I should navigate to GGR guidance page
    And The Heading should be Based on your answers, this group does not need to report Pillar 2 top-up taxes
    And The Body content should be Pillar 2 top-up taxes apply to groups that have consolidated global revenues of €750 million or more in at least 2 of the previous 4 accounting periods.
    And The Body content should be You may need to report Pillar 2 top-up taxes if the global turnover meets the €750 million threshold in future accounting periods.
    When I click Go back to the start page for more information link
    Then I should navigate to gov uk guidance page1
    When I click the browser back button
    Then I should navigate to GGR guidance page
    When I select back link
    Then I should navigate to Global gross revenue