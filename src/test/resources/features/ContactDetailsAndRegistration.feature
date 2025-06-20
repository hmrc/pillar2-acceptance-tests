@tests
Feature: Contact details for the filing member
  As a NFM Subscription user
  I want to enter contact details and navigate to dashboard page

  @batch1
  Scenario: 1 - Create a new subscription with UPE NoID Flow and NFM No Id flow to validate Contact Details
    Given Organisation User logs in as upe with credId ContactDetails for Pillar2
    Then I should be on UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test
    When I enter Address as:
      | KEY          | VALUE                |
      | addressLine1 | Address Line 1       |
      | addressLine3 | City                 |
      | postalCode   | EH5 5WY              |
      | countryCode  | United Arab Emirates |
    When I enter UPE Person/Team name as UPE Test
    When I enter UPE Email address as test&upe@email.com
    When I select option Yes and continue to next
    And I enter Telephone Number as 123456
    And I click on Continue button
    When I click Add filing member details link
    When I select No option and continue to next
    When I click Add further group details link
    When I select option In the UK and outside the UK in further details group status page
    When I enter account period as:
      | KEY             | VALUE |
      | startDate.day   | 15    |
      | startDate.month | 1     |
      | startDate.year  | 2024  |
      | endDate.day     | 15    |
      | endDate.month   | 1     |
      | endDate.year    | 2025  |
    And I click on Continue button
    Then The Task Add contact details status should be Not started
    When I click Add contact details link
    Then I should navigate to Contact details guidance page
    And The caption must be Contact details
    And The Heading should be We need contact details for the filing member
    And The Body content should be We need the contact details for the filing member of this group so we can contact the right person or team when about compliance for Pillar 2 Top-up Taxes.
    And The Body content should be These may be different to any contact details you have already provided during this registration.
    When I click on Continue button
    Then I should navigate to Contact details display page
    And The Heading should be Saved contact
    And I should see the contact details row 1 as UPE Test on use contact page
    And I should see the contact details row 2 as test&upe@email.com on use contact page
    And I should see the contact details row 3 as 123456 on use contact page
    When I select option No and continue to next
    Then I should navigate to Contact details input name page
    And The caption must be Contact details
    And The Heading should be What is the name of the person or team we should contact about compliance for Pillar 2 Top-up Taxes?
    When I enter Contact Name as Contact Name Test
    Then I should navigate to Contact details input email page
    And the page title should be What is the email address? - Report Pillar 2 Top-up Taxes - GOV.UK
    And The caption must be Contact details
    And The Heading should be What is the email address for Contact Name Test
    And The Body content should be We will only use this to contact you about Pillar 2 Top-up Taxes.
    When I enter Contact Email as testContact@email.com
    Then I should navigate to Contact details telephone page
    And the page title should be Can we contact by telephone? - Report Pillar 2 Top-up Taxes - GOV.UK
    And The caption must be Contact details
    And The Heading should be Can we contact Contact Name Test by telephone?
    When I select option No and continue to next
    Then I should navigate to Second Contact details page
    When I select back link
    Then I should navigate to Contact details telephone page
    When I select option Yes and continue to next
    Then I should navigate to Contact details input telephone page
    And The caption must be Contact details
    When I enter Contact Telephone as 1234554
    And I click on Continue button
    Then I should navigate to Second Contact details page
    When I select option No and continue to next
    Then I should navigate to Contact address input page
    When I select back link
    Then I should navigate to Second Contact details page
    When I select option Yes and continue to next
    Then I should navigate to Second Contact name page
    And The caption must be Contact details
    And The Heading should be What is the name of the alternative person or team we should contact about compliance for Pillar 2 Top-up Taxes?
    And The Body content should be For example, ‘Tax team’ or ‘Ashley Smith’.
    When I enter Second Contact Name as Second Contact Name Test
    Then I should navigate to Second Contact email page
    And The caption must be Contact details
    And The Heading should be What is the email address for Second Contact Name Test?
    And The Body content should be We will only use this to contact you about Pillar 2 Top-up Taxes.
    And the page title should be What is the email address? - Report Pillar 2 Top-up Taxes - GOV.UK
    When I enter Second Contact Email as secondContact@email.com
    Then I should navigate to Second Contact number page
    And the page title should be Can we contact by telephone? - Report Pillar 2 Top-up Taxes - GOV.UK
    When I select option Yes and continue to next
    Then I should navigate to Second Contact Input page
    When I enter Second Contact Input as 1234554
    Then I should navigate to Contact address input page
    And The caption must be Contact details
    And The Heading should be What address do you want to use as the filing member’s contact address?
    When I enter Address as:
      | KEY          | VALUE          |
      | addressLine1 | Address Line 1 |
      | addressLine3 | City           |
      | postalCode   | EH5 5WY        |
      | countryCode  | United Kingdom |
    Then I should navigate to Contact details Check answers page
    When I select back link
    Then I should be on Contact address input page
    When I select back link
    Then I should be on Second Contact Input page
    And I should see the Second Contact Input field is pre-populated with 1234554
    When I select back link
    Then I should be on Second Contact number page
    And I should see the answer Yes remain selected
    When I select back link
    And I should see the Second Contact Email field is pre-populated with secondContact@email.com
    When I select back link
    And I should see the Second Contact Name field is pre-populated with Second Contact Name Test
    When I select back link
    Then I should navigate to Second Contact details page
    And I should see the answer Yes remain selected
    When I select back link
    When I select back link
    And I should see the Contact Telephone field is pre-populated with 1234554
    When I select back link
    And I should see the answer Yes remain selected
    When I select back link
    And I should see the Contact Email field is pre-populated with testContact@email.com
    When I select back link
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

  @batch1
  Scenario: 2 - Check you Answers Page Validations
    Given Organisation User navigates to Contact Details check your answer page with credId ContactDetails
    Then I should be on Contact details Check answers page
    And The caption must be Contact details
    And The Heading should be Check your answers for contact details
    And I should see details as below:
      | KEY                                                 |  VALUE                   |
      | Contact name                                        | Contact Name Test        |
      | Email address                                       | testContact@email.com    |
      | Can we contact the primary contact by telephone?    | Yes                      |
      | Telephone number                                    | 1234554                  |
      | Do you have a second contact?                       | Yes                      |
      | Secondary contact name                              | Second Contact Name Test |
      | Second contact email address                        | secondContact@email.com  |
      | Can we contact the secondary contact by telephone?  | Yes                      |
      | Second contact telephone number                     | 1234554                  |
      | Address                                             | Address Line 1           |
      | Address                                             | City                     |
      | Address                                             | EH5 5WY                  |
      | Address                                             | United Kingdom           |
    When I click on change link for Contact Name
    And I enter Contact Name as Contact $ Name Change
    Then I should navigate to Contact details Check answers page
    When I click on change link for Email address
    And I enter Contact Email as email&change@test.com
    Then I should navigate to Contact details Check answers page
    When I click on change link for Telephone number
    And I enter Contact Telephone as 1234555
    When I click on change link for Second Contact Name
    And I enter Second Contact Name as Second Contact Name Change
    When I click on change link for Second Contact Email
    And I enter Second Contact Email as secondContact&change@email.com
    When I click on change link for Second Contact Telephone number
    And I enter Second Contact Input as 71235643
    When I click on change link for Address
    And I enter Address Line 1 as Address Change
    And I click on Continue button
    Then I should see details as below:
      | KEY                                               | VALUE                          |
      | Contact name                                      | Contact $ Name Change        |
      | Email address                                     | email&change@test.com          |
      | Telephone number                                  | 1234555                        |
      | Secondary contact name                            | Second Contact Name Change   |
      | Second contact email address                      | secondContact&change@email.com |
      | Can we contact the secondary contact by telephone?| Yes                            |
      | Second contact telephone number                   | 71235643                       |
      | Address                                           | Address Change                 |
    And I click on Continue button
    When I click Check your answers before submitting your registration link
    Then I should be on Review answers page
    And I should see details as below:
      | KEY                                           | VALUE                          |
      | Name                                          | Test                           |
      | Address                                       | Address Line 1                 |
      | Address                                       | City                           |
      | Address                                       | United Arab Emirates           |
      | Contact name                                  | UPE Test                       |
      | Email address                                 | test&upe@email.com             |
      | Can we contact by telephone?                  | Yes                            |
      | Telephone number                              | 123456                         |
      | Is there a nominated filing member            | No                             |
      | Where are the entities in your group located? | In the UK and outside the UK   |
      | Start date                                    | 15 January 2024                |
      | End date                                      | 15 January 2025                |
      | Do you have a second contact?                 | Yes                            |
      | Secondary contact name                        | Second Contact Name Change     |
      | Second contact email address                  | secondContact&change@email.com |
      | Second contact telephone number               | 71235643                       |
    And I should see row 12 with key Contact name and value Contact $ Name Change
    And I should see row 13 with key Email address and value email&change@test.com
    And I should see row 14 with key Can we contact the primary contact by telephone? and value Yes
    And I should see row 15 with key Telephone number and value 1234555
    And I should see row 19 with key Can we contact the secondary contact by telephone? and value Yes
    And I should see row 21 with key Address and value Address Change
    When I click Report Pillar 2 Top-up Taxes link
    Then I should navigate to Task list page
    When I click Edit contact details link
    Then I should navigate to Contact details guidance page
    When I click on Continue button
    Then I should navigate to Contact details display page
    When I select option Yes and continue to next
    Then I should navigate to Second Contact details page
    When I select option No and continue to next
    Then I should navigate to Contact address input page
    When I click on Continue button
    Then I should be on Contact details Check answers page
    And I should see details as below:
      | KEY                               | VALUE          |
      | Do you have a second contact?     | No             |
      | Address                           | Address Change |
    And I click on Continue button
    When I click Check your answers before submitting your registration link
    Then I should be on Review answers page
    And I should see row 12 value UPE Test
    And I should see row 13 value test&upe@email.com
    And I should see row 14 value Yes
    And I should see row 15 value 123456
    And I should see row 16 value No
    And I should see row 17 value Address Change

  @zap_accessibility @batch2
  Scenario: 3 - Contact details pages Error validations and Registration Confirmation Page Validations
    Given I clear the cache
    Given Organisation User logs in without Pillar2 enrolment
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test
    When I enter Address as:
      | KEY          | VALUE                |
      | addressLine1 | Address Line 1       |
      | addressLine3 | City                 |
      | postalCode   | EH5 5WY              |
      | countryCode  | United Arab Emirates |
    When I enter UPE Person/Team name as UPE Test
    When I enter UPE Email address as test&upe@email.com
    When I select option Yes and continue to next
    And I enter Telephone Number as 123456
    And I click on Continue button
    When I click Add filing member details link
    When I select Yes option and continue to next
    When I select option No and continue to next
    When I enter NFM name as Test
    When I enter Address as:
      | KEY          | VALUE                |
      | addressLine1 | Address Line 1       |
      | addressLine3 | City                 |
      | postalCode   | EH5 5WY              |
      | countryCode  | United Arab Emirates |
    When I enter NFM Contact name as Contact NFM Test
    When I enter NFM Contact Email as testNFM@email.com
    When I select option Yes and continue to next
    When I enter NFM Telephone Number as 12345678
    And I click on Continue button
    When I click Add further group details link
    When I select option In the UK and outside the UK in further details group status page
    When I enter account period as:
      | KEY             | VALUE |
      | startDate.day   | 15    |
      | startDate.month | 1     |
      | startDate.year  | 2024  |
      | endDate.day     | 15    |
      | endDate.month   | 1     |
      | endDate.year    | 2025  |
    And I click on Continue button
    When I click Add contact details link
    When I click on Continue button
    Then I should navigate to Contact details display page
    When I click on Continue button
    Then I should see error message Select yes if you want to use this as your primary contact on the Contact details display Page
    When I select option No and continue to next
    Then I should navigate to Contact details input name page
    When I click on Continue button
    Then I should see error message Enter name of the person or team we should contact about compliance for Pillar 2 Top-up Taxes on the Contact details display Page
    When I enter Contact Details Name as Testing the character limit of contact details field is 160 character limit. Maximum character limit of contact details name field should be 160 characters, user should not be able to continue with more than 160 characters.
    And I click on Continue button
    Then I should see error message Name of the contact person or team should be 160 characters or less on the Contact details display Page
    When I enter Contact Details Name as Test ContactName
    And I click on Continue button
    Then I should navigate to Contact details input email page
    When I click on Continue button
    Then I should see error message Enter the email address for Test ContactName on the Contact details email Page
    When I enter Contact Email as ContactNameCharacterLengthErrorValidation@andMaximumNFMCharacterLengthShouldBeEnteredMoreThanOneHundredThirtyTwoCharactersForEmailTextField.com
    When I click on Continue button
    Then I should see error message Email address must be 132 characters or less on the Contact details email Page
    When I enter Contact Email as FormatErrorTest.com
    When I click on Continue button
    Then I should see error message Enter an email address in the correct format, like name@example.com on the Contact details email Page
    When I enter Contact Email as testContact@email.com
    And I click on Continue button
    Then I should navigate to Contact details telephone page
    When I click on Continue button
    Then I should see error message Select yes if we can contact Test ContactName by telephone on the Contact details display Page
    When I select option Yes and continue to next
    Then I should navigate to Contact details input telephone page
    When I click on Continue button
    When I enter NFM Telephone Number as 12345678@
    When I click on Continue button
    When I enter NFM Telephone Number as 1234567890123456789012345
    When I click on Continue button
    When I enter NFM Telephone Number as 12345343
    When I click on Continue button
    Then I should navigate to Second Contact details page
    When I click on Continue button
    Then I should see error message Select yes if there is someone else we can contact if Test ContactName is not available on the Second Contact details Page
    When I select option Yes and continue to next
    Then I should navigate to Second Contact name page
    And I click on Continue button
    Then I should see error message Enter the name of the alternative person or team we should contact about compliance for Pillar 2 Top-up Taxes on the Second Contact details Page
    When I enter Second Contact Name as Testing the character limit of contact details field is 160 character limit. Maximum character limit of contact details name field should be 160 characters, user should not be able to continue with more than 160 characters.
    And I click on Continue button
    Then I should see error message Name of the alternative contact person or team should be 160 characters or less on the Second Contact details Page
    When I enter Second Contact Name as Test secondName
    And I click on Continue button
    Then I should navigate to Second Contact email page
    And I click on Continue button
    Then I should see error message Enter the email address for Test secondName on the Contact details email Page
    When I enter Second Contact Email as ContactNameCharacterLengthErrorValidation@andMaximumNFMCharacterLengthShouldBeEnteredMoreThanOneHundredThirtyTwoCharactersForEmailTextField.com
    When I click on Continue button
    Then I should see error message Email address must be 132 characters or less on the Contact details email Page
    When I enter Second Contact Email as FormatErrorTest.com
    When I click on Continue button
    Then I should see error message Enter an email address in the correct format, like name@example.com on the Contact details email Page
    When I enter Second Contact Email as testContact@email.com
    And I click on Continue button
    Then I should navigate to Second Contact number page
    When I click on Continue button
    Then I should see error message Select yes if we can contact Test secondName by telephone on the Second Contact details Page
    When I select option Yes and continue to next
    Then I should navigate to Second Contact Input page
    When I click on Continue button
    When I enter NFM Telephone Number as 12345678@
    When I click on Continue button
    When I enter NFM Telephone Number as 1234567890123456789012345
    When I click on Continue button
    When I enter NFM Telephone Number as 1234567
    When I click on Continue button
    Then I should navigate to Contact address input page
    When I enter Address as:
      | KEY          | VALUE          |
      | addressLine1 | Address Line 1 |
      | addressLine3 | City           |
      | postalCode   | EH5 5WY        |
      | countryCode  | United Kingdom |
    Then I should be on Contact details Check answers page
    And I click on Continue button
    When I click Check your answers before submitting your registration link
    Then I should navigate to Review answers page
    And I should see row 7 key Is there a nominated filing member
    And I should see row 7 value Yes
    And I should see row 8 key Name
    And I should see row 8 value Test
    And I should see row 9 key Address
    And I should see row 9 value Address Line 1
    And I click on Save&Continue button
    Then I should be redirect to Registration processing page
    And I should navigate to Registration confirmation page
    And The Header should be Report Pillar 2 Top-up Taxes
    And The Heading should be Registration complete
    And The Id text should be Group’s Pillar 2 Top-up Taxes ID
    When I should see heading 1 as Registration date:
    And The registration date should be displayed as current day
    And The Body content should be Test has successfully registered to report for Domestic Top-up Tax and Multinational Top-up Tax
    And The Body content should be You will be able to find your Pillar 2 Top-up Taxes ID and registration date on your account homepage. Keep these details safe.
    When I should see heading 2 as What happens next
    And The Body content should be You can now report and manage your Pillar 2 Top-up Taxes.
    When I click report and manage your Pillar 2 Top-up Taxes link
    Then I should be on Dashboard page
    And I should see user details row 1 value XMPLR0012345674
    And I should see user details row 2 value 31 January 2024
    And I should see user details row 3 value International Organisation Inc.
    And I click the browser back button
    Then I can see Print this page link

  @batch1
  Scenario: 4 - Validate subscription journey from knock back page for duplicate details on registration for UPE and NFM GRS flows, verify registration confirmation page.
    Given Organisation User logs in without Pillar2 enrolment
    When I select option Yes and continue to next
    Then I should be on UPE entity type page
    When I select option UK limited company and continue to GRS page
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    When I click Add filing member details link
    When I select Yes option and continue to next
    When I select option Yes and continue to next
    When I select option UK limited company and continue to GRS page
    When I registered successfully with BV enabled
    And The json response Body should contain the status "registrationStatus" : "REGISTERED"
    And I click on Save&Continue button
    When I click Add further group details link
    When I select option Only in the UK in further details group status page
    When I enter account period as:
      | KEY             | VALUE |
      | startDate.day   | 15    |
      | startDate.month | 1     |
      | startDate.year  | 2024  |
      | endDate.day     | 15    |
      | endDate.month   | 1     |
      | endDate.year    | 2025  |
    And I click on Continue button
    When I click Add contact details link
    Then I should navigate to Contact details guidance page
    When I click on Continue button
    When I enter Contact Name as Contact Name Test
    When I enter Contact Email as testContact@email.com
    When I select option Yes and continue to next
    When I enter Contact Telephone as 1234554
    When I select option No and continue to next
    When I enter Address as:
      | KEY          | VALUE                  |
      | addressLine1 | Address Line 1 Contact |
      | addressLine3 | City Contact           |
      | postalCode   | EH5 5WY                |
      | countryCode  | United Kingdom         |
    Then I should navigate to Contact details Check answers page
    And I should see row 5 key Do you have a second contact?
    And I should see row 5 value No
    And I click on Continue button
    When I click Check your answers before submitting your registration link
    Then I should navigate to Review answers page
    And I should see details as below:
      | KEY                         | VALUE                     |
      | Company                     | Test Example Company Name |
      | Company Registration Number | 76543210                  |
      | Unique Taxpayer Reference   | 1234567890                |
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
    Then I should navigate to Registration Duplication KB Page
    And I click on Save&Continue button
    When I select No option and continue to next
    Then I should navigate to Review answers page
    And I should see row 4 key Is there a nominated filing member
    And I should see row 4 value No
    And I click on Save&Continue button
    Then I should be redirect to Registration processing page
    Then I should navigate to Registration confirmation page
    And The Body content should be Test Example Company Name has successfully registered to report for Domestic Top-up Tax
    And I click the browser back button
    Then I should navigate to Registration return error page
    And The Heading should be You cannot return, your registration is complete
    And The Body content should be You have successfully registered to report Pillar 2 Top-up Taxes.
    And The Body content should be You can now report and manage your Pillar 2 Top-up Taxes.
    And I click report and manage your Pillar 2 Top-up Taxes. link
    And I should be on Dashboard page
    And I click the browser back button
    Then I should be on Registration return error page
    And I click Sign out link
    When Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service
    Then I should be on Dashboard page

  @batch1
  Scenario: 5 - Validate Yes journey from knock back page for duplicate details on registration for UPE and NFM GRS flows
    Given Organisation User logs in without Pillar2 enrolment
    When I select option Yes and continue to next
    Then I should be on UPE entity type page
    When I select option UK limited company and continue to GRS page
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    When I click Add filing member details link
    When I select Yes option and continue to next
    When I select option Yes and continue to next
    When I select option UK limited company and continue to GRS page
    When I registered successfully with BV enabled
    And The json response Body should contain the status "registrationStatus" : "REGISTERED"
    And I click on Save&Continue button
    When I click Add further group details link
    When I select option In the UK and outside the UK in further details group status page
    When I enter account period as:
      | KEY             | VALUE |
      | startDate.day   | 15    |
      | startDate.month | 1     |
      | startDate.year  | 2024  |
      | endDate.day     | 15    |
      | endDate.month   | 1     |
      | endDate.year    | 2025  |
    And I click on Continue button
    When I click Add contact details link
    Then I should navigate to Contact details guidance page
    When I click on Continue button
    When I enter Contact Name as Contact Name Test
    When I enter Contact Email as testContact@email.com
    When I select option Yes and continue to next
    When I enter Contact Telephone as 1234554
    When I select option No and continue to next
    When I enter Address as:
      | KEY          | VALUE                  |
      | addressLine1 | Address Line 1 Contact |
      | addressLine3 | City Contact           |
      | postalCode   | EH5 5WY                |
      | countryCode  | United Kingdom         |
    Then I should navigate to Contact details Check answers page
    And I should see row 5 key Do you have a second contact?
    And I should see row 5 value No
    And I click on Continue button
    When I click Check your answers before submitting your registration link
    Then I should navigate to Review answers page
    And I click on Save&Continue button
    Then I should navigate to Registration Duplication KB Page
    When I click Report Pillar 2 Top-up Taxes link
    Then The Task Edit filing member details status should be Completed
    When I click Check your answers before submitting your registration link
    Then I should navigate to Review answers page
    And I click on Save&Continue button
    Then I should navigate to Registration Duplication KB Page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option No and continue to next
    When I enter NFM name as NFM Test KB
    When I enter Address as:
      | KEY          | VALUE                |
      | addressLine1 | Address Line 1 CYA   |
      | addressLine3 | City CYA             |
      | postalCode   | EH5 5WY              |
      | countryCode  | United Arab Emirates |
    When I click on Continue button
    When I enter NFM Contact name as Contact CYA
    When I enter NFM Contact Email as testcya@email.com
    Then I should navigate to NFM Telephone page
    When I select option No and continue to next
    Then I should navigate to NFM Check your answers page
    When I click on Continue button
    Then I should be on Task list page
    When I click Check your answers before submitting your registration link
    Then I should navigate to Review answers page
    And I click on Save&Continue button
    Then I should be redirect to Registration processing page
    And I should navigate to Registration confirmation page

