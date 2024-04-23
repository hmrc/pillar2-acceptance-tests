@tests
Feature: RFM CYA - NFM No ID flow
  As a MNE user
  I would like to check my details via NFM No ID journey

  @zap_accessibility
  Scenario: 1 - Verify RFM journey for NFM No Id flow until check your answers page and validate if data is pre populated once entered
    Given Organisation User logs in with rfm URL to Pillar2
    When I access RFM CYA NFM page
    Then I should navigate to RFM New NFM Contact Name Page
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
    Then I should navigate to RFM Contact Guidance page

  Scenario: 2 - Verify RFM journey for adding Secondary contact details
    Given Organisation User logs in with rfm URL to Pillar2
    When I access RFM CYA NFM page
    Then I should navigate to RFM New NFM Contact Name Page
    When I provide RFM New NFM Name as Test CYA
    And I click on Continue button
    And I enter Address Line 1 as RFM address line 1
    And I enter Address Line 2 as RFM address line 2
    And I enter City as Cityrfm
    And I enter Region as Regionrfm
    And I enter Postal Code as EH00WY
    And I enter Country as Poland
    And I click on Country selected
    And I click on Continue button
    Then I should be on RFM No ID CYA Page
    And I click on Continue button
    Then I access RFM Contact Guidance page
    Then I should be on RFM Contact Guidance page
    And I click on Continue button
    Then I should navigate to RFM Contact Detail Page
    When I provide RFM contact name as RFM test contact
    And I click on Continue button
    Then I should navigate to RFM Contact Email Page
    When I provide RFM contact email as rfm@email.com
    And I click on Continue button
    Then I should navigate to RFM Contact Number Page
    When I select option No and continue to next
    Then I should navigate to RFM Second Contact Question Page
    When I select back link
    And I select option Yes and continue to next
    Then I should navigate to RFM Contact Input Page
    When I provide RFM contact number as 01632960001
    And I click on Continue button
    Then I should navigate to RFM Second Contact Question Page
    And I select option No and continue to next
    Then I should be on RFM Second Contact Address Page
    When I select back link
    And I select option Yes and continue to next
    Then I should navigate to RFM second contact name page
    And I click on Continue button
    Then I should see an error message Enter name of the person of team we should contact on the RFM contact detail Page
    When I provide RFM New NFM Name as Second contact NFM
    And I click on Continue button
    Then I should navigate to RFM second contact email page
    And I click on Continue button
    Then I should see an error message You need to enter the email address for Second contact NFM on the RFM contact email Page
    When I provide RFM contact email as rfmsecond@email.com
    And I click on Continue button
    Then I should be on RFM second contact telephone question page
    And I click on Continue button
    Then I should see an error message Select yes if we can contact Second contact NFM by telephone on the RFM input telephone Page
    And I select option No and continue to next
    Then I should be on RFM Second Contact Address Page
    When I select back link
    And I select option Yes and continue to next
    Then I should be on RFM second contact telephone page
    And I click on Continue button
    Then I should see an error message You need to enter the telephone for Second contact NFM on the RFM input telephone Page
    When I enter Contact Telephone as 01632976880
    And I click on Continue button
    Then I should be on RFM Second Contact Address Page
    When I enter Address Line 1 as RFMSC Address Line 1
    And I enter City as RFMSC City
    And I enter Postal Code as EH5 5WY
    And I enter Country as United Kingdom
    And I click on Country selected
    When I click on Continue button
    Then I should navigate to RFM Contact Details Final CYA Page
