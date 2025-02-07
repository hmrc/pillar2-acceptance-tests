@tests
Feature: RFM check your answers page
  As a replacing filing member
  I want to enter my subscription details and access CYA page to check my answers and carry on in the journey

  @batch2
  Scenario: 1 - Verify Journey recovery page and error handling on submission of Pillar id and registration date for RFM journey
    Given Organisation User logs in with rfm URL to Pillar2
    When I provide RFM pillar2 id as XEPLR0123456400
    When I enter registration date as:
      | KEY                       | VALUE |
      | rfmRegistrationDate.day   | 31    |
      | rfmRegistrationDate.month | 1     |
      | rfmRegistrationDate.year  | 2024  |
    And I click on Continue button
    Then I should navigate to RFM journey recovery page
    Then I should see Report Pillar 2 top-up taxes text is not clickable
    And I click to replace the filing member for a Pillar 2 top-up taxes account to try again link
    Then I should be on RFM start page
    And I click on Continue button
    Then I should see Report Pillar 2 top-up taxes text is not clickable
    And I provide RFM pillar2 id as XEPLR0123456222
    Then I should be on RFM Registration Date Page
    When Registration Day is entered as 27
    And I click on Continue button
    Then I should see Report Pillar 2 top-up taxes text is not clickable
    And I click on Continue button
    Then I should navigate to RFM No record Match Error Page
    And I select back link
    Then I should be on RFM CYA Page
    Then I should see Report Pillar 2 top-up taxes text is not clickable
    When I click change link for RFM Pillar 2 top-up taxes ID
    And I provide RFM pillar2 id as XEPLR0123456404
    And I click on Continue button
    Then I should navigate to RFM No record Match Error Page
    And I click go back to try again using different details. link
    Then I should be on RFM enter pillar2 id page
    And I provide RFM pillar2 id as XMPLR0123456111
    And I click on Continue button
    And I should see row 1 value XMPLR0123456111
    And I click Sign out link

  @batch2
  Scenario: 2 - Verify that system throws an error on generic failure from ETMP when calling Amend API in replacing rfm journey
    Given Organisation User logs in without Pillar2 enrolment
    And I access RFM start page
    And I click on Continue button
    When I provide RFM pillar2 id as XMPLR0012345111
    When I enter registration date as:
      | KEY                       | VALUE |
      | rfmRegistrationDate.day   | 31    |
      | rfmRegistrationDate.month | 1     |
      | rfmRegistrationDate.year  | 2024  |
    When I click on Save&Continue button
    Then I should be on RFM Saving Progress Page
    When I click on Continue button
    When I select corp position as NFM
    Then I should be on New NFM guidance page
    When I click on Continue button
    And I select option Yes and continue to next
    When I select option UK limited company and continue to GRS page
    And I click on Save&Continue button
    Then I should be on RFM Contact Guidance page
    Then I should see Report Pillar 2 top-up taxes text is not clickable
    And I click on Continue button
    When I provide RFM contact name as 500
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
    And I should see Report Pillar 2 top-up taxes text is not clickable
    And I click on Continue button
    Then I should be redirect to RFM processing page
    And I should navigate to Amend API error Page for RFM
    Then I should see Report Pillar 2 top-up taxes text is not clickable
    And I click to replace the filing member for a Pillar 2 top-up taxes account to try again link
    Then I should navigate to RFM Final Review Page
    And I click Sign out link

  @batch2
  Scenario: 3 - Verify Incomplete data error
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
    And I access RFM corporate position page
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
    And I continue to RFM contact name Page
    And I provide RFM contact name as RFM test contact
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
    When  I click change link for RFM Change Second Contact Preference
    And I select option Yes and continue to next
    Then I should see Report Pillar 2 top-up taxes text is not clickable
    When I select back link
    When I select back link
    And I click on Continue button
    Then I should navigate to RFM incomplete task error page
    Then I should see Report Pillar 2 top-up taxes text is not clickable
    When I click replace the filing member for a Pillar 2 top-up taxes account to try again link
    Then I should be on RFM Final Review Page

  @zap_accessibility @batch2
  Scenario: 4 - Verify Security questions are not pre populated for RFM journey
    Given Organisation User logs in to RFM with credId RFMSaveProgress for Pillar2
    Then I should be on RFM enter pillar2 id page
    When I provide RFM pillar2 id as XMPLR0123456789
    When I enter registration date as:
      | KEY                       | VALUE |
      | rfmRegistrationDate.day   | 31    |
      | rfmRegistrationDate.month | 1     |
      | rfmRegistrationDate.year  | 2024  |
    When I click on Save&Continue button
    Then I should be on RFM Saving Progress Page
    When I select back link
    Then I should be on RFM CYA Page
    When I click on Continue button
    Then I access RFM corporate position page
    When I select corp position as UPE
    Then I should be on RFM Contact Guidance page
    When I click on Continue button
    And I provide RFM contact name as RFM test contact
    When I provide RFM contact email as rfm@email.com
    Then I should see Report Pillar 2 top-up taxes text is not clickable
    And I click Sign out link
    And Organisation User logs in to RFM with credId RFMSaveProgress for Pillar2
    Then I access RFM start page
    And I click on Continue button
    Then I should be on RFM enter pillar2 id page
    And The caption must be Replace filing member
    And The Heading should be Enter the group’s Pillar 2 top-up taxes ID
    And I should see RFM Pillar2 Id field as blank
    Then I provide RFM pillar2 id as XMPLR0123456789
    Then I should be on RFM Registration Date Page
    And I should see RFM Registration Day field as blank
    And I should see RFM Registration Month field as blank
    And I should see RFM Registration Year field as blank
    When I enter registration date as:
      | KEY                       | VALUE |
      | rfmRegistrationDate.day   | 31    |
      | rfmRegistrationDate.month | 1     |
      | rfmRegistrationDate.year  | 2024  |
    When I click on Save&Continue button
    Then I should be on RFM Saving Progress Page
    When I click on Continue button
    Then I access RFM corporate position page
    And I should see the corporate position UPE remain selected

