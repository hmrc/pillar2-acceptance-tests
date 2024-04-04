@tests
Feature: replacing existing contact details
  As a Subscription user
  I should be displayed with contact details in use contact page
  @zap_accessibility
  Scenario: 1 - Verify RFM guidance page
    Given Organisation User logs in as upe for Pillar2
    Then I access RFM Contact Guidance page
    Then I should be on RFM Contact Guidance page
    And I click on Continue button
    When I select back link
    Then I should be on RFM Contact Guidance page
    And I click on Continue button
    Then I should navigate to RFM Contact Detail Page
    When I provide RFM contact name as RFM test contact
    And I click on Continue button
    Then I should navigate to RFM Contact Email Page
    When I provide RFM contact email as rfm@email.com
    And I click on Continue button
    Then I should navigate to RFM Contact Number Page
    When I select option No and continue to next
    Then I should navigate to under construction page
    When I select back link
    And I select option Yes and continue to next
    Then I should navigate to RFM Contact Input Page
    When I provide RFM contact number as 01632960001
    And I click on Continue button
    Then I should navigate to under construction page