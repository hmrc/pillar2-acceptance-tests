@tests
Feature: Task list page
  As a MNE user
  I want to create a new subscription

  Scenario: 1 - Task list page
    Given Organisation User logs in to subscribe for Pillar2
    Then I should be on Task list page
    And The Heading should be Register for Global Minimum Tax
    And I should see task list sections
    And I should see section 1 as Business details
    And I should see section 2 as Contact details
    And I should see section 3 as Review and submit
    And I should see the task name Enter ultimate parent's details on Business details section
    And I should see the task name Enter filing member's details on Business details section
    And I should see the task name Enter further business details on Business details section
    And I should see employee status link Enter ultimate parent's details
    When I click Enter ultimate parent's details link
    Then I should navigate to Initial guidance Page


  Scenario: 2 - Prepopulate the answers on UPE pages after signout
    Given Organisation User logs in as upe with credId TestCredID1 for Pillar2
    Then I should be on UPE page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test UPE
    Then I should navigate to input-upe-address page
    When I select back link
    And I click Sign out link
    Then I am on feedback survey page
    When Organisation User logs in as upe with credId TestCredID1 for Pillar2
    Then I should be on UPE page
    And I should see the answer No remain selected
    When I continue to next page
    Then I should navigate to input-upe-name page
    And I should see the UPE name field is pre-populated with Test UPE
