@tests @zap_accessibility
Feature: Ultimate parent entity based in UK EQs
  As a MNE user
  I want to answer the Ultimate parent entity based in UK EQ

  Scenario: 1 - User Navigates to Display page
    Given Organisation User logs in as upe and navigates to name Page
    Then I should navigate to UPE Contact person/team Name page
    When I enter UPE Person/Team name as Test Telephone
    And I click on Continue button
    Then I should navigate to UPE Contact Email page
    When I enter UPE Email address as testteam@email.com
    And I click on Continue button
    Then I should navigate to UPE Telephone page
    And The caption must be Business details
    And The Heading should be Can we contact Test Telephone by telephone?
    And The Body content should be We will call if we have any questions about the management of Pillar 2 top-up tax for this business
    When I select option Yes and continue to next
    Then I should navigate to input telephone page
    And The caption must be Business details
    And The Heading should be What is the telephone number for Test Telephone?
    And The Body content should be Enter a telephone number, like 01632 960 001, 07700 900 982 or +44 808 157 0192.
    When I enter Telephone Number as 123456
    When I click on Continue button
    Then I should navigate to under construction page

  Scenario: 2 - User Navigates to Display page
    Given Organisation User logs in as upe and navigates to name Page
    Then I should navigate to UPE Contact person/team Name page
    When I enter UPE Person/Team name as Test Telephone
    And I click on Continue button
    Then I should navigate to UPE Contact Email page
    When I enter UPE Email address as testteam@email.com
    And I click on Continue button
    Then I should navigate to UPE Telephone page
    And The caption must be Business details
    And The Heading should be Can we contact Test Telephone by telephone?
    When I select option No and continue to next
    Then I should navigate to under construction page

  Scenario: 3 - Display an error message, when user continue without selecting an option
    Given Organisation User logs in as upe and navigates to name Page
    Then I should navigate to UPE Contact person/team Name page
    When I enter UPE Person/Team name as Test Telephone Error
    And I click on Continue button
    Then I should navigate to UPE Contact Email page
    When I enter UPE Email address as testteam@email.com
    And I click on Continue button
    Then I should navigate to UPE Telephone page
    And The Heading should be Can we contact Test Telephone Error by telephone?
    When I click on Continue button
    Then I should see error message Select yes if we can contact Test Telephone Error by telephone on the UPE Telephone Page

  Scenario: 4 - Display an error message, when user continue without selecting an option
    Given Organisation User logs in as upe and navigates to name Page
    Then I should navigate to UPE Contact person/team Name page
    When I enter UPE Person/Team name as Test Telephone Error
    And I click on Continue button
    Then I should navigate to UPE Contact Email page
    When I enter UPE Email address as testteam@email.com
    And I click on Continue button
    Then I should navigate to UPE Telephone page
    And The Heading should be Can we contact Test Telephone Error by telephone?
    When I select option Yes and continue to next
    Then I should navigate to input telephone page
    And The Heading should be What is the telephone number for Test Telephone Error?
    When I click on Continue button
    Then I should see error message You need to enter the telephone for Test Telephone Error on the Input Telephone Page

  Scenario: 5 - User navigates back to email page from input Telephone page
    Given Organisation User logs in as upe and navigates to name Page
    Then I should navigate to UPE Contact person/team Name page
    When I enter UPE Person/Team name as Test Telephone Back
    And I click on Continue button
    Then I should navigate to UPE Contact Email page
    When I enter UPE Email address as testteam@email.com
    And I click on Continue button
    Then I should navigate to UPE Telephone page
    And The Heading should be Can we contact Test Telephone Back by telephone?
    When I select option Yes and continue to next
    Then I should navigate to input telephone page
    And The Heading should be What is the telephone number for Test Telephone Back?
    And I enter Telephone Number as 12345
    And I click on Continue button
    When I select back link
    Then I should navigate to input telephone page
    And The Heading should be What is the telephone number for Test Telephone Back?
    When I select back link
    Then I should navigate to UPE Telephone page
    And The Heading should be Can we contact Test Telephone Back by telephone?

  Scenario: 6 - Prepopulate the answers on Telephone Selection and Telephone input after sign out
    Given Organisation User logs in as upe with credId TestUPETelephone for Pillar2
    Then I should be on UPE page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test UPE Telephone Save
    Then I should navigate to input-upe-address page
    When I enter Address Line 1 as Test Address Line 1
    And I enter City as Test City
    And I enter Country as Test Country
    And I click on Continue button
    Then I should navigate to UPE Contact person/team Name page
    When I enter UPE Person/Team name as Test Person
    And I click on Continue button
    Then I should navigate to UPE Contact Email page
    When I enter UPE Email address as testteam@email.com
    And I click on Continue button
    Then I should navigate to UPE Telephone page
    When I select option Yes and continue to next
    Then I should navigate to input telephone page
    And I enter Telephone Number as 1234569
    And I click on Continue button
    And I select back link
    And I click Sign out link
    Then I am on feedback survey page
    When Organisation User logs in as upe with credId TestUPETelephone for Pillar2
    Then I should be on UPE page
    And I should see the answer No remain selected
    When I continue to next page
    Then I should navigate to input-upe-name page
    And I navigate from Name page to Telephone page
    Then I should see the Telephone number field is pre-populated with 1234569




