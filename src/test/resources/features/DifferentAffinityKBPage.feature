@tests @zap_accessibility
Feature: Failure scenarios with different Affinity groups
  I must be navigated to Error screen for Agent and Individual Affinity group

  Scenario: 1 - User logins as organisation user and standard role
    Given Assistant User logs in to register for Pillar2
    Then I should be on Assistant role KB page
    And The Heading should be Sorry, you're unable to use this service
    And The Body content should be You've signed in with a standard organisation account.
    And The Body content should be Only Government Gateway accounts with an administrator role can register to use this service.
    And The Body content should be You need to find someone with an administrator's Government Gateway user ID who can register and then give you authority to report and manage pillar 2 top-up taxes.
    When I click Read the draft guidance for more information on who can use this service. link
    Then I should navigate to Draft guidance page
    When I click the browser back button
    Then I should navigate to Assistant role KB page
    When I select back link
    Then I should be on auth-login page

  Scenario: 2 - User logins as Agent
    Given Agent User logs in to register for Pillar2
    Then I should be on Agent affinity KB page
    And The Heading should be Sorry, you're unable to use this service
    And The Body content should be You've signed in using an agent's Government Gateway user ID. Agents cannot use this service to register or administer a group's Pillar 2 top-up taxes.
    And The Body content should be If you are an agent who has been given authorisation to report Pillar 2 top-up taxes, you must sign in via Agent Services.
    And The Body content should be If you need to request authorisation to report Pillar 2 top-up taxes, you must request authorisation via Agent services.
    When I click sign in via Agent Services. link
    Then I should navigate to Agent services account page
    When I click the browser back button
    Then I should be on Agent affinity KB page
    When I click request authorisation via Agent services. link
    Then I should navigate to Agent services account page
    When I click the browser back button
    Then  I should be on Agent affinity KB page
    And I click Read the draft guidance for more information on who can use this service. link
    Then I should navigate to Draft guidance page
    When I click the browser back button
    Then I should navigate to Agent affinity KB page
    When I select back link
    Then I should be on auth-login page

  Scenario: 3 - User logins as Individual User
    Given Individual User logs in to register for Pillar2
    Then I should be on Individual affinity KB page
    And The Heading should be Sorry, you're unable to use this service
    And The Body content should be You've signed in with an individual account. Only users with an organisation account can register to use this service.
    And The Body content should be If you still need to register, sign in to Government Gateway with an organisation account.
    And The Body content should be Read the draft guidance for more information on who can use this service.
    When I click sign in to Government Gateway with an organisation account. link
    Then I should be on auth-login page
    When Individual User logs in to register for Pillar2
    Then I should be on Individual affinity KB page
    When I click Read the draft guidance for more information on who can use this service. link
    Then I should navigate to Draft guidance page
    When I click the browser back button
    Then I should navigate to Individual affinity KB page
    When I select back link
    Then I should be on auth-login page





