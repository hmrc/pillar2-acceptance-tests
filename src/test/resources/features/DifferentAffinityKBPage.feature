@tests @batch1
Feature: Failure scenarios with different Affinity groups
  I must be navigated to Error screen for Agent and Individual Affinity group

  Scenario: 1 - User logins as organisation user and standard role
    Given Assistant User logs in to register for Pillar2
    Then I should be on Assistant role KB page
    When I click Find out more about who can use this service link
    Then I should navigate to guidance page
    When I click the browser back button
    Then I should navigate to Assistant role KB page
    When I select back link
    Then I should be on auth-login page

  Scenario: 2 - User logins as Agent
    Given Agent User logs in to register for Pillar2
    Then I should be on Agent affinity KB page
    When I click sign in via agent services link
    Then I should navigate to agent services account page
    When I click the browser back button
    Then I should be on Agent affinity KB page
    When I click request authorisation via agent services link
    Then I should navigate to agent services account page
    When I click the browser back button
    Then  I should be on Agent affinity KB page
    And I click Find out more about who can use this service link
    Then I should navigate to guidance page
    When I click the browser back button
    Then I should navigate to Agent affinity KB page
    When I select back link
    Then I should be on auth-login page

  Scenario: 3 - User logins as Individual User
    Given Individual User logs in to register for Pillar2
    Then I should be on Individual affinity KB page
    When I click sign in to Government Gateway with an organisation account. link
    Then I should be on auth-login page
    When Individual User logs in to register for Pillar2
    Then I should be on Individual affinity KB page
    When I click Find out more about who can use this service link
    Then I should navigate to guidance page
    When I click the browser back button
    Then I should navigate to Individual affinity KB page
    When I select back link
    Then I should be on auth-login page

  @zap_accessibility
  Scenario: 4 - User logins as organisation user and standard role - ZAP-Accessibility Tests
    Given Assistant User logs in to register for Pillar2
    Then I should be on Assistant role KB page

  @zap_accessibility
  Scenario: 5 - User logins as Agent
    Given Agent User logs in to register for Pillar2
    Then I should be on Agent affinity KB page
    When I click sign in via agent services link
    Then I should navigate to agent services account page

  @zap_accessibility
  Scenario: 6 - User logins as Individual User
    Given Individual User logs in to register for Pillar2
    Then I should be on Individual affinity KB page