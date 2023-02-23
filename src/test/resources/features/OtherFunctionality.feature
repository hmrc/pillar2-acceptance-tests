@tests @ZAP
Feature: Other Functionalities

  Background:
    Given Organisation User logs in to register for Pillar2
    Then The Heading should be Welcome to OECD Pillar Two

  Scenario:1 User clicks sign out
    And click Sign out
    Then The Heading should be Give feedback


