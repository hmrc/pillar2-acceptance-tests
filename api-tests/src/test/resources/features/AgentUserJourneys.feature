@tests
Feature: Test subscription Api

  Background: Setup

    Given I set the API version to 2.0

 Scenario: Successful request - agent
   Given an agent is authorised
  When a request is made to GET to url: SubscriptionUrl, and the gov-test-scenario: None
  Then the response code is 200

  #Scenario: Invalid request - agent
  #  Given an agent is authorised
  #  When a request is made to GET to url: SubscriptionUrl, and the gov-test-scenario: None
  #  Then the response code is 503