@tests
Feature: Further Details Task page validation
  As a MNE user
  I should be taken to all the Further detail pages

  @zap_accessibility @batch1
  Scenario: 1 - User navigates to check your answer page answering all the questions of Further Details Page
    Given Organisation User logs in as upe with credId FDTask for Pillar2
    When I select option Yes and continue to next
    When I select option UK limited company and continue to GRS page
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    When I click Add filing member details link
    When I select No option and continue to next
    When I click Add further group details link
    Then I should navigate to MNE or domestic page
    And I click on Continue button
    When I select option In the UK and outside the UK in further details group status page
    When I select back link
    Then I should navigate to MNE or domestic page
    And I should see the option In the UK and outside the UK remain selected
    When I select back link
    And I select back link
    And The Task Add further group details status should be In progress
    When I click Add further group details link
    Then I should navigate to MNE or domestic page
    When I select option Only in the UK in further details group status page
    Then I should navigate to Group accounting period page
    And I click on Continue button
    When I enter account period as:
      | KEY             | VALUE |
      | startDate.day   | 15    |
      | startDate.month | 1     |
      | startDate.year  | 2024  |
      | endDate.day     | 15    |
      | endDate.month   | 1     |
      | endDate.year    | 2025  |
    Then I should navigate to FD check your answers page
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
    When I select back link
    Then I should navigate to MNE or domestic page

  @batch1
  Scenario: 2 - Change all the details from Furthers details check your answers page
    Given Organisation User navigates to FD check your answer page with credId FDTask
    Then I should be on FD check your answers page
    When I click on change hyperlink next to the FD Group Status
    When I select option In the UK and outside the UK in further details group status page
    Then I should be on FD check your answers page
    And I should see row 1 value In the UK and outside the UK
    When I click on change hyperlink next to the Accounting Period
    When I enter account period as:
      | KEY             | VALUE |
      | startDate.day   | 5     |
      | startDate.month | 5     |
      | startDate.year  | 2025  |
      | endDate.day     | 5     |
      | endDate.month   | 6     |
      | endDate.year    | 2026  |
    And I should see row 3 value 5 May 2025
    And I should see row 4 value 5 June 2026
    And I should see row 4 value 5 June 2026

  @batch2
  Scenario: 3 - Accounting period page Error Validations
    Given I clear the cache
    Given Organisation User logs in as upe with credId APErrors for Pillar2
    When I select option Yes and continue to next
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    When I click Add filing member details link
    When I select No option and continue to next
    When I click Add further group details link
    When I select option Only in the UK in further details group status page
    Then I should navigate to Group accounting period page