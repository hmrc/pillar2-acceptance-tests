
Feature: Already registered user go to "Your organisation is already registered" page

  Scenario: 1 - Start page
    Given Organisation User logs in to register for Pillar2
    Then The Heading should be Welcome to OECD Pillar Two
    Then The Body content should be Welcome to your new frontend. Please see the README file for a guide to getting started.
    When I click Continue button
    Then The Heading should be Do you have trading business address in UK?

