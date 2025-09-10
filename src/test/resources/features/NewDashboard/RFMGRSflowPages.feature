@newTests
Feature: RFM Ultimate Parent Entity and New nominated Filling Member GRS journey
  As a MNE user
  I want to determine that in RFM journey, UPE or New NFM journey is based in UK for LLP and Limited company
  So that I can navigate to the correct GRS journey and complete the navigation.

  @batch3
  Scenario: 1 - Verify RFM GRS journey when New NFM is based in UK - UK limited company
    Given Organisation User logs in without Pillar2 enrolment
    And I access RFM start page
    And I click on Continue button
    When I provide RFM pillar2 id as XMPLR0123456789
    And I click on Continue button
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
    When I click on Continue button
    When I select corp position as NFM
    Then I should be on New NFM guidance page
    When I click on Continue button
    Then I should be on RFM registered in UK page
    And I click on Continue button
    And I select option Yes and continue to next
    Then I should be on RFM UK based entity type page
    When I click on Continue button
    When I select option UK limited company and continue to GRS page
    Then I should navigate to RFM UK limited Company GRSPage
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    Then I should be on RFM Contact Guidance page

  @batch3
  Scenario: 2 - Verify that New NFM can replace existing FM through GRS registration flow on the Pillar 2 account and validations
    Given Organisation User logs in without Pillar2 enrolment
    And I access RFM start page
    And I click on Continue button
    When I provide RFM pillar2 id as XMPLR0123456789
    When I enter registration date as:
      | KEY                       | VALUE |
      | rfmRegistrationDate.day   | 31    |
      | rfmRegistrationDate.month | 1     |
      | rfmRegistrationDate.year  | 2024  |
    Then I should be on RFM CYA Page
    When I click on Save&Continue button
    When I click on Continue button
    When I select corp position as NFM
    When I click on Continue button
    And I select option Yes and continue to next
    Then I should be on RFM UK based entity type page
    When I select option UK limited company and continue to GRS page
    And I click on Save&Continue button
    Then I should be on RFM Contact Guidance page
    And I click on Continue button
    Then I should navigate to RFM Contact Detail Page
    When I provide RFM contact name as RFM test contact
    When I provide RFM contact email as rfm@email.com
    And I select option Yes and continue to next
    When I provide RFM contact number as 01632960001
    And I select option No and continue to next
    When I enter Address as:
      | KEY          | VALUE              |
      | addressLine1 | Address Line 1 CYA |
      | addressLine3 | City CYA           |
      | postalCode   | EH5 5WY            |
      | countryCode  | Australia          |
    Then I should navigate to RFM Final Review Page
    When  I click change link for RFM Change Second Contact Preference
    And I select option Yes and continue to next
    When I provide RFM contact name as RFM second test contact
    When I provide RFM contact email as rfmsecondcontact@email.com
    When I select option Yes and continue to next
    When I provide RFM second contact number as 09872960001
    Then I should navigate to RFM Final Review Page
    And I should see details as below:
      | KEY                                            | VALUE                      |
      | Company                                        | Test Example Company Name  |
      | Company Registration Number                    | 76543210                   |
      | Unique Taxpayer Reference                      | 1234567890                 |
      | Do you have a secondary contact?               | Yes                        |
      | Second contact name                            | RFM second test contact    |
      | Second contact email address                   | rfmsecondcontact@email.com |
      | Can we contact the secondary contact by phone? | Yes                        |
      | Second contact phone number                    | 09872960001                |
    When I click change link for RFM New NFM Name
    And I provide RFM contact name as RFM test contact change
    And I should see the row 5 value RFM test contact change
    When I click change link for RFM New RFM CYA Change Contact preference
    And I select option No and continue to next
    When I click change link for RFM Change Address
    And I enter Address Line 1 as Address Line 1 CYA change
    And I click on Continue button
    Then I should navigate to RFM Final Review Page
    And I should see the row 13 value Address Line 1 CYA change
    And I should see Print this page link on Review answers page
    And I click on Continue button
    And I should be redirect to RFM processing page
    Then I should navigate to RFM Confirmation Page

  @batch2
  Scenario: 3 - User registration as Limited liability partnership failed with party type mismatch error
    Given Organisation User logs in without Pillar2 enrolment
    And I access RFM start page
    And I click on Continue button
    When I provide RFM pillar2 id as XMPLR0123456789
    When I enter registration date as:
      | KEY                       | VALUE |
      | rfmRegistrationDate.day   | 31    |
      | rfmRegistrationDate.month | 1     |
      | rfmRegistrationDate.year  | 2024  |
    Then I should be on RFM CYA Page
    When I click on Save&Continue button
    And I click on Continue button
    When I select corp position as NFM
    When I click on Continue button
    And I select option Yes and continue to next
    When I select option Limited liability partnership and continue to GRS page
    Then I should navigate to RFM LLP GRS page
    When registration is unsuccessful with party type mismatch error
    And I click on Save&Continue button
    Then I should be on RFM GRS Registration Mismatch Error Page
    When I click go back to select the entity type link
    Then I should be on RFM UK based entity type page
    When I select option Limited liability partnership and continue to GRS page
    Then I should navigate to RFM LLP GRS page

  @batch2
  Scenario: 4 - User registration as UK limited company failed with identifiers mismatch error and entity type page validation
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
    When I select corp position as NFM
    And I click on Continue button
    And I select option Yes and continue to next
    When I select option UK limited company and continue to GRS page
    Then I should navigate to RFM UK limited Company GRSPage
    When registration is unsuccessful with identifiers not match error
    And I click on Save&Continue button
    Then I should be on RFM GRS Registration Not Called Error Page
    When I click Go back to select the entity type link
    Then I should be on RFM UK based entity type page
    When I select option Entity type not listed and continue to Name page
    Then I should be on RFM New NFM Contact Name Page