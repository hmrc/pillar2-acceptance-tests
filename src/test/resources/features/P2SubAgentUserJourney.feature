@p2tests
Feature: Pillar2 submission Agent User Journey
  As an Agent authenticated user
  I should be able to access Agent features

  @p2zap_p2accessibility
  Scenario: 1 - Agent user capturing Pillar2 ID
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 submission service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 submission service
    Then I should be navigated to ASA Pillar2 Input Page of Pillar2 Submission
    When I provide RFM pillar2 id as XMplr0123456789
    And I click on Continue button
    When I click Report Pillar 2 top-up taxes link
    Then I should be navigated to ASA Home Page of Pillar2 Submission
    And I click on Continue button
    And I should be navigated to ASA Pillar2 Input Page of Pillar2 Submission
    And I provide ASA Pillar2 ID as XMPLR0012345674
    And I click on Continue button
    Then I should be navigated to ASA Confirmation Page of Pillar2 Submission
    When I select back link
    And I provide ASA Pillar2 ID as XEPLR0123456500
    And I click on Continue button
    Then I should be navigated to ASA No record Match Error Page of Pillar2 Submission
    When I select back link
    When I click Report Pillar 2 top-up taxes link
    Then I should be navigated to ASA Home Page of Pillar2 Submission
    When I click on Continue button
    Then I should be navigated to ASA Pillar2 Input Page of Pillar2 Submission
    And I provide ASA Pillar2 ID as XEPLR0123456500
    And I click on Continue button
    When I click Re-enter your client’s Pillar 2 top-up taxes ID to try again link
    Then I should be navigated to ASA Pillar2 Input Page of Pillar2 Submission
    When I provide ASA Pillar2 ID as XMPLR0012345674
    And I click on Continue button
    Then I should be navigated to ASA Confirmation Page of Pillar2 Submission
    When I click Enter a different client’s Pillar 2 top-up taxes ID link
    Then I should be navigated to ASA Pillar2 Input Page of Pillar2 Submission
    And I should see the PLRID field is pre-populated with XMPLR0012345674
    And I click on Continue button
    Then I should be navigated to ASA Confirmation Page of Pillar2 Submission
    And I click on Continue button
    Then I should be navigated to Under Construction Page of Pillar2 Submission

  Scenario: 2 - Verify Agent service account user unauthorised pages
    Given Individual User logs in to register for Pillar2 Submission Agent service
    Then I should be navigated to ASA Individual KB Page of Pillar2 Submission
    When I click sign in via agent services link
    Then I should navigate to agent services account page
    When I click the browser back button
    Then I should be navigated to ASA Individual KB Page of Pillar2 Submission
    When I click request authorisation on agent services link
    Then I should navigate to Agent services account page2
    When I click the browser back button
    Then I should be navigated to ASA Individual KB Page of Pillar2 Submission
    And I click Find out more about who can report for Pillar 2 top-up taxes link
    Then I should navigate to guidance page
    When I click the browser back button
    Then I should be navigated to ASA Individual KB Page of Pillar2 Submission

  Scenario: 3 - Verify Agent service account user unauthorised pages
    Given Organisation User logs in to register for Pillar2 Submission Agent service
    Then I should be navigated to ASA Organisation KB Page of Pillar2 Submission
    When I click sign in via agent services link
    Then I should navigate to agent services account page
    When I click the browser back button
    Then I should be navigated to ASA Organisation KB Page of Pillar2 Submission
    When I click request authorisation on agent services link
    Then I should navigate to Agent services account page2
    When I click the browser back button
    Then I should be navigated to ASA Organisation KB Page of Pillar2 Submission
    And I click Find out more about who can report for Pillar 2 top-up taxes link
    Then I should navigate to guidance page
    When I click the browser back button
    Then I should be navigated to ASA Organisation KB Page of Pillar2 Submission
    When Assistant User logs in to register for Pillar2 Submission Agent service
    Then I should be navigated to ASA Organisation KB Page of Pillar2 Submission
