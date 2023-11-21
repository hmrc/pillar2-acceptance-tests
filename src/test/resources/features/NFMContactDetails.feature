@tests @zap_accessibility
Feature: Enter NFM registered contact name and contact email address
  As an NFM user
  I want to enter the contact details

  Scenario: 1 - Create a new subscription for validating NFM Contact Name and Contact Email Address
  Given Organisation User logs in as upe with credId NFMContactDetails for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit ultimate parent's details status should be Completed
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option No and continue to next
    Then I should navigate to NFM Name page
    When I enter NFM name as NFM Test
    When I enter Address Line 1 as Test Address Line 1
    And I enter City as Test City
    And I enter Postal Code as EH5 5WY
    And I select country as United Kingdom
    When I click on Continue button
    Then I should navigate to NFM Contact Name page
    And The caption must be Group details
    And The Heading should be What is the name of the person or team we should contact from the nominated filing member?
    And The Body content should be For example, ‘Tax team’ or ‘Ashley Smith’.
    When I enter NFM Contact name as NFM Test Contact
    When I click on Continue button
    Then I should navigate to NFM Contact Email page
    And The Heading should be What is the email address for NFM Test Contact?
    And The Body content should be We will use this to confirm your records
    When I enter NFM Contact Email as test@email.com
    When I click on Continue button
    Then I should navigate to NFM Telephone page
    When I select back link
    Then I should navigate to NFM Contact Email page
    When I select back link
    Then I should navigate to NFM Contact Name page
    When I select back link
    Then I should navigate to NFM Address page
    When I select back link
    Then I should navigate to NFM Name page
    And I click Sign out link
    Then I am on feedback survey page
    Given Organisation User logs in with credId NFMContactDetails for Pillar2
    And The Task Add filing member's details status should be In progress
    When I click Add filing member's details link
    And I click on Continue button
    Then I should navigate to NFM details page
    When I click on Continue button
    Then I should navigate to NFM Name page
    And I should see the NFM name field is pre-populated with NFM Test
    When I click on Continue button
    Then I should see the Address Line 1 field is pre-populated with Test Address Line 1
    And I should see the City field is pre-populated with Test City
    And I should see the Country field is selected with GB
    When I click on Continue button
    Then I should navigate to NFM Contact Name page
    And I should see the NFM Contact name field is pre-populated with NFM Test Contact
    When I click on Continue button
    Then I should navigate to NFM Contact Email page
    And I should see the NFM Contact Email field is pre-populated with test@email.com

  Scenario: 2 - NFM Contact Name and Contact Email pages Error validations
    Given I clear the cache
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit ultimate parent's details status should be Completed
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option No and continue to next
    Then I should navigate to NFM Name page
    When I enter NFM name as NFM Test
    When I click on Continue button
    When I enter Address Line 1 as Test Address Line 1
    And I enter City as Test City
    And I enter Postal Code as EH5 5WY
    And I select country as United Kingdom
    When I click on Continue button
    Then I should navigate to NFM Contact Name page
    When I click on Continue button
    Then I should see NFM error message You need to enter the name of the person or team we should contact from the nominated filing member on the Input NFM Contact Name Element
    When I enter NFM Contact name as NFM Name character length Error validation and Maximum NFM character length should be entered 105 characters.
    When I click on Continue button
    Then I should see NFM error message The name of the contact person or team should be 105 characters or less on the Input NFM Contact Name Element
    When I enter NFM Contact name as NFM Test Contact
    When I click on Continue button
    Then I should navigate to NFM Contact Email page
    When I click on Continue button
    Then I should see NFM error message You need to enter the email address for NFM Test Contact on the Input NFM Contact Email Element
    When I enter NFM Contact Email as incorrect email
    When I click on Continue button
    Then I should see NFM error message Enter an email address in the correct format, like name@example.com on the Input NFM Contact Email Element
    When I enter NFM Contact Email as NFMNameCharacterLengthErrorValidation@andMaximumNFMCharacterLengthShouldBeEnteredMoreThanOneHundredThirtyTwoCharactersForEmailTextField.com
    When I click on Continue button
    Then I should see NFM error message The email address should be 132 characters or less on the Input NFM Contact Email Element

  Scenario: 3 - Validate Bookmark for NFM Contact Name and NFM Contact Email Pages
   Given Organisation User logs in NFM Contact Name page for Pillar2
    Then The Heading should be Task not yet started
    Given Organisation User logs in NFM Contact Email page for Pillar2
    Then The Heading should be Task not yet started
