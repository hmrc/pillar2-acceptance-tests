@tests
Feature: CYA - NFM No ID flow
  As a MNE user
  I would like to check my details via NFM No ID journey

  @zap_accessibility
  Scenario: 1 - NFM No Id journey navigation to check your answers page and verify if data is pre populated
    Given Organisation User logs in with rfm URL to Pillar2
    When I access RFM CYA NFM page
    Then I should navigate to RFM New NFM Contact Detail Name Page
    When I click on Continue button
    Then I should see an error message Enter the name of the new nominated filing member on the RFM contact name change Page
    When I enter NFM name as RFMNewNFMContactNameCharacterLengthErrorValidationMaximumNFMNameCharacterLengthShouldBeEnteredLessThanOneHundredFive
    And I click on Continue button
    Then I should see an error message The name of the new nominated filing must be 105 characters or less on the RFM contact name change Page
    When I refresh the page
#    When I enter NFM name as "!%$   -- This feature is not available, it might be enabled in future --
#    And I click on Continue button
#    Then I should see an error message The name of the new nominated filing member must only include letters a to z, numbers 0 to 9, ampersands (&), apostrophes, commas, forward slashes, full stops, hyphens, round brackets and spaces on the RFM contact name change Page
#    When I refresh the page
    When I provide RFM New NFM Name as Test CYA
    And I click on Continue button
    Then I should navigate to RFM New NFM Contact Address Page
    And I enter Country as United Kingdom
    And I click on Country selected
    And I click on Continue button
    Then I should see address error message Enter first line of the address on the Address Line Element
    Then I should see address error message Enter town or city on the City Element
    Then I should see address error message Enter a full UK postal code on the Postal code Element
#    Then I should see address error message Enter country on the Country Element
    When I refresh the page
    And I enter Address Line 1 as enter long first line of address with more than 35 characters
    And I enter Address Line 2 as enter long second line of address with more than 35 characters
    And I enter City as enter long city name with more than 35 characters
    And I enter Region as enter long Region name with more than 35 characters
    And I enter Postal Code as enter long postal code
    And I enter Country as Australia
    And I click on Country selected
    And I click on Continue button
    Then I should see address error message The first line of the address must be 35 characters or less on the Address Line Element
    Then I should see address error message The second line of the address must be 35 characters or less on the Address Line 2 Element
    Then I should see address error message The town or city must be 35 characters or less on the City Element
    Then I should see address error message The region must be 35 characters or less on the Region Element
    Then I should see address error message The postal code must be 10 characters or less on the Postal code Element
    When I refresh the page
    And I enter Address Line 1 as Address Line 1 CYA
    And I enter City as City CYA
    And I enter Postal Code as EH5 5WY
    And I enter Country as Australia
    And I click on Country selected
    And I click on Continue button
    Then I should be on RFM No ID CYA Page
#    When I select back link
#    Then I should be on RFM New NFM Contact Address Page
#    And I select back link
#    Then I should be on CYA NFM
#    And I click on Continue button
#    And I click on Continue button
    Then The caption must be Group details
    And The Heading should be Check your answers
    And I should see row 1 key Name
    And I should see row 1 value Test CYA
    And I should see row 2 key Address
    And I should see row 2 value Address Line 1 CYA
    And I should see row 2 value City CYA
    And I should see row 2 value EH55WY
    And I should see row 2 value Australia
    When I click change link for RFM New NFM Name
    Then I should navigate to RFM New NFM Contact Name Change
    When I provide RFM New NFM Name as New NFM Name Change
    And I click on Continue button
    Then I should navigate to RFM No ID Change CYA Page
    When I click on Continue button
    Then I should be on under construction page
