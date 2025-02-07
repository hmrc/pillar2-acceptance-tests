@tests
Feature: RFM CYA - NFM No ID flow
  As a MNE user
  I would like to check my details via NFM No ID journey

  @zap_accessibility @batch3
  Scenario: 1 - Verify RFM journey for NFM No Id flow until check your answers page and validate that previously entered data is pre populated
    Given Organisation User logs in with rfm URL to Pillar2
    And I access RFM start page
    And The caption must be Replace filing member
    And The Heading should be Replace the filing member for a Pillar 2 top-up taxes account
    And I should see 4 sections on RFM start page
    And I should see the section 1 as Tell HMRC when you have replaced your filing member
    And I should see the section 3 as Obligations as the filing member
    And I should see the section 4 as What you will need
    And I should see register to report Pillar 2 top-up taxes link
    And I click on Continue button
    When I provide RFM pillar2 id as XMPLR0123456789
    When I enter registration date as:
      | KEY                       | VALUE |
      | rfmRegistrationDate.day   | 31    |
      | rfmRegistrationDate.month | 1     |
      | rfmRegistrationDate.year  | 2024  |
    Then I should be on RFM CYA Page
    When I click on Save&Continue button
    Then I should be on RFM Saving Progress Page
    When I click on Continue button
    Then I should be on RFM Corp Position Page
    And I click on Continue button
    Then I should see an error message Select if you are the ultimate parent entity or a new nominated filing member on the RFM journey error Page
    When I select corp position as NFM
    Then I should be on New NFM guidance page
    And The caption must be Group details
    And The Heading should be We need to match the details of the new nominated filing member to HMRC records
    And The Body content should be If the new filing member is registered in the UK, we will ask you for identifying information so we can best match it with our records.
    And The Body content should be If the new filing member is registered outside of the UK or if they are not a listed entity type, we will ask you for identifying information so we can create a new HMRC record.
    When I click on Continue button
    Then I should be on RFM registered in UK page
    When I select option No and continue to next
    Then I should navigate to RFM New NFM Contact Name Page
    And I click on Continue button
    Then I should see an error message Enter the name of the new nominated filing member on the RFM contact name Page
    When I enter NFM name as RFMNewNFMContactNameCharacterLengthErrorValidationMaximumNFMNameCharacterLengthShouldBeEnteredLessThanOneHundredFive
    Then I should see an error message Name of the new nominated filing must be 105 characters or less on the RFM contact name Page
    When I refresh the page
    When I provide RFM New NFM Name as Test CYA
    Then I should navigate to RFM New NFM Contact Address Page
    And I enter Country as United Arab Emirates
    And I click on Country selected
    And I click on Continue button
    Then I should see address error message Enter the first line of the address on the Address Line Element
    Then I should see address error message Enter the town or city on the City Element
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
    And I should see details as below:
      | KEY     | VALUE              |
      | Name    | Test CYA           |
      | Address | Address Line 1 CYA |
      | Address | City CYA           |
      | Address | EH55WY             |
      | Address | Australia          |
    When I click change link for RFM New NFM Name
    Then I should navigate to RFM New NFM Contact Name Change
    When I provide RFM New NFM Name as New NFM Name Change
    Then I should navigate to RFM No ID Change CYA Page
    When I click on Continue button
    Then I should navigate to RFM Contact Guidance page
    And I click Sign out link

  @batch3
  Scenario: 2 - Validating RFM final submission for RFM as selecting UPE then changed to NFM No ID journey
    Given I clear the cache
    When Organisation User logs in with rfm URL to Pillar2
    And I access RFM start page
    And I click on Continue button
    When I provide RFM pillar2 id as XMPLR0123456789
    When I enter registration date as:
      | KEY                       | VALUE |
      | rfmRegistrationDate.day   | 31    |
      | rfmRegistrationDate.month | 1     |
      | rfmRegistrationDate.year  | 2024  |
    When I click on Save&Continue button
    When I click on Continue button
    When I select corp position as UPE
    And I click on Continue button
    When I provide RFM contact name as RFM test contact
    When I provide RFM contact email as rfm@email.com
    Then I should navigate to RFM Contact Number Page
    When I select option No and continue to next
    And I select option No and continue to next
    When I enter Address as:
      | KEY          | VALUE              |
      | addressLine1 | RFM Address Line 1 |
      | addressLine3 | RFM City           |
      | postalCode   | EH5 5WY            |
      | countryCode  | United Kingdom     |
    Then I should navigate to RFM Final Review Page
    And I should see row 1 key Position in the group’s corporate structure
    And I should see row 1 value Ultimate parent entity (UPE)
    When I click change link for RFM Corporate Position
    When I select corp position as NFM
    And I click on Continue button
    When I select option No and continue to next
    And I click on Continue button
    When I provide RFM New NFM Name as Test CYA
    Then I should navigate to RFM New NFM Contact Address Page
    When I enter Address as:
      | KEY          | VALUE                |
      | addressLine1 | Address Line 1 & CYA |
      | addressLine3 | City CYA             |
      | postalCode   | EH5 5WY              |
      | countryCode  | Australia            |
    Then I should be on RFM No ID CYA Page
    And I click on Continue button
    Then I should navigate to RFM Final Review Page
    When I select back link
    Then I should be on RFM No ID CYA Page
    And I click on Continue button
    Then I should navigate to RFM Final Review Page
    And I should see details as below:
      | KEY                                         | VALUE                       |
      | Position in the group’s corporate structure | New nominated filing member |
      | Name                                        | Test CYA                    |
      | Address                                     | Address Line 1 & CYA        |
      | Address                                     | City CYA                    |
      | Address                                     | EH55WY                      |
      | Address                                     | Australia                   |
    When I click change link for RFM Input Name
    When I provide RFM New NFM Name as Test Change
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
    And I click on Continue button
    Then I should be redirect to RFM processing page
    And I should be on RFM Confirmation Page
    And I should see report and manage your group's Pillar 2 top-up taxes link
    And I can see Print this page link
    When I click the browser back button
    Then I should navigate to RFM No Return Back Error Page
    And I click report and manage your Pillar 2 top-up taxes link
    Then I should be on Dashboard page

  @batch2 @PIL-991
  Scenario: 3 - Validating RFM Check your answers page navigations
    Given Organisation User logs in with rfm URL to Pillar2
    And I access RFM start page
    And I click on Continue button
    When I provide RFM pillar2 id as XMPLR0123456789
    When I enter registration date as:
      | KEY                       | VALUE |
      | rfmRegistrationDate.day   | 31    |
      | rfmRegistrationDate.month | 1     |
      | rfmRegistrationDate.year  | 2024  |
    When I click on Save&Continue button
    When I click on Continue button
    When I select corp position as UPE
    And I click on Continue button
    When I provide RFM contact name as RFM test contact
    When I provide RFM contact email as rfm@email.com
    When I select option No and continue to next
    And I select option No and continue to next
    When I enter Address as:
      | KEY          | VALUE              |
      | addressLine1 | RFM Address Line 1 |
      | addressLine3 | RFM City           |
      | postalCode   | EH5 5WY            |
      | countryCode  | United Kingdom     |
    Then I should navigate to RFM Final Review Page
    When I click change link for RFM Corporate Position
    And I select corp position as NFM
    Then I should be on New NFM guidance page
    And I click on Continue button
    Then I should be on RFM registered in UK page
    When I select option Yes and continue to next
    Then I should be on RFM UK based entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to RFM UK limited Company GRSPage
    When I navigate back to RFM CYA Page from GRS Page
    Then I should navigate to RFM Final Review Page
    When I click change link for RFM Corporate Position
    And I click on Continue button
    Then I should be on New NFM guidance page
    And I click on Continue button
    Then I should be on RFM registered in UK page
    And I click on Continue button
    Then I should be on RFM UK based entity type page

  @batch3
  Scenario: 4 - Validating RFM Check your answers page for UPE/NFM journey Responses
    Given Organisation User logs in with rfm URL to Pillar2
    And I access RFM start page
    And I click on Continue button
    When I provide RFM pillar2 id as XMPLR0123456789
    When I enter registration date as:
      | KEY                       | VALUE |
      | rfmRegistrationDate.day   | 31    |
      | rfmRegistrationDate.month | 1     |
      | rfmRegistrationDate.year  | 2024  |
    When I click on Save&Continue button
    And I access RFM corporate position page
    When I select corp position as UPE
    And I click on Continue button
    When I provide RFM contact name as RFM test contact
    When I provide RFM contact email as rfm@email.com
    When I select option No and continue to next
    And I select option No and continue to next
    When I enter Address as:
      | KEY          | VALUE              |
      | addressLine1 | RFM Address Line 1 |
      | addressLine3 | RFM City           |
      | postalCode   | EH5 5WY            |
      | countryCode  | United Kingdom     |
    When I click change link for RFM Corporate Position
    When I select corp position as NFM
    And I click on Continue button
    When I select option No and continue to next
    When I provide RFM New NFM Name as Test CYA
    When I enter Address as:
      | KEY          | VALUE              |
      | addressLine1 | Address Line 1 CYA |
      | addressLine3 | City CYA           |
      | postalCode   | EH5 5WY            |
      | countryCode  | Australia          |
    Then I should be on RFM No ID CYA Page
    And I click on Continue button
    Then I should navigate to RFM Final Review Page
    When I select back link
    Then I should be on RFM No ID CYA Page
    And I click on Continue button
    Then I should navigate to RFM Final Review Page
    And I should see details as below:
      | KEY                                         | VALUE                       |
      | Position in the group’s corporate structure | New nominated filing member |
      | Name                                        | Test CYA                    |
      | Address                                     | Address Line 1 CYA          |
      | Address                                     | City CYA                    |
      | Address                                     | EH55WY                      |
      | Address                                     | Australia                   |
   When I click change link for RFM Input Name
    When I provide RFM New NFM Name as Test Change
    Then I should navigate to RFM Final Review Page
    When I click change link for RFM Input Address
    And I enter Address Line 1 as Address Line 1 Change
    And I enter City as City Change
    And I enter Postal Code as EH75WK
    And I click on Continue button
    Then I should navigate to RFM Final Review Page
    And I should see details as below:
      | KEY     | VALUE                 |
      | Address | Address Line 1 Change |
      | Address | City Change           |
      | Address | EH75WK                |
    When I click change link for RFM Corporate Position
    When I select corp position as UPE
    And I should see row 1 value Ultimate parent entity (UPE)
    When I click change link for RFM Corporate Position
    When I select corp position as NFM
    And I click on Continue button
    When I select option Yes and continue to next
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
    And I click on Continue button
    Then I should be on RFM Contact Address Page
    When I click on Continue button
    Then I should navigate to RFM Final Review Page
    And I should see details as below:
      | KEY                                         | VALUE                       |
      | Position in the group’s corporate structure | New nominated filing member |
      | Company                                     | Test Example Company Name   |
      | Company Registration Number                 | 76543210                    |
      | Unique Taxpayer Reference                   | 1234567890                  |

  @batch3
  Scenario: 5 - Verify that New NFM can replace existing FM through NO ID flow on the Pillar 2 account
    Given Organisation User logs in without Pillar2 enrolment
    And I access RFM start page
    And I click on Continue button
    When I provide RFM pillar2 id as XMPLR0123456789
    When I enter registration date as:
      | KEY                       | VALUE |
      | rfmRegistrationDate.day   | 31    |
      | rfmRegistrationDate.month | 1     |
      | rfmRegistrationDate.year  | 2024  |
    When I click on Save&Continue button
    When I click on Continue button
    When I select corp position as NFM
    When I click on Continue button
    And I select option No and continue to next
    When I provide RFM New NFM Name as Test CYA
    When I enter Address as:
      | KEY          | VALUE              |
      | addressLine1 | Address Line 1 CYA |
      | addressLine3 | City CYA           |
      | postalCode   | EH5 5WY            |
      | countryCode  | Australia          |
    And I click on Continue button
    And I click on Continue button
    When I provide RFM contact name as RFM test contact
    When I provide RFM contact email as rfm@email.com
    And I select option No and continue to next
    And I select option No and continue to next
    When I enter Address as:
      | KEY          | VALUE              |
      | addressLine1 | Address Line 1 CYA |
      | addressLine3 | City CYA           |
      | postalCode   | EH5 5WY            |
      | countryCode  | Australia          |
    Then I should navigate to RFM Final Review Page
    And I click on Continue button
    Then I should be redirect to RFM processing page
    And I should see Report Pillar 2 top-up taxes text is not clickable
    And I should be on RFM Confirmation Page
    And I should see report and manage your group's Pillar 2 top-up taxes link
    And I can see Print this page link
    When I click report and manage your group's Pillar 2 top-up taxes link
    Then I should be on Dashboard page

  @batch3
  Scenario: 6 - Verify that UPE can replace existing FM on the Pillar 2 account
    Given Organisation User logs in without Pillar2 enrolment
    And I access RFM start page
    And I click on Continue button
    When I provide RFM pillar2 id as XMPLR0123456789
    When I enter registration date as:
      | KEY                       | VALUE |
      | rfmRegistrationDate.day   | 31    |
      | rfmRegistrationDate.month | 1     |
      | rfmRegistrationDate.year  | 2024  |
    When I click on Save&Continue button
    And I click on Continue button
    When I select corp position as UPE
    When I click on Continue button
    When I provide RFM contact name as RFM test contact
    When I provide RFM contact email as rfm@email.com
    And I select option Yes and continue to next
    When I provide RFM contact number as 01632960001
    And I select option Yes and continue to next
    And I click on Continue button
    Then I should see an error message Enter name of the person or team we should contact on the RFM second contact name Page
    When I provide RFM contact name as RFM second test contact
    When I click on Continue button
    Then I should see an error message You need to enter the email address for RFM second test contact on the RFM contact email Page
    When I provide RFM contact email as rfmsecondcontact@email.com
    Then I click on Continue button
    Then I should see an error message Select yes if we can contact RFM second test contact by telephone on the RFM input telephone Page
    When I select option Yes and continue to next
    When I provide RFM second contact number as 09872960001
    When I enter Address as:
      | KEY          | VALUE              |
      | addressLine1 | Address Line 1 CYA |
      | addressLine3 | City CYA           |
      | postalCode   | EH5 5WY            |
      | countryCode  | Australia          |
    And I should see the row 1 value Ultimate parent entity (UPE)
    When I click on change link for Contact Name
    When I enter Contact Name as 400
    And I click on Continue button
    Then I should be redirect to RFM processing page
    And I should be on Amend API error Page for RFM
    When I click to replace the filing member for a Pillar 2 top-up taxes account to try again link
    Then I should navigate to RFM Final Review Page
    When I click on change link for Contact Name
    When I enter Contact Name as test name
    And I click on Continue button
    And I should navigate to RFM Confirmation Page
    And I should see report and manage your group's Pillar 2 top-up taxes link
    And I can see Print this page link
    When I click report and manage your group's Pillar 2 top-up taxes link
    Then I should be on Dashboard page
