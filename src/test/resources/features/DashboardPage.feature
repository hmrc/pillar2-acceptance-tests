@tests @zap_accessibility
Feature: Dashboard Page
As a registered user
  I should be able to navigate to Links on dashboard page

  Scenario: 1 - User navigates to Dashboard page and validates the links
    Given Organisation User logs in Dashboard page for Pillar2
    Then I should be on Dashboard page
    And The Heading should be Your Pillar 2 top-up taxes account
    And I should see User details in dashboard page
    And I should see user details 1 as Pillar 2 top-up taxes ID:
    And I should see user details 2 as Registration date:
    And I should see user details 3 as Ultimate parent entity:
    And I should see the heading 1 on Dashboard page as Payments
    And The Body content should be You have no payments due
    And The Body content should be Make a voluntary payment
    And The Body content should be View your payment history
    And The Body content should be Request a repayment
    And I should see the heading 2 on Dashboard page as Manage your account
    And The Body content should be View and amend contact details
    And The Body content should be View and amend group details
    And The Body content should be This service is being continuously updated. You can anticipate the introduction of more features in line with the development of OECD's policy.
    And The Body content should be For more information, please refer to the draft guidance (opens in new tab)
    When I click Make a voluntary payment link
    Then I should navigate to under construction page
    When I select back link
    Then I should be on Dashboard page
    When I click View your payment history link
    Then I should navigate to under construction page
    When I select back link
    Then I should be on Dashboard page
    When I click Request a repayment link
    Then I should navigate to under construction page
    When I select back link
    Then I should be on Dashboard page
    When I click View and amend contact details link
    Then I should navigate to under construction page
    When I select back link
    Then I should be on Dashboard page
    When I click View and amend group details link
    Then I should navigate to under construction page
    When I select back link
    Then I should be on Dashboard page
    When I click draft guidance (opens in new tab) link
    Then I should be navigated to new tab
    And  I should be on Draft guidance page
    Then I close new tab
    And I should navigate back to main tab
    And I should be on Dashboard page
    When I click Sign out link
    Then I am on feedback survey page