@tests
Feature: NFM NO ID journey
  As a MNE user
  I would like to enter my details via NFM No ID journey
  @zap_accessibility
  Scenario: 1 - NFM No Id journey navigation to check your answers page and verify if data is pre populated
    Given Organisation User logs in as upe with credId NFMCYA for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    Then I should navigate to Task list page
    When I click Add filing member’s details link
    Then I should navigate to NFM registration page
    And The caption must be Group details
    And The Heading should be Nominate a filing member
    And The Body content should be A nominated filing member must be nominated by the UPE and must have access to information required to report Pillar 2 top-up taxes.
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    And The caption must be Group details
    And The Heading should be Is the nominated filing member registered in the UK?
    When I select option No and continue to next
    Then I should navigate to NFM Name page
    And The caption must be Group details
    And The Heading should be What is the name of the nominated filing member?
    When I enter NFM name as Test CYA
    And The caption must be Group details
    And The Heading should be What is the registered office address of Test CYA?
    And The hint text should be Enter text and then choose from the list.
    And I enter Address Line 1 as Address Line 1 CYA
    And I enter City as City CYA
    And I enter Country as United Kingdom
    And I click on Country selected
    When I click on Continue button
    Then I should see address error message Enter a valid UK postal code or change the country you selected on the Postal code Element
    And I enter Postal Code as EH5 5WY
    When I click on Continue button
    Then I should navigate to NFM Contact Name page
    And The caption must be Group details
    And The Heading should be What is the name of the person or team we should contact from the nominated filing member?
    And The hint text should be For example, ‘Tax team’ or ‘Ashley Smith’.
    When I enter NFM Contact name as Contact CYA
    And I click on Continue button
    Then I should navigate to NFM Contact Email page
    And The Heading should be What is the email address for Contact CYA?
    And The hint text should be We will use this to confirm your records.
    When I enter NFM Contact Email as testcya@email.com
    And I click on Continue button
    Then I should navigate to NFM Telephone page
    And The caption must be Group details
    And The Heading should be Can we contact Contact CYA by telephone?
    And The hint text should be We will use this to confirm your records.
    When I select option Yes and continue to next
    Then I should navigate to input nfm telephone page
    And The caption must be Group details
    And The Heading should be What is the telephone number for Contact CYA?
    And The hint text should be Enter a telephone number, like 01632 960 001, 07700 900 982. For international numbers include the country code, like +44 808 157 0192 or 0044 808 157 0192.
    When I enter NFM Telephone Number as 1234569
    And I click on Continue button
    Then I should navigate to NFM Check your answers page
    And The caption must be Group details
    And The Heading should be Check your answers
    And I should see row 1 key Name
    And I should see row 2 key Address
    And I should see row 3 key Contact name
    And I should see row 4 key Email address
    And I should see row 5 key Can we contact by telephone?
    And I should see row 6 key Telephone number
    And I should see row 1 value Test CYA
    And I should see row 2 value Address Line 1 CYA
    And I should see row 2 value City CYA
    And I should see row 2 value EH5 5WY
    And I should see row 2 value United Kingdom
    And I should see row 3 value Contact CYA
    And I should see row 4 value testcya@email.com
    And I should see row 5 value Yes
    And I should see row 6 value 1234569
    When I select back link
    Then I should navigate to input nfm telephone page
    When I click on Continue button
    Then I should be on NFM Check your answers page
    When I click on Continue button
    Then I should be on Task list page
    And The Task Edit filing member’s details status should be Completed
    Then I click Sign out link
    Then I am on feedback survey page

  Scenario: 2 - Verify change answers for all NFM No ID journey pages
    Given Organisation User logs in with credId NFMCYA for Pillar2
    When I click Edit filing member’s details link
    Then I should navigate to NFM registration page
    When I click on Continue button
    Then I should navigate to NFM details page
    And I should see the answer No remain selected
    And I click on Continue button
    Then I should navigate to NFM Name page
    And I should see the NFM name field is pre-populated with Test CYA
    And I click on Continue button
    And I should see the Address Line 1 field is pre-populated with Address Line 1 CYA
    And I should see the City field is pre-populated with City CYA
    And I should see the Postal Code field is pre-populated with EH5 5WY
    And I should see the Country field is pre-populated with United Kingdom
    And I click on Continue button
    And I should see the NFM Contact name field is pre-populated with Contact CYA
    And I click on Continue button
    And I should see the NFM Contact Email field is pre-populated with testcya@email.com
    And I click on Continue button
    And I should see the answer Yes remain selected
    And I click on Continue button
    Then I should see the NFM Telephone number field is pre-populated with 1234569
    And I click on Continue button
    Then I should be on NFM Check your answers page
    When I click on change hyperlink next to the NFM Name
    And I enter NFM name as Name Change
    Then I navigate back to check your answers page from name page
    Then I should be on NFM Check your answers page
    And I should see row 1 value Name Change
    When I click on change hyperlink next to the NFM Address
    And I enter Address Line 1 as Change Address
    Then I navigate back to check your answers page from address page
    And I should be on NFM Check your answers page
    And I should see row 2 value Change Address
    And I should see row 2 value City CYA
    And I should see row 2 value United Kingdom
    When I click on change hyperlink next to the NFM Contact Name
    And I enter NFM Contact name as Change Contact Person
    Then I navigate back to check your answers page from contact name page
    And I should be on NFM Check your answers page
    And I should see row 3 value Change Contact Person
    When I click on change hyperlink next to the NFM Email Address
    And I enter NFM Contact Email as changetest@email.com
    Then I navigate back to check your answers page from email address page
    And I should be on NFM Check your answers page
    And I should see row 4 value changetest@email.com
    When I click on change hyperlink next to the NFM Telephone Number
    And I enter NFM Telephone Number as 12345679
    Then I navigate back to check your answers page from telephone number page
    And I should be on NFM Check your answers page
    And I should see row 6 value 12345679
    When I click on change hyperlink next to the NFM Telephone Contact
    And I select option No and continue to next
    Then I should be on NFM Check your answers page
    And I should see row 5 value No

  @zap_accessibility
  Scenario: 3 - Validate different error messages for NFM no ID journey pages
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    And I select option Yes and continue to next
    And I select option UK limited company and continue to GRS page
    And I registered successfully with BV enabled
    When I click on Save&Continue button
    Then I should navigate to Task list page
    When I click Add filing member’s details link
    Then I should navigate to NFM registration page
    When I click on Continue button
    Then I should see NFM error message Select yes if you want to register a nominated filing member to report for this group on the NFM registration page Element
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I click on Continue button
    Then I should see NFM error message Select yes if the nominated filing member is registered in the UK on the NFM details page Element
    When I select option No and continue to next
    Then I should navigate to NFM Name page
    And The caption must be Group details
    And The Heading should be What is the name of the nominated filing member?
    When I click on Continue button
    Then I should see NFM error message You need to enter the name of the nominated filing member on the Input NFM Name Element
    When I enter NFM name as NFM Name character length Error validation and Maximum NFM character length should be entered 105 characters.
    Then I should see NFM error message The name of the nominated filing member must be 105 characters or less on the Input NFM Name Element
    When I enter NFM name as Test <script>alert(document.domain)</script>
    Then I should see NFM error message The name of the new nominated filing member must only include letters a to z, numbers 0 to 9, ampersands (&), apostrophes, commas, forward slashes, full stops, hyphens, round brackets and spaces on the Input NFM Name Element
    When I enter NFM name as NFM Test
    Then I should navigate to NFM Address page
    And the page title should be What is the registered office address? - Report Pillar 2 top-up taxes - GOV.UK
    When I click on Continue button
    Then I should see NFM error message Enter the first line of the address on the Address Line 1 Element
    And I should see NFM error message Enter the town or city on the City Element
    And I should see NFM error message Select a country on the Country Element
    When I enter Address Line 1 as Address Line 1 Character Length Test1
    And I enter Address Line 2 as Address Line 2 Character Length Test1
    And I enter City as City Field Character Length Test Error
    And I enter Region as Region Field Character Length Test Error
    And I enter Postal Code as 12345678901
    And I enter Country as Australia
    And I click on Country selected
    And I click on Continue button
    Then I should see NFM error message The first line of the address must be 35 characters or less on the Address Line 1 Element
    And I should see NFM error message The second line of the address must be 35 characters or less on the Address Line 2 Element
    And I should see NFM error message The town or city must be 35 characters or less on the City Element
    And I should see NFM error message The region must be 35 characters or less on the Region Element
    And I should see NFM error message The postal code must be 10 characters or less on the Postal Code Element
    When I enter Address Line 1 as Test Address Line 1
    And I enter Address Line 2 as Test Address Line 2
    And I enter Region as Region
    And I enter City as Test City
    When I enter Postal Code as 1334445
    When I click on Continue button
    Then I should navigate to NFM Contact Name page
    And I click on Continue button
    Then I should see NFM error message You need to enter the name of the person or team we should contact from the nominated filing member on the Input NFM Contact Name Element
    When I enter NFM Contact name as NFM Contact
    When I click on Continue button
    Then I should navigate to NFM Contact Email page
    And the page title should be What is the email address? - Report Pillar 2 top-up taxes - GOV.UK
    When I click on Continue button
    Then I should see NFM error message You need to enter the email address for NFM Contact on the Input NFM Contact Email Element
    When I enter NFM Contact Email as incorrect email
    When I click on Continue button
    Then I should see NFM error message Enter an email address in the correct format, like name@example.com on the Input NFM Contact Email Element
    When I enter NFM Contact Email as NFMNameCharacterLengthErrorValidation@andMaximumNFMCharacterLengthShouldBeEnteredMoreThanOneHundredThirtyTwoCharactersForEmailTextField.com
    When I click on Continue button
    Then I should see NFM error message The email address should be 132 characters or less on the Input NFM Contact Email Element
    And I enter NFM Contact Email as test@email.com
    When I click on Continue button
    Then I should navigate to NFM Telephone page
    And the page title should be Can we contact by telephone? - Report Pillar 2 top-up taxes - GOV.UK
    When I click on Continue button
    Then I should see error message Select yes if we can contact NFM Contact by telephone on the NFM Telephone Page
    When I select option Yes and continue to next
    Then I should navigate to input nfm telephone page
    And the page title should be What is the telephone number? - Report Pillar 2 top-up taxes - GOV.UK
    When I click on Continue button
    Then I should see error message You need to enter the telephone for NFM Contact on the Input Nfm Telephone Page
    When I enter NFM Telephone Number as 1234567812345678123456780
    And I click on Continue button
    Then I should see error message The telephone number should be 24 characters or less on the Input Nfm Telephone Page
    When I enter NFM Telephone Number as 1234567@
    And I click on Continue button
    Then I should see error message Enter a telephone number in the correct format on the Input Nfm Telephone Page
    When I enter NFM Telephone Number as 9923-456
    When I click on Continue button
    Then I should be on NFM Check your answers page
    When I click on change hyperlink next to the NFM Telephone Contact
    And I select option No and continue to next
    Then I should be on NFM Check your answers page
    And I should see row 5 value No
    And I select back link
    Then I should see the answer No remain selected
    And I click Continue button
    Then I should be on NFM Check your answers page
    And I click on Continue button
    Then The Task Edit filing member’s details status should be Completed

  Scenario: 4 - Verify back link for all NFM No ID journey pages and status validation
    Given Organisation User logs in as upe with credId NFMBack for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    Then I should navigate to Task list page
    Then The Task Add filing member’s details status should be Not started
    When I click Add filing member’s details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option No and continue to next
    Then I should navigate to NFM Name page
    Then I select back link
    Then I should be on NFM details page
    And I select back link
    Then I should be on NFM registration page
    And I select back link
    Then I should be on Task list page
    And The Task Add filing member’s details status should be In progress
    And I click Add filing member’s details link
    And I click on Continue button
    And I click on Continue button
    Then I should navigate to NFM Name page
    When I enter NFM name as Test CYA
    And I enter Address Line 1 as Address Line 1 CYA
    And I enter City as City CYA
    And I enter Postal Code as EH5 5WY
    And I enter Country as United Kingdom
    And I click on Country selected
    When I click on Continue button
    Then I should navigate to NFM Contact Name page
    When I enter NFM Contact name as Contact CYA
    And I click on Continue button
    Then I should navigate to NFM Contact Email page
    When I enter NFM Contact Email as testcya@email.com
    And I click on Continue button
    Then I should navigate to NFM Telephone page
    When I select option Yes and continue to next
    Then I should navigate to input nfm telephone page
    When I enter NFM Telephone Number as 1234569
    And I click on Continue button
    Then I should navigate to NFM Check your answers page
    Then I select back link
    Then I should be on input nfm telephone page
    Then I select back link
    Then I should be on NFM Telephone page
    Then I select back link
    Then I should be on NFM Contact Email page
    Then I select back link
    Then I should be on NFM Contact Name page
    Then I select back link
    Then I should navigate to NFM Address page
    Then I select back link
    Then I should be on NFM Name page
    Then I select back link
    Then I should be on NFM details page
    Then I select back link
    Then I should be on NFM registration page








