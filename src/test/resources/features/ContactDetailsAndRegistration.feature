@tests
Feature: Secondary Contact details for the filing member
  As a NFM Subscription user
  I want to enter the secondary contact details,in case the first in not able to be reached

  Scenario: 1 - Create a new subscription with UPE GRS Flow and NFM No Id flow to validate Contact Details
    Given Organisation User logs in as upe with credId ContactDetails for Pillar2
    Then I should be on UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test
    Then I should navigate to input-upe-address page
    When I enter Address Line 1 as Address Line 1
    And I enter City as City
    And I enter Postal Code as EH5 5WY
    And I enter Country as United Kingdom
    And I click on Country selected
    And I click on Continue button
    Then I should navigate to UPE Contact person/team Name page
    When I enter UPE Person/Team name as UPE Test
    And I click on Continue button
    Then I should navigate to UPE Contact Email page
    When I enter UPE Email address as testupe@email.com
    And I click on Continue button
    Then I should navigate to UPE Telephone page
    When I select option Yes and continue to next
    Then I should navigate to input telephone page
    And I enter Telephone Number as 123456
    And I click on Continue button
    Then I should be on Check your answers page
    And I click on Continue button
    When I click Add filing member’s details link
    Then I should navigate to NFM registration page
    When I select No option and continue to next
    When I click Add further group details link
    Then I should navigate to MNE or domestic page
    When I select option In the UK and other countries in further details group status page
    And I click on Continue button
    Then I should navigate to Group accounting period page
    When Accounting Period Start Day is entered as 15
    And Accounting Period Start Month is entered as 1
    And Accounting Period Start Year is entered as 2024
    When Accounting Period End Day is entered as 15
    And Accounting Period End Month is entered as 1
    And Accounting Period End Year is entered as 2025
    And I click on Continue button
    Then I should navigate to FD check your answers page
    And I click on Continue button
    Then I should navigate to Task list page
    Then The Task Add contact details status should be Not started
    When I click Add contact details link
    Then I should navigate to Contact details guidance page
    And The caption must be Contact details
    And The Heading should be We need contact details for the filing member
    And The Body content should be We need information about the filing member of this group so we can contact the right person or team when reviewing your compliance with Pillar 2 top-up taxes.
    And The Body content should be These may be different to any contact details you have already provided during registration, which were used to match your business with our records.
    When I click on Continue button
    Then I should navigate to Contact details display page
    And The Heading should be Saved contact
    And I should see the contact details row 1 as UPE Test on use contact page
    And I should see the contact details row 2 as testupe@email.com on use contact page
    And I should see the contact details row 3 as 123456 on use contact page
    When I select option No and continue to next
    Then I should navigate to Contact details input name page
    And The caption must be Contact details
    And The Heading should be What is the name of the person or team we should contact about compliance with Pillar 2 top-up taxes?
    When I enter Contact Name as Contact Name Test
    And I click on Continue button
    Then I should navigate to Contact details input email page
    And the page title should be What is the email address? - Report Pillar 2 top-up taxes - GOV.UK
    And The caption must be Contact details
    And The Heading should be What is the email address for Contact Name Test
    And The Body content should be We will only use this to contact you about Pillar 2 top-up taxes.
    When I enter Contact Email as testContact@email.com
    And I click on Continue button
    Then I should navigate to Contact details telephone page
    And the page title should be Can we contact by telephone? - Report Pillar 2 top-up taxes - GOV.UK
    And The caption must be Contact details
    And The Heading should be Can we contact Contact Name Test by telephone?
    When I select option No and continue to next
    Then I should navigate to Second Contact details page
    When I select back link
    Then I should navigate to Contact details telephone page
    When I select option Yes and continue to next
    Then I should navigate to Contact details input telephone page
    And the page title should be What is the telephone number? - Report Pillar 2 top-up taxes - GOV.UK
    And The caption must be Contact details
    And The Heading should be What is the telephone number for Contact Name Test?
    And The Body content should be Enter a telephone number, like 01632 960 001, 07700 900 982. For international numbers include the country code, like +44 808 157 0192 or 0044 808 157 0192.
    When I enter Contact Telephone as 1234554
    And I click on Continue button
    Then I should navigate to Second Contact details page
    And the page title should be Is there someone else we can contact? - Report Pillar 2 top-up taxes - GOV.UK
    And The caption must be Contact details
    And The Heading should be Is there someone else we can contact if Contact Name Test is not available?
    And The Body content should be This can be a team mailbox or another contact who is able to deal with enquiries about the group’s management of Pillar 2 top-up taxes.
    When I select option No and continue to next
    Then I should navigate to Contact address input page
    When I select back link
    Then I should navigate to Second Contact details page
    When I select option Yes and continue to next
    Then I should navigate to Second Contact name page
    And The caption must be Contact details
    And The Heading should be What is the name of the person or team we should contact about compliance with Pillar 2 top-up taxes?
    And The Body content should be For example, ‘Tax team’ or ‘Ashley Smith’.
    When I enter Second Contact Name as Second Contact Name Test
    And I click on Continue button
    Then I should navigate to Second Contact email page
    And The caption must be Contact details
    And The Heading should be What is the email address for Second Contact Name Test?
    And The Body content should be We will only use this to contact you about Pillar 2 top-up taxes.
    And the page title should be What is the email address? - Report Pillar 2 top-up taxes - GOV.UK
    When I enter Second Contact Email as secondContact@email.com
    And I click on Continue button
    Then I should navigate to Second Contact number page
    And the page title should be Can we contact by telephone? - Report Pillar 2 top-up taxes - GOV.UK
    When I select option Yes and continue to next
    Then I should navigate to Second Contact Input page
    When I enter Second Contact Input as 1234554
    And I click on Continue button
    Then I should navigate to Contact address input page
    And The caption must be Contact details
    And The Heading should be What address do you want to use as the filing member’s contact address?
    When I enter Address Line 1 as Address Line 1
    And I enter City as City
    And I enter Postal Code as EH5 5WY
    And I enter Country as United Kingdom
    And I click on Country selected
    When I click on Continue button
    Then I should navigate to Contact details Check answers page
    When I select back link
    Then I should navigate to Contact address input page
    When I select back link
    Then I should navigate to Second Contact Input page
    And I should see the Second Contact Input field is pre-populated with 1234554
    When I select back link
    Then I should navigate to Second Contact number page
    And I should see the answer Yes remain selected
    When I select back link
    Then I should navigate to Second Contact email page
    And I should see the Second Contact Email field is pre-populated with secondContact@email.com
    When I select back link
    Then I should navigate to Second Contact name page
    And I should see the Second Contact Name field is pre-populated with Second Contact Name Test
    When I select back link
    Then I should navigate to Second Contact details page
    And I should see the answer Yes remain selected
    When I select back link
    Then I should navigate to Contact details input telephone page
    And I should see the Contact Telephone field is pre-populated with 1234554
    When I select back link
    And I should see the answer Yes remain selected
    When I select back link
    Then I should navigate to Contact details input email page
    And I should see the Contact Email field is pre-populated with testContact@email.com
    When I select back link
    Then I should navigate to Contact details input name page
    And I should see the Contact Name field is pre-populated with Contact Name Test
    When I select back link
    Then I should navigate to Contact details display page
    And I should see the answer No remain selected
    When I select back link
    Then I should navigate to Contact details guidance page
    When I select back link
    Then I should navigate to Task list page
    Then The Task Edit contact details status should be Completed
    And The Task Check your answers status should be Not started
    When I click Sign out link
    Then I am on feedback survey page

  Scenario: 2 - Check you Answers Page Validations
    Given Organisation User navigates to Contact Details check your answer page with credId ContactDetails
    Then I should be on Contact details Check answers page
    And The caption must be Contact details
    And The Heading should be Check your answers for contact details
    And I should see row 1 key Contact name
    And I should see row 2 key Email address
    And I should see row 3 key Can we contact by telephone?
    And I should see row 4 key Telephone number
    And I should see row 1 value Contact Name Test
    And I should see row 2 value testContact@email.com
    And I should see row 3 value Yes
    And I should see row 4 value 1234554
    And I should see row 5 key Do you have a second contact?
    And I should see row 6 key Second contact name
    And I should see row 7 key Second contact email address
    And I should see row 8 key Can we contact by telephone?
    And I should see row 9 key Second contact telephone number
    And I should see row 10 key Address
    And I should see row 5 value Yes
    And I should see row 6 value Second Contact Name Test
    And I should see row 7 value secondContact@email.com
    And I should see row 8 value Yes
    And I should see row 9 value 1234554
    And I should see row 10 value Address Line 1
    And I should see row 10 value City
    And I should see row 10 value EH5 5WY
    And I should see row 10 value United Kingdom
    When I click on change link for Contact Name
    When I enter Contact Name as Contact Name Change
    And I click on Continue button
    Then I should navigate to Contact details Check answers page
    When I click on change link for Email address
    When I enter Contact Email as emailchange@test.com
    And I click on Continue button
    Then I should navigate to Contact details Check answers page
    When I click on change link for Telephone number
    When I enter Contact Telephone as 1234555
    And I click on Continue button
    When I click on change link for Second Contact Name
    And I enter Second Contact Name as Second Contact Name Change
    And I click on Continue button
    Then I should navigate to Contact details Check answers page
    When I click on change link for Second Contact Email
    When I enter Second Contact Email as secondContactchange@email.com
    And I click on Continue button
    When I click on change link for Second Contact Telephone number
    When I enter Second Contact Input as 71235643
    And I click on Continue button
    When I click on change link for Address
    When I enter Address Line 1 as Address Change
    And I click on Continue button
    And I should see row 1 value Contact Name Change
    And I should see row 2 value emailchange@test.com
    And I should see row 4 value 1234555
    And I should see row 6 value Second Contact Name Change
    And I should see row 7 value secondContactchange@email.com
    And I should see row 8 value Yes
    And I should see row 9 value 71235643
    And I should see row 10 value Address Change
    And I click on Continue button
    When I click Check your answers link
    Then I should be on Review answers page
    And I should see row 1 key Name
    And I should see row 2 key Address
    And I should see row 3 key Contact name
    And I should see row 4 key Email address
    And I should see row 5 key Can we contact by telephone?
    And I should see row 6 key Telephone number
    And I should see row 1 value Test
    And I should see row 2 value Address Line 1
    And I should see row 2 value City
    And I should see row 2 value EH5 5WY
    And I should see row 2 value United Kingdom
    And I should see row 3 value UPE Test
    And I should see row 4 value testupe@email.com
    And I should see row 5 value Yes
    And I should see row 6 value 123456
    And I should see row 7 key Is there a nominated filing member
    And I should see row 7 value No
    And I should see row 8 key Where are the entities in your group located?
    And I should see row 9 key Group’s consolidated accounting period
    And I should see row 10 key Start date
    And I should see row 11 key End date
    And I should see row 8 value In the UK and other countries
    And I should see row 10 value 15 January 2024
    And I should see row 11 value 15 January 2025
    And I should see row 12 key Contact name
    And I should see row 13 key Email address
    And I should see row 14 key Can we contact by telephone?
    And I should see row 15 key Telephone number
    And I should see row 16 key Do you have a second contact?
    And I should see row 17 key Second contact name
    And I should see row 18 key Second contact email address
    And I should see row 19 key Can we contact by telephone?
    And I should see row 20 key Second contact telephone number
    And I should see row 21 key Address
    And I should see row 12 value Contact Name Change
    And I should see row 13 value emailchange@test.com
    And I should see row 14 value Yes
    And I should see row 15 value 1234555
    And I should see row 16 value Yes
    And I should see row 17 value Second Contact Name Change
    And I should see row 18 value secondContactchange@email.com
    And I should see row 19 value Yes
    And I should see row 20 value 71235643
    And I should see row 21 value Address Change
    When I click Report Pillar 2 top-up taxes link
    Then I should navigate to Task list page
    Then I click Edit contact details link
    Then I should navigate to Contact details guidance page
    When I click on Continue button
    Then I should navigate to Contact details display page
    When I select option Yes and continue to next
    Then I should navigate to Second Contact details page
    When I select option No and continue to next
    Then I should navigate to Contact address input page
    When I click on Continue button
    Then I should be on Contact details Check answers page
    And I should see row 1 key Contact name
    And I should see row 2 key Email address
    And I should see row 3 key Can we contact by telephone?
    And I should see row 4 key Telephone number
    And I should see row 1 value UPE Test
    And I should see row 2 value testupe@email.com
    And I should see row 3 value Yes
    And I should see row 4 value 123456
    And I should see row 5 key Do you have a second contact?
    And I should see row 6 key Address
    And I should see row 5 value No
    And I should see row 6 value Address Change
    And I click on Continue button
    When I click Check your answers link
    Then I should be on Review answers page
    And I should see row 12 value UPE Test
    And I should see row 13 value testupe@email.com
    And I should see row 14 value Yes
    And I should see row 15 value 123456
    And I should see row 16 value No
    And I should see row 17 value Address Change

   @zap_accessibility
  Scenario: 3 - Contact details pages Error validations and Registration Confirmation Page Validations
    Given I clear the cache
    Given Organisation User logs in as upe for Pillar2
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
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option No and continue to next
    Then I should navigate to NFM Name page
    When I enter NFM name as Test
    And I enter Address Line 1 as Address Line 1
    And I enter City as City
    And I enter Postal Code as EH5 5WY
    And I enter Country as United Kingdom
    And I click on Country selected
    When I click on Continue button
    Then I should navigate to NFM Contact Name page
    When I enter NFM Contact name as Contact NFM Test
    And I click on Continue button
    Then I should navigate to NFM Contact Email page
    When I enter NFM Contact Email as testNFM@email.com
    And I click on Continue button
    Then I should navigate to NFM Telephone page
    When I select option Yes and continue to next
    Then I should navigate to input nfm telephone page
    When I enter NFM Telephone Number as 12345678
    And I click on Continue button
    Then I should navigate to NFM Check your answers page
    And I click on Continue button
    Then I should navigate to Task list page
    When I click Add further group details link
    Then I should navigate to MNE or domestic page
    When I select option Only in the UK in further details group status page
    And I click on Continue button
    Then I should navigate to Group accounting period page
    When Accounting Period Start Day is entered as 15
    And Accounting Period Start Month is entered as 1
    And Accounting Period Start Year is entered as 2024
    When Accounting Period End Day is entered as 15
    And Accounting Period End Month is entered as 1
    And Accounting Period End Year is entered as 2025
    And I click on Continue button
    Then I should navigate to FD check your answers page
    And I click on Continue button
    Then I should navigate to Task list page
    When I click Add contact details link
    Then I should navigate to Contact details guidance page
    When I click on Continue button
    Then I should navigate to Contact details display page
    When I click on Continue button
    Then I should see error message Select yes if you want to use this as your primary contact on the Contact details display Page
    When I select option No and continue to next
    Then I should navigate to Contact details input name page
    When I click on Continue button
    Then I should see error message Enter name of the person of team we should contact on the Contact details display Page
    When I enter Contact Details Name as Testing the character limit of contact details field is 160 character limit. Maximum character limit of contact details name field should be 160 characters, user should not be able to continue with more than 160 characters.
    And I click on Continue button
    Then I should see error message The name of the contact person or team should be 160 characters or less on the Contact details display Page
    When I enter Contact Details Name as Test <script>alert(document.domain)</script>
    And I click on Continue button
    Then I should see error message The name of the contact person or team must only include letters a to z, numbers 0 to 9, ampersands (&), apostrophes, commas, forward slashes, full stops, hyphens, round brackets and spaces on the Contact details display Page
    When I enter Contact Name as Contact Name Test
    And I click on Continue button
    Then I should navigate to Contact details input email page
    When I click on Continue button
    Then I should see error message You need to enter the email address for Contact Name Test on the Contact details email Page
    When I enter Contact Email as ContactNameCharacterLengthErrorValidation@andMaximumNFMCharacterLengthShouldBeEnteredMoreThanOneHundredThirtyTwoCharactersForEmailTextField.com
    When I click on Continue button
    Then I should see error message The email address should be 132 characters or less on the Contact details email Page
    When I enter Contact Email as FormatErrorTest.com
    When I click on Continue button
    Then I should see error message Enter an email address in the correct format, like name@example.com on the Contact details email Page
    When I enter Contact Email as testContact@email.com
    And I click on Continue button
    Then I should navigate to Contact details telephone page
    When I click on Continue button
    Then I should see error message Select yes if we can contact Contact Name Test by telephone on the Contact details display Page
    When I select option Yes and continue to next
    Then I should navigate to Contact details input telephone page
    When I click on Continue button
    Then I should see error message You need to enter the telephone for Contact Name Test on the Contact details display Page
    When I enter NFM Telephone Number as 12345678@
    When I click on Continue button
    Then I should see error message Enter a telephone number in the correct format on the Contact details display Page
    When I enter NFM Telephone Number as 1234567890123456789012345
    When I click on Continue button
    Then I should see error message The telephone number should be 24 characters or less on the Contact details display Page
    When I enter NFM Telephone Number as 12345343
    When I click on Continue button
    Then I should navigate to Second Contact details page
     When I click on Continue button
     Then I should see error message Select yes if there is someone else we can contact on the Second Contact details Page
     When I select option Yes and continue to next
    Then I should navigate to Second Contact name page
    And I click on Continue button
    Then I should see error message Enter name of the person of team we should contact on the Second Contact details Page
    When I enter Second Contact Name as Testing the character limit of contact details field is 160 character limit. Maximum character limit of contact details name field should be 160 characters, user should not be able to continue with more than 160 characters.
    And I click on Continue button
    Then I should see error message The name of the contact person or team should be 160 characters or less on the Second Contact details Page
     When I enter Second Contact Name as Test <script>alert(document.domain)</script>
     And I click on Continue button
     Then I should see error message The name of the contact person or team must only include letters a to z, numbers 0 to 9, ampersands (&), apostrophes, commas, forward slashes, full stops, hyphens, round brackets and spaces on the Second Contact details Page
     When I enter Second Contact Name as Second Contact Name Test
    And I click on Continue button
    Then I should navigate to Second Contact email page
    And I click on Continue button
    Then I should see error message You need to enter the email address for Second Contact Name Test on the Contact details email Page
    When I enter Second Contact Email as ContactNameCharacterLengthErrorValidation@andMaximumNFMCharacterLengthShouldBeEnteredMoreThanOneHundredThirtyTwoCharactersForEmailTextField.com
    When I click on Continue button
    Then I should see error message The email address should be 132 characters or less on the Contact details email Page
    When I enter Second Contact Email as FormatErrorTest.com
    When I click on Continue button
    Then I should see error message Enter an email address in the correct format, like name@example.com on the Contact details email Page
    When I enter Second Contact Email as testContact@email.com
    And I click on Continue button
    Then I should navigate to Second Contact number page
    When I click on Continue button
    Then I should see error message Select yes if we can contact Second Contact Name Test by telephone on the Second Contact details Page
    When I select option Yes and continue to next
    Then I should navigate to Second Contact Input page
    When I click on Continue button
    Then I should see error message You need to enter the telephone for Second Contact Name Test on the Second Contact details Page
    When I enter NFM Telephone Number as 12345678@
    When I click on Continue button
    Then I should see error message Enter a telephone number in the correct format on the Second Contact details Page
    When I enter NFM Telephone Number as 1234567890123456789012345
    When I click on Continue button
    Then I should see error message The telephone number should be 24 characters or less on the Second Contact details Page
    When I enter NFM Telephone Number as 1234567
    When I click on Continue button
    Then I should navigate to Contact address input page
    When I click on Continue button
    Then I should see contact address error message Enter the first line of the address on the Address Line 1
    And I should see contact address error message Enter the town or city on the City
    And I should see contact address error message Select a country on the Country
    When I enter Address Line 1 as Address Line 1 Character Length Test1
    And I enter Address Line 2 as Address Line 2 Character Length Test1
    And I enter City as City Field Character Length Test Error
    And I enter Region as Region Field Character Length Test Error
    And I enter Postal Code as 12345678901
    And I enter Country as Angola
    And I click on Country selected
    When I click on Continue button
    Then I should see contact address error message The first line of the address must be 35 characters or less on the Address Line 1
    And I should see contact address error message The second line of the address must be 35 characters or less on the Address Line 2
    And I should see contact address error message The town or city must be 35 characters or less on the City
    And I should see contact address error message The region must be 35 characters or less on the Region
    And I should see contact address error message The postal code must be 10 characters or less on the Postal Code
    When I enter Address Line 1 as Test Address Line 1
    When I enter Address Line 2 as Test Address Line 2
    And I enter City as Test City
    And I enter Region as Region
    And I enter Postal Code as 123456
    And I click on Continue button
    Then I should be on Contact details Check answers page
    And I click on Continue button
    When I click Check your answers link
    Then I should navigate to Review answers page
    And I should see row 1 key Company
    And I should see row 2 key Company Registration Number
    And I should see row 3 key Unique Taxpayer Reference
    And I should see row 1 value Test Example Company Name
    And I should see row 2 value 76543210
    And I should see row 3 value 1234567890
    And I should see row 4 key Is there a nominated filing member
    And I should see row 5 key Name
    And I should see row 6 key Address
    And I should see row 7 key Contact name
    And I should see row 8 key Email address
    And I should see row 9 key Can we contact by telephone?
    And I should see row 10 key Telephone number
    And I should see row 4 value Yes
    And I should see row 5 value Test
    And I should see row 6 value Address Line 1
    And I should see row 6 value City
    And I should see row 6 value EH5 5WY
    And I should see row 6 value United Kingdom
    And I should see row 7 value NFM Test
    And I should see row 8 value testNFM@email.com
    And I should see row 9 value Yes
    And I should see row 10 value 12345678
    And I click on Save&Continue button
    Then I should navigate to Registration confirmation page
    And The Header should be Report Pillar 2 top-up taxes
    And The Heading should be Registration complete
    And The Id text should be Group’s Pillar 2 top-up taxes ID
    When I should see heading 1 as Registration date:
    And The registration date should be displayed as current day
    And The Body content should be Your group has registered to report for Domestic Top-up Tax.
    And The Body content should be You will not be emailed a confirmation of this registration.
    And The Body content should be You must record your group’s Pillar 2 top-up taxes ID and registration date.
    And The Body content should be You must not disclose your Pillar 2 top-up taxes ID or registration date outside of agreed communications.
    When The second heading should be What happens next
    And The Body content should be You can now report and manage your Pillar 2 top-up taxes.
    And The Body content should be Is this page not working properly? (opens in new tab)
    When I click report and manage your Pillar 2 top-up taxes link
    Then I should be on Dashboard page
    And I should see user details row 1 value XMPLR0012345674
    And I should see user details row 2 value 31 January 2022
    And I should see user details row 3 value International Organisation Inc.
    And I click the browser back button
    Then I can see Print this page link

  Scenario: 5 - Validate check your answers page with UPE and NFM GRS and without second contact details for NFM user
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    And The Heading should be Stub GRS Journey Data
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit ultimate parent’s details status should be Completed
    And The Task Add filing member’s details status should be Not started
    When I click Add filing member’s details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to NFM UKCompany GRS page
    When I registered successfully with BV enabled
    And The json response Body should contain the status "registrationStatus" : "REGISTERED"
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit filing member’s details status should be Completed
    When I click Add further group details link
    Then I should navigate to MNE or domestic page
    When I select option In the UK and other countries in further details group status page
    And I click on Continue button
    Then I should navigate to Group accounting period page
    When Accounting Period Start Day is entered as 15
    And Accounting Period Start Month is entered as 1
    And Accounting Period Start Year is entered as 2024
    When Accounting Period End Day is entered as 15
    And Accounting Period End Month is entered as 1
    And Accounting Period End Year is entered as 2025
    And I click on Continue button
    Then I should navigate to FD check your answers page
    And I click on Continue button
    Then I should navigate to Task list page
    Then The Task Add contact details status should be Not started
    When I click Add contact details link
    Then I should navigate to Contact details guidance page
    When I click on Continue button
    Then I should navigate to Contact details input name page
    When I enter Contact Name as Contact Name Test
    And I click on Continue button
    Then I should navigate to Contact details input email page
    When I enter Contact Email as testContact@email.com
    And I click on Continue button
    Then I should navigate to Contact details telephone page
    When I select option Yes and continue to next
    Then I should navigate to Contact details input telephone page
    When I enter Contact Telephone as 1234554
    And I click on Continue button
    Then I should navigate to Second Contact details page
    When I select option No and continue to next
    Then I should navigate to Contact address input page
    When I enter Address Line 1 as Address Line 1 Contact
    And I enter Address Line 2 as Address Line 2 Contact
    And I enter City as City Contact
    And I enter Region as Region Contact
    And I enter Postal Code as EH5 5WY
    And I enter Country as United Kingdom
    And I click on Country selected
    When I click on Continue button
    Then I should navigate to Contact details Check answers page
    And I should see row 5 key Do you have a second contact?
    And I should see row 5 value No
    And I click on Continue button
    When I click Check your answers link
    Then I should navigate to Review answers page
    And I should see row 4 key Is there a nominated filing member
    And I should see row 5 key Company
    And I should see row 6 key Company Registration Number
    And I should see row 7 key Unique Taxpayer Reference
    And I should see row 4 value Yes
    And I should see row 5 value Test Example Company Name
    And I should see row 6 value 76543210
    And I should see row 7 value 1234567890
    And I should see row 16 key Do you have a second contact?
    And I should see row 16 value No
    And I click on Save&Continue button
    Then I should navigate to Registration confirmation page
    And The Body content should be Your group has registered to report for Domestic Top-up Tax and Multinational Top-up Tax.
    And I click the browser back button
    Then I should navigate to Registration return error page
    And The Heading should be You cannot return, your registration is complete
    And The Body content should be You have successfully registered to report pillar 2 top-up taxes.
    And The Body content should be You can now report and manage your pillar 2 top-up taxes.
    And I click report and manage your pillar 2 top-up taxes. link
    And I should be on Dashboard page
    And I click the browser back button
    Then I should be on Registration return error page
    And I click the browser back button
    Then I should navigate to Registration confirmation page
    When Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service
    Then I should be on Dashboard page
