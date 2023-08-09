@tests @zap_accessibility
Feature: Task list page
  As a MNE user
  I want to create a new subscription

  Scenario: 1 - Task list page Sections and status validation
    Given Organisation User logs in to subscribe for Pillar2
    Then I should be on Task list page
    And The page header should be Report Pillar 2 top-up taxes
    And The Heading should be Register for Pillar 2 top-up tax
    And I should see task list sections
    And I should see section 1 as Business details
    And I should see section 2 as Contact details
    And I should see section 3 as Review and submit
    And I should see the task name Add ultimate parent's details on Business details section
    And I should see the task name Filing member's details on Business details section
    And I should see the task name Further business details on Business details section
    And The Task Add ultimate parent's details status should be Not started
    And The Task Filing member's details status should be Cannot start yet
    And The Task Further business details status should be Cannot start yet

  Scenario: 2 - Prepopulate the answers on UPE pages after signout
    Given Organisation User logs in as upe with credId TestCredID1 for Pillar2
    Then I should be on UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test UPE
    Then I should navigate to input-upe-address page
    When I select back link
    And I click Sign out link
    Then I am on feedback survey page
    When Organisation User logs in as upe with credId TestCredID1 for Pillar2
    Then I should be on UPE business page
    And I should see the answer No remain selected
    When I continue to next page
    Then I should navigate to input-upe-name page
    And I should see the UPE name field is pre-populated with Test UPE

  Scenario: 3 - Status update Enter ultimate parent's details task
    Given Organisation User logs in to subscribe for Pillar2
    Then I should be on Task list page
    And The Heading should be Register for Pillar 2 top-up tax
    And The Task Add ultimate parent's details status should be Not started
    When I click Add ultimate parent's details link
    Then I should navigate to Initial guidance Page
    When I click on Continue button
    Then I should navigate to UPE business page
    When I select option No and continue to next
    And I navigate back to TaskList Page from Name Page
    Then The Task Add ultimate parent's details status should be In progress

  Scenario: 4 - Verify the signout functionality
    Given Organisation User logs in to subscribe for Pillar2
    Then I should be on Task list page
    And The Heading should be Register for Pillar 2 top-up tax
    When I click Sign out link
    Then I am on feedback survey page
    When I click the browser back button
    Then I should be on auth-login page

  Scenario: 5 - Task list page status update validation after Task1 completion
    Given Organisation User logs in to subscribe for Pillar2
    Then I should be on Task list page
    And The Heading should be Register for Pillar 2 top-up tax
    When I click Add ultimate parent's details link
    Then I should navigate to Initial guidance Page
    And I click on Continue button
    Then I should be on UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test Task List
    Then I should navigate to input-upe-address page
    When I enter Address Line 1 as Address Line 1
    And I enter City as City
    And I enter Country as Country
    And I click on Continue button
    Then I should navigate to UPE Contact person/team Name page
    When I enter UPE Person/Team name as Contact
    And I click on Continue button
    Then I should navigate to UPE Contact Email page
    When I enter UPE Email address as test@email.com
    And I click on Continue button
    Then I should navigate to UPE Telephone page
    When I select option No and continue to next
    Then I should be on Check your answers page
    When I click on Continue button
    Then I should be on Task list page
    And I should see the task name Edit ultimate parent's details on Business details section
    And The Task Edit ultimate parent's details status should be Completed
    And I should see the task name Add filing member's details on Business details section
    And The Task Add filing member's details status should be Not started





