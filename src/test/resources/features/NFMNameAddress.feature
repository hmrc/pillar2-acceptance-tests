@tests @zap_accessibility
Feature: Enter NFM registered Name and address
  As an NFM user
  I want to enter the registered address

  Scenario: 1 - Create a new subscription for validating NFM Name and Address
  Given Organisation User logs in as upe with credId NFMNameAddress for Pillar2
    Then I should be on UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test NFM
    Then I should navigate to input-upe-address page
    When I enter Address Line 1 as Address Line 1
    And I enter City as City
    And I enter Country as Country
    And I click on Continue button
    Then I should navigate to UPE Contact person/team Name page
    When I enter UPE Person/Team name as Contact name
    And I click on Continue button
    Then I should navigate to UPE Contact Email page
    When I enter UPE Email address as test@email.com
    And I click on Continue button
    Then I should navigate to UPE Telephone page
    When I select option No and continue to next
    Then I should be on Check your answers page
    And I click on Continue button
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select option Yes and continue to next
    Then I should navigate to NFM details page
    When I select option No and continue to next
    Then I should navigate to NFM Name page
    And The caption must be Business details
    And The Heading should be What is the name of the nominated filing member?
    When I enter NFM name as NFM Test
    And The caption must be Business details
    And The Heading should be Where is the registered office address of NFM Test?
    When I enter Address Line 1 as Test Address Line 1
    And I enter Address Line 2 as Test Address Line 2
    And I enter City as Test City
    And I enter Region as Test Region
    And I enter Postal Code as EH5 5WY
    And I select country as United Kingdom
    When I click on Continue button
    Then I should navigate to NFM Contact Name page
    When I select back link
    Then I should navigate to NFM Address page
    When I select back link
    Then I should navigate to NFM Name page
    And I click Sign out link
    Then I am on feedback survey page
    Given Organisation User logs in with credId NFMNameAddress for Pillar2
    And The Task Add filing member's details status should be In progress
    When I click Add filing member's details link
    And I click on Continue button
    Then I should navigate to NFM details page
    When I click on Continue button
    Then I should navigate to NFM Name page
    And I should see the NFM name field is pre-populated with NFM Test
    When I click on Continue button
    Then I should see the Address Line 1 field is pre-populated with Test Address Line 1
    And I should see the Address Line 2 field is pre-populated with Test Address Line 2
    And I should see the City field is pre-populated with Test City
    And I should see the Region field is pre-populated with Test Region
    And I should see the Postal Code field is pre-populated with EH5 5WY
    And I should see the Country field is selected with GB
    Given Organisation User logs in NFM Contact Name page for Pillar2
    Then The Heading should be Page not available
    Given Organisation User logs in NFM Contact Email page for Pillar2
    Then The Heading should be Page not available

  Scenario: 2 - NFM Name page Error validations
    Given Organisation User logs in as upe with credId NFMNameError for Pillar2
    Then I should be on UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test NFM
    Then I should navigate to input-upe-address page
    When I enter Address Line 1 as Address Line 1
    And I enter City as City
    And I enter Country as Country
    And I click on Continue button
    Then I should navigate to UPE Contact person/team Name page
    When I enter UPE Person/Team name as Contact name
    And I click on Continue button
    Then I should navigate to UPE Contact Email page
    When I enter UPE Email address as test@email.com
    And I click on Continue button
    Then I should navigate to UPE Telephone page
    When I select option No and continue to next
    Then I should be on Check your answers page
    And I click on Continue button
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select option Yes and continue to next
    Then I should navigate to NFM details page
    When I select option No and continue to next
    Then I should navigate to NFM Name page
    When I click on Continue button
    Then I should see NFM error message You need to enter the name of the nominated filing member on the Input NFM Name Element
    When I enter NFM name as NFM Name character length Error validation and Maximum NFM character length should be entered 105 characters.
    Then I should see NFM error message The name of the nominated filing member must be 105 characters or less on the Input NFM Name Element

  Scenario: 3 - NFM Address page Error validations
    Given Organisation User logs in as upe with credId NFMAddressError for Pillar2
    Then I should be on UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test NFM
    Then I should navigate to input-upe-address page
    When I enter Address Line 1 as Address Line 1
    And I enter City as City
    And I enter Country as Country
    And I click on Continue button
    Then I should navigate to UPE Contact person/team Name page
    When I enter UPE Person/Team name as Contact name
    And I click on Continue button
    Then I should navigate to UPE Contact Email page
    When I enter UPE Email address as test@email.com
    And I click on Continue button
    Then I should navigate to UPE Telephone page
    When I select option No and continue to next
    Then I should be on Check your answers page
    And I click on Continue button
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select option Yes and continue to next
    Then I should navigate to NFM details page
    When I select option No and continue to next
    Then I should navigate to NFM Name page
    When I enter NFM name as NFM Test
    Then I should navigate to NFM Address page
    When I click on Continue button
    Then I should see NFM error message Enter the first line of the address on the Address Line 1 Element
    And I should see NFM error message Enter the town or city on the City Element
    And I should see NFM error message Select a country on the Country Element
    When I enter Address Line 1 as Address Line 1 Character Length Test1
    And I enter Address Line 2 as Address Line 2 Character Length Test1
    And I enter City as City Field Character Length Test Error
    And I enter Region as Region Field Character Length Test Error
    And I enter Postal Code as 12345678901
    And I select country as India
    When I click on Continue button
    Then I should see NFM error message The first line of the address must be 35 characters or less on the Address Line 1 Element
    And I should see NFM error message The second line of the address must be 35 characters or less on the Address Line 2 Element
    And I should see NFM error message The town or city must be 35 characters or less on the City Element
    And I should see NFM error message The region must be 35 characters or less on the Region Element
    And I should see NFM error message The postal code must be 10 characters or less on the Postal Code Element
    When I enter Address Line 1 as Test Address Line 1
    And I enter City as Test City
    And I select country as United Kingdom
    When I click on Continue button
    Then I should see NFM error message Enter a valid UK postal code or change the country you selected on the Postal Code Element

  Scenario: 4 - Validate Bookmark for NFM Name and NFM Address Pages
    Given Organisation User logs in NFM name page for Pillar2
    Then The Heading should be Page not available
    Given Organisation User logs in NFM address page for Pillar2
    Then The Heading should be Page not available



