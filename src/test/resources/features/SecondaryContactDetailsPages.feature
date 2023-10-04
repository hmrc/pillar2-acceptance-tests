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
    Then I should navigate to Contact details Check answers page
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
    When I enter Second Contact Email as secondContact@email.com
    And I click on Continue button
    Then I should navigate to Second Contact number page
    When I select option Yes and continue to next
    Then I should navigate to Second Contact Input page
    When I enter Second Contact Input as 1234554
    And I click on Continue button
    Then I should navigate to Contact details Check answers page
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
    Then The Task Edit Contact details status should be Completed
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
    Then I should navigate to Contact details Check answers page

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
