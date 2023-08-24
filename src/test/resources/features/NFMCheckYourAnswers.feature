@tests1 @zap_accessibility
Feature: Task list page
  As a MNE user
  I want to create a new subscription

  Scenario: 1 - User navigates to check your answer page answering all the questions of UPE and NFM
    Given Organisation User logs in as upe with credId NFMCYA for Pillar2
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
    When I select option Yes and continue to next
    Then I should navigate to NFM details page
    When I select option No and continue to next
    Then I should navigate to NFM Name page
    When I enter NFM name as Test CYA
    And I enter Address Line 1 as Address Line 1 CYA
    And I enter City as City CYA
    And I enter Postal Code as EH5 5WY
    And I select country as United Kingdom
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
    And The Task Edit filing member's details status should be Completed
    When I click Sign out link
    Then I am on feedback survey page
    Given Organisation User logs in with credId NFMCYA for Pillar2
    When I click Edit filing member's details link
    When I click on Continue button
    Then I should navigate to NFM details page
    And I should see the answer No remain selected
    When I click on Continue button
    Then I should navigate to NFM Name page
    And I should see the NFM name field is pre-populated with Test CYA
    And I click on Continue button
    And I should see the Address Line 1 field is pre-populated with Address Line 1 CYA
    And I should see the City field is pre-populated with City CYA
    And I should see the Postal Code field is pre-populated with EH5 5WY
    And I should see the Country field is pre-populated with GB
    And I click on Continue button
    And I should see the NFM Contact name field is pre-populated with Contact CYA
    And I click on Continue button
    And I should see the NFM Contact Email field is pre-populated with testcya@email.com
    And I click on Continue button
    And I should see the answer Yes remain selected
    And I click on Continue button
    Then I should see the NFM Telephone number field is pre-populated with 1234569


  Scenario: 2 - Change all the details from check your answers page
    Given Organisation User navigates to NFM check your answer page with credId NFMCYA
    Then I should be on NFM Check your answers page
    And The Heading should be Check your answers
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










