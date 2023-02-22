@tests
Feature: Check Answers Page
  Scenario: 1 - Display check your answer page
    Given Organisation User logs in to register for Pillar2
    Then The Heading should be Welcome to OECD Pillar Two
    Then The Body content should be Welcome to your new frontend. Please see the README file for a guide to getting started.
    When I click Continue button
    Then The Heading should be Check Your Answers
