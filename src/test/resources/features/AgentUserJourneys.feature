@tests
Feature: Agent user journeys
  As an Agent
  I should be able to access clients accounts using Pillar2 ID
@tests
  Scenario: 1 - Agent user capturing Pillar2 ID
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    When I click Report Pillar 2 top-up taxes link
    Then I should navigate to ASA Home Page
    When I click on Continue button
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XMPLR0012345674
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    When I click Report Pillar 2 top-up taxes link
    Then I should navigate to ASA Home Page
    When I select back link
    Then I should navigate to ASA Confirmation Page
    When I select back link
    And I provide ASA Pillar2 ID as XEPLR0123456500
    And I click on Continue button
    Then I should navigate to ASA No record Match Error Page
    When I click Report Pillar 2 top-up taxes link
    Then I should navigate to ASA Home Page
    When I click on Continue button
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XEPLR0123456500
    And I click on Continue button
    When I click Re-enter your client’s Pillar 2 top-up taxes ID to try again link
    Then I should be on ASA Pillar2 Input Page
    When I provide ASA Pillar2 ID as XMPLR0012345674
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    When I click Enter a different client’s Pillar 2 top-up taxes ID link
    Then I should be on ASA Pillar2 Input Page
    And I should see the PLRID field is pre-populated with XMPLR0012345674
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    And I click on Continue button
    Then I should navigate to ASA Dashboard page
    And I can see Agent Services Account link
    When I click Report Pillar 2 top-up taxes link
    Then I should navigate to ASA Dashboard page
    When I click Change client link
    And I provide ASA Pillar2 ID as XMPLR0123456789
    And I click on Continue button
    And I click on Continue button
    Then I should navigate to ASA Not Authorised page
    When I click request authorisation to report and manage this client’s Pillar 2 top-up taxes link
    Then I should navigate to ASA Home Page
    When I select back link
    When I click Report Pillar 2 top-up taxes link
    Then I should navigate to ASA Home Page
