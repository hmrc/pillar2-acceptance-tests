@p2tests
Feature: Pillar2 submission set up page
  As an eligible authenticated user
  I should be able to access Pillar2 submission set up page
  @p2zap_p2accessibility
  Scenario: 1 - User accessing Pillar2 submission set up page
    Given Organisation User logs in to subscribe for Pillar2 Submission
    Then I should be on P2 Submission Set Up Page
    And The Heading should be pillar2 phase 2 Frontend
    And The Body content should be Welcome to your new frontend. Please see the README file for a guide to getting started.
