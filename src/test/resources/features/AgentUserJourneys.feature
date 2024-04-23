@tests
Feature: Agent user journeys
  As an Agent
  I should be able to access clients accounts using Pillar2 ID

  Scenario: 1 - Agent user capturing Pillar2 ID
    Given Agent User logs in to register for Pillar2
    And I access Agent Pillar2 ID input page
    Then I should be on ASA Pillar2 Input Page
    When I provide ASA Pillar2 ID as XMPLR0123456789
    And I click on Continue button
    Then I should navigate to under construction page
