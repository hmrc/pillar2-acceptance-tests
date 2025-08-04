@tests1
Feature: Create a new registration and subscription
  As an user
  I want to create a new registration and subscription

  @zap_accessibility @batch2
  Scenario: 1 - User redirected to a placeholder error page, for a duplicate subscription on UPE No ID flow,UPE as DFM path.
    Given Organisation User logs in to subscribe for Pillar2
    When I click Add Ultimate Parent Entity details link
    When I click on Continue button
    When I select option No and continue to next
    And I enter UPE name as XMPLR0009999999
    When I enter Address as:
      | KEY          | VALUE                |
      | addressLine1 | Address Line 1       |
      | addressLine3 | City                 |
      | postalCode   | EH5 5WY              |
      | countryCode  | United Arab Emirates |
    When I enter UPE Person/Team name as UPE Contact Name
    When I enter UPE Email address as testteam@email.com
    When I select option No and continue to next
    Then I should be on Check your answers page
    And I click on Continue button
    When I click Add filing member details link
    When I select No option and continue to next
    When I click Add further group details link
    When I select option In the UK and outside the UK in further details group status page
    When I enter account period as:
      | KEY             | VALUE |
      | startDate.day   | 15    |
      | startDate.month | 1     |
      | startDate.year  | 2024  |
      | endDate.day     | 15    |
      | endDate.month   | 1     |
      | endDate.year    | 2025  |
    And I click on Continue button
    When I click Add contact details link
    When I click on Continue button
    When I select option Yes and continue to next
    When I select option No and continue to next
    When I enter Address as:
      | KEY          | VALUE          |
      | addressLine1 | Address Line 1 |
      | addressLine3 | City           |
      | postalCode   | EH5 5WY        |
      | countryCode  | United Kingdom |
    Then I should navigate to Contact details Check answers page
    When I click on Continue button
    When I click Check your answers before submitting your registration link
    Then I should navigate to Review answers page
    And I click on Save&Continue button
    Then I should navigate to duplicate ack ref error page

  @zap_accessibility @batch2
  Scenario: 2 - User redirected to a placeholder error page, for an incomplete data submission during registration
    Given Organisation User logs in without Pillar2 enrolment
    Then I should be on UPE business page
    When I select option Yes and continue to next
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    When I click Add filing member details link
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to NFM UKCompany GRS page
    And I click on Save&Continue button
    When I click Add further group details link
    When I select option In the UK and outside the UK in further details group status page
    When I enter account period as:
      | KEY             | VALUE |
      | startDate.day   | 15    |
      | startDate.month | 1     |
      | startDate.year  | 2024  |
      | endDate.day     | 15    |
      | endDate.month   | 1     |
      | endDate.year    | 2025  |
    Then I should navigate to FD check your answers page
    And I click on Continue button
    Then I should navigate to Task list page
    When I click Add contact details link
    Then I should navigate to Contact details guidance page
    When I click on Continue button
    When I enter Contact Name as Contact Name Test
    When I enter Contact Email as testContact@email.com
    When I select option No and continue to next
    Then I should navigate to Second Contact details page
    When I select option No and continue to next
    When I enter Address as:
      | KEY          | VALUE          |
      | addressLine1 | Address Line 1 |
      | addressLine3 | City           |
      | postalCode   | EH5 5WY        |
      | countryCode  | United Kingdom |
    Then I should navigate to Contact details Check answers page
    When I click on Continue button
    When I click Check your answers before submitting your registration link
    When I click on change link for Primary Contact
    Then I should navigate to Contact details change phone page
    When I select option Yes and continue to next
    And I select back link
    And I select back link
    When I click on Continue button
    Then I should navigate to Incomplete Data Submission Error Page
    And The Heading should be You have one or more incomplete registration tasks
    And The Body content should be go back to register your group and complete any in progress tasks.
    When I click go back to register your group and complete any in progress tasks. link
    Then I should navigate to Task list page
    Then The Task Add contact details status should be In progress

  @batch2
  Scenario: 3 - User redirected to a placeholder error page, for an invalid request during registration.
    Given Organisation User logs in to subscribe for Pillar2
    Then I should be on Task list page
    When I click Add Ultimate Parent Entity details link
    Then I should navigate to Initial guidance Page
    When I click on Continue button
    Then I should navigate to UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    And I enter UPE name as regNoIDInvalidRequest
    When I enter Address as:
      | KEY          | VALUE                |
      | addressLine1 | Address Line 1       |
      | addressLine3 | City                 |
      | postalCode   | EH5 5WY              |
      | countryCode  | United Arab Emirates |
    When I enter UPE Person/Team name as UPE Contact Name
    When I enter UPE Email address as testteam@email.com
    When I select option No and continue to next
    Then I should be on Check your answers page
    And I click on Continue button
    When I click Add filing member details link
    Then I should navigate to NFM registration page
    When I select No option and continue to next
    When I click Add further group details link
    When I select option In the UK and outside the UK in further details group status page
    When I enter account period as:
      | KEY             | VALUE |
      | startDate.day   | 15    |
      | startDate.month | 1     |
      | startDate.year  | 2024  |
      | endDate.day     | 15    |
      | endDate.month   | 1     |
      | endDate.year    | 2025  |
    Then I should navigate to FD check your answers page
    And I click on Continue button
    When I click Add contact details link
    When I click on Continue button
    Then I should navigate to Contact details display page
    When I select option Yes and continue to next
    Then I should navigate to Second Contact details page
    When I select option No and continue to next
    When I enter Address as:
      | KEY          | VALUE          |
      | addressLine1 | Address Line 1 |
      | addressLine3 | City           |
      | postalCode   | EH5 5WY        |
      | countryCode  | United Kingdom |
    Then I should navigate to Contact details Check answers page
    When I click on Continue button
    When I click Check your answers before submitting your registration link
    And I click on Save&Continue button
    Then I should navigate to Registration API error page
    And The Heading should be Sorry, there is a problem with the service
    And The Body content should be You must still register, please try again later.
    And The Body content should be We have saved your answers and they will be available for 28 days. After that time you will need to enter all of the information again.
    When I click Return to registration to try again link
    Then I should navigate to Task list page

  @batch2
  Scenario: 4 - Verify the link on page can't be found page
    Given Organisation User logs in without Pillar2 enrolment
    And I access random page
    And The Heading should be This page can’t be found
    And The Body content should be Please check that you have entered the correct web address.
    And The Body content should be You must return to your Pillar 2 Top-up Taxes registration and complete the required tasks.
    Then I click return to your Pillar 2 Top-up Taxes registration link
    Then I should see task list sections
    And The Task Add Ultimate Parent Entity details status should be Not started

  @ignore @batch2
  Scenario: 5 - User redirected to a placeholder error page, for a duplicate subscription on UPE No ID flow,UPE as DFM path.
    Given Organisation User logs in to subscribe for Pillar2
    Then I should be on Task list page
    When I click Add Ultimate Parent Entity details link
    Then I should navigate to Initial guidance Page
    When I click on Continue button
    Then I should navigate to UPE business page
    When I select option No and continue to next
    And I enter UPE name as Test UPE
    When I enter Address as:
      | KEY          | VALUE          |
      | addressLine1 | Address Line 1 |
      | addressLine3 | City           |
      | postalCode   | EH5 5WY        |
      | countryCode  | United Kingdom |
    Then I should navigate to UPE Contact person/team Name page
    When I enter UPE Person/Team name as UPE Contact Name
    When I enter UPE Email address as testteam@email.com
    When I select option No and continue to next
    Then I should be on Check your answers page
    And I click on Continue button
    When I click Add filing member details link
    Then I should navigate to NFM registration page
    When I select No option and continue to next
    When I click Add further group details link
    When I select option In the UK and outside the UK in further details group status page
    When I enter account period as:
      | KEY             | VALUE |
      | startDate.day   | 15    |
      | startDate.month | 1     |
      | startDate.year  | 2024  |
      | endDate.day     | 15    |
      | endDate.month   | 1     |
      | endDate.year    | 2025  |
    Then I should navigate to FD check your answers page
    And I click on Continue button
    When I click Add contact details link
    Then I should navigate to Contact details guidance page
    When I click on Continue button
    Then I should navigate to Contact details display page
    When I select option Yes and continue to next
    Then I should navigate to Second Contact details page
    When I select option No and continue to next
    When I enter Address as:
      | KEY          | VALUE          |
      | addressLine1 | Address Line 1 |
      | addressLine3 | City           |
      | postalCode   | EH5 5WY        |
      | countryCode  | United Kingdom |
    Then I should navigate to Contact details Check answers page
    When I click on Continue button
    When I click Check your answers before submitting your registration link
    Then I should navigate to Review answers page
    And I should see Print this page link on Review answers page