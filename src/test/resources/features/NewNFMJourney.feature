@tests
Feature: New NFM Journey
  As a Replacing Filing member
  I would link to enter my details via New NFM journey

  @zap_accessibility
  Scenario: 1 - Verify RFM corporate position page and validations
    Given Organisation User logs in as upe for Pillar2
    And I access RFM New NFM guidance page
    Then I should be on New NFM guidance page
    And The caption must be Group details
    And The Heading should be We need to match the details of the new nominated filing member to HMRC records
    And The Body content should be We will ask you for several pieces of identifying information about the new nominated filing member so that we can best match them to our records.
    When I click on Continue button
    Then I should be on RFM registered in UK page
    When I select back link
    Then I should be on New NFM guidance page
    And I click on Continue button
    Then I should be on RFM registered in UK page
    And The caption is Group details
    And The Heading should be Is the new nominated filing member registered in the UK?
    And I click on Continue button
    Then I should see an error message Select yes if the new nominated filing member is registered in the UK on the RFM journey error Page
    When I select option No and continue to next
    And I click on Continue button
    Then I should navigate to RFM New NFM Contact Name Page
    When I select back link
    Then I should be on RFM registered in UK page


