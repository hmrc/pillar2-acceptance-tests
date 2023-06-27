@tests @zap_accessibility
Feature: Enter UPE registered Contact details
  As an UPE user
  I want to enter the Name and Contact details

  Scenario: 1 - User Validates UPE contact person name & email fields
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test contact person/team name & Email
    Then I should navigate to input-upe-address page
    When I enter Address Line 1 as Test Address Line 1
    And I enter City as Test City
    And I enter Country as Test Country
    And I click on Continue button
    Then I should navigate to UPE Contact person/team Name page
    And The caption must be Business details
    And The Heading should be What is the name of the person or team we should contact from the ultimate parent entity?
    When I enter UPE Person/Team name as Test Person/Team
    And I click on Continue button
    Then I should navigate to UPE Contact Email page
    And The caption must be Business details
    And The Heading should be What is the email address for Test Person/Team?
    When I enter UPE Email address as testteam@email.com
    And I click on Continue button
    Then I should navigate to UPE Contact page

  Scenario: 2 - User navigates to previous UPE contact person name and email pages
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test contact person/team Name&Email Back Link
    Then I should navigate to input-upe-address page
    When I enter Address Line 1 as Test Address Line 1
    And I enter City as Test City
    And I enter Country as Test Country
    And I click on Continue button
    Then I should navigate to UPE Contact person/team Name page
    When I enter UPE Person/Team name as Test Team
    And I click on Continue button
    Then I should navigate to UPE Contact Email page
    When I select back link
    Then I should navigate to UPE Contact person/team Name page
    When I select back link
    Then I should navigate to input-upe-address page

  Scenario: 3 - Display an error message, when user continues without entering UPE contact person/team name and email
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test contact person/team name & Email
    Then I should navigate to input-upe-address page
    When I enter Address Line 1 as Test Address Line 1
    And I enter City as Test City
    And I enter Country as Test Country
    And I click on Continue button
    Then I should navigate to UPE Contact person/team Name page
    And I click on Continue button
    Then I should see error message You need to enter the name of the person or team we should contact from the ultimate parent entity on the UPE Contact person/team name Page
    When I enter UPE Person/Team name as Test Person/Team
    And I click on Continue button
    Then I should navigate to UPE Contact Email page
    And I click on Continue button
    Then I should see error message You need to enter the email address for Test Person/Team on the UPE contact email Page

  Scenario: 4 - Prepopulate the answers on UPE contact person/team name and email after sign out
    Given Organisation User logs in as upe with credId TestUPEContactDetails for Pillar2
    Then I should be on UPE page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test UPE Contact Details Save
    Then I should navigate to input-upe-address page
    When I enter Address Line 1 as Test Address Line 1 Save
    And I enter Address Line 2 as Test Address Line 2 Save
    And I enter City as Test City Save
    And I enter Region as Test Region Save
    And I enter Postal Code as Test Postal Code Save
    And I enter Country as Test Country Save
    And I click on Continue button
    Then I should navigate to UPE Contact person/team Name page
    When I enter UPE Person/Team name as Test Person/Team
    And I click on Continue button
    Then I should navigate to UPE Contact Email page
    When I enter UPE Email address as testteam@email.com
    And I click on Continue button
    Then I should navigate to UPE Contact page
    When I select back link
    And I click Sign out link
    Then I am on feedback survey page
    When Organisation User logs in as upe with credId TestUPEContactDetails for Pillar2
    Then I should be on UPE page
    And I should see the answer No remain selected
    When I continue to next page
    Then I should navigate to input-upe-name page
    And I click on Continue button
    And I should see the Address Line 1 field is pre-populated with Test Address Line 1 Save
    And I should see the Address Line 2 field is pre-populated with Test Address Line 2 Save
    And I should see the City field is pre-populated with Test City Save
    And I should see the Region field is pre-populated with Test Region Save
    And I should see the Postal Code field is pre-populated with Test Postal Code Save
    And I should see the Country field is pre-populated with Test Country Save
    And I click on Continue button
    And I should see the UPE Person/Team name field is pre-populated with Test Person/Team
    And I click on Continue button
    And I should see the UPE Email address field is pre-populated with testteam@email.com
