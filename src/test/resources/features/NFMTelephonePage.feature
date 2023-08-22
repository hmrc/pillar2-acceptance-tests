@tests @zap_accessibility
Feature: Enter NFM contact Telephone number
  As an NFM user
  I want to enter the Telephone number

  Scenario: 1 - Create a new subscription for validating telephone pages
    Given Organisation User logs in as upe with credId NFMTelephone for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit ultimate parent's details status should be Completed
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select option Yes and continue to next
    Then I should navigate to NFM details page
    When I select option No and continue to next
    Then I should navigate to NFM Name page
    When I enter NFM name as NFM Telephone
    And I enter Address Line 1 as Test Address Line 1
    And I enter City as Test City
    And I enter Postal Code as EH5 5WY
    And I select country as United Kingdom
    When I click on Continue button
    Then I should navigate to NFM Contact Name page
    When I enter NFM Contact name as NFM Telephone Contact
    And I click on Continue button
    Then I should navigate to NFM Contact Email page
    When I enter NFM Contact Email as test@email.com
    And I click on Continue button
    Then I should navigate to NFM Telephone page
    And The caption must be Business details
    And The Heading should be Can we contact NFM Telephone Contact by telephone?
    And The Body content should be We will use this to confirm your records
    When I select option Yes and continue to next
    Then I should navigate to input nfm telephone page
    And The caption must be Business details
    And The Heading should be What is the telephone number for NFM Telephone Contact?
    And The Body content should be Enter a telephone number, like 01632 960 001, 07700 900 982. For international numbers include the country code, like +44 808 157 0192 or 0044 808 157 0192
    When I enter NFM Telephone Number as 9923-456
    And I click on Continue button
    Then I should navigate to NFM Check your answers page
    When I select back link
    Then I should navigate to input nfm telephone page
    When I select back link
    Then I should navigate to NFM Telephone page
    When I click Sign out link
    Then I am on feedback survey page
    Given Organisation User logs in with credId NFMTelephone for Pillar2
    And The Task Edit filing member's details status should be Completed
    When I click Edit filing member's details link
    And I click on Continue button
    Then I should navigate to NFM details page
    When I click on Continue button
    Then I should navigate to NFM Name page
    When I click on Continue button
    Then I should navigate to NFM Address page
    When I click on Continue button
    Then I should navigate to NFM Contact Name page
    When I click on Continue button
    Then I should navigate to NFM Contact Email page
    When I click on Continue button
    Then I should navigate to NFM Telephone page
    And I should see the answer Yes remain selected
    When I click on Continue button
    Then I should navigate to input nfm telephone page
    And I should see the NFM Telephone number field is pre-populated with 9923-456

  Scenario: 2 - Telephone pages Error validations
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
    And The Task Edit ultimate parent's details status should be Completed
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select option Yes and continue to next
    Then I should navigate to NFM details page
    When I select option No and continue to next
    Then I should navigate to NFM Name page
    When I enter NFM name as NFM Test
    And I click on Continue button
    When I enter Address Line 1 as Test Address Line 1
    And I enter City as Test City
    And I enter Postal Code as EH5 5WY
    And I select country as United Kingdom
    And I click on Continue button
    When I enter NFM Contact name as NFM Telephone Contact
    And I click on Continue button
    When I enter NFM Contact Email as test@email.com
    And I click on Continue button
    Then I should navigate to NFM Telephone page
    When I click on Continue button
    Then I should see error message Select yes if we can contact NFM Telephone Contact by telephone on the NFM Telephone Page
    When I select option Yes and continue to next
    Then I should navigate to input nfm telephone page
    When I click on Continue button
    Then I should see error message You need to enter the telephone for NFM Telephone Contact on the Input Nfm Telephone Page
    When I enter NFM Telephone Number as 1234567812345678123456780
    And I click on Continue button
    Then I should see error message The telephone number should be 24 characters or less on the Input Nfm Telephone Page
    When I enter NFM Telephone Number as 1234567@
    And I click on Continue button
    Then I should see error message Enter a telephone number in the correct format on the Input Nfm Telephone Page

  Scenario: 3 - Validate Bookmark for NFM Name and NFM Address Pages
    Given Organisation User logs in NFM Telephone page for Pillar2
    Then The Heading should be Page not available
    Given Organisation User logs in NFM Telephone input page for Pillar2
    Then The Heading should be Page not available