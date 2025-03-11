@p2tests @p2zap_p2accessibility
Feature: Pillar2 Due Overdue And Submission History User Journey
  As an authenticated user
  I should be able to view due overdue and submission history page

  Scenario: 1 - Org User navigates to due and overdue returns and Submission History pages for multiple accounting period
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR1111111111 for Pillar2 service
    Then I should be on Dashboard page
    And I access submission BTN start page
    And I go to due overdue page
    And I verify details as below
      | KEY            | VALUE         |
      | Type of return | UK Tax Return |
      | Due date       | 8 March 2025  |
      | Status         | Due           |
      | Type of return | UK Tax Return |
      | Due date       | 9 March 2025  |
      | Status         | Overdue       |
      | Type of return | UK Tax Return |
      | Due date       | 9 March 2025  |
      | Status         | Overdue       |
      | Type of return | UK Tax Return |
      | Due date       | 9 March 2025  |
      | Status         | Overdue       |
    When I click submission history link
    Then I verify page "No submissions made.","Submission History"

  Scenario: 2 - Org User navigates to due and overdue returns and Submission History pages for no accounting period
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR2222222222 for Pillar2 service
    Then I should be on Dashboard page
    And I access submission BTN start page
    And I go to due overdue page
    Then I verify page "Your group is up to date with their returns for this accounting period.","Due Overdue"
    When I click submission history link
    Then I verify page "No submissions made.","Submission History"

  Scenario: 3 - Org User navigates to due and overdue returns and Submission History pages for single accounting period
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR3333333333 for Pillar2 service
    Then I should be on Dashboard page
    And I access submission BTN start page
    And I go to due overdue page
    And I verify details as below
      | KEY            | VALUE         |
      | Type of return | UK Tax Return |
      | Due date       | previous date |
      | Status         | Overdue       |
    When I click submission history link
    Then I verify page "No submissions made.","Submission History"

  Scenario: 4 - Org User navigates to due and overdue returns and Submission History pages for all fulfilled submissions
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR4444444444 for Pillar2 service
    Then I should be on Dashboard page
    And I access submission BTN start page
    And I go to due overdue page
    Then I verify page "Your group is up to date with their returns for this accounting period.","Due Overdue"
    When I click submission history link
    Then I verify details as below
      | KEY             | VALUE         |
      | Type of return  | UK Tax Return |
      | Submission date | 10 March 2025 |
      | Type of return  | UK Tax Return |
      | Submission date | 10 March 2025 |

  Scenario: 5 - Org User navigates to due and overdue returns and Submission History pages for some fulfilled submissions
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR5555555555 for Pillar2 service
    Then I should be on Dashboard page
    And I access submission BTN start page
    And I go to due overdue page
    And I verify details as below
      | KEY            | VALUE              |
      | Type of return | Information return |
      | Due date       | 9 March 2025       |
      | Status         | Overdue            |
      | Type of return | UK Tax Return      |
      | Due date       | 9 March 2025       |
      | Status         | Overdue            |
    When I click submission history link
    Then I verify details as below
      | KEY             | VALUE         |
      | Type of return  | UK Tax Return |
      | Submission date | 10 March 2025 |
      | Type of return  | UK Tax Return |
      | Submission date | 10 March 2025 |