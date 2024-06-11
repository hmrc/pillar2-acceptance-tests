@p2tests
Feature: Pillar2 submission set up page
  As an eligible authenticated user
  I should be able to access Pillar2 submission set up page
  @p2zap_p2accessibility
  Scenario: 1 - User accessing Pillar2 submission set up page
    Given Organisation User logs in to subscribe for Pillar2 Submission
    Then I should be on P2 Submission Set Up Page
    And The Heading should be Welcome to Report Pillar 2 top-up taxes
    And The Body content should be Welcome to your new frontend. Please see the README file for a guide to getting started.

  @p2zap_p2accessibility
  Scenario: 2 - User logins as organisation user and standard role
    Given Organisation Assistant User logs in to subscribe for Pillar2 Submission
    Then I should be on P2 Submission Assistant role KB page
    And The Heading should be Sorry, you’re unable to use this service

  @p2zap_p2accessibility
  Scenario: 3 - User logins as Agent
    Given Agent User logs in to subscribe for Pillar2 Submission
    Then I should be on P2 Submission Agent affinity KB page
    And The Heading should be Sorry, you’re unable to use this service
    When I click sign in via Agent Services. link
    Then I should navigate to Agent services account page

  @p2zap_p2accessibility
  Scenario: 4 - User logins as Individual User
    Given Individual User logs in to subscribe for Pillar2 Submission
    Then I should be on P2 Submission Individual affinity KB page
    And The Heading should be Sorry, you’re unable to use this service
    When I click sign in to Government Gateway with an organisation account. link
    Then I should navigate to auth-login page