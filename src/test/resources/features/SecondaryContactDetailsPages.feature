@tests @zap_accessibility
Feature: Secondary Contact details for the filing member
  As a NFM Subscription user
  I want to enter the secondary contact details,in case the first in not able to be reached

  Scenario: 1 - Provide secondary contact details for NFM user and validating play back secondary contact details
    Given Organisation User logs in as upe with credId SecondContact for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    And The Heading should be Stub GRS Journey Data
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit ultimate parent's details status should be Completed
    And The Task Add filing member's details status should be Not started
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to NFM UKCompany GRS page
    When I registered successfully with BV enabled
    And The json response Body should contain the status "registrationStatus" : "REGISTERED"
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit filing member's details status should be Completed
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
    Then The Task Add Contact details status should be Not started
    When I click Add Contact details link
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
    And The caption must be Contact details
    And The Heading should be Is there someone else we can contact if Contact Name Test is not available?
    And The Body content should be This can be a team mailbox or another contact who is able to deal with enquiries about the group's management of Pillar 2 top-up tax
    When I select option No and continue to next
    Then I should navigate to Contact address input page
    When I select back link
    Then I should navigate to Second Contact details page
    When I select option Yes and continue to next
    Then I should navigate to Second Contact name page
    And The caption must be Contact details
    And The Heading should be What is the name of the individual or team we should contact?
    And The Body content should be For example, ‘Tax team’ or ‘Ashley Smith’.
    When I enter Second Contact Name as Second Contact Name Test
    And I click on Continue button
    Then I should navigate to Second Contact email page
    When I enter Second Contact Email as secondContact@email.com
    And I click on Continue button
    Then I should navigate to Second Contact number page
    When I select option Yes and continue to next
    Then I should navigate to Second Contact Input page
    When I enter Second Contact Input as 1234554
    And I click on Continue button
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
    Then I should navigate to Contact details guidance page
    When I select back link
    Then I should navigate to Task list page
    Then The Task Add Contact details status should be In progress
    When I click Sign out link
    Then I am on feedback survey page

  Scenario: 2 - Provide secondary contact details for NFM user and use existing primary contact details
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    Then I should navigate to Task list page
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option No and continue to next
    Then I should navigate to NFM Name page
    When I enter NFM name as Test
    And I enter Address Line 1 as Address Line 1
    And I enter City as City
    And I enter Postal Code as EH5 5WY
    And I select country as United Kingdom
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
    When I click Add Contact details link
    Then I should navigate to Contact details guidance page
    When I click on Continue button
    Then I should navigate to Contact details display page
    And I should see the contact details NFM Test on use contact page
    And I should see the contact details testNFM@email.com on use contact page
    And I should see the contact details 12345678 on use contact page
    When I select option Yes and continue to next
    Then I should navigate to Second Contact details page
    When I select option Yes and continue to next
    Then I should navigate to Second Contact name page
    When I enter Second Contact Name as Second Contact Name Test
    And I click on Continue button
    Then I should navigate to Second Contact email page
    When I enter Second Contact Email as secondContact@email.com
    And I click on Continue button
    Then I should navigate to Second Contact number page
    When I select option Yes and continue to next
    Then I should navigate to Second Contact Input page
    When I enter Second Contact Input as 1234554
    And I click on Continue button
    Then I should navigate to Contact address input page

  Scenario: 2 - Secondary contact details pages Error validations
    Given I clear the cache
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    And The Heading should be Stub GRS Journey Data
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit ultimate parent's details status should be Completed
    And The Task Add filing member's details status should be Not started
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to NFM UKCompany GRS page
    When I registered successfully with BV enabled
    And The json response Body should contain the status "registrationStatus" : "REGISTERED"
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit filing member's details status should be Completed
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
    Then The Task Add Contact details status should be Not started
    When I click Add Contact details link
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
    When I click on Continue button
    Then I should see error message Select yes if there is someone else we can contact on the Second Contact details Page
    When I select option Yes and continue to next
    Then I should navigate to Second Contact name page
    And I click on Continue button
    Then I should see error message Enter name of the person of team we should contact on the Second Contact details Page
    When I enter Second Contact Name as Testing the character limit of contact details field is 160 character limit. Maximum character limit of contact details name field should be 160 characters, user should not be able to continue with more than 160 characters.
    And I click on Continue button
    Then I should see error message The name of the contact person or team should be 160 characters or less on the Second Contact details Page
    When I enter Second Contact Name as Second Contact Name Test
    And I click on Continue button
    Then I should navigate to Second Contact email page
    And I click on Continue button
    Then I should see error message You need to enter the email address for Second Contact Name Test on the Second Contact details Page
    When I enter Second Contact Email as ContactNameCharacterLengthErrorValidation@andMaximumNFMCharacterLengthShouldBeEnteredMoreThanOneHundredThirtyTwoCharactersForEmailTextField.com
    When I click on Continue button
    Then I should see error message The email address should be 160 characters or less on the Second Contact details Page
    When I enter Second Contact Email as FormatErrorTest.com
    When I click on Continue button
    Then I should see error message Enter an email address in the correct format, like name@example.com on the Second Contact details Page
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

  Scenario: 4 - Validate check your answers page with second contact details for NFM user
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    And The Heading should be Stub GRS Journey Data
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit ultimate parent's details status should be Completed
    And The Task Add filing member's details status should be Not started
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to NFM UKCompany GRS page
    When I registered successfully with BV enabled
    And The json response Body should contain the status "registrationStatus" : "REGISTERED"
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit filing member's details status should be Completed
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
    Then The Task Add Contact details status should be Not started
    When I click Add Contact details link
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
    When I select option Yes and continue to next
    Then I should navigate to Second Contact name page
    When I enter Second Contact Name as Second Contact Name Test
    And I click on Continue button
    Then I should navigate to Second Contact email page
    When I enter Second Contact Email as secondContact@email.com
    And I click on Continue button
    Then I should navigate to Second Contact number page
    When I select option Yes and continue to next
    Then I should navigate to Second Contact Input page
    When I enter Second Contact Input as 1234554
    And I click on Continue button
    Then I should navigate to Contact address input page
    When I enter Address Line 1 as Address Line 1 Contact
    And I enter Address Line 2 as Address Line 2 Contact
    And I enter City as City Contact
    And I enter Region as Region Contact
    And I enter Postal Code as EH5 5WY
    And I select country as United Kingdom
    When I click on Continue button
    Then I should navigate to Contact details Check answers page
    And The caption must be Contact details
    And The Heading should be Check your answers
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
    And I should see row 5 value Yes
    And I should see row 6 value Second Contact Name Test
    And I should see row 7 value secondContact@email.com
    And I should see row 8 value Yes
    And I should see row 9 value 1234554

  Scenario: 5 - Validate check your answers page without second contact details for NFM user
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    And The Heading should be Stub GRS Journey Data
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit ultimate parent's details status should be Completed
    And The Task Add filing member's details status should be Not started
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to NFM UKCompany GRS page
    When I registered successfully with BV enabled
    And The json response Body should contain the status "registrationStatus" : "REGISTERED"
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit filing member's details status should be Completed
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
    Then The Task Add Contact details status should be Not started
    When I click Add Contact details link
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
    And I select country as United Kingdom
    When I click on Continue button
    Then I should navigate to Contact details Check answers page
    And The caption must be Contact details
    And The Heading should be Check your answers
    And I should see row 1 key Contact name
    And I should see row 2 key Email address
    And I should see row 3 key Can we contact by telephone?
    And I should see row 4 key Telephone number
    And I should see row 5 key Do you have a second contact?
    And I should see row 1 value Contact Name Test
    And I should see row 2 value testContact@email.com
    And I should see row 3 value Yes
    And I should see row 4 value 1234554
    And I should see row 5 value No
    When I click on change link for Contact Name
    When I enter Contact Name as Contact Name Test
    And I click on Continue button
    And I select back link
    And I select back link
    Then I should navigate to Contact details Check answers page
    When I click on change link for Email address
    When I enter Contact Email as Contact Email Test
    And I click on Continue button
    And I select back link
    And I select back link
    Then I should navigate to Contact details Check answers page
    When I click on change link for Telephone number
    When I enter Contact Telephone as 1234555
    And I click on Continue button
    And I select back link
    And I select back link
    Then I should navigate to Contact details Check answers page
    When I click on change link for Do you have a second contact?
    When I select option Yes and continue to next
    When I enter Second Contact Name as Second Contact Name Test
    And I click on Continue button
    When I enter Second Contact Email as secondContact@email.com
    And I click on Continue button
    When I select option Yes and continue to next
    When I enter Second Contact Input as 1234554
    And I click on Continue button
    And I click on Continue button
    Then I should navigate to Contact details Check answers page
    And I should see row 5 key Do you have a second contact?
    And I should see row 6 key Second contact name
    And I should see row 7 key Second contact email address
    And I should see row 8 key Can we contact by telephone?
    And I should see row 9 key Second contact telephone number
    And I should see row 5 value Yes
    And I should see row 6 value Second Contact Name Test
    And I should see row 7 value secondContact@email.com
    And I should see row 8 value Yes
    And I should see row 9 value 1234554

  Scenario: 6 - UPE No flow ID and NFM NO flow ID, Review and submit your answers page
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test CYA
    Then I should navigate to input-upe-address page
    When I enter Address Line 1 as Address Line 1 CYA
    And I enter City as City CYA
    And I enter Postal Code as EH5 5WY
    And I select country as United Kingdom
    And I click on Continue button
    Then I should navigate to UPE Contact person/team Name page
    When I enter UPE Person/Team name as Contact CYA
    And I click on Continue button
    Then I should navigate to UPE Contact Email page
    When I enter UPE Email address as testcya@email.com
    And I click on Continue button
    Then I should navigate to UPE Telephone page
    When I select option Yes and continue to next
    Then I should navigate to input telephone page
    And I enter Telephone Number as 1234569
    And I click on Continue button
    Then I should be on Check your answers page
    And I click on Continue button
    Then I should navigate to Task list page
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option No and continue to next
    Then I should navigate to NFM Name page
    When I enter NFM name as Test CYA
    And I enter Address Line 1 as Address Line 1
    And I enter City as City CYA
    And I enter Postal Code as EH5 5WY
    And I select country as United Kingdom
    When I click on Continue button
    Then I should navigate to NFM Contact Name page
    When I enter NFM Contact name as NFM Test
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
    When I click Add Contact details link
    Then I should navigate to Contact details guidance page
    When I click on Continue button
    Then I should navigate to Contact details display page
    And I should see the contact details NFM Test on use contact page
    And I should see the contact details testNFM@email.com on use contact page
    And I should see the contact details 12345678 on use contact page
    When I select option Yes and continue to next
    Then I should navigate to Second Contact details page
    When I select option Yes and continue to next
    Then I should navigate to Second Contact name page
    When I enter Second Contact Name as Second Contact Name Test
    And I click on Continue button
    Then I should navigate to Second Contact email page
    When I enter Second Contact Email as secondContact@email.com
    And I click on Continue button
    Then I should navigate to Second Contact number page
    When I select option Yes and continue to next
    Then I should navigate to Second Contact Input page
    When I enter Second Contact Input as 1234554
    And I click on Continue button
    Then I should navigate to Contact address input page
    When I enter Address Line 1 as Address Line 1 Contact
    And I enter Address Line 2 as Address Line 2 Contact
    And I enter City as City Contact
    And I enter Region as Region Contact
    And I enter Postal Code as EH5 5WY
    And I select country as United Kingdom
    When I click on Continue button
    Then I should navigate to Contact details Check answers page
    When I click on Continue button
    Then I should navigate to Task list page
    And The Task Edit contact details status should be Completed
    And The Task Check your answers status should be Not started
    When I click Check your answers link
    Then I should navigate to Review answers page
    And I should see row 1 key Name
    And I should see row 2 key Address
    And I should see row 3 key Contact name
    And I should see row 4 key Email address
    And I should see row 5 key Can we contact by telephone?
    And I should see row 6 key Telephone number
    And I should see row 1 value Test CYA
    And I should see row 2 value Address Line 1 CYA
    And I should see row 2 value City CYA
    And I should see row 2 value United Kingdom
    And I should see row 3 value Contact CYA
    And I should see row 4 value testcya@email.com
    And I should see row 5 value Yes
    And I should see row 6 value 1234569
    And I should see row 7 key Is there a nominated filing member
    And I should see row 8 key Name
    And I should see row 9 key Address
    And I should see row 10 key Contact name
    And I should see row 11 key Email address
    And I should see row 12 key Can we contact by telephone?
    And I should see row 13 key Telephone number
    And I should see row 7 value Yes
    And I should see row 8 value Test CYA
    And I should see row 9 value Address Line 1
    And I should see row 9 value City CYA
    And I should see row 9 value EH5 5WY
    And I should see row 9 value United Kingdom
    And I should see row 10 value NFM Test
    And I should see row 11 value testNFM@email.com
    And I should see row 12 value Yes
    And I should see row 13 value 12345678
    And I should see row 14 key Where does the group operate?
    And I should see row 15 key Group's consolidated accounting period
    And I should see row 16 key Start date
    And I should see row 17 key End date
    And I should see row 14 value In the UK and other countries
    And I should see row 16 value 15 January 2024
    And I should see row 17 value 15 January 2025
    And I should see row 18 key Contact name
    And I should see row 19 key Email address
    And I should see row 20 key Can we contact by telephone?
    And I should see row 21 key Telephone number
    And I should see row 22 key Do you have a second contact?
    And I should see row 23 key Second contact name
    And I should see row 24 key Second contact email address
    And I should see row 25 key Can we contact by telephone?
    And I should see row 26 key Second contact telephone number
    And I should see row 18 value NFM Test
    And I should see row 19 value testNFM@email.com
    And I should see row 20 value Yes
    And I should see row 21 value 12345678
    And I should see row 22 value Yes
    And I should see row 23 value Second Contact Name Test
    And I should see row 24 value secondContact@email.com
    And I should see row 25 value Yes
    And I should see row 26 value 1234554

  Scenario: 7 - UPE GRS flow ID and NFM NO flow ID, Review and submit your answers page
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    And The Heading should be Stub GRS Journey Data
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    Then I should navigate to Task list page
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option No and continue to next
    Then I should navigate to NFM Name page
    When I enter NFM name as Test CYA
    And I enter Address Line 1 as Address Line 1
    And I enter City as City CYA
    And I enter Postal Code as EH5 5WY
    And I select country as United Kingdom
    When I click on Continue button
    Then I should navigate to NFM Contact Name page
    When I enter NFM Contact name as NFM Test
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
    When I click Add Contact details link
    Then I should navigate to Contact details guidance page
    When I click on Continue button
    Then I should navigate to Contact details display page
    And I should see the contact details NFM Test on use contact page
    And I should see the contact details testNFM@email.com on use contact page
    And I should see the contact details 12345678 on use contact page
    When I select option Yes and continue to next
    Then I should navigate to Second Contact details page
    When I select option Yes and continue to next
    Then I should navigate to Second Contact name page
    When I enter Second Contact Name as Second Contact Name Test
    And I click on Continue button
    Then I should navigate to Second Contact email page
    When I enter Second Contact Email as secondContact@email.com
    And I click on Continue button
    Then I should navigate to Second Contact number page
    When I select option Yes and continue to next
    Then I should navigate to Second Contact Input page
    When I enter Second Contact Input as 1234554
    And I click on Continue button
    Then I should navigate to Contact address input page
    When I enter Address Line 1 as Address Line 1 Contact
    And I enter Address Line 2 as Address Line 2 Contact
    And I enter City as City Contact
    And I enter Region as Region Contact
    And I enter Postal Code as EH5 5WY
    And I select country as United Kingdom
    When I click on Continue button
    Then I should navigate to Contact details Check answers page
    When I click on Continue button
    Then I should navigate to Task list page
    And The Task Edit contact details status should be Completed
    And The Task Check your answers status should be Not started
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
    And I should see row 5 value Test CYA
    And I should see row 6 value Address Line 1
    And I should see row 6 value City CYA
    And I should see row 6 value EH5 5WY
    And I should see row 6 value United Kingdom
    And I should see row 7 value NFM Test
    And I should see row 8 value testNFM@email.com
    And I should see row 9 value Yes
    And I should see row 10 value 12345678
    And I should see row 11 key Where does the group operate?
    And I should see row 12 key Group's consolidated accounting period
    And I should see row 13 key Start date
    And I should see row 14 key End date
    And I should see row 11 value In the UK and other countries
    And I should see row 13 value 15 January 2024
    And I should see row 14 value 15 January 2025
    And I should see row 15 key Contact name
    And I should see row 16 key Email address
    And I should see row 17 key Can we contact by telephone?
    And I should see row 18 key Telephone number
    And I should see row 19 key Do you have a second contact?
    And I should see row 20 key Second contact name
    And I should see row 21 key Second contact email address
    And I should see row 22 key Can we contact by telephone?
    And I should see row 23 key Second contact telephone number
    And I should see row 15 value NFM Test
    And I should see row 16 value testNFM@email.com
    And I should see row 17 value Yes
    And I should see row 18 value 12345678
    And I should see row 19 value Yes
    And I should see row 20 value Second Contact Name Test
    And I should see row 21 value secondContact@email.com
    And I should see row 22 value Yes
    And I should see row 23 value 1234554
    And I click on Save&Continue button
    #Then I should navigate to Registration confirmation page #Tax enrolments issues needs to be fixed
    #And The Header should be Report Pillar 2 top-up taxes
    #And The Heading should be Registration complete
    #And The Id text should be Pillar 2 top-up tax ID
    #And The Information header should be What happens next
    #And The Body content should be You have set up an account for reporting and managing Pillar 2 top-up taxes.
    #And The Body content should be You can save this ID number by making a note or taking a screenshot.
    #When I click on Continue button
    #Then I should be on Dashboard page

 Scenario: 8 - UPE GRS flow ID and GRS flow ID, Review and submit your answers page
   Given Organisation User logs in as upe for Pillar2
   Then I should be on UPE business page
   When I select option Yes and continue to next
   Then I should be on UPE Org type page
   When I select option UK limited company and continue to GRS page
   Then I should navigate to UKCompany GRS page
   And The Heading should be Stub GRS Journey Data
   When I registered successfully with BV enabled
   And I click on Save&Continue button
   Then I should navigate to Task list page
   And I click Add filing member's details link
   Then I should navigate to NFM registration page
   When I select Yes option and continue to next
   Then I should navigate to NFM details page
   When I select option Yes and continue to next
   Then I should be on NFM Org type page
   When I select option UK limited company and continue to GRS page
   Then I should navigate to NFM UKCompany GRS page
   And The Heading should be Stub GRS Journey Data
   When I registered successfully with BV enabled
   And I click on Save&Continue button
   Then I should navigate to Task list page
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
   When I click Add Contact details link
   Then I should navigate to Contact details guidance page
   When I click on Continue button
   Then I should navigate to Contact details input name page
   When I enter Contact Name as Test Name
   And I click on Continue button
   Then I should navigate to Contact details input email page
   When I enter Contact Email as testContact@email.com
   And I click on Continue button
   Then I should navigate to Contact details telephone page
   When I select option Yes and continue to next
   Then I should navigate to Contact details input telephone page
   When I enter Contact Telephone as 1234554
   When I click on Continue button
   Then I should navigate to Second Contact details page
   When I select option Yes and continue to next
   Then I should navigate to Second Contact name page
   When I enter Second Contact Name as Second Contact Name Test
   And I click on Continue button
   Then I should navigate to Second Contact email page
   When I enter Second Contact Email as secondContact@email.com
   And I click on Continue button
   Then I should navigate to Second Contact number page
   When I select option Yes and continue to next
   Then I should navigate to Second Contact Input page
   When I enter Second Contact Input as 1234554
   And I click on Continue button
   Then I should navigate to Contact address input page
   When I enter Address Line 1 as Address Line 1 Contact
   And I enter Address Line 2 as Address Line 2 Contact
   And I enter City as City Contact
   And I enter Region as Region Contact
   And I enter Postal Code as EH5 5WY
   And I select country as United Kingdom
   When I click on Continue button
   Then I should navigate to Contact details Check answers page
   When I click on Continue button
   Then I should navigate to Task list page
   And The Task Edit contact details status should be Completed
   And The Task Check your answers status should be Not started
   When I click Check your answers link
   Then I should navigate to Review answers page
   And I should see row 1 key Company
   And I should see row 2 key Company Registration Number
   And I should see row 3 key Unique Taxpayer Reference
   And I should see row 1 value Test Example Company Name
   And I should see row 2 value 76543210
   And I should see row 3 value 1234567890
   And I should see row 4 key Is there a nominated filing member
   And I should see row 5 key Company
   And I should see row 6 key Company Registration Number
   And I should see row 7 key Unique Taxpayer Reference
   And I should see row 4 value Yes
   And I should see row 5 value Test Example Company Name
   And I should see row 6 value 76543210
   And I should see row 7 value 1234567890
   And I should see row 8 key Where does the group operate?
   And I should see row 9 key Group's consolidated accounting period
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
   And I should see row 12 value Test Name
   And I should see row 13 value testContact@email.com
   And I should see row 14 value Yes
   And I should see row 15 value 1234554
   And I should see row 16 value Yes
   And I should see row 17 value Second Contact Name Test
   And I should see row 18 value secondContact@email.com
   And I should see row 19 value Yes
   And I should see row 20 value 1234554
   And I click on Save&Continue button
   Then I should navigate to Registration confirmation page
   And The Header should be Report Pillar 2 top-up taxes
   And The Heading should be Registration complete
   And The Id text should be Pillar 2 top-up tax ID
   And The Information header should be What happens next
   And The Body content should be You have set up an account for reporting and managing Pillar 2 top-up taxes.
   And The Body content should be You can save this ID number by making a note or taking a screenshot.
   When I click What did you think of this service link
   Then I should navigate to under construction page
   When I select back link
   When I should navigate to Registration confirmation page
   When I click on Continue button
   Then I should be on Dashboard page
   When I click Sign out link
   Then I am on feedback survey page
   When Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service
   Then I should be on Dashboard page
