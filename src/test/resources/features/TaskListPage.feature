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


