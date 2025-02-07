@e2e
Feature: RFM ultimate parent entity and New nominated Filling Member GRS and NO ID journeys
  As a MNE user
  I want to determine that in RFM journey, UPE or New NFM journey is based in UK for LLP and Limited company

  Scenario: 1 - Verify that New NFM can replace existing FM through GRS registration flow
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
    And I should see Print this page link on Review answers page
    When I click on Continue button
    Then I should be redirect to RFM processing page
    And I should navigate to RFM Confirmation Page

  Scenario: 2 - Verify that New NFM can replace existing FM through NO ID registration flow
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

  Scenario: 3 - Verify that UPE can replace existing FM on the Pillar 2 account
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
    When I provide RFM contact name as RFM second test contact
    When I provide RFM contact email as rfmsecondcontact@email.com
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
    And I enter Contact Name as test name
    And I click on Continue button
    And I should navigate to RFM Confirmation Page
    And I should see report and manage your group's Pillar 2 top-up taxes link
    And I can see Print this page link

  Scenario: 4 - Validating RFM final submission for RFM as selecting UPE then changed to NFM No ID journey
    Given I clear the cache
    When Organisation User logs in with rfm URL to Pillar2
    And I access RFM start page
    And I click on Continue button
    When I provide RFM pillar2 id as XMPLR0123456789
    And I enter registration date as:
      | KEY                       | VALUE |
      | rfmRegistrationDate.day   | 31    |
      | rfmRegistrationDate.month | 1     |
      | rfmRegistrationDate.year  | 2024  |
    And I click on Save&Continue button
    And I click on Continue button
    And I select corp position as UPE
    And I click on Continue button
    And I provide RFM contact name as RFM test contact
    And I provide RFM contact email as rfm@email.com
    Then I should navigate to RFM Contact Number Page
    When I select option No and continue to next
    And I select option No and continue to next
    And I enter Address as:
      | KEY          | VALUE              |
      | addressLine1 | RFM Address Line 1 |
      | addressLine3 | RFM City           |
      | postalCode   | EH5 5WY            |
      | countryCode  | United Kingdom     |
    Then I should navigate to RFM Final Review Page
    When I click change link for RFM Corporate Position
    And I select corp position as NFM
    And I click on Continue button
    And I select option No and continue to next
    And I click on Continue button
    And I provide RFM New NFM Name as Test CYA
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
    And I click on Continue button
    Then I should be redirect to RFM processing page
    And I should be on RFM Confirmation Page
    And I should see report and manage your group's Pillar 2 top-up taxes link
    And I can see Print this page link
    When I click the browser back button
    Then I should navigate to RFM No Return Back Error Page
