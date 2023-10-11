@tests @zap_accessibility
Feature: Enter UPE registered address
  As an UPE user
  I want to enter the registered address

  Scenario: 1 - User Validates all fields and navigates to UPE contact & email page
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test Address
    Then I should navigate to input-upe-address page
    And The caption must be Business details
    And The Heading should be Where is the registered office address of Test Address?
    When I enter Address Line 1 as Test Address Line 1
    And I enter Address Line 2 as Test Address Line 2
    And I enter City as Test City
    And I enter Region as Test Region
    And I enter Postal Code as EH5 5WY
    And I select country as United Kingdom
    And I click on Continue button
    Then I should navigate to UPE Contact person/team Name page

  Scenario: 2 - User navigates to previous UPE name page
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test Address Back Link
    Then I should navigate to input-upe-address page
    And The Heading should be Where is the registered office address of Test Address Back Link?
    When I select back link
    Then I should navigate to input-upe-name page
    And The Heading should be What is the name of the ultimate parent entity?

  Scenario: 3 - Display an error messages, when user enters long address details
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test Address
    Then I should navigate to input-upe-address page
    And I enter City as Test City
    And I enter Postal Code as EH5 5WY
    And I select country as United Kingdom
    And I click on Continue button
    Then I should see address error message Enter the first line of the address on the Address Line Element
    And I enter Address Line 1 as enter long first line of address with more than 35 characters
    And I enter Address Line 2 as enter long second line of address with more than 35 characters
    And I enter Region as enter long Region name with more than 35 characters
    And I click on Continue button
    Then I should see address error message The first line of the address must be 35 characters or less on the Address Line Element
    Then I should see address error message The second line of the address must be 35 characters or less on the Address Line 2 Element
    Then I should see address error message The region must be 35 characters or less on the Region Element

  Scenario: 4 - Display an error message, when user continues without entering City
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test Address
    Then I should navigate to input-upe-address page
    And I enter Address Line 1 as Test Address Line 1
    And I enter Postal Code as EH5 5WY
    And I select country as United Kingdom
    And I click on Continue button
    Then I should see address error message Enter the town or city on the City Element
    And I enter City as enter long city name with more than 35 characters
    And I click on Continue button
    Then I should see address error message The town or city must be 35 characters or less on the City Element

  Scenario: 5 - Display an error message, when user continues without entering Postal code or enters incorrect postal code
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test Address
    Then I should navigate to input-upe-address page
    And I enter Address Line 1 as Test Address Line 1
    And I enter City as Test City
    And I select country as India
    And I click on Continue button
    Then I should see address error message Enter the postal code on the Postal code Element
    And I enter Postal Code as enter long postal code
    And I click on Continue button
    Then I should see address error message The postal code must be 10 characters or less on the Postal code Element
    And I select country as United Kingdom
    And I enter Postal Code as invalid
    And I click on Continue button
    Then I should see address error message Enter a valid UK postal code or change the country you selected on the Postal code Element

  Scenario: 6 - Display an error message, when user continues without entering Country
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test Address
    Then I should navigate to input-upe-address page
    And I enter Address Line 1 as Test Address Line 1
    And I enter City as Test City
    And I enter Postal Code as EH5 5WY
    And I click on Continue button
    Then I should see address error message Select a country on the Country Element

  Scenario: 7 - Prepopulate the answers on UPE Address page after sign out
    Given Organisation User logs in as upe with credId TestAddress1 for Pillar2
    Then I should be on UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test UPE Address Save
    Then I should navigate to input-upe-address page
    When I enter Address Line 1 as Test Address Line 1 Save
    And I enter Address Line 2 as Test Address Line 2 Save
    And I enter City as Test City Save
    And I enter Region as Test Region Save
    And I enter Postal Code as EH5 5WY
    And I select country as United Kingdom
    And I click on Continue button
    When I select back link
    And I click Sign out link
    Then I am on feedback survey page
    When Organisation User logs in as upe with credId TestAddress1 for Pillar2
    Then I should be on UPE business page
    And I should see the answer No remain selected
    When I continue to next page
    Then I should navigate to input-upe-name page
    And I click on Continue button
    And I should see the Address Line 1 field is pre-populated with Test Address Line 1 Save
    And I should see the Address Line 2 field is pre-populated with Test Address Line 2 Save
    And I should see the City field is pre-populated with Test City Save
    And I should see the Region field is pre-populated with Test Region Save
    And I should see the Postal Code field is pre-populated with EH5 5WY
    And I should see the Country field is pre-populated with GB





