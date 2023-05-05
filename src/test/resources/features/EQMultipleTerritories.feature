@tests
Feature: Multiple Territories EQ Page
As a multinational enterprise user
I must have the facility to answer the Multiple territories EQ on Pillar 2 service

  Scenario: 1 - User navigates to next EQ page
    Given I am on Multiple Territories EQ Page
    And The caption should be Check if your group is liable
    And The Heading should be Does your group have businesses in more than one country?
    When I choose Yes and continue
    Then I should navigate to business EQ page

  Scenario: 2 - User navigates to guidance page
    Given I am on Multiple Territories EQ Page
    And The caption should be Check if your group is liable
    And The Body content should be Does your group have businesses in more than one country?
    When I choose No and continue
    Then I should navigate to guidance page

  Scenario: 3 - Display an error message, when user continue without selecting an option
    Given I am on Multiple Territories EQ Page
    And The caption should be Check if your group is liable
    And The Heading should be Does your group have businesses in more than one country?
    When I continue without selecting an option
    Then I should see error message Select yes if your group has businesses in more than one country on the Multiple Territories EQ Page

#  Scenario: 4 - User navigates to previous eligibility question
#    Given I am on multiple territories EQ Page
#    And The Heading should be Check if your group is liable
#    And The Body content should be Does your group have businesses in more than one country?
#    When I select back link
#    Then I should navigate to start page of pillar 2

