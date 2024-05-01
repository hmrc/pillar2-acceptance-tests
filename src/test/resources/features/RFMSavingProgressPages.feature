@tests
Feature: RFM check your answers page
  As a replacing filing member
  I want to enter my subscription details and access CYA page to check my answers and carry on in the journey
  @zap_accessibility
  Scenario: 1 - Verify RFM check your answers page and successful navigation to corporate position page
    Given Organisation User logs in to RFM with credId RFMSaveProgress for Pillar2
    Then I should be on RFM enter pillar2 id page
    When I provide RFM pillar2 id as XMPLR0123456789
    And I click on Continue button
    Then I should be on RFM Registration Date Page
    When Registration Day is entered as 31
    When Registration Month is entered as 1
    And Registration Year is entered as 2024
    And I click on Continue button
    Then I should be on RFM CYA Page
    And I click on Save&Continue button
    Then I should be on RFM Saving Progress Page
    When I select back link
    Then I should be on RFM CYA Page
    And I click on Continue button
    Then I should be on RFM Saving Progress Page
    And I click on Continue button
    Then I access RFM corporate position page
    And I select corp position as UPE
    And I click on Continue button
    Then I should be on RFM Contact Guidance page
    And I click on Continue button
    Then I should navigate to RFM Contact Detail Page
    When I provide RFM contact name as RFM test contact
    And I click on Continue button
    Then I should navigate to RFM Contact Email Page
    When I provide RFM contact email as rfm@email.com
    When I click Sign out link
    And Organisation User logs in to RFM with credId RFMSaveProgress for Pillar2
    And I access RFM start page
    When I select confirmation checkbox
    And I click on Continue button
    Then I should be on RFM enter pillar2 id page
    And The caption must be Replace filing member
    And The Heading should be Enter the group’s Pillar 2 top-up taxes ID
    And I should see RFM field pillar2 id is pre-populated with XMPLR0123456789
    And I click on Continue button
    Then I should be on RFM Registration Date Page
    And I should see RFM date field Start Day is pre-populated with 31
    And I should see RFM date field Start Month is pre-populated with 1
    And I should see RFM date field Start Year is pre-populated with 2024
    And I click on Continue button
    Then I should be on RFM CYA Page
    And I click on Save&Continue button
    Then I should be on RFM Saving Progress Page
    And I click on Continue button
    Then I access RFM corporate position page
    And I should see the corporate position UPE remain selected

  Scenario: 2 - Validate Bookmark for RFM Saving Progress Pages
    Given Organisation User logs in with rfm URL to Pillar2
    When I access RFM Saving Progress page
    Then I should be on Bookmark page
