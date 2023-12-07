@tests
Feature: UPE NO ID journey
  As a MNE user
  I would like to enter my details via UPE No ID journey
  @zap_accessibility
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
    And The caption must be Group details
    And The Heading should be Where is the registered office address of Test UPE?
    When I enter Address Line 1 as Address Line 1 UPE
    And I enter City as City UPE
    And I enter Postal Code as EH5 5WY
    And I select country as United Kingdom
    And I click on Continue button
    Then I should navigate to UPE Contact person/team Name page
    And The caption must be Group details
    And The Heading should be What is the name of the person or team we should contact from the ultimate parent entity?
    When I enter UPE Person/Team name as Contact UPE
    And I click on Continue button
    Then I should navigate to UPE Contact Email page
    And The caption must be Group details
    And The Heading should be What is the email address for Contact UPE?
    When I enter UPE Email address as testcontactupe@email.com
    And I click on Continue button
    Then I should navigate to UPE Telephone page
    And The caption must be Group details
    And The Heading should be Can we contact Contact UPE by telephone?
    And The Body content should be We will call if we have any questions about the management of Pillar 2 top-up tax for this business
    When I select option Yes and continue to next
    Then I should navigate to input telephone page
    And The caption must be Group details
    And The Heading should be What is the telephone number for Contact UPE?
    And The Body content should be Enter a telephone number, like 01632 960 001, 07700 900 982 or +44 808 157 0192.
    And I enter Telephone Number as 1234569
    And I click on Continue button
    Then I should be on Check your answers page
    And The caption must be Group details
    And The Heading should be Check your answers
    And I should see row 1 key Name
    And I should see row 2 key Address
    And I should see row 3 key Contact name
    And I should see row 4 key Email address
    And I should see row 5 key Can we contact by telephone?
    And I should see row 6 key Telephone number
    And I should see row 1 value Test UPE
    And I should see row 2 value Address Line 1 UPE
    And I should see row 2 value City UPE
    And I should see row 2 value EH5 5WY
    And I should see row 2 value United Kingdom
    And I should see row 3 value Contact UPE
    And I should see row 4 value testcontactupe@email.com
    And I should see row 5 value Yes
    And I should see row 6 value 1234569
    When I click on Continue button
    Then I should be on Task list page
    And The Task Edit ultimate parent's details status should be Completed
    And The Task Add filing member's details status should be Not started
    And I click Sign out link
    Then I am on feedback survey page
    When Organisation User logs in as upe with credId UPENoIDJourney for Pillar2
    Then I should be on UPE business page
    And I should see the answer No remain selected
    When I continue to next page
    Then I should navigate to input-upe-name page
    And I should see the UPE name field is pre-populated with Test UPE
    And I click on Continue button
    And I should see the Address Line 1 field is pre-populated with Address Line 1 UPE
    And I should see the City field is pre-populated with City UPE
    And I should see the Postal Code field is pre-populated with EH5 5WY
    And I should see the Country field is pre-populated with GB
    And I click on Continue button
    And I should see the UPE Person/Team name field is pre-populated with Contact UPE
    And I click on Continue button
    And I should see the UPE Email address field is pre-populated with testcontactupe@email.com
    And I click on Continue button
    And I should see the answer Yes remain selected
    And I click on Continue button
    Then I should see the Telephone number field is pre-populated with 1234569

  Scenario: 2 - Verify back link for all UPE No ID journey pages
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    And I enter UPE name as Test UPE
    Then I should navigate to input-upe-address page
    When I enter Address Line 1 as Test Address Line 1
    And I enter City as Test City
    And I enter Postal Code as EH5 5WY
    And I select country as United Kingdom
    And I click on Continue button
    Then I should navigate to UPE Contact person/team Name page
    When I enter UPE Person/Team name as UPE Contact Name
    And I click on Continue button
    Then I should navigate to UPE Contact Email page
    When I enter UPE Email address as testteam@email.com
    And I click on Continue button
    Then I should navigate to UPE Telephone page
    When I select option Yes and continue to next
    Then I should navigate to input telephone page
    When I enter Telephone Number as 123456
    When I click on Continue button
    Then I should be on Check your answers page
    When I select back link
    Then I should navigate to input telephone page
    When I select back link
    Then I should navigate to UPE Telephone page
    When I select option No and continue to next
    Then I should be on Check your answers page
    When I select back link
    Then I should navigate to UPE Telephone page
    When I select back link
    Then I should navigate to UPE Contact Email page
    When I select back link
    When I enter UPE Person/Team name as Test Telephone
    When I select back link
    Then I should navigate to input-upe-address page
    When I select back link
    Then I should navigate to input-upe-name page
    When I select back link
    Then I should be on UPE business page
  @zap_accessibility
  Scenario: 3 - Validate different error messages for UPE no ID journey pages
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I click on Continue button
    Then I should see error message Select yes if the ultimate parent entity is registered in the UK on the UPE business EQ Page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I click on Continue button
    Then I should see error message You need to enter the name of the ultimate parent entity on the Input UPE Name Page
    When I enter NFM name as UPE Name character length Error validation and Maximum UPE character length should be entered 105 characters.
    Then I should see error message The name of the ultimate parent entity must be 105 characters or less on the Input UPE Name Page
    And I enter UPE name as Test UPE
    Then I should navigate to input-upe-address page
    When I click on Continue button
    Then I should see address error message Enter the first line of the address on the Address Line Element
    Then I should see address error message Enter the town or city on the City Element
    Then I should see address error message Enter the postal code on the Postal code Element
    Then I should see address error message Select a country on the Country Element
    And I enter Address Line 1 as enter long first line of address with more than 35 characters
    And I enter Address Line 2 as enter long second line of address with more than 35 characters
    And I enter City as enter long city name with more than 35 characters
    And I enter Region as enter long Region name with more than 35 characters
    And I enter Postal Code as enter long postal code
    And I select country as India
    And I click on Continue button
    Then I should see address error message The first line of the address must be 35 characters or less on the Address Line Element
    Then I should see address error message The second line of the address must be 35 characters or less on the Address Line 2 Element
    Then I should see address error message The town or city must be 35 characters or less on the City Element
    Then I should see address error message The region must be 35 characters or less on the Region Element
    Then I should see address error message The postal code must be 10 characters or less on the Postal code Element
    When I enter Address Line 1 as Test Address Line 1
    When I enter Address Line 2 as Test Address Line 2
    And I enter City as Test City
    And I enter Region as Region
    And I enter Postal Code as invalid
    And I select country as United Kingdom
    And I click on Continue button
    Then I should see address error message Enter a valid UK postal code or change the country you selected on the Postal code Element
    When I enter Postal Code as EH5 5WY
    And I click on Continue button
    Then I should navigate to UPE Contact person/team Name page
    And I click on Continue button
    Then I should see error message You need to enter the name of the person or team we should contact from the ultimate parent entity on the UPE Contact person/team name Page
    When I enter UPE name as UPE Name character length Error validation and Maximum UPE character length should be entered 200 characters.UPE Name character length Error validation and Maximum UPE character length should be entered 200 characters.
    Then I should see error message Name cannot be more than 200 characters on the UPE Contact person/team name Page
    When I enter UPE Person/Team name as UPE Contact Name
    And I click on Continue button
    Then I should navigate to UPE Contact Email page
    And I click on Continue button
    Then I should see error message You need to enter the email address for UPE Contact Name on the UPE contact email Page
    When I enter UPE Email address as testTeamEmail
    And I click on Continue button
    Then I should see error message Enter an email address in the correct format, like name@example.com on the UPE contact email Page
    When I enter UPE Email address as NFMNameCharacterLengthErrorValidation@andMaximumNFMCharacterLengthShouldBeEnteredMoreThanOneHundredThirtyTwoCharactersForEmailTextField.com
    And I click on Continue button
    Then I should see error message The email address should be 132 characters or less on the UPE contact email Page
    When I enter UPE Email address as testteam@email.com
    And I click on Continue button
    Then I should navigate to UPE Telephone page
    When I click on Continue button
    Then I should see error message Select yes if we can contact UPE Contact Name by telephone on the UPE Telephone Page
    When I select option Yes and continue to next
    Then I should navigate to input telephone page
    When I click on Continue button
    Then I should see error message You need to enter the telephone for UPE Contact Name on the Input Telephone Page
    And I enter Telephone Number as 1234512345123451234512345
    When I click on Continue button
    Then I should see error message The telephone number should be 24 characters or less on the Input Telephone Page
    And I enter Telephone Number as #incorrect number
    When I click on Continue button
    Then I should see error message Enter a telephone number in the correct format on the Input Telephone Page
  @zap_accessibility
  Scenario: 4 - Change UPE fields from UPE check your answers page
    Given Organisation User navigates to UPE check your answer page with credId UPENoIDJourney
    Then I should be on Check your answers page
    When I click on change hyperlink next to the UPE Name
    And I enter UPE name as Name Change
    Then I navigate back to check your answers page from name page
    Then I should be on Check your answers page
    And I should see row 1 value Name Change
    When I click on change hyperlink next to the UPE Address
    And I enter Address Line 1 as Change Address
    Then I navigate back to check your answers page from address page
    And I should be on Check your answers page
    And I should see row 2 value Change Address
    And I should see row 2 value City UPE
    And I should see row 2 value United Kingdom
    When I click on change hyperlink next to the UPE Contact Name
    And I enter UPE Person/Team name as Change Contact Person
    Then I navigate back to check your answers page from contact name page
    And I should be on Check your answers page
    And I should see row 3 value Change Contact Person
    When I click on change hyperlink next to the UPE Email Address
    And I enter UPE Email address as changetest@email.com
    Then I navigate back to check your answers page from email address page
    And I should be on Check your answers page
    And I should see row 4 value changetest@email.com
    When I click on change hyperlink next to the UPE Telephone Number
    And I enter Telephone Number as 12345679
    Then I navigate back to check your answers page from telephone number page
    And I should be on Check your answers page
    And I should see row 6 value 12345679
    When I click on change hyperlink next to the UPE Telephone Contact
    And I select option No and continue to next
    Then I should be on Check your answers page
    And I should see row 5 value No

  Scenario: 5 - Status update for Enter ultimate parent's details task
    Given Organisation User logs in to subscribe for Pillar2
    Then I should be on Task list page
    When I click Add ultimate parent's details link
    Then I should navigate to Initial guidance Page
    And I click on Continue button
    Then I should be on UPE business page
    When I select option No and continue to next
    And I navigate back to TaskList Page from Name Page
    Then The Task Add ultimate parent's details status should be In progress
    When I click Add ultimate parent's details link
    Then I should navigate to Initial guidance Page
    When I click on Continue button
    Then I should navigate to UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    And I enter UPE name as Test UPE
    Then I should navigate to input-upe-address page
    When I enter Address Line 1 as Test Address Line 1
    And I enter City as Test City
    And I enter Postal Code as EH5 5WY
    And I select country as United Kingdom
    And I click on Continue button
    Then I should navigate to UPE Contact person/team Name page
    When I enter UPE Person/Team name as UPE Contact Name
    And I click on Continue button
    Then I should navigate to UPE Contact Email page
    When I enter UPE Email address as testteam@email.com
    And I click on Continue button
    Then I should navigate to UPE Telephone page
    When I select option Yes and continue to next
    And I navigate back to TaskList Page from Telephone Page
    Then The Task Add ultimate parent's details status should be In progress
    When I click Add ultimate parent's details link
    Then I should navigate to Initial guidance Page
    When I click on Continue button
    Then I should navigate to UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    And I enter UPE name as Test UPE
    Then I should navigate to input-upe-address page
    When I enter Address Line 1 as Test Address Line 1
    And I enter City as Test City
    And I enter Postal Code as EH5 5WY
    And I select country as United Kingdom
    And I click on Continue button
    Then I should navigate to UPE Contact person/team Name page
    When I enter UPE Person/Team name as UPE Contact Name
    And I click on Continue button
    Then I should navigate to UPE Contact Email page
    When I enter UPE Email address as testteam@email.com
    And I click on Continue button
    Then I should navigate to UPE Telephone page
    When I select option Yes and continue to next
    Then I should navigate to input telephone page
    When I enter Telephone Number as 123456
    And I click on Continue button
    And I navigate back to TaskList Page from Telephone Input Page
    Then The Task Edit ultimate parent's details status should be Completed






