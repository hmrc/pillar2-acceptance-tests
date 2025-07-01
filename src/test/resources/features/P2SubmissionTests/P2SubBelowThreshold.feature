@p2tests @p2zap_p2accessibility @ignore
Feature: Pillar2 submission Below threshold  notification user journey
  As an authenticated user
  I should be able to complete below threshold notification journey

  Scenario: 1 - Org User navigates to below threshold notification pages
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR9999999991 for Pillar2 service
    Then I should be on Dashboard page
    And I access submission BTN start page
    When I click on Continue button
    Then I should be navigated to BTN Accounting Period Page of Pillar2 Submission
    And I select back link
    Then I should be navigated to BTN Start Page of Pillar2 Submission
    When I click on Continue button
    When I click update your group’s accounting period dates link
    Then I should be on accounts summary page
    And I click the browser back button
    When I click on Continue button
    Then I should be navigated to BTN Domestic or MNE Page of Pillar2 Submission
    When I select option No and continue on Pillar2 submission
    Then I should be navigated to BTN AGD KB Page of Pillar2 Submission
    When I click Amend group details link
    Then I should be on accounts summary page
    And I click the browser back button
    Then I should be navigated to BTN AGD KB Page of Pillar2 Submission
    And I click the browser back button
    Then I should be navigated to BTN Domestic or MNE Page of Pillar2 Submission
    When I select option Yes and continue on Pillar2 submission
    Then I should be navigated to BTN CYA Submit Page of Pillar2 Submission
    When I click on Continue button
    Then I should be navigated to BTN Confirmation Page of Pillar2 Submission
    When I click Sign out link

  Scenario: 2 - Agent User navigates to below threshold notification pages
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR9999999991 and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XEPLR9999999991
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
    When I click update the group’s accounting period dates link
    Then I should be on accounts summary page
    And I click the browser back button
    When I click on Continue button
    Then I should be navigated to BTN Domestic or MNE Page of Pillar2 Submission
    When I select option No and continue on Pillar2 submission
    Then I should be navigated to BTN AGD KB Page of Pillar2 Submission
    When I click Amend group details link
    Then I should be on accounts summary page
    When I click Sign out link
    Then I am on feedback survey page

  Scenario: 3 - Org User navigates to BTN return submission KB page
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR9999999991 for Pillar2 service
    Then I should be on Dashboard page
    And I access submission BTN start page
    When I click on Continue button
    Then I should be navigated to BTN Return Submission KB Page of Pillar2 Submission
    When I click on Continue button
    Then I should be navigated to BTN Domestic or MNE Page of Pillar2 Submission
    When I select option Yes and continue on Pillar2 submission
    Then I should be navigated to BTN CYA Submit Page of Pillar2 Submission
    When I navigate back to BTN Return Submission KB Page
    Then I should be navigated to BTN Return Submission KB Page of Pillar2 Submission
    When I click Sign out link
    Then I am on feedback survey page

  Scenario: 4 - Agent User navigates to BTN return submission KB page
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR9999999991 and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XEPLR9999999991
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    And I click on Continue button
    Then I should be on ASA Dashboard page
    And I access submission BTN start page
    When I click on Continue button
    Then I should be navigated to BTN Return Submission KB Page of Pillar2 Submission
    When I click Report Pillar 2 Top-up Taxes link
    Then I should be navigated to P2 ASA Home Page of Pillar2 Submission
    When I select back link
    Then I should be navigated to BTN Return Submission KB Page of Pillar2 Submission
    When I click Sign out link
    Then I am on feedback survey page
    When I click on Continue button

  Scenario: 5 - Agent User navigates to below threshold notification CYA page and change pages
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR9999999991 and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XEPLR9999999991
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    And I click on Continue button
    Then I should navigate to ASA Dashboard page
    And I access submission BTN start page
    When I click on Continue button
    Then I should be navigated to BTN Accounting Period Page of Pillar2 Submission
    When I click on Continue button
    Then I should be navigated to BTN Domestic or MNE Page of Pillar2 Submission
    When I select option Yes and continue on Pillar2 submission
    Then I should be navigated to BTN CYA Submit Page of Pillar2 Submission
    When I click on change hyperlink next to the Domestic or Mne
    When I click on Continue button
    Then I should be navigated to BTN CYA Submit Page of Pillar2 Submission
    When I click on Continue button
    Then I should be navigated to BTN Confirmation Page of Pillar2 Submission

  Scenario: 6 - Agent User navigates to below threshold notification CYA page and change pages with KB pages
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR9999999991 and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XEPLR9999999991
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    And I click on Continue button
    Then I should navigate to ASA Dashboard page
    And I access submission BTN start page
    When I click on Continue button
    Then I should be navigated to BTN Accounting Period Page of Pillar2 Submission
    When I click on Continue button
    Then I should be navigated to BTN Domestic or MNE Page of Pillar2 Submission
    When I select option Yes and continue on Pillar2 submission
    Then I should be navigated to BTN CYA Submit Page of Pillar2 Submission
    When I click on change hyperlink next to the Domestic or Mne
    When I select option No and continue on Pillar2 submission
    Then I should be navigated to BTN AGD KB Page of Pillar2 Submission
    And I click the browser back button
    When I select option Yes and continue on Pillar2 submission
    Then I should be navigated to BTN CYA Submit Page of Pillar2 Submission
    When I click on Continue button
    Then I should be navigated to BTN Confirmation Page of Pillar2 Submission

  Scenario: 7 - Org User navigates to below threshold notification CYA page and change pages
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR9999999991 for Pillar2 service
    Then I should be on Dashboard page
    And I access submission BTN start page
    When I click on Continue button
    Then I should be navigated to BTN Accounting Period Page of Pillar2 Submission
    When I click on Continue button
    Then I should be navigated to BTN Domestic or MNE Page of Pillar2 Submission
    When I select option Yes and continue on Pillar2 submission
    Then I should be navigated to BTN CYA Submit Page of Pillar2 Submission
    When I click on change hyperlink next to the Domestic or Mne
    When I click on Continue button
    Then I should be navigated to BTN CYA Submit Page of Pillar2 Submission
    When I click on Continue button
    Then I should be navigated to BTN Confirmation Page of Pillar2 Submission

  Scenario: 8 - Org User navigates to below threshold notification CYA page and change pages with KB pages
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR9999999991 for Pillar2 service
    Then I should be on Dashboard page
    And I access submission BTN start page
    When I click on Continue button
    Then I should be navigated to BTN Accounting Period Page of Pillar2 Submission
    When I click on Continue button
    Then I should be navigated to BTN Domestic or MNE Page of Pillar2 Submission
    When I select option Yes and continue on Pillar2 submission
    Then I should be navigated to BTN CYA Submit Page of Pillar2 Submission
    When I click on change hyperlink next to the Domestic or Mne
    When I select option No and continue on Pillar2 submission
    Then I should be navigated to BTN AGD KB Page of Pillar2 Submission
    And I click the browser back button
    When I select option Yes and continue on Pillar2 submission
    Then I should be navigated to BTN CYA Submit Page of Pillar2 Submission
    When I click on Continue button
    Then I should be navigated to BTN Confirmation Page of Pillar2 Submission
    And I can see Print this page link
    And I can see Download as PDF link
    When I click Back to group’s homepage link
    Then I should be on Dashboard page

  Scenario: 9 - Org User navigates to KB page, if user click browser back after successful BTN submission
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR9999999991 for Pillar2 service
    Then I should be on Dashboard page
    And I access submission BTN start page
    When I click on Continue button
    Then I should be navigated to BTN Accounting Period Page of Pillar2 Submission
    When I click on Continue button
    Then I should be navigated to BTN Domestic or MNE Page of Pillar2 Submission
    When I select option Yes and continue on Pillar2 submission
    Then I should be navigated to BTN CYA Submit Page of Pillar2 Submission
    When I click on Continue button
    Then I should be navigated to BTN Confirmation Page of Pillar2 Submission
    When I click the browser back button
    Then I should be navigated to BTN Cannot Return Page of Pillar2 Submission
    When I click the browser back button
    Then I should be navigated to BTN Cannot Return Page of Pillar2 Submission
    When I click Return to your group’s homepage link
    Then I should be on Dashboard page

  Scenario Outline: 10 - Org User navigates to KB page, if BTN submission unsuccessful
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and <PLRID> for Pillar2 service
    Then I should be on Dashboard page
    And I access submission BTN start page
    When I click on Continue button
    Then I should be navigated to BTN Accounting Period Page of Pillar2 Submission
    When I click on Continue button
    Then I should be navigated to BTN Domestic or MNE Page of Pillar2 Submission
    When I select option Yes and continue on Pillar2 submission
    When I click on Continue button
    Then I should be navigated to BTN Problem with service Page of Pillar2 Submission
    When I click Return to your account homepage to submit a Below-Threshold Notification again link
    Then I should navigate to Dashboard page
    Examples:
      | PLRID           |
      | XEPLR4220000000 |
      | XEPLR4000000000 |
      | XEPLR5000000000 |

  Scenario Outline: 11 - Agent User navigates to KB page, if BTN submission unsuccessful
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, <PLRID> and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as <PLRID>
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    And I click on Continue button
    Then I should navigate to ASA Dashboard page
    And I access submission BTN start page
    When I click on Continue button
    Then I should be navigated to BTN Accounting Period Page of Pillar2 Submission
    When I click on Continue button
    Then I should be navigated to BTN Domestic or MNE Page of Pillar2 Submission
    When I select option Yes and continue on Pillar2 submission
    When I click on Continue button
    Then I should be navigated to BTN Problem with service Page of Pillar2 Submission
    When I click Return to your account homepage to submit a Below-Threshold Notification again link
    Then I should navigate to Dashboard page
    Examples:
      | PLRID           |
      | XEPLR4220000000 |
      | XEPLR4000000000 |
      | XEPLR5000000000 |

  Scenario: 12 - Agent User navigates to BTN multiple accounting period for current accounting period to check amend group details
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR9999999994 and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XEPLR9999999994
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    And I click on Continue button
    Then I should navigate to ASA Dashboard page
    And I access submission BTN start page
    When I click on Continue button
    Then I should be navigated to BTN Multiple Accounting Period Page of Pillar2 Submission
    And I select back link
    Then I should be navigated to BTN Start Page of Pillar2 Submission
    When I click on Continue button
    And I select CurrentAccountingPeriod
    And  I click on Continue button
    When I click update the group’s accounting period dates link
    Then I should be on accounts summary page
    And I click the browser back button
    When I click on Continue button
    Then I should be navigated to BTN Domestic or MNE Page of Pillar2 Submission
    When I select option No and continue on Pillar2 submission
    Then I should be navigated to BTN AGD KB Page of Pillar2 Submission
    When I click Amend group details link
    Then I should be on accounts summary page
    When I click Sign out link
    Then I am on feedback survey page

  Scenario: 13 - Agent User navigates to submit BTN multiple accounting period for current accounting period
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR9999999994 and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XEPLR9999999994
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    And I click on Continue button
    Then I should navigate to ASA Dashboard page
    And I access submission BTN start page
    When I click on Continue button
    Then I should be navigated to BTN Multiple Accounting Period Page of Pillar2 Submission
    And I select CurrentAccountingPeriod
    And  I click on Continue button
    And I click Select different accounting period link
    Then I should be navigated to BTN Multiple Accounting Period Page of Pillar2 Submission
    And I select CurrentAccountingPeriod
    And  I click on Continue button
    And  I click on Continue button
    Then I should be navigated to BTN Domestic or MNE Page of Pillar2 Submission
    When I select option Yes and continue on Pillar2 submission
    Then I should be navigated to BTN CYA Submit Page of Pillar2 Submission
    When I click on Continue button
    Then I should be navigated to BTN Confirmation Page of Pillar2 Submission

  Scenario: 14 - Agent User navigates to BTN multiple accounting period for previous accounting period
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR9999999994 and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XEPLR9999999994
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    And I click on Continue button
    Then I should navigate to ASA Dashboard page
    And I access submission BTN start page
    When I click on Continue button
    Then I should be navigated to BTN Multiple Accounting Period Page of Pillar2 Submission
    And I click on Continue button
    Then I should be navigated to BTN Multiple Accounting Period Page of Pillar2 Submission
    And I select PreviousAccountingPeriodBTNSubmitted
    And  I click on Continue button
    Then I should be navigated to BTN Accounting Period Page of Pillar2 Submission
    And I select back link
    And I select PreviousAccountingPeriodUKTRSubmitted
    And  I click on Continue button
    Then I should be navigated to BTN Accounting Period Page of Pillar2 Submission
    And  I click on Continue button
    Then I should be navigated to BTN Domestic or MNE Page of Pillar2 Submission
    When I select option Yes and continue on Pillar2 submission
    Then I should be navigated to BTN CYA Submit Page of Pillar2 Submission
    When I click on Continue button

  Scenario: 15- Agent User navigates to BTN Two accounting period for previous and current period.
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XEPLR9999999992 and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XEPLR9999999992
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    And I click on Continue button
    Then I should navigate to ASA Dashboard page
    And I access submission BTN start page
    When I click on Continue button
    Then I should be navigated to BTN Multiple Accounting Period Page of Pillar2 Submission
    And I select back link
    Then I should be navigated to BTN Start Page of Pillar2 Submission
    When I click on Continue button
    Then I should be navigated to BTN Multiple Accounting Period Page of Pillar2 Submission
    And I select CurrentAccountingPeriod
    And  I click on Continue button
    When I click Select different accounting period link
    Then I should be navigated to BTN Multiple Accounting Period Page of Pillar2 Submission
    And I select PreviousAccountingPeriod
    When I click on Continue button
    Then I should be navigated to BTN Accounting Period Page of Pillar2 Submission
    And  I click on Continue button
    And I click the browser back button
    Then I should be navigated to BTN Accounting Period Page of Pillar2 Submission
