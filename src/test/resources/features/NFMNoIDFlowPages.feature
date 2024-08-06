@tests
Feature: NFM NO ID journey
  As a MNE user
  I would like to enter my details via NFM No ID journey

  @zap_accessibility @batch1
  Scenario: 1 - NFM No Id journey navigation to check your answers page and verify if data is pre populated
    Given Organisation User logs in as upe with credId NFMCYA for Pillar2
    When I select option Yes and continue to next
    When I select option UK limited company and continue to GRS page
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    When I click Add filing member details link
    Then I should navigate to NFM registration page
    And The caption must be Group details
    And The Heading should be Nominated filing member
    And The Body content should be The ultimate parent entity (UPE) is expected to report as the filing member. However, the UPE can nominate another company within your group.
    And The Body content should be If you are nominated to report as the filing member, you must have written permission from your UPE (such as an email). We won’t collect this during registration, but we may request it during compliance checks.
    And The field heading should be Are you registering as the nominated filing member to report for this group?
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
    When I enter Address as:
      | KEY          | VALUE              |
      | addressLine1 | Address Line 1 CYA |
      | addressLine3 | City CYA           |
      | countryCode  | United Kingdom     |
    Then I should see address error message Enter a full UK postcode on the Postal code Element
    And I enter Postal Code as EH5 5WY
    When I click on Continue button
    Then I should navigate to NFM Contact Name page
    And The caption must be Group details
    And The Heading should be What is the name of the person or team from the nominated filing member to keep on record?
    And The hint text should be For example, ‘Tax team’ or ‘Ashley Smith’.
    When I enter NFM Contact name as Contact CYA
    Then I should navigate to NFM Contact Email page
    And The Heading should be What is the email address for Contact CYA?
    And The hint text should be We will use this to confirm your records.
    When I enter NFM Contact Email as testcya@email.com
    Then I should navigate to NFM Telephone page
    And The caption must be Group details
    And The Heading should be Can we contact Contact CYA by telephone?
    And The hint text should be We will use this to confirm your records.
    When I select option Yes and continue to next
    Then I should navigate to input nfm telephone page
    And The caption must be Group details
    And The Heading should be What is the telephone number for Contact CYA?
    And The hint text should be For international numbers include the country code
    When I enter NFM Telephone Number as 1234569
    Then I should navigate to NFM Check your answers page
    And The caption must be Group details
    And The Heading should be Check your answers for filing member details
    And I should see details as below:
      | KEY                          | VALUE              |
      | Name                         | Test CYA           |
      | Address                      | Address Line 1 CYA |
      | Address                      | City CYA           |
      | Address                      | EH5 5WY            |
      | Address                      | United Kingdom     |
      | Contact name                 | Contact CYA        |
      | Email address                | testcya@email.com  |
      | Can we contact by telephone? | Yes                |
      | Telephone number             | 1234569            |
    When I select back link
    Then I should navigate to input nfm telephone page
    When I click on Continue button
    Then I should be on NFM Check your answers page
    When I click on Continue button
    Then I should be on Task list page
    And The Task Edit filing member details status should be Completed

  @batch1
  Scenario: 2 - Verify change answers for all NFM No ID journey pages and Verify back links
    Given Organisation User logs in with credId NFMCYA for Pillar2
    When I click Edit filing member details link
    When I click on Continue button
    And I should see the answer No remain selected
    Then I click on Continue button
    Then I should navigate to NFM Name page
    And I should see the NFM name field is pre-populated with Test CYA
    Then I click on Continue button
    And I should see the Address Line 1 field is pre-populated with Address Line 1 CYA
    Then I click on Continue button
    And I should see the NFM Contact name field is pre-populated with Contact CYA
    Then I click on Continue button
    And I should see the NFM Contact Email field is pre-populated with testcya@email.com
    Then I click on Continue button
    And I should see the answer Yes remain selected
    Then I click on Continue button
    Then I should see the NFM Telephone number field is pre-populated with 1234569
    Then I click on Continue button
    When I click on change hyperlink next to the NFM Name
    And I enter NFM name as Name () Change %^
    And I should see row 1 value Name () Change %^
    When I click on change hyperlink next to the NFM Address
    And I enter Address Line 1 as Change# Address $
    And I click on Continue button
    And I should see row 2 value Change# Address $
    And I should see row 2 value City CYA
    And I should see row 2 value United Kingdom
    When I click on change hyperlink next to the NFM Contact Name
    And I enter NFM Contact name as Change & Contact $ Person ~
    And I should see row 3 value Change & Contact $ Person ~
    When I click on change hyperlink next to the NFM Email Address
    And I enter NFM Contact Email as changetest&*@email.com
    And I should see row 4 value changetest&*@email.com
    When I click on change hyperlink next to the NFM Telephone Number
    And I enter NFM Telephone Number as 12345679
    And I should see row 6 value 12345679
    When I click on change hyperlink next to the NFM Telephone Contact
    And I select option No and continue to next
    And I should see row 5 value No

  @zap_accessibility @batch2
  Scenario: 3 - Validate different error messages for NFM no ID journey pages
    Given Organisation User logs in as upe for Pillar2
    And I select option Yes and continue to next
    And I select option UK limited company and continue to GRS page
    And I registered successfully with BV enabled
    When I click on Save&Continue button
    When I click Add filing member details link
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
    Then I should see NFM error message Enter the name of the nominated filing member on the Input NFM Name Element
    When I enter NFM name as NFM Name character length Error validation and Maximum NFM character length should be entered 105 characters.
    Then I should see NFM error message Name of the nominated filing member must be 105 characters or less on the Input NFM Name Element
    When I enter NFM name as Test <script>alert(document.domain)</script>
    Then I should navigate to NFM Address page
    And the page title should be What is the registered office address? - Report Pillar 2 top-up taxes - GOV.UK
    When I click on Continue button
    Then I should see NFM error message Enter the first line of the address on the Address Line 1 Element
    And I should see NFM error message Enter the town or city on the City Element
    And I should see NFM error message Enter the country on the Country Element
    When I enter Address Line 1 as Address Line 1 Character Length Test1
    And I enter Address Line 2 as Address Line 2 Character Length Test1
    And I enter City as City Field Character Length Test Error
    And I enter Region as Region Field Character Length Test Error
    And I enter Postal Code as 12345678901
    And I enter Country as Australia
    And I click on Country selected
    And I click on Continue button
    Then I should see NFM error message First line of the address must be 35 characters or less on the Address Line 1 Element
    And I should see NFM error message Second line of the address must be 35 characters or less on the Address Line 2 Element
    And I should see NFM error message Town or city must be 35 characters or less on the City Element
    And I should see NFM error message Region must be 35 characters or less on the Region Element
    And I should see NFM error message Postcode must be 10 characters or less on the Postal Code Element
    When I enter Address Line 1 as Test Address Line 1
    And I enter Address Line 2 as Test Address Line 2
    And I enter Region as Region
    And I enter City as Test City
    When I enter Postal Code as 1334445
    When I click on Continue button
    Then I should navigate to NFM Contact Name page
    And I click on Continue button
    Then I should see NFM error message Enter the name of the person or team from the nominated filing member to keep on record on the Input NFM Contact Name Element
    When I enter NFM Contact name as NFM Contact
    When I click on Continue button
    Then I should navigate to NFM Contact Email page
    And the page title should be What is the email address? - Report Pillar 2 top-up taxes - GOV.UK
    When I click on Continue button
    Then I should see NFM error message Enter the email address for NFM Contact on the Input NFM Contact Email Element
    When I enter NFM Contact Email as incorrect email
    Then I should see NFM error message Enter an email address in the correct format, like name@example.com on the Input NFM Contact Email Element
    When I enter NFM Contact Email as NFMNameCharacterLengthErrorValidation@andMaximumNFMCharacterLengthShouldBeEnteredMoreThanOneHundredThirtyTwoCharactersForEmailTextField.com
    Then I should see NFM error message Email address must be 132 characters or less on the Input NFM Contact Email Element
    And I enter NFM Contact Email as test@email.com
    Then I should navigate to NFM Telephone page
    And the page title should be Can we contact by telephone? - Report Pillar 2 top-up taxes - GOV.UK
    When I click on Continue button
    Then I should see error message Select yes if we can contact NFM Contact by telephone on the NFM Telephone Page
    When I select option Yes and continue to next
    Then I should navigate to input nfm telephone page
    And the page title should be What is the telephone number? - Report Pillar 2 top-up taxes - GOV.UK
    When I click on Continue button
    Then I should see error message Enter the telephone number for NFM Contact on the Input Nfm Telephone Page
    When I enter NFM Telephone Number as 1234567812345678123456780
    Then I should see error message The telephone number should be 24 characters or less on the Input Nfm Telephone Page
    When I enter NFM Telephone Number as 1234567@
    Then I should see error message Enter the telephone number for NFM Contact in the correct format, like 01632 960 001 or +44 808 157 0192 on the Input Nfm Telephone Page
    When I enter NFM Telephone Number as 9923-456
    When I click on change hyperlink next to the NFM Telephone Contact
    And I select option No and continue to next
    And I should see row 5 value No
    And I select back link
    Then I should see the answer No remain selected
    And I click on Continue button
    And I click on Continue button
    Then The Task Edit filing member details status should be Completed
