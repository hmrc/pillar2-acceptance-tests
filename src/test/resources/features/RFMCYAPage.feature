@tests1
Feature: RFM check your answers page
  As a replacing filing member
  I want to access CYA page to check my answers and change
  @zap_accessibility
  Scenario: 1 - Verify RFM check your answers page
    Given Organisation User logs in with rfm URL to Pillar2
    Then I should be on RFM enter pillar2 id page
    When I provide RFM pillar2 id as XMPLR0123456789
    And I click on Continue button
    Then I should be on RFM Registration Date Page
    When Registration Day is entered as 1
    When Registration Month is entered as 1
    And Registration Year is entered as 2024
    And I click on Continue button
    Then I should be on RFM CYA Page
    When I select back link
    Then I should be on RFM Registration Date Page
    And I click on Continue button
    Then I should be on RFM CYA Page
    And The caption must be Replace filing member
    And The Heading should be Check your answers
    And I should see row 1 key Pillar 2 top-up taxes ID
    And I should see row 2 key Registration date
    And I should see row 1 value XMPLR0123456789
    And I should see row 2 value 1 January 2024
    When I click change link for RFM Pillar 2 top-up taxes ID
    When I provide RFM pillar2 id as XMPLR0123456111
    And I click on Continue button
    And I should see row 1 key Pillar 2 top-up taxes ID
    And I should see row 1 value XMPLR0123456111
    When I click change link for RFM Registration date
    When Registration Day is entered as 10
    When Registration Month is entered as 2
    When Registration Year is entered as 2024
    And I click on Continue button
    And I should see row 2 key Registration date
    And I should see row 2 value 10 February 2024
    And I click on Continue button
    Then I should navigate to under construction page
