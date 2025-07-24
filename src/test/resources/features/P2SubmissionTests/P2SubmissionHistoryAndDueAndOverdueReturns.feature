@tests @p2zap_p2accessibility
Feature: Pillar2 Due & Overdue returns And Submission History User Journey
  As an authenticated user
  I should be able to view Due & Overdue returns and Submission History page

  Scenario: 1 - Org User navigates to Due & Overdue returns and Submission History for multiple accounting period
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR1111111111 for Pillar2 service
    Then I should be on Dashboard page
    And I access submission BTN start page
    And I go to due overdue page
    And I should see 4 accounting periods on Due Overdue Page
    And I should see 1 section with status "Due"
    And I should see 3 section with status "Overdue"
    When I click submission history link
    And I should see 0 accounting periods on Sub History Page
    When I click due and overdue returns link
    Then I should be navigated to Due & Over Due Page of Pillar2 Submission

  Scenario: 2 - Org User navigates to Due & Overdue returns and Submission History pages for no accounting period
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR2222222222 for Pillar2 service
    Then I should be on Dashboard page
    And I access submission BTN start page
    And I go to due overdue page
    And I should see 0 accounting periods on Due Overdue Page
    When I click submission history link
    And I should see 0 accounting periods on Sub History Page

  Scenario: 3 -  Org User navigates to due & Due & Overdue returns and Submission History pages for single accounting period
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR3333333333 for Pillar2 service
    Then I should be on Dashboard page
    And I access submission BTN start page
    And I go to due overdue page
    And I should see 1 accounting periods on Due Overdue Page
    And I should see 1 section with status "Due"
    And I should see 0 section with status "Overdue"
    When I click submission history link
    And I should see 0 accounting periods on Sub History Page

  Scenario: 4 - Org User navigates to Due & Overdue returns and Submission History pages for all fulfilled submissions
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR4444444444 for Pillar2 service
    Then I should be on Dashboard page
    And I access submission BTN start page
    And I go to due overdue page
    And I should see 0 accounting periods on Due Overdue Page
    When I click submission history link
    And I should see 2 accounting periods on Sub History Page

  Scenario: 5 - Org User navigates to Due & Overdue returns and Submission History pages for some fulfilled submissions
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR5555555555 for Pillar2 service
    Then I should be on Dashboard page
    And I access submission BTN start page
    And I go to due overdue page
    And I should see 2 accounting periods on Due Overdue Page
    And I should see 0 section with status "Due"
    And I should see 2 section with status "Overdue"
    When I click submission history link
    And I should see 2 accounting periods on Sub History Page

  Scenario: 6 - Org User navigates to Due & Overdue returns and Submission History for one accounting period
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR7777777777 for Pillar2 service
    Then I should be on Dashboard page
    And I access submission BTN start page
    And I go to due overdue page
    And I should see 0 accounting periods on Due Overdue Page
    When I click submission history link
    And I should see 1 accounting periods on Sub History Page