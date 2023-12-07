@tests
Feature: Further Details Task page validation
  As a MNE user
  I should be taken to all the Further detail pages
  @zap_accessibility
  Scenario: 1 - User navigates to check your answer page answering all the questions of Further Details Page
    Given Organisation User logs in as upe with credId FDTask for Pillar2
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
    When I select No option and continue to next
    Then I should navigate to Task list page
    And The Task Add further group details status should be Not started
    When I click Add further group details link
    Then I should navigate to MNE or domestic page
    And The caption must be Group details
    And The Heading should be Where does the group operate?
    And I click on Continue button
    Then I should see error message Select where the group operates on the Further Details Group Status Page
    When I select option In the UK and other countries in further details group status page
    And I click on Continue button
    When I select back link
    Then I should navigate to MNE or domestic page
    And I should see the option In the UK and other countries remain selected
    When I select back link
    And I select back link
    Then I should navigate to Task list page
    And The Task Add further group details status should be In progress
    When I click Add further group details link
    Then I should navigate to MNE or domestic page
    When I select option Only in the UK in further details group status page
    And I click on Continue button
    Then I should navigate to Group accounting period page
    And The caption must be Group details
    And The Heading should be What are the start and end dates of the group's consolidated accounting period?
    And I click on Continue button
    Then I should see error message You need to enter the start date of the group's consolidated accounting period on the Group Accounting Period Start Date Page
    Then I should see error message You need to enter the end date of the group's consolidated accounting period on the Group Accounting Period End Date Page
    When Accounting Period Start Day is entered as 30
    And Accounting Period Start Month is entered as 12
    And Accounting Period Start Year is entered as 2023
    And I click on Continue button
    Then I should see error message You need to enter a start date on or after 31/12/2023 on the Group Accounting Period Start Date Page
    When Accounting Period Start Day is entered as 15
    And Accounting Period Start Month is entered as 01
    And Accounting Period Start Year is entered as 2024
    When Accounting Period End Day is entered as 14
    And Accounting Period End Month is entered as 01
    And Accounting Period End Year is entered as 2024
    And I click on Continue button
    Then I should see error message You need to enter an end date that is after the start date on the Group Accounting Period End Date Page
    When Accounting Period Start Day is entered as 1
    And Accounting Period Start Month is entered as 15
    And Accounting Period Start Year is entered as 2024
    When Accounting Period End Day is entered as 12
    And Accounting Period End Month is entered as 20
    And Accounting Period End Year is entered as 2024
    And I click on Continue button
    Then I should see error message Enter a date in the correct format on the Group Accounting Period Start Date Page
    And I should see error message Enter a date in the correct format on the Group Accounting Period End Date Page
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
    And I should see row 1 value Only in the UK
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
    When Organisation User logs in with credId FDTask for Pillar2
    And The Task Edit further group details status should be Completed
    When I click Edit further group details link
    Then I should navigate to MNE or domestic page
    And I should see the option Only in the UK remain selected
    When I click on Continue button
    Then I should navigate to Group accounting period page
    And I should see date field Start Day is pre-populated with 15
    And I should see date field Start Month is pre-populated with 1
    And I should see date field Start Year is pre-populated with 2024
    And I should see date field End Day is pre-populated with 15
    And I should see date field End Month is pre-populated with 1
    And I should see date field End Year is pre-populated with 2025
    When I select back link
    Then I should navigate to MNE or domestic page

  Scenario: 2 - Change all the details from Furthers details check your answers page
    Given Organisation User navigates to FD check your answer page with credId FDTask
    Then I should be on FD check your answers page
    And The Heading should be Check your answers
    When I click on change hyperlink next to the FD Group Status
    When I select option In the UK and other countries in further details group status page
    When I click on Continue button
    When I click on Continue button
    Then I should be on FD check your answers page
    And I should see row 1 value In the UK and other countries
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
