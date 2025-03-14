@p2tests @p2zap_p2accessibility  @tests1
Feature: Pillar2 Submission History Agent User Journey
  As an authenticated user
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
    Then I verify page "No submissions made.","Submission History"

  Scenario: 2 - Agent User navigates to Submission History for one accounting period
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR3333333333 and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XEPLR3333333333
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    And I click on Continue button
    And I access submission BTN start page
    And I go to submission history page
    Then I verify details as below
      | KEY             | VALUE         |
      | Type of return  | UK Tax Return |
      | Submission date | 10 March 2025 |

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
    Then I verify details as below
      | KEY             | VALUE                        |
      | Type of return  | UK Tax Return                |
      | Submission date | 10 March 2025                |
      | Type of return  | Below Threshold Notification |
      | Submission date | 10 March 2025                |
      | Type of return  | UK Tax Return                |
      | Submission date | 10 March 2025                |
      | Type of return  | Below Threshold Notification |
      | Submission date | 10 March 2025                |
      | Type of return  | Information Return           |
      | Submission date | 10 March 2025                |

