@p2tests @p2zap_p2accessibility
Feature: Pillar2 submission Below threshold  notification user journey
  As an authenticated user
  I should be able to complete below threshold notification journey

  Scenario: 1 - Org User navigates to below threshold notification pages
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service
    Then I should be on Dashboard page
    And I access submission BTN start page
    When I click on Continue button
    Then I should be navigated to BTN Accounting Period Page of Pillar2 Submission
    And I select back link
    Then I should be navigated to BTN Start Page of Pillar2 Submission
    When I click on Continue button
    When I click Update your group’s current accounting period link
    Then I should be on Manage accounting period Page
    And I select back link
    When I click on Continue button
    Then I should be navigated to BTN Domestic or MNE Page of Pillar2 Submission
    When I select option Yes and continue on Pillar2 submission
    Then I should be navigated to BTN Annual Revenue Page of Pillar2 Submission
    When I select back link
    When I select option No and continue on Pillar2 submission
    Then I should be navigated to Under Construction Page of Pillar2 Submission
    And I click the browser back button
    When I select option Yes and continue on Pillar2 submission
    Then I should be navigated to BTN Annual Revenue Page of Pillar2 Submission
    When I select option No and continue on Pillar2 submission
    Then I should be navigated to BTN Future Annual Revenue Page of Pillar2 Submission
    When I select back link
    When I select option Yes and continue on Pillar2 submission
    Then I should be navigated to Under Construction Page of Pillar2 Submission
    And I click the browser back button
    When I select option No and continue on Pillar2 submission
    Then I should be navigated to BTN Future Annual Revenue Page of Pillar2 Submission
    When I select option Yes and continue on Pillar2 submission
    Then I should be navigated to Under Construction Page of Pillar2 Submission
    And I click the browser back button
    When I select option No and continue on Pillar2 submission
    Then I should be navigated to Under Construction Page of Pillar2 Submission

  Scenario: 2 - Agent User navigates to below threshold notification pages
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XMPLR0012345674
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    And I click on Continue button
    Then I should navigate to ASA Dashboard page
    And I access submission BTN start page
    When I click on Continue button
    Then I should be navigated to BTN Accounting Period Page of Pillar2 Submission
    And I select back link
    Then I should be navigated to BTN Start Page of Pillar2 Submission
    When I click on Continue button
    When I click Update your group’s current accounting period link
    Then I should be on Manage accounting period Page
    And I select back link
    When I click on Continue button
    Then I should be navigated to BTN Domestic or MNE Page of Pillar2 Submission
    When I select option Yes and continue on Pillar2 submission
    Then I should be navigated to BTN Annual Revenue Page of Pillar2 Submission
    When I select back link
    When I select option No and continue on Pillar2 submission
    Then I should be navigated to Under Construction Page of Pillar2 Submission
    And I click the browser back button
    When I select option Yes and continue on Pillar2 submission
    Then I should be navigated to BTN Annual Revenue Page of Pillar2 Submission
    When I select option No and continue on Pillar2 submission
    Then I should be navigated to BTN Future Annual Revenue Page of Pillar2 Submission
    When I select back link
    When I select option Yes and continue on Pillar2 submission
    Then I should be navigated to Under Construction Page of Pillar2 Submission
    And I click the browser back button
    When I select option No and continue on Pillar2 submission
    Then I should be navigated to BTN Future Annual Revenue Page of Pillar2 Submission
    When I select option Yes and continue on Pillar2 submission
    Then I should be navigated to Under Construction Page of Pillar2 Submission
    And I click the browser back button
    When I select option No and continue on Pillar2 submission
    Then I should be navigated to Under Construction Page of Pillar2 Submission
