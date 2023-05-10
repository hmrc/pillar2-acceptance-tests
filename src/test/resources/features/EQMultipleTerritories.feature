@tests
Feature: Multiple Territories EQ Page
As a multinational enterprise user
I must have the facility to answer the Multiple territories EQ on Pillar 2 service

  Scenario: 1 - Display an error message, when user continue without selecting an option
    Given I am on Multiple Territories EQ Page
    And The caption should be Check if your group is liable
    And The Heading should be Does your group have businesses in more than one country?
    When I continue without selecting an option
    Then I should see error message Select yes if your group has businesses in more than one country on the Multiple Territories EQ Page

  Scenario: 2 - User navigates to next EQ page
    Given I am on Multiple Territories EQ Page
    And The caption should be Check if your group is liable
    And The Heading should be Does your group have businesses in more than one country?
    When I choose Yes and continue
    Then I should navigate to business EQ page

  Scenario: 3 - User navigates to guidance page
    Given I am on Multiple Territories EQ Page
    And The caption should be Check if your group is liable
    And The Body content should be Does your group have businesses in more than one country?
    When I choose No and continue
    Then I should navigate to MT guidance page
    And The Heading should be Based on your answers, you’re not covered by Pillar 2 top-up tax
    And The Body content should be Pillar 2 top-up tax applies to businesses with activities in more than one country. It’s likely that you’re not covered by this law.
    And The Body content should be Your business should continue to pay tax as usual in the country where you operate.
    When I click More about Pillar 2 top-up tax link
    Then I should navigate to gov uk guidance page

  Scenario: 4 - User navigates to previous eligibility question pages
    Given I am on Multiple Territories EQ Page
    And The caption should be Check if your group is liable
    And The Heading should be Does your group have businesses in more than one country?
    When I choose Yes and continue
    Then I should navigate to business EQ page
    When I choose Yes and continue
    Then I should navigate to Global gross revenue
    When I select back link
    Then I should navigate to business EQ page
    When I select back link
    Then I should navigate to multiple territories EQ page

#  Scenario: 5 - User navigates to previous eligibility question
#    Given I am on multiple territories EQ Page
#    And The Heading should be Check if your group is liable
#    And The Body content should be Does your group have businesses in more than one country?
#    When I select back link
#    Then I should navigate to start page of pillar 2

