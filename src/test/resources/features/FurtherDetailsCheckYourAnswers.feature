@tests @zap_accessibility
Feature: Further Details Check your Answers Page
  As a MNE user
  I would like to change data from change your answers page

  Scenario: 1 - User navigates to check your answer page answering all the questions of Further Details Page
    Given Organisation User logs in as upe with credId FDCheckYourAnswers for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    Then I should navigate to Task list page
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select option No and continue to next
    Then I should navigate to Task list page
    And The Task Add further group details status should be Not started
    When I click Add further group details link
    Then I should navigate to MNE or domestic page
    When I select option In the UK and other countries in further details group status page
    And I click on Continue button
    Then I should navigate to Group accounting period page
    When Accounting Period Start Day is entered as 15
    And Accounting Period Start Month is entered as 1
    And Accounting Period Start Year is entered as 2024
    When Accounting Period End Day is entered as 15
    And Accounting Period End Month is entered as 1
    And Accounting Period End Year is entered as 2025
    And I click on Continue button
    Then I should navigate to FD check your answers page
    And The caption must be Group details
    And The Heading should be Check your answers
    And I should see row 1 key Where does the group operate?
    And I should see row 2 key Group's consolidated accounting period
    And I should see row 3 key Start date
    And I should see row 4 key End date
    And I should see row 1 value In the UK and other countries
    And I should see row 3 value 15 January 2024
    And I should see row 4 value 15 January 2025
    When I select back link
    Then I should navigate to Group accounting period page
    When I click on Continue button
    Then I should be on FD check your answers page
    When I click on Continue button
    Then I should be on Task list page
    And The Task Edit further group details status should be Completed
    When I click Sign out link
    Then I am on feedback survey page
    When Organisation User logs in with credId FDCheckYourAnswers for Pillar2
    And The Task Edit further group details status should be Completed
    When I click Edit further group details link
    Then I should navigate to MNE or domestic page
    And I should see the option In the UK and other countries remain selected
    When I click on Continue button
    Then I should navigate to Group accounting period page
    And I should see date field Start Day is pre-populated with 15
    And I should see date field Start Month is pre-populated with 1
    And I should see date field Start Year is pre-populated with 2024
    And I should see date field End Day is pre-populated with 15
    And I should see date field End Month is pre-populated with 1
    And I should see date field End Year is pre-populated with 2025
    When I click on Continue button
    Then I should navigate to FD check your answers page

  Scenario: 2 - Change all the details from Furthers details check your answers page
    Given Organisation User navigates to FD check your answer page with credId FDCheckYourAnswers
    Then I should be on FD check your answers page
    And The Heading should be Check your answers
    When I click on change hyperlink next to the FD Group Status
    When I select option Only in the UK in further details group status page
    When I click on Continue button
    When I click on Continue button
    Then I should be on FD check your answers page
    And I should see row 1 value Only in the UK
    When I click on change hyperlink next to the Accounting Period
    When Accounting Period Start Day is entered as 5
    And Accounting Period Start Month is entered as 5
    And Accounting Period Start Year is entered as 2025
    When Accounting Period End Day is entered as 5
    And Accounting Period End Month is entered as 6
    And Accounting Period End Year is entered as 2026
    When I click on Continue button
    And I should see row 3 value 5 May 2025
    And I should see row 4 value 5 June 2026
    And I should see row 4 value 5 June 2026