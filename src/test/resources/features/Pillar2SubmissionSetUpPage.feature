@ignore
Feature: Pillar2 submission set up page
  As an eligible authenticated user
  I should be able to access Pillar2 submission set up page
  @p2zap_p2accessibility
  Scenario: 1 - User accessing Pillar2 submission set up page
    Given Organisation User logs in to subscribe for Pillar2 Submission
    Then I should be on P2 Submission Set Up Page

  @p2zap_p2accessibility
  Scenario: 2 - User logins as organisation user and standard role
    Given Organisation Assistant User logs in to subscribe for Pillar2 Submission
    Then I should be on P2 Submission Assistant role KB page

  @p2zap_p2accessibility
  Scenario: 3 - User logins as Agentgit
    Given Agent User logs in to subscribe for Pillar2 Submission
    Then I should be on P2 Submission Agent affinity KB page
    When I click sign in via Agent Services link
    Then I should navigate to agent services account page

  @p2zap_p2accessibility
  Scenario: 4 - User logins as Individual User
    Given Individual User logs in to subscribe for Pillar2 Submission
    Then I should be on P2 Submission Individual affinity KB page
    When I click sign in to Government Gateway with an organisation account. link
    Then I should navigate to auth-login page