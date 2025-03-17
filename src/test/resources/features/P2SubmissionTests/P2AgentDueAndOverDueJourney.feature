@p2tests1 @p2zap_p2accessibility
Feature: Pillar2 Due & Overdue returns for Agent User Journey
  As an authenticated Agent user
  I should be able to view Due & Overdue returns Page

  Scenario: 1 - Agent User navigates to Due & Overdue returns page with multiple accounting period
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR1111111111 and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XEPLR1111111111
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    And I click on Continue button
    Then I should navigate to ASA Dashboard page
    And I access submission BTN start page
    And I go to due overdue page
    And I should see 4 accounting periods on Due Overdue Page
    And I should see 1 section with status "Due"
    And I should see 3 section with status "Overdue"
    When I click submission history link
    And I should see 0 accounting periods on Sub History Page

  Scenario: 2 - Agent User navigates to Due & Overdue returns page with no accounting period
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR2222222222 and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XEPLR2222222222
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    And I click on Continue button
    Then I should navigate to ASA Dashboard page
    And I access submission BTN start page
    And I go to due overdue page
    And I should see 0 accounting periods on Due Overdue Page
    When I click submission history link
    And I should see 0 accounting periods on Sub History Page

  Scenario: 3 - Agent User navigates to Due & Overdue returns page with single accounting period
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR3333333333 and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XEPLR3333333333
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    And I click on Continue button
    Then I should navigate to ASA Dashboard page
    And I access submission BTN start page
    And I go to due overdue page
    And I should see 1 accounting periods on Due Overdue Page
    And I should see 0 section with status "Due"
    And I should see 1 section with status "Overdue"
    When I click submission history link
    And I should see 0 accounting periods on Sub History Page

  Scenario: 4 - Agent User navigates to Due & Overdue returns page with all fulfilled submissions
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR4444444444 and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XEPLR4444444444
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    And I click on Continue button
    Then I should navigate to ASA Dashboard page
    And I access submission BTN start page
    And I go to due overdue page
    And I should see 0 accounting periods on Due Overdue Page
    When I click submission history link
    And I should see 2 accounting periods on Sub History Page

  Scenario: 5 - Agent User navigates to Due & Overdue returns page with some fulfilled submissions
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR5555555555 and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XEPLR5555555555
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    And I click on Continue button
    Then I should navigate to ASA Dashboard page
    And I access submission BTN start page
    And I go to due overdue page
    And I should see 2 accounting periods on Due Overdue Page
    And I should see 0 section with status "Due"
    And I should see 2 section with status "Overdue"
    When I click submission history link
    And I should see 2 accounting periods on Sub History Page