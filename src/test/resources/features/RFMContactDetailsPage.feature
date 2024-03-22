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
    Then I should navigate to RFM Contact Email Page
    And The caption must be Contact details
    And The Heading should be What is the email address for RFM test contact?
    And The hint text should be We will only use this to contact you about Pillar 2 top-up taxes.
    And I click on Continue button
    Then I should see an error message You need to enter the email address for RFM test contact on the RFM Contact Email Page
    When I provide RFM contact email as FormatErrorTest.com
    And I click on Continue button
    Then I should see an error message Enter an email address in the correct format, like name@example.com on the RFM Contact Email Page
    When I provide RFM contact email as ContactNameCharacterLengthErrorValidation@andMaximumNFMCharacterLengthShouldBeEnteredMoreThanOneHundredThirtyTwoCharactersForEmailTextField.com
    And I click on Continue button
    Then I should see an error message The email address should be 132 characters or less on the RFM Contact Email Page
    When I provide RFM contact email as rfm@email.com
    And I click on Continue button
    Then I should navigate to RFM Contact Number Page
    And The caption must be Contact details
    And The Heading should be Can we contact RFM test contact by telephone?
    And I click on Continue button
    Then I should see an error message Select yes if we can contact RFM test contact by telephone on the RFM Contact Number Page
    When I select option No and continue to next
    Then I should navigate to under construction page
    When I select back link
    And I select option Yes and continue to next
    Then I should navigate to RFM Contact Input Page
    And The caption must be Contact details
    And The Heading should be What is the telephone number for RFM test contact?
    And The hint text should be For international numbers include the country code
    And I click on Continue button
    Then I should see an error message Enter a telephone number, like 01632 960 001 or +44 808 157 0192 on the RFM Contact Input Page
    When I provide RFM contact number as 12345678@
    When I click on Continue button
    Then I should see an error message The telephone number must include only letters a to z, numbers, brackets, hyphens, forward slashes, asterisks, hashtags and plus signs on the RFM Contact Input Page
    When I provide RFM contact number as 1234567890123456789012345
    When I click on Continue button
    Then I should see an error message The telephone number should be 24 characters or less on the RFM Contact Input Page
    When I provide RFM contact number as 01632960001
    And I click on Continue button
    Then I should navigate to under construction page