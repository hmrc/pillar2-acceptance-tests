@tests
Feature: replacing existing contact details
  As a Subscription user
  I should be displayed with contact details in use contact page
  @zap_accessibility
  Scenario: 1 - Verify RFM guidance page
    Given Organisation User logs in as upe for Pillar2
    Then I access RFM Contact Guidance page
    Then I should be on RFM Contact Guidance page
    And The caption must be Contact details
    And The Heading should be We need contact details for your Pillar 2 top-up taxes account
    And The Body content should be We need information about the filing member of this group so we can contact the right person or team when reviewing your Pillar 2 top-up tax compliance.
    And I click on Continue button
    When I select back link
    Then I should be on RFM Contact Guidance page
    And I click on Continue button
    Then I should navigate to RFM Contact Detail Page
    And The caption must be Contact details
    And The Heading should be What is the name of the person or team we should contact about Pillar 2 top-up taxes?
    And The hint text should be For example, ‘Tax team’ or ‘Ashley Smith’.
    And I click on Continue button
    Then I should see an error message Enter name of the person or team we should contact on the RFM contact detail Page
    When I provide RFM contact name as NFM Name character length Error validation and Maximum NFM character length should be entered 160 characters. NFM Name character length Error validation and Maximum NFM character length should be entered 160
    And I click on Continue button
    Then I should see an error message Name of the contact person or team should be 160 characters or less on the RFM contact detail Page
    When I provide RFM contact name as RFM test contact
    And I click on Continue button
    Then I should navigate to under construction page