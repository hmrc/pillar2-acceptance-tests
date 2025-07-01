@tests @batch1 @ignore
Feature: Failure scenarios with different Affinity groups
  I must be navigated to Error screen for Agent and Individual Affinity group

  Scenario: 1 - User logins as organisation user and standard role
    Given Assistant User logs in to register for Pillar2
    Then I should be on Assistant role KB page
    And The Heading should be Sorry, you’re unable to use this service
    And The Body content should be You’ve signed in with a standard organisation account.
    And The Body content should be Only Government Gateway accounts with an administrator role can register to use this service.
    And The Body content should be You need to find someone with an administrator’s Government Gateway user ID who can register and then give you authority to report and manage Pillar 2 Top-up Taxes.
    When I click Find out more about who can use this service link
    Then I should navigate to guidance page
    When I click the browser back button
    Then I should navigate to Assistant role KB page
    When I select back link
    Then I should be on auth-login page

  Scenario: 2 - User logins as Agent
    Given Agent User logs in to register for Pillar2
    Then I should be on Agent affinity KB page
    And The Heading should be Sorry, you’re unable to use this service
    And The Body content should be You’ve signed in using an agent Government Gateway user ID. Only groups can register to use this service.
    And The Body content should be if you are an agent that has been given authorisation to report Pillar 2 Top-up Taxes on behalf of a group, you must sign in via agent services
    And The Body content should be if you need to request authorisation to report Pillar 2 Top-up Taxes, you must request authorisation via agent services
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
    And The Heading should be Sorry, you’re unable to use this service
    And The Body content should be You’ve signed in with an individual account. Only users with an organisation account can register to use this service.
    And The Body content should be If the group still needs to register, sign in to Government Gateway with an organisation account.
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



