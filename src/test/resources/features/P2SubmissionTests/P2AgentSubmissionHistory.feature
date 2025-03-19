@p2tests @p2zap_p2accessibility
Feature: Pillar2 Submission History Agent User Journey
  As an authenticated Agent user
  I should be able to view Submission History page

  Scenario: 1 - Agent User navigates to Submission History for no accounting period
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR2222222222 and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XEPLR2222222222
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    And I click on Continue button
    And I access submission BTN start page
    And I go to submission history page
    And I should see 0 accounting periods on Sub History Page

  Scenario: 2 -  Agent User navigates to Submission History for one accounting period
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR7777777777 and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XEPLR7777777777
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    And I click on Continue button
    And I access submission BTN start page
    And I go to submission history page
    And I should see 1 accounting periods on Sub History Page

  Scenario: 3 - Agent User navigates to Submission History for multiple accounting period
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR4444444444 and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XEPLR4444444444
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    And I click on Continue button
    And I access submission BTN start page
    And I go to submission history page
    And I should see 2 accounting periods on Sub History Page

