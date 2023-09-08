@tests @zap_accessibility
Feature: Enter group Accounting period
  As a Subscription user
  I want to enter the group accounting period

  Scenario: 1 - Create a new subscription for validating group accounting period
    Given Organisation User logs in as upe with credId AccountingPeriod for Pillar2
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
    And The caption must be Group details
    And The Heading should be What are the start and end dates of the group's consolidated accounting period?
    When Accounting Period Start Day is entered as 15
    And Accounting Period Start Month is entered as 01
    And Accounting Period Start Year is entered as 2024
    When Accounting Period End Day is entered as 15
    And Accounting Period End Month is entered as 01
    And Accounting Period End Year is entered as 2025
    And I click on Continue button
    Then I should navigate to under construction page
    When I select back link
    Then I should navigate to Group accounting period page
    And I should see date field Start Day is pre-populated with 15
    And I should see date field Start Month is pre-populated with 1
    And I should see date field Start Year is pre-populated with 2024
    And I should see date field End Day is pre-populated with 15
    And I should see date field End Month is pre-populated with 1
    And I should see date field End Year is pre-populated with 2025
    When I click Sign out link
    Then I am on feedback survey page
    Given Organisation User logs in with credId AccountingPeriod for Pillar2
    And The Task Edit further group details status should be Completed
    When I click Edit further group details link
    Then I should navigate to MNE or domestic page
    And I click on Continue button
    Then I should navigate to Group accounting period page
    And I should see date field Start Day is pre-populated with 15
    And I should see date field Start Month is pre-populated with 1
    And I should see date field Start Year is pre-populated with 2024
    And I should see date field End Day is pre-populated with 15
    And I should see date field End Month is pre-populated with 1
    And I should see date field End Year is pre-populated with 2025

  Scenario: 2 -  Accounting period page error validations
    Given I clear the cache
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit ultimate parent's details status should be Completed
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select option No and continue to next
    Then I should navigate to Task list page
    When I click Add further group details link
    Then I should navigate to MNE or domestic page
    When I select option In the UK and other countries in further details group status page
    And I click on Continue button
    Then I should navigate to Group accounting period page
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
    Then I should see error message Enter a date in the correct format on the Group Accounting Period Start Date Page
    And I should see error message Enter a date in the correct format on the Group Accounting Period End Date Page