@tests @zap_accessibility
Feature: UPE Check your Answers page
  As a MNE user
  I would like to change data from change your answers page

  Scenario: 1 - User navigates to check your answer page answering all the questions of UPE
    Given Organisation User logs in as upe with credId UPECYA for Pillar2
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
    And The caption must be Business details
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
    And I should see row 2 value United Kingdom
    And I should see row 3 value Contact CYA
    And I should see row 4 value testcya@email.com
    And I should see row 5 value Yes
    And I should see row 6 value 1234569
    When I select back link
    Then I should navigate to input telephone page
    When I click on Continue button
    Then I should be on Check your answers page
    When I click on Continue button
    Then I should be on Task list page
    And The Task Edit ultimate parent's details status should be Completed
    And I click Sign out link
    Then I am on feedback survey page
    When Organisation User logs in as upe with credId UPECYA for Pillar2
    Then I should be on UPE business page
    And I should see the answer No remain selected
    When I continue to next page
    Then I should navigate to input-upe-name page
    And I should see the UPE name field is pre-populated with Test CYA
    And I click on Continue button
    And I should see the Address Line 1 field is pre-populated with Address Line 1 CYA
    And I should see the City field is pre-populated with City CYA
    And I should see the Postal Code field is pre-populated with EH5 5WY
    And I should see the Country field is pre-populated with GB
    And I click on Continue button
    And I should see the UPE Person/Team name field is pre-populated with Contact CYA
    And I click on Continue button
    And I should see the UPE Email address field is pre-populated with testcya@email.com
    And I click on Continue button
    And I should see the answer Yes remain selected
    And I click on Continue button
    Then I should see the Telephone number field is pre-populated with 1234569

  Scenario: 2 - Change UPE fields from check your answers page
    Given Organisation User navigates to UPE check your answer page with credId UPECYA
    Then I should be on Check your answers page
    And The caption must be Business details
    And The Heading should be Check your answers
    When I click on change hyperlink next to the UPE Name
    And I enter UPE name as Name Change
    Then I navigate back to check your answers page from name page
    Then I should be on Check your answers page
    And I should see row 1 value Name Change
    When I click on change hyperlink next to the UPE Address
    And I enter Address Line 1 as Change Address
    Then I navigate back to check your answers page from address page
    And I should be on Check your answers page
    And I should see row 2 value Change Address
    And I should see row 2 value City CYA
    And I should see row 2 value United Kingdom
    When I click on change hyperlink next to the UPE Contact Name
    And I enter UPE Person/Team name as Change Contact Person
    Then I navigate back to check your answers page from contact name page
    And I should be on Check your answers page
    And I should see row 3 value Change Contact Person
    When I click on change hyperlink next to the UPE Email Address
    And I enter UPE Email address as changetest@email.com
    Then I navigate back to check your answers page from email address page
    And I should be on Check your answers page
    And I should see row 4 value changetest@email.com
    When I click on change hyperlink next to the UPE Telephone Number
    And I enter Telephone Number as 12345679
    Then I navigate back to check your answers page from telephone number page
    And I should be on Check your answers page
    And I should see row 6 value 12345679
    When I click on change hyperlink next to the UPE Telephone Contact
    And I select option No and continue to next
    Then I should be on Check your answers page
    And I should see row 5 value No






