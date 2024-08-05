@tests
Feature: UPE NO ID journey
  As a MNE user
  I would like to enter my details via UPE No ID journey

  @batch1 @zap_accessibility @tests1
  Scenario: 1 - UPE No Id journey navigation to check your answers page and verify if data is pre populated
    Given Organisation User logs in as upe with credId UPENoIDJourney for Pillar2
    Then I should be on UPE business page
    And The caption must be Group details
    And The Heading should be Is the ultimate parent entity registered in the UK?
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    And The caption must be Group details
    And The Heading should be What is the name of the ultimate parent entity?
    When I enter UPE name as Test UPE
    Then I should navigate to input-upe-address page
    And the page title should be What is the registered office address? - Report Pillar 2 top-up taxes - GOV.UK
    And The caption must be Group details
    And The Heading should be What is the registered office address of Test UPE?
    And The hint text should be Enter text and then choose from the list.
    When I enter Address as:
      | KEY          | VALUE              |
      | addressLine1 | Address Line 1 UPE |
      | addressLine3 | City UPE           |
      | postalCode   | invalid            |
      | countryCode  | United Kingdom     |
    And I click on Continue button
    Then I should see address error message Enter a valid UK postal code or change the country you selected on the Postal code Element
    When I enter Postal Code as EH5 5WY
    And I click on Continue button
    Then I should navigate to UPE Contact person/team Name page
    And The caption must be Group details
    And The Heading should be What is the name of the person or team we should contact from the ultimate parent entity?
    When I enter UPE Person/Team name as Contact UPE
    Then I should navigate to UPE Contact Email page
    And the page title should be What is the email address? - Report Pillar 2 top-up taxes - GOV.UK
    And The caption must be Group details
    And The Heading should be What is the email address for Contact UPE?
    And The hint text should be We will use this to confirm your records.
    When I enter UPE Email address as testcontactupe@email.com
    Then I should navigate to UPE Telephone page
    And the page title should be Can we contact by telephone? - Report Pillar 2 top-up taxes - GOV.UK
    And The caption must be Group details
    And The Heading should be Can we contact Contact UPE by telephone?
    And The hint text should be We will use this to confirm your records.
    When I select option Yes and continue to next
    Then I should navigate to input telephone page
    And the page title should be What is the telephone number? - Report Pillar 2 top-up taxes - GOV.UK
    And The caption must be Group details
    And The Heading should be What is the telephone number for Contact UPE?
    And The hint text should be Enter a telephone number, like 01632 960 001, 07700 900 982. For international numbers include the country code, like +44 808 157 0192 or 0044 808 157 0192.
    And I enter Telephone Number as 1234569
    Then I should be on Check your answers page
    And The caption must be Group details
    And The Heading should be Check your answers for ultimate parent details
    And I should see details as below:
      | KEY                          | VALUE                    |
      | Name                         | Test UPE                 |
      | Address                      | Address Line 1 UPE       |
      | Address                      | City UPE                 |
      | Address                      | EH5 5WY                  |
      | Address                      | United Kingdom           |
      | Contact name                 | Contact UPE              |
      | Email address                | testcontactupe@email.com |
      | Can we contact by telephone? | Yes                      |
      | Telephone number             | 1234569                  |
    When I click on Continue button
    Then I should be on Task list page
    And The Task Edit ultimate parent’s details status should be Completed
    And The Task Add filing member’s details status should be Not started
    And I click Sign out link
    Then I am on feedback survey page
    When Organisation User logs in as upe with credId UPENoIDJourney for Pillar2
    Then I should be on UPE business page
    And I should see the answer No remain selected
    Then I click on Continue button
    And I should see the UPE name field is pre-populated with Test UPE
    Then I click on Continue button
    And I should see the Postal Code field is pre-populated with EH5 5WY
    And I should see the Country field is pre-populated with United Kingdom
    And I click on Continue button
    And I should see the UPE Person/Team name field is pre-populated with Contact UPE
    And I click on Continue button
    And I should see the UPE Email address field is pre-populated with testcontactupe@email.com
    And I click on Continue button
    And I should see the answer Yes remain selected
    Then I click on Continue button
    Then I should see the Telephone number field is pre-populated with 1234569
    When I select back link
    Then I should be on UPE Telephone page
    When I select back link
    Then I should be on UPE Contact Email page
    When I select back link
    Then I should be on UPE Contact person/team Name page
    When I select back link
    Then I should be on input-upe-address page
    When I click Report Pillar 2 top-up taxes link
    Then I should navigate to Task list page

  @batch1
  Scenario: 2 - Verify task list status
    Given Organisation User logs in to subscribe for Pillar2
    Then I should be on Task list page
    And The header should display BETA banner
    And The page header should be Report Pillar 2 top-up taxes
    And The Heading should be Register your group
    And I should see task list sections
    And I should see section 1 as Group details
    And I should see section 2 as Contact details
    And I should see section 3 as Review and submit
    And I should see the task name Add ultimate parent’s details on Business details section
    And I should see the task name Filing member’s details on Business details section
    And I should see the task name Further group details on Business details section
    And The Task Add ultimate parent’s details status should be Not started
    And The Task Filing member’s details status should be Cannot start yet
    And The Task Further group details status should be Cannot start yet
    And I should see the task section 2 with task name as Contact details on Contact details section
    And The Task Contact details status should be Cannot start yet
    And I should see the task section 3 with task name as Review and submit on Contact details section
    And The Task Check your answers status should be Cannot start yet
    When I click Add ultimate parent’s details link
    Then I should navigate to Initial guidance Page
    When I click on Continue button
    Then I should be on UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    And I enter UPE name as Test UPE
    Then I should navigate to input-upe-address page
    When I enter Address as:
      | KEY          | VALUE               |
      | addressLine1 | Test Address Line 1 |
      | addressLine3 | Test City           |
      | postalCode   | E H 5 5 W Y         |
      | countryCode  | United Kingdom      |
    When I click on Continue button
    When I enter UPE Person/Team name as UPE Contact Name
    And I click on Continue button
    When I enter UPE Email address as testteam@email.com
    And I click on Continue button
    When I select option Yes and continue to next
    When I enter Telephone Number as 123456
    Then I should be on Check your answers page
    When I select back link
    Then I should navigate to input telephone page
    When I select back link
    Then I should navigate to UPE Telephone page
    When I select option No and continue to next
    Then I should be on Check your answers page
    When I click feedback link
    Then I should be navigated to Send your feedback page

  @zap_accessibility @batch2 @tests1
  Scenario: 3 - Validate different error messages for UPE no ID journey pages
    Given Organisation User logs in to subscribe for Pillar2
    Then I should be on Task list page
    And The Heading should be Register your group
    When I click Add ultimate parent’s details link
    Then I should navigate to Initial guidance Page
    And The caption must be Group details
    And The Heading should be We need to match the details of the ultimate parent entity to HMRC records
    And The Body content should be We will ask you for several pieces of identifying information about the ultimate parent so we can match it with our records.
    When I click on Continue button
    Then I should navigate to UPE business page
    When I click on Continue button
    Then I should see error message Select yes if the ultimate parent entity is registered in the UK on the UPE business EQ Page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I click on Continue button
    Then I should see error message You need to enter the name of the ultimate parent entity on the Input UPE Name Page
    When I enter UPE name as UPE Name character length Error validation and Maximum UPE character length should be entered 105 characters.
    Then I should see error message The name of the ultimate parent entity must be 105 characters or less on the Input UPE Name Page
    When I enter UPE name as Test <script>alert(document.domain)</script>
    Then I should navigate to input-upe-address page
    When I click on Continue button
    Then I should see address error message Enter the first line of the address on the Address Line Element
    Then I should see address error message Enter the town or city on the City Element
    Then I should see address error message Enter the postal code on the Postal code Element
    Then I should see address error message Select a country on the Country Element
    When I enter Address as:
      | KEY          | VALUE                                                          |
      | addressLine1 | enter long first line of address with more than 35 characters  |
      | addressLine2 | enter long second line of address with more than 35 characters |
      | addressLine3 | enter long city name with more than 35 characters              |
      | addressLine4 | enter long Region name with more than 35 characters            |
      | postalCode   | enter long postal code                                         |
      | countryCode  | Australia                                                      |
    Then I should see address error message The first line of the address must be 35 characters or less on the Address Line Element
    Then I should see address error message The second line of the address must be 35 characters or less on the Address Line 2 Element
    Then I should see address error message The town or city must be 35 characters or less on the City Element
    Then I should see address error message The region must be 35 characters or less on the Region Element
    Then I should see address error message The postal code must be 10 characters or less on the Postal code Element
    When I enter Address Line 1 as Test Address Line 1
    When I enter Address Line 2 as Test Address Line 2
    And I enter City as Test City
    And I enter Region as Region
    And I enter Postal Code as 123456
    And I click on Continue button
    Then I should navigate to UPE Contact person/team Name page
    And I click on Continue button
    Then I should see error message You need to enter the name of the person or team we should contact from the ultimate parent entity on the UPE Contact person/team name Page
    When I enter UPE name as UPE Name character length Error validation and Maximum UPE character length should be entered 200 characters.UPE Name character length Error validation and Maximum UPE character length should be entered 200 characters.
    Then I should see error message Name cannot be more than 200 characters on the UPE Contact person/team name Page
    When I enter UPE Person/Team name as UPE Contact Name
    Then I should navigate to UPE Contact Email page
    And I click on Continue button
    Then I should see error message You need to enter the email address for UPE Contact Name on the UPE contact email Page
    When I enter UPE Email address as testTeamEmail
    Then I should see error message Enter an email address in the correct format, like name@example.com on the UPE contact email Page
    When I enter UPE Email address as NFMNameCharacterLengthErrorValidation@andMaximumNFMCharacterLengthShouldBeEnteredMoreThanOneHundredThirtyTwoCharactersForEmailTextField.com
    Then I should see error message The email address should be 132 characters or less on the UPE contact email Page
    When I enter UPE Email address as testteam@email.com
    Then I should navigate to UPE Telephone page
    When I click on Continue button
    Then I should see error message Select yes if we can contact UPE Contact Name by telephone on the UPE Telephone Page
    When I select option Yes and continue to next
    Then I should navigate to input telephone page
    When I click on Continue button
    Then I should see error message You need to enter the telephone for UPE Contact Name on the Input Telephone Page
    And I enter Telephone Number as 1234512345123451234512345
    Then I should see error message The telephone number should be 24 characters or less on the Input Telephone Page
    And I enter Telephone Number as #incorrect number
    Then I should see error message Enter a telephone number in the correct format on the Input Telephone Page

  @batch1 @zap_accessibility @tests1
  Scenario: 4 - Change UPE fields from UPE check your answers page
    Given Organisation User navigates to UPE check your answer page with credId UPENoIDJourney
    Then I should be on Check your answers page
    When I click on change hyperlink next to the UPE Name
    And I enter UPE name as Name Change
    And I should see row 1 value Name Change
    When I click on change hyperlink next to the UPE Address
    And I enter Address Line 1 as Change Address
    And I click on Continue button
    And I should see row 2 value Change Address
    When I click on change hyperlink next to the UPE Contact Name
    And I enter UPE Person/Team name as Change Contact Person
    Then I should be on Check your answers page
    And I should see row 3 value Change Contact Person
    When I click on change hyperlink next to the UPE Email Address
    And I enter UPE Email address as changetest@email.com
    And I should see row 4 value changetest@email.com
    When I click on change hyperlink next to the UPE Telephone Number
    And I enter Telephone Number as 12345679
    And I should see row 6 value 12345679
    When I click on change hyperlink next to the UPE Telephone Contact
    And I select option No and continue to next
    And I should see row 5 value No
    When I click Report Pillar 2 top-up taxes link
    Then I should navigate to Task list page
    When I click Sign out link
    Then I am on feedback survey page
    When I click the browser back button
    Then I should be on auth-login page

  @tests @batch1
  Scenario: 5 - Status update for Enter ultimate parent’s details task
    Given Organisation User logs in to subscribe for Pillar2
    Then I should be on Task list page
    When I click Add ultimate parent’s details link
    Then I should navigate to Initial guidance Page
    And I click on Continue button
    When I select option No and continue to next
    And I enter UPE name as Test UPE
    When I enter Address as:
      | KEY          | VALUE          |
      | addressLine1 | Address Line 1 |
      | addressLine3 | City           |
      | postalCode   | EH5 5WY        |
      | countryCode  | United Kingdom |
    When I enter UPE Person/Team name as UPE Contact Name
    When I enter UPE Email address as testteam@email.com
    Then I should navigate to UPE Telephone page
    When I select option Yes and continue to next
    And I navigate back to TaskList Page from Telephone Page
    Then The Task Add ultimate parent’s details status should be In progress
    When I click Add ultimate parent’s details link
    And I navigate to Telephone Question Page from Initial guidance Page
    And I select option Yes and continue to next
    And I enter Telephone Number as 123456
    And I navigate back to TaskList Page from Telephone Input Page
    Then The Task Edit ultimate parent’s details status should be Completed

