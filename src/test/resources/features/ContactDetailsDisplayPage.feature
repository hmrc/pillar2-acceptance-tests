@tests
Feature: Contact details guidance and logic to play back contact details
  As a Subscription user
  I should be displayed with contact details in use contact page
  @zap_accessibility
  Scenario: 1 - Create a new subscription with NFM No Id flow for validating play back contact details
    Given Organisation User logs in as upe with credId TestPlaybackNFM for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE entity type page
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
    And The caption must be Contact details
    And The Heading should be We need contact details for the filing member
    And The Body content should be We need information about the filing member of this group so we can contact the right person or team when reviewing your compliance with Pillar 2 top-up taxes.
    And The Body content should be These may be different to any contact details you have already provided during registration, which were used to match your business with our records.
    When I click on Continue button
    Then I should navigate to Contact details display page
    And The caption must be Contact details
    And The Heading should be Do you want to use this as your primary contact?
    And I should see the contact details NFM Test on use contact page
    And I should see the contact details testNFM@email.com on use contact page
    And I should see the contact details 12345678 on use contact page
    When I select option No and continue to next
    Then I should navigate to Contact details input name page
    And The caption must be Contact details
    And The Heading should be What is the name of the person or team we should contact about compliance with Pillar 2 top-up tax?
    When I enter Contact Name as Contact Name Test
    And I click on Continue button
    Then I should navigate to Contact details input email page
    And the page title should be What is the email address? - Report Pillar 2 top-up taxes - GOV.UK
    And The caption must be Contact details
    And The Heading should be What is the email address for Contact Name Test
    And The Body content should be We will use this to send confirmation of your Pillar 2 top-up tax compliance actions or if we have any questions about them.
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
    And The Body content should be Enter a telephone number, like 01632 960 001, 07700 900 982 or +44 808 157 0192.
    When I enter Contact Telephone as 1234554
    And I click on Continue button
    Then I should navigate to Second Contact details page
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
    Then The Task Add Contact details status should be In progress
    When I click Sign out link
    Then I am on feedback survey page
    When Organisation User logs in with credId TestPlaybackNFM for Pillar2
    Then The Task Add Contact details status should be In progress
    When I click Add Contact details link
    When I click on Continue button
    Then I should navigate to Contact details display page
    And I should see the contact details NFM Test on use contact page
    And I should see the contact details testNFM@email.com on use contact page
    And I should see the contact details 12345678 on use contact page
    And I should see the answer No remain selected
    When I click on Continue button
    And I should see the Contact Name field is pre-populated with Contact Name Test
    When I click on Continue button
    And I should see the Contact Email field is pre-populated with testContact@email.com
    When I click on Continue button
    And I should see the answer Yes remain selected
    When I click on Continue button
    And I should see the Contact Telephone field is pre-populated with 1234554

  Scenario: 2 - Create a new subscription with UPE No Id flow for validating play back contact details
    Given Organisation User logs in as upe for Pillar2
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
    Then I should navigate to Task list page
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select No option and continue to next
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
    Then The Task Add Contact details status should be Not started
    When I click Add Contact details link
    Then I should navigate to Contact details guidance page
    When I click on Continue button
    Then I should navigate to Contact details display page
    And I should see the contact details UPE Test on use contact page
    And I should see the contact details testupe@email.com on use contact page
    And I should see the contact details 123456 on use contact page
    When I select option No and continue to next
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

  Scenario: 3 - Create a new subscription with no data in UPE/NFM for validating play back contact details
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    Then I should navigate to Task list page
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select No option and continue to next
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

  Scenario: 4 - Guidance and play back contact details page Error validations
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
    And The Task Add further group details status should be Not started
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
    Then The Task Add Contact details status should be Not started
    When I click Add Contact details link
    Then I should navigate to Contact details guidance page
    When I click on Continue button
    Then I should navigate to Contact details display page
    When I click on Continue button
    Then I should see error message Select yes if you want to use this as your primary contact on the Contact details display Page
    When I select option No and continue to next
    Then I should navigate to Contact details input name page
    And I click on Continue button
    Then I should see error message Enter name of the person of team we should contact on the Contact details display Page
    When I enter Contact Details Name as Testing the character limit of contact details field is 160 character limit. Maximum character limit of contact details name field should be 160 characters, user should not be able to continue with more than 160 characters.
    And I click on Continue button
    Then I should see error message The name of the contact person or team should be 160 characters or less on the Contact details display Page
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

