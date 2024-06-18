@tests @batch3
Feature: RFM CYA - NFM No ID flow
  As a MNE user
  I would like to check my details via NFM No ID journey

   @zap_accessibility
  Scenario: 1 - Verify RFM journey for NFM No Id flow until check your answers page and validate if data is pre populated once entered
    Given Organisation User logs in with rfm URL to Pillar2
    And I access RFM start page
    And I click on Continue button
    When I provide RFM pillar2 id as XMPLR0012345674
    And I click on Continue button
    When Registration Day is entered as 31
    When Registration Month is entered as 1
    And Registration Year is entered as 2024
    And I click on Continue button
    Then I should be on RFM CYA Page
    When I click on Save&Continue button
    And I access RFM corporate position page
    Then I should be on RFM Corp Position Page
    When I select corp position as NFM
    And I click on Continue button
    Then I should be on New NFM guidance page
    And The caption must be Group details
    And The Heading should be We need to match the details of the new nominated filing member to HMRC records
    And The Body content should be If the new filing member is registered in the UK, we will ask you for identifying information so we can best match it with our records.
    And The Body content should be If the new filing member is registered outside of the UK or if they are not a listed entity type, we will ask you for identifying information so we can create a new HMRC record.
    When I click on Continue button
    Then I should see an error message Enter the name of the new nominated filing member on the RFM contact name change Page
    When I enter NFM name as RFMNewNFMContactNameCharacterLengthErrorValidationMaximumNFMNameCharacterLengthShouldBeEnteredLessThanOneHundredFive
    And I click on Continue button
    Then I should see an error message The name of the new nominated filing must be 105 characters or less on the RFM contact name change Page
    When I refresh the page
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

  Scenario: 2 - Validating RFM final submission for RFM as selecting UPE then changed to NFM No ID journey
    Given Organisation User logs in with rfm URL to Pillar2
    And I access RFM start page
    And I click on Continue button
    When I provide RFM pillar2 id as XMPLR0012345674
    And I click on Continue button
    When Registration Day is entered as 31
    When Registration Month is entered as 1
    And Registration Year is entered as 2024
    And I click on Continue button
    Then I should be on RFM CYA Page
    When I click on Save&Continue button
    And I access RFM corporate position page
    When I select corp position as UPE
    And I click on Continue button
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
    And I select option No and continue to next
    Then I should be on RFM Contact Address Page
    When I enter Address Line 1 as RFM Address Line 1
    And I enter City as RFM City
    And I enter Postal Code as EH5 5WY
    And I enter Country as United Kingdom
    And I click on Country selected
    When I click on Continue button
    Then I should navigate to RFM Final Review Page
    And I should see row 1 key Position in the group’s corporate structure
    And I should see row 1 value Ultimate parent entity (UPE)
    When I click change link for RFM Corporate Position
    When I select corp position as NFM
    And I click on Continue button
    Then I should be on New NFM guidance page
    And I click on Continue button
    Then I should be on RFM registered in UK page
    When I select option No and continue to next
    And I click on Continue button
    Then I should navigate to RFM New NFM Contact Name Page
    When I provide RFM New NFM Name as Test CYA
    And I click on Continue button
    Then I should navigate to RFM New NFM Contact Address Page
    And I enter Address Line 1 as Address Line 1 CYA
    And I enter City as City CYA
    And I enter Postal Code as EH5 5WY
    And I enter Country as Australia
    And I click on Country selected
    And I click on Continue button
    Then I should be on RFM No ID CYA Page
    And I click on Continue button
    Then I should navigate to RFM Final Review Page
    When I select back link
    Then I should be on RFM No ID CYA Page
    And I click on Continue button
    Then I should navigate to RFM Final Review Page
    And I should see row 1 value New nominated filing member
    And I should see row 2 value Test CYA
    And I should see row 3 value Address Line 1 CYA
    And I should see row 3 value City CYA
    And I should see row 3 value EH55WY
    And I should see row 3 value Australia
    When I click change link for RFM Input Name
    When I provide RFM New NFM Name as Test Change
    And I click on Continue button
    Then I should navigate to RFM Final Review Page
    When I click change link for RFM Input Address
    And I enter Address Line 1 as Address Line 1 Change
    And I enter City as City Change
    And I enter Postal Code as EH75WK
    And I click on Continue button
    Then I should navigate to RFM Final Review Page
    And I should see row 3 value Address Line 1 Change
    And I should see row 3 value City Change
    And I should see row 3 value EH75WK
    When I click change link for RFM Corporate Position
    When I select corp position as UPE
    And I click on Continue button
    And I should see row 1 value Ultimate parent entity (UPE)
    When I click change link for RFM Corporate Position
    When I select corp position as NFM
    And I click on Continue button
    Then I should be on New NFM guidance page
    And I click on Continue button
    When I select option Yes and continue to next
    Then I should be on RFM UK based entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to RFM UK limited Company GRSPage
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    Then I should be on RFM Contact Guidance page
    And I click on Continue button
    Then I should navigate to RFM Contact Detail Page
    And I click on Continue button
    Then I should navigate to RFM Contact Email Page
    And I click on Continue button
    Then I should navigate to RFM Contact Number Page
    And I click on Continue button
    Then I should navigate to RFM Second Contact Question Page
    And I select option Yes and continue to next
    Then I should navigate to RFM second contact name page
    And I click on Continue button
    Then I should see an error message Enter name of the person of team we should contact on the RFM contact name change Page
    When I provide RFM contact name as RFM second test contact
    And I click on Continue button
    Then I should be on RFM second contact email page
    And I click on Continue button
    Then I should see an error message You need to enter the email address for RFM second test contact on the RFM contact email Page
    When I provide RFM contact email as rfmsecondcontact@email.com
    And I click on Continue button
    Then I should be on RFM second contact telephone question page
    And I select option No and continue to next
    Then I should be on RFM Contact Address Page
    When I select back link
    And I select option Yes and continue to next
    Then I should be on RFM second contact telephone page
    And I click on Continue button
    Then I should see an error message Select yes if we can contact RFM second test contact by telephone on the RFM journey error Page
    When I select option Yes and continue to next
    Then I should be on RFM second contact telephone page
    When I provide RFM second contact number as 09872960001
    And I click on Continue button
    Then I should be on RFM Contact Address Page
    And I click on Continue button
    Then I should navigate to RFM Final Review Page
    And I should see row 1 value New nominated filing member
    And I should see row 2 value Test Example Company Name
    And I should see row 3 value 76543210
    And I should see row 4 value 1234567890
    And I click on Continue button
    Then I should navigate to RFM Confirmation Page
    And I should see report and manage your group's Pillar 2 top-up taxes link
    And I can see Print this page link
    When I click report and manage your group's Pillar 2 top-up taxes link
    Then I should be on Dashboard page
