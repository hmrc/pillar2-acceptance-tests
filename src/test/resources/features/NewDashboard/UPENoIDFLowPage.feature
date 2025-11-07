@newTests
Feature: UPE NO ID journey
  As a MNE user
  I would like to enter my details via UPE No ID journey

  @batch1 @zap_accessibility
  Scenario: 1 - UPE No Id journey navigation to check your answers page and verify if data is pre populated
    Given Organisation User logs in as upe with credId UPENoIDJourney for Pillar2
    Then I should be on UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test UPE
    Then I should navigate to input-upe-address page
    When I enter Address as:
      | KEY          | VALUE                |
      | addressLine1 | Address Line 1 UPE   |
      | addressLine3 | City UPE             |
      | postalCode   | Invalid              |
      | countryCode  | United Arab Emirates |
    And I click on Continue button
    Then I should navigate to UPE Contact person/team Name page
    When I enter UPE Person/Team name as Contact UPE
    Then I should navigate to UPE Contact Email page
    When I enter UPE Email address as testcontactupe@email.com
    Then I should navigate to UPE Phone page
    When I select option Yes and continue to next
    Then I should navigate to input phone page
    And I enter Phone Number as 1234569
    Then I should be on Check your answers page
    When I click on Continue button
    Then I should be on Task list page
    And I click Sign out link
    Then I am on feedback survey page
    When Organisation User logs in as upe with credId UPENoIDJourney for Pillar2
    Then I should be on UPE business page
    Then I click on Continue button
    Then I click on Continue button
    And I click on Continue button
    And I click on Continue button
    And I click on Continue button
    Then I click on Continue button
    When I select back link
    Then I should be on UPE Phone page
    When I select back link
    Then I should be on UPE Contact Email page
    When I select back link
    Then I should be on UPE Contact person/team Name page
    When I select back link
    Then I should be on input-upe-address page
    When I click Report Pillar 2 Top-up Taxes link
    Then I should navigate to Task list page

  @batch1
  Scenario: 2 - Verify task list status
    Given Organisation User logs in to subscribe for Pillar2
    Then I should be on Task list page
    When I click Add Ultimate Parent Entity details link
    Then I should navigate to Initial guidance Page
    When I click on Continue button
    Then I should be on UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    And I enter UPE name as Test UPE
    Then I should navigate to input-upe-address page
    When I enter Address as:
      | KEY          | VALUE                |
      | addressLine1 | Test Address Line 1  |
      | addressLine3 | Test City            |
      | postalCode   | EH5 5WY              |
      | countryCode  | United Arab Emirates |
    When I click on Continue button
    When I enter UPE Person/Team name as UPE Contact Name
    And I click on Continue button
    When I enter UPE Email address as testteam@email.com
    And I click on Continue button
    When I select option Yes and continue to next
    When I enter Phone Number as 123456
    Then I should be on Check your answers page
    When I select back link
    Then I should navigate to input phone page
    When I select back link
    Then I should navigate to UPE Phone page
    When I select option No and continue to next
    Then I should be on Check your answers page
    When I click feedback link
    Then I should be navigated to Send your feedback page

  @zap_accessibility @batch2
  Scenario: 3 - Validate different error messages for UPE no ID journey pages
    Given Organisation User logs in to subscribe for Pillar2
    Then I should be on Task list page
    When I click Add Ultimate Parent Entity details link
    Then I should navigate to Initial guidance Page
    When I click on Continue button
    Then I should navigate to UPE business page
    When I click on Continue button
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test upeName
    Then I should navigate to input-upe-address page
    When I enter Address as:
      | KEY          | VALUE                |
      | addressLine1 | Test Address Line 1  |
      | addressLine3 | Test City            |
      | postalCode   | EH5 5WY              |
      | countryCode  | United Arab Emirates |
    When I click on Continue button
    Then I should navigate to UPE Contact person/team Name page
    And I click on Continue button
    When I enter UPE name as UPE Name character length Error validation and Maximum UPE character length should be entered 200 characters.UPE Name character length Error validation and Maximum UPE character length should be entered 200 characters.
    When I enter UPE Person/Team name as UPE Contact Name
    Then I should navigate to UPE Contact Email page
    And I click on Continue button
    When I enter UPE Email address as testTeamEmail
    When I enter UPE Email address as NFMNameCharacterLengthErrorValidation@andMaximumNFMCharacterLengthShouldBeEnteredMoreThanOneHundredThirtyTwoCharactersForEmailTextField.com
    When I enter UPE Email address as testteam@email.com
    Then I should navigate to UPE Phone page

  @batch1 @zap_accessibility @tests1
  Scenario: 4 - Change UPE fields from UPE check your answers page
    Given Organisation User navigates to UPE check your answer page with credId UPENoIDJourney
    Then I should be on Check your answers page
    When I click on change hyperlink next to the UPE Name
    And I enter UPE name as Name Change @&#
    And I should see row 1 value Name Change @&#
    When I click on change hyperlink next to the UPE Address
    And I enter Address Line 1 as Change Address &
    And I click on Continue button
    And I should see row 2 value Change Address &
    When I click on change hyperlink next to the UPE Contact Name
    And I enter UPE Person/Team name as Change Contact Person~
    Then I should be on Check your answers page
    And I should see row 3 value Change Contact Person~
    When I click on change hyperlink next to the UPE Email Address
    And I enter UPE Email address as changetest&@email.com
    And I should see row 4 value changetest&@email.com
    When I click on change hyperlink next to the UPE Phone Number
    And I enter Phone Number as 12345679
    And I should see row 6 value 12345679
    When I click on change hyperlink next to the UPE Phone Contact
    And I select option No and continue to next
    And I should see row 5 value No
    When I click Report Pillar 2 Top-up Taxes link
    Then I should navigate to Task list page
    When I click Sign out link
    Then I am on feedback survey page
    When I click the browser back button
    Then I should be on auth-login page

  @tests @batch1
  Scenario: 5 - Status update for Enter ultimate parent’s details task
    Given Organisation User logs in to subscribe for Pillar2
    Then I should be on Task list page
    When I click Add Ultimate Parent Entity details link
    Then I should navigate to Initial guidance Page
    And I click on Continue button
    When I select option No and continue to next
    And I enter UPE name as Test UPE
    When I enter Address as:
      | KEY          | VALUE                |
      | addressLine1 | Address Line 1       |
      | addressLine3 | City                 |
      | postalCode   | EH5 5WY              |
      | countryCode  | United Arab Emirates |
    When I enter UPE Person/Team name as UPE Contact Name
    When I enter UPE Email address as testteam@email.com
    Then I should navigate to UPE Phone page
    When I select option Yes and continue to next
    And I navigate back to TaskList Page from Phone Page
    Then The Task Add Ultimate Parent Entity details status should be In progress
    When I click Add Ultimate Parent Entity details link
    And I navigate to Phone Question Page from Initial guidance Page
    And I select option Yes and continue to next
    And I enter Phone Number as 123456
    And I navigate back to TaskList Page from Phone Input Page
    Then The Task Edit Ultimate Parent Entity details status should be Completed