@tests @zap_accessibility
Feature: Enter contact address
  As an user
  I want to enter the contact address

  Scenario: 1 - Create a new subscription with NFM No Id flow for validating address details
    Given Organisation User logs in as upe with credId ContactAddress1 for Pillar2
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
    And I enter Address Line 1 as Address Line 1 CD
    And I enter City as City CD
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
    When I select option Yes and continue to next
    Then I should navigate to Second Contact details page
    When I select option No and continue to next
    Then I should navigate to Contact address input page
    And The caption must be Contact details
    And The Heading should be What address do you want to use as the filing member's contact address?
    When I select back link
    Then I should navigate to Second Contact details page
    When I select back link
    Then I should navigate to Contact details display page
    When I select back link
    Then I should navigate to Contact details guidance page
    When I select back link
    Then I should navigate to Task list page
    Then The Task Add Contact details status should be In progress
    When I click Add Contact details link
    Then I should navigate to Contact details guidance page
    When I click on Continue button
    Then I should navigate to Contact details display page
    When I select option Yes and continue to next
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
    When I select back link
    Then I should navigate to Contact address input page
    When I select back link
    Then I should navigate to Second Contact details page
    When I click Sign out link
    Then I am on feedback survey page
    When Organisation User logs in with credId ContactAddress1 for Pillar2
    Then The Task Edit contact details status should be Completed
    When I click Edit contact details link
    When I click on Continue button
    Then I should navigate to Contact details display page
    When I click on Continue button
    Then I should navigate to Second Contact details page
    When I click on Continue button
    Then I should navigate to Contact address input page
    Then I should see the Address Line 1 field is pre-populated with Address Line 1 Contact
    And I should see the Address Line 2 field is pre-populated with Address Line 2 Contact
    And I should see the City field is pre-populated with City Contact
    And I should see the Region field is pre-populated with Region Contact
    And I should see the Postal Code field is pre-populated with EH5 5WY
    And I should see the Country field is selected with GB
    When I click on Continue button
    Then I should navigate to Contact details Check answers page

  Scenario: 2 - Contact address page Error validations
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
    When I select option Yes and continue to next
    Then I should navigate to Second Contact details page
    When I select option No and continue to next
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
    And I select country as India
    When I click on Continue button
    Then I should see contact address error message The first line of the address must be 35 characters or less on the Address Line 1
    And I should see contact address error message The second line of the address must be 35 characters or less on the Address Line 2
    And I should see contact address error message The town or city must be 35 characters or less on the City
    And I should see contact address error message The region must be 35 characters or less on the Region
    And I should see contact address error message The postal code must be 10 characters or less on the Postal Code
    When I enter Address Line 1 as Test Address Line 1
    And I enter City as Test City
    And I select country as United Kingdom
    When I click on Continue button
    Then I should see contact address error message Enter a valid UK postal code or change the country you selected on the Postal Code

