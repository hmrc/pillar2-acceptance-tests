@e2e
Feature: User registration and subscription e2e journey
  As a MNE user
  I want to create a new registration and subscription
  So that I can access my dashboard

  Scenario: 1 - Create a new registration & subscription with UPE GRS Flow and NFM GRS flow
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    And I click on Save&Continue button
    Then I should navigate to Task list page
    When I click Add filing member details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to NFM UKCompany GRS page
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit filing member’s details status should be Completed
    When I click Add further group details link
    Then I should navigate to MNE or domestic page
    When I select option In the UK and outside the UK in further details group status page
    And I click on Continue button
    Then I should navigate to Group accounting period page
    When I enter account period as:
      | KEY             | VALUE |
      | startDate.day   | 15    |
      | startDate.month | 1     |
      | startDate.year  | 2024  |
      | endDate.day     | 15    |
      | endDate.month   | 1     |
      | endDate.year    | 2025  |
    And I click on Continue button
    Then I should navigate to FD check your answers page
    And I click on Continue button
    Then I should navigate to Task list page
    When I click Add contact details link
    Then I should navigate to Contact details guidance page
    When I click on Continue button
    When I enter Contact Name as Contact Name Test
    And I click on Continue button
    Then I should navigate to Contact details input email page
    When I enter Contact Email as testContact@email.com
    And I click on Continue button
    Then I should navigate to Contact details telephone page
    When I select option No and continue to next
    Then I should navigate to Second Contact details page
    When I select back link
    Then I should navigate to Contact details telephone page
    When I select option Yes and continue to next
    Then I should navigate to Contact details input telephone page
    When I enter Contact Telephone as 1234554
    And I click on Continue button
    Then I should navigate to Second Contact details page
    When I select option No and continue to next
    Then I should navigate to Contact address input page
    When I select back link
    Then I should navigate to Second Contact details page
    When I select option Yes and continue to next
    Then I should navigate to Second Contact name page
    When I enter Second Contact Name as Second Contact Name Test
    And I click on Continue button
    Then I should navigate to Second Contact email page
    When I enter Second Contact Email as secondContact@email.com
    And I click on Continue button
    Then I should navigate to Second Contact number page
    When I select option Yes and continue to next
    Then I should navigate to Second Contact Input page
    When I enter Second Contact Input as 1234554
    And I click on Continue button
    Then I should navigate to Contact address input page
    When I enter Address as:
      | KEY          | VALUE          |
      | addressLine1 | Address Line 1 |
      | addressLine3 | City           |
      | postalCode   | EH5 5WY        |
      | countryCode  | United Kingdom |
    When I click on Continue button
    Then I should navigate to Contact details Check answers page
    And I click on Continue button
    When I click Check your answers before submitting your registration link
    Then I should navigate to Review answers page
    And I click on Save&Continue button
    Then I should navigate to Registration confirmation page
    And I click report and manage your Pillar 2 top-up taxes link
    And I should be on Dashboard page

  Scenario: 2 - Create a new registration & subscription with UPE GRS Flow and No NFM flow
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    And I click on Save&Continue button
    Then I should navigate to Task list page
    When I click Add filing member details link
    Then I should navigate to NFM registration page
    When I select No option and continue to next
    Then I should navigate to Task list page
    And The Task Edit filing member’s details status should be Completed
    When I click Add further group details link
    Then I should navigate to MNE or domestic page
    When I select option In the UK and outside the UK in further details group status page
    And I click on Continue button
    Then I should navigate to Group accounting period page
    When I enter account period as:
      | KEY             | VALUE |
      | startDate.day   | 15    |
      | startDate.month | 1     |
      | startDate.year  | 2024  |
      | endDate.day     | 15    |
      | endDate.month   | 1     |
      | endDate.year    | 2025  |
    And I click on Continue button
    Then I should navigate to FD check your answers page
    And I click on Continue button
    Then I should navigate to Task list page
    When I click Add contact details link
    Then I should navigate to Contact details guidance page
    When I click on Continue button
    When I enter Contact Name as Contact Name Test
    And I click on Continue button
    Then I should navigate to Contact details input email page
    When I enter Contact Email as testContact@email.com
    And I click on Continue button
    Then I should navigate to Contact details telephone page
    When I select option No and continue to next
    Then I should navigate to Second Contact details page
    When I select back link
    Then I should navigate to Contact details telephone page
    When I select option Yes and continue to next
    Then I should navigate to Contact details input telephone page
    When I enter Contact Telephone as 1234554
    And I click on Continue button
    Then I should navigate to Second Contact details page
    When I select option No and continue to next
    Then I should navigate to Contact address input page
    When I select back link
    Then I should navigate to Second Contact details page
    When I select option Yes and continue to next
    Then I should navigate to Second Contact name page
    When I enter Second Contact Name as Second Contact Name Test
    And I click on Continue button
    Then I should navigate to Second Contact email page
    When I enter Second Contact Email as secondContact@email.com
    And I click on Continue button
    Then I should navigate to Second Contact number page
    When I select option Yes and continue to next
    Then I should navigate to Second Contact Input page
    When I enter Second Contact Input as 1234554
    And I click on Continue button
    Then I should navigate to Contact address input page
    When I enter Address as:
      | KEY          | VALUE          |
      | addressLine1 | Address Line 1 |
      | addressLine3 | City           |
      | postalCode   | EH5 5WY        |
      | countryCode  | United Kingdom |
    When I click on Continue button
    Then I should navigate to Contact details Check answers page
    And I click on Continue button
    When I click Check your answers before submitting your registration link
    Then I should navigate to Review answers page
    And I click on Save&Continue button
    Then I should navigate to Registration confirmation page
    And I click report and manage your Pillar 2 top-up taxes link
    And I should be on Dashboard page

  Scenario: 3 - Create a new registration & subscription with UPE GRS Flow and NFM No ID flow
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    And I click on Save&Continue button
    Then I should navigate to Task list page
    When I click Add filing member details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option No and continue to next
    Then I should navigate to NFM Name page
    When I enter NFM name as Test CYA
    And I enter Address as:
      | KEY          | VALUE          |
      | addressLine1 | Address Line 1 |
      | addressLine3 | City           |
      | postalCode   | EH5 5WY        |
      | countryCode  | United Kingdom |
    When I click on Continue button
    Then I should navigate to NFM Contact Name page
    When I enter NFM Contact name as Contact CYA
    And I click on Continue button
    Then I should navigate to NFM Contact Email page
    When I enter NFM Contact Email as testcya@email.com
    And I click on Continue button
    Then I should navigate to NFM Telephone page
    When I select option Yes and continue to next
    Then I should navigate to input nfm telephone page
    When I enter NFM Telephone Number as 1234569
    And I click on Continue button
    Then I should navigate to NFM Check your answers page
    When I click on Continue button
    Then I should navigate to Task list page
    And The Task Edit filing member’s details status should be Completed
    When I click Add further group details link
    Then I should navigate to MNE or domestic page
    When I select option In the UK and outside the UK in further details group status page
    And I click on Continue button
    Then I should navigate to Group accounting period page
    When I enter account period as:
      | KEY             | VALUE |
      | startDate.day   | 15    |
      | startDate.month | 1     |
      | startDate.year  | 2024  |
      | endDate.day     | 15    |
      | endDate.month   | 1     |
      | endDate.year    | 2025  |
    And I click on Continue button
    Then I should navigate to FD check your answers page
    And I click on Continue button
    Then I should navigate to Task list page
    When I click Add contact details link
    Then I should navigate to Contact details guidance page
    When I click on Continue button
    And I select option Yes and continue to next
    Then I should navigate to Second Contact details page
    When I select option No and continue to next
    Then I should navigate to Contact address input page
    When I enter Address as:
      | KEY          | VALUE          |
      | addressLine1 | Address Line 1 |
      | addressLine3 | City           |
      | postalCode   | EH5 5WY        |
      | countryCode  | United Kingdom |
    When I click on Continue button
    Then I should navigate to Contact details Check answers page
    And I click on Continue button
    When I click Check your answers before submitting your registration link
    Then I should navigate to Review answers page
    And I click on Save&Continue button
    Then I should navigate to Registration confirmation page
    And I click report and manage your Pillar 2 top-up taxes link
    And I should be on Dashboard page

  Scenario: 4 - Create a new registration & subscription with UPE No ID Flow and NFM No ID flow
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test UPE
    Then I should navigate to input-upe-address page
    When I enter Address as:
      | KEY          | VALUE          |
      | addressLine1 | Address Line 1 |
      | addressLine3 | City           |
      | postalCode   | EH5 5WY        |
      | countryCode  | United Kingdom |
    And I click on Continue button
    Then I should navigate to UPE Contact person/team Name page
    When I enter UPE Person/Team name as UPE Contact Name
    And I click on Continue button
    Then I should navigate to UPE Contact Email page
    When I enter UPE Email address as testcontactupe@email.com
    And I click on Continue button
    Then I should navigate to UPE Telephone page
    When I select option No and continue to next
    Then I should be on Check your answers page
    When I click on Continue button
    Then I should navigate to Task list page
    When I click Add filing member details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option No and continue to next
    Then I should navigate to NFM Name page
    When I enter NFM name as Test CYA
    And I enter Address as:
      | KEY          | VALUE          |
      | addressLine1 | Address Line 1 |
      | addressLine3 | City           |
      | postalCode   | EH5 5WY        |
      | countryCode  | United Kingdom |
    When I click on Continue button
    Then I should navigate to NFM Contact Name page
    When I enter NFM Contact name as Contact CYA
    And I click on Continue button
    Then I should navigate to NFM Contact Email page
    When I enter NFM Contact Email as testcya@email.com
    And I click on Continue button
    Then I should navigate to NFM Telephone page
    When I select option Yes and continue to next
    Then I should navigate to input nfm telephone page
    When I enter NFM Telephone Number as 1234569
    And I click on Continue button
    Then I should navigate to NFM Check your answers page
    When I click on Continue button
    Then I should navigate to Task list page
    And The Task Edit filing member’s details status should be Completed
    When I click Add further group details link
    Then I should navigate to MNE or domestic page
    When I select option In the UK and outside the UK in further details group status page
    And I click on Continue button
    Then I should navigate to Group accounting period page
    When I enter account period as:
      | KEY             | VALUE |
      | startDate.day   | 15    |
      | startDate.month | 1     |
      | startDate.year  | 2024  |
      | endDate.day     | 15    |
      | endDate.month   | 1     |
      | endDate.year    | 2025  |
    And I click on Continue button
    Then I should navigate to FD check your answers page
    And I click on Continue button
    Then I should navigate to Task list page
    When I click Add contact details link
    Then I should navigate to Contact details guidance page
    When I click on Continue button
    And I select option Yes and continue to next
    Then I should navigate to Second Contact details page
    When I select option No and continue to next
    Then I should navigate to Contact address input page
    When I enter Address as:
      | KEY          | VALUE          |
      | addressLine1 | Address Line 1 |
      | addressLine3 | City           |
      | postalCode   | EH5 5WY        |
      | countryCode  | United Kingdom |
    When I click on Continue button
    Then I should navigate to Contact details Check answers page
    And I click on Continue button
    When I click Check your answers before submitting your registration link
    Then I should navigate to Review answers page
    And I click on Save&Continue button
    Then I should navigate to Registration confirmation page
    And I click report and manage your Pillar 2 top-up taxes link
    And I should be on Dashboard page

  Scenario: 5 - Create a new registration & subscription with UPE No ID Flow and No NFM flow
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test UPE
    Then I should navigate to input-upe-address page
    When I enter Address as:
      | KEY          | VALUE          |
      | addressLine1 | Address Line 1 |
      | addressLine3 | City           |
      | postalCode   | EH5 5WY        |
      | countryCode  | United Kingdom |
    And I click on Continue button
    Then I should navigate to UPE Contact person/team Name page
    When I enter UPE Person/Team name as UPE Contact Name
    And I click on Continue button
    Then I should navigate to UPE Contact Email page
    When I enter UPE Email address as testcontactupe@email.com
    And I click on Continue button
    Then I should navigate to UPE Telephone page
    When I select option No and continue to next
    Then I should be on Check your answers page
    When I click on Continue button
    Then I should navigate to Task list page
    When I click Add filing member details link
    Then I should navigate to NFM registration page
    When I select No option and continue to next
    Then I should navigate to Task list page
    And The Task Edit filing member’s details status should be Completed
    When I click Add further group details link
    Then I should navigate to MNE or domestic page
    When I select option In the UK and outside the UK in further details group status page
    And I click on Continue button
    Then I should navigate to Group accounting period page
    When I enter account period as:
      | KEY             | VALUE |
      | startDate.day   | 15    |
      | startDate.month | 1     |
      | startDate.year  | 2024  |
      | endDate.day     | 15    |
      | endDate.month   | 1     |
      | endDate.year    | 2025  |
    And I click on Continue button
    Then I should navigate to FD check your answers page
    And I click on Continue button
    Then I should navigate to Task list page
    When I click Add contact details link
    Then I should navigate to Contact details guidance page
    When I click on Continue button
    And I select option Yes and continue to next
    Then I should navigate to Second Contact details page
    When I select option No and continue to next
    Then I should navigate to Contact address input page
    When I enter Address as:
      | KEY          | VALUE          |
      | addressLine1 | Address Line 1 |
      | addressLine3 | City           |
      | postalCode   | EH5 5WY        |
      | countryCode  | United Kingdom |
    When I click on Continue button
    Then I should navigate to Contact details Check answers page
    And I click on Continue button
    When I click Check your answers before submitting your registration link
    Then I should navigate to Review answers page
    And I click on Save&Continue button
    Then I should navigate to Registration confirmation page
    And I click report and manage your Pillar 2 top-up taxes link
    And I should be on Dashboard page

  Scenario: 6 - Create a new registration & subscription with UPE No ID Flow and NFM GRS flow
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test UPE
    Then I should navigate to input-upe-address page
    When I enter Address as:
      | KEY          | VALUE          |
      | addressLine1 | Address Line 1 |
      | addressLine3 | City           |
      | postalCode   | EH5 5WY        |
      | countryCode  | United Kingdom |
    And I click on Continue button
    Then I should navigate to UPE Contact person/team Name page
    When I enter UPE Person/Team name as Contact UPE
    And I click on Continue button
    Then I should navigate to UPE Contact Email page
    When I enter UPE Email address as testcontactupe@email.com
    And I click on Continue button
    Then I should navigate to UPE Telephone page
    When I select option Yes and continue to next
    Then I should navigate to input telephone page
    And I enter Telephone Number as 1234569
    And I click on Continue button
    Then I should be on Check your answers page
    When I click on Continue button
    Then I should navigate to Task list page
    When I click Add filing member details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to NFM UKCompany GRS page
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit filing member’s details status should be Completed
    When I click Add further group details link
    Then I should navigate to MNE or domestic page
    When I select option In the UK and outside the UK in further details group status page
    And I click on Continue button
    Then I should navigate to Group accounting period page
    When I enter account period as:
      | KEY             | VALUE |
      | startDate.day   | 15    |
      | startDate.month | 1     |
      | startDate.year  | 2024  |
      | endDate.day     | 15    |
      | endDate.month   | 1     |
      | endDate.year    | 2025  |
    And I click on Continue button
    Then I should navigate to FD check your answers page
    And I click on Continue button
    Then I should navigate to Task list page
    When I click Add contact details link
    Then I should navigate to Contact details guidance page
    When I click on Continue button
    And I select option Yes and continue to next
    Then I should navigate to Second Contact details page
    When I select option No and continue to next
    Then I should navigate to Contact address input page
    When I enter Address as:
      | KEY          | VALUE          |
      | addressLine1 | Address Line 1 |
      | addressLine3 | City           |
      | postalCode   | EH5 5WY        |
      | countryCode  | United Kingdom |
    When I click on Continue button
    Then I should navigate to Contact details Check answers page
    And I click on Continue button
    When I click Check your answers before submitting your registration link
    Then I should navigate to Review answers page
    And I click on Save&Continue button
    Then I should navigate to Registration confirmation page
    And I click report and manage your Pillar 2 top-up taxes link
    And I should be on Dashboard page

  Scenario: 7 - Create a new registration & subscription with UPE Entity type not listed and NFM GRS flow
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE entity type page
    When I select option Entity type not listed and continue to Name page
    And I enter UPE name as Test UPE
    Then I should navigate to input-upe-address page
    When I enter Address as:
      | KEY          | VALUE          |
      | addressLine1 | Address Line 1 |
      | addressLine3 | City           |
      | postalCode   | EH5 5WY        |
      | countryCode  | United Kingdom |
    Then I should navigate to UPE Contact person/team Name page
    When I enter UPE Person/Team name as UPE Contact Name
    Then I should navigate to UPE Contact Email page
    When I enter UPE Email address as testcontactupe@email.com
    Then I should navigate to UPE Telephone page
    When I select option No and continue to next
    Then I should be on Check your answers page
    When I click on Continue button
    Then I should navigate to Task list page
    When I click Add filing member details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to NFM UKCompany GRS page
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit filing member details status should be Completed
    When I click Add further group details link
    Then I should navigate to MNE or domestic page
    When I select option In the UK and outside the UK in further details group status page
    Then I should navigate to Group accounting period page
    When I enter account period as:
      | KEY             | VALUE |
      | startDate.day   | 15    |
      | startDate.month | 1     |
      | startDate.year  | 2024  |
      | endDate.day     | 15    |
      | endDate.month   | 1     |
      | endDate.year    | 2025  |
    When I click on Continue button
    Then I should navigate to Task list page
    When I click Add contact details link
    Then I should navigate to Contact details guidance page
    When I click on Continue button
    When I select option Yes and continue to next
    Then I should navigate to Second Contact details page
    When I select option No and continue to next
    Then I should navigate to Contact address input page
    When I enter Address as:
      | KEY          | VALUE          |
      | addressLine1 | Address Line 1 |
      | addressLine3 | City           |
      | postalCode   | EH5 5WY        |
      | countryCode  | United Kingdom |
    And I click on Continue button
    And I click Check your answers before submitting your registration link
    Then I should navigate to Review answers page
    When I click on Save&Continue button
    Then I should navigate to Registration processing page
    And I should navigate to Registration confirmation page

  Scenario: 8 - Create a new registration & subscription with UPE GRS flow and NFM Entity type not listed
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    When I click on Save&Continue button
    Then I should navigate to Task list page
    When I click Add filing member details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM entity type page
    When I select option Entity type not listed and continue to Name page
    When I enter NFM Contact name as Contact CYA
    And I enter Address as:
      | KEY          | VALUE          |
      | addressLine1 | Address Line 1 |
      | addressLine3 | City           |
      | postalCode   | EH5 5WY        |
      | countryCode  | United Kingdom |
    Then I should navigate to NFM Contact Name page
    When I enter NFM Contact name as Contact CYA
    Then I should navigate to NFM Contact Email page
    When I enter NFM Contact Email as testcya@email.com
    Then I should navigate to NFM Telephone page
    When I select option Yes and continue to next
    Then I should navigate to input nfm telephone page
    When I enter NFM Telephone Number as 1234569
    And I click on Continue button
    And I click Add further group details link
    Then I should navigate to MNE or domestic page
    When I select option In the UK and outside the UK in further details group status page
    Then I should navigate to Group accounting period page
    When I enter account period as:
      | KEY             | VALUE |
      | startDate.day   | 15    |
      | startDate.month | 1     |
      | startDate.year  | 2024  |
      | endDate.day     | 15    |
      | endDate.month   | 1     |
      | endDate.year    | 2025  |
    When I click on Continue button
    Then I should navigate to Task list page
    When I click Add contact details link
    Then I should navigate to Contact details guidance page
    When I click on Continue button
    When I select option Yes and continue to next
    Then I should navigate to Second Contact details page
    When I select option No and continue to next
    Then I should navigate to Contact address input page
    When I enter Address as:
      | KEY          | VALUE          |
      | addressLine1 | Address Line 1 |
      | addressLine3 | City           |
      | postalCode   | EH5 5WY        |
      | countryCode  | United Kingdom |
    And I click on Continue button
    And I click Check your answers before submitting your registration link
    And I click on Save&Continue button
    Then I should navigate to Registration processing page
    And I should navigate to Registration confirmation page
