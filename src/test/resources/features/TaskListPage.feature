@ignore
Feature: Task list page
  As a MNE user
  I should have access to Task List page

  Scenario: 2 - Complete the GRS journey for UPE/NFM and change the journey to no ID
    Given Organisation User logs in to subscribe for Pillar2
    Then I should be on Task list page
    When I click Add ultimate parent’s details link
    Then I should navigate to Initial guidance Page
    And I click on Continue button
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    When I click Add filing member details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to NFM UKCompany GRS page
    And I click on Save&Continue button
    When I click Edit filing member’s details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option No and continue to next
    Then I should be on NFM Name page
    When I select back link
    Then I should navigate to NFM details page
    When I select back link
    Then I should navigate to NFM registration page
    When I select back link
    Then I should be on Task list page
    And The Task Add filing member details status should be In progress
    When I click Edit ultimate parent's details link
    Then I should navigate to Initial guidance Page
    And I click on Continue button
    Then I should be on UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I select back link
    Then I should be on UPE business page
    When I select back link
    Then I should navigate to Initial guidance Page
    When I select back link
    Then I should be on Task list page
    And The Task Add ultimate parent’s details status should be In progress

  Scenario: 3 - Complete the No ID journey for UPE/NFM and change the journey to GRS
    Given Organisation User logs in to subscribe for Pillar2
    Then I should be on Task list page
    When I click Add ultimate parent’s details link
    Then I should navigate to Initial guidance Page
    And I click on Continue button
    Then I should be on UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test Bookmark
    Then I should navigate to input-upe-address page
    When I enter Address Line 1 as Address Line 1
    And I enter City as City
    And I enter Postal Code as EH5 5WY
    And I enter Country as United Kingdom
    And I click on Country selected
    And I click on Continue button
    Then I should navigate to UPE Contact person/team Name page
    When I enter UPE Person/Team name as Bookmark contact
    And I click on Continue button
    Then I should navigate to UPE Contact Email page
    When I enter UPE Email address as test@email.com
    And I click on Continue button
    Then I should navigate to UPE Telephone page
    When I select option Yes and continue to next
    Then I should navigate to input telephone page
    And I enter Telephone Number as 1234569
    And I click on Continue button
    Then I should be on Check your answers page
    When I click on Continue button
    And I click Add filing member details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option No and continue to next
    Then I should navigate to NFM Name page
    When I enter NFM name as Test CYA
    And I enter Address Line 1 as Address Line 1
    And I enter City as City
    And I enter Postal Code as EH5 5WY
    And I enter Country as United Kingdom
    And I click on Country selected
    When I click on Continue button
    Then I should navigate to NFM Contact Name page
    When I enter NFM Contact name as Contact Name
    And I click on Continue button
    Then I should navigate to NFM Contact Email page
    When I enter NFM Contact Email as teststatus@email.com
    And I click on Continue button
    Then I should navigate to NFM Telephone page
    When I select option Yes and continue to next
    Then I should navigate to input nfm telephone page
    When I enter NFM Telephone Number as 1234569
    And I click on Continue button
    Then I should navigate to NFM Check your answers page
    And I click on Continue button
    When I click Edit filing member’s details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM entity type page
    When I select back link
    Then I should navigate to NFM details page
    When I select back link
    Then I should navigate to NFM registration page
    When I select back link
    Then I should be on Task list page
    And The Task Add filing member details status should be In progress
    When I click Edit ultimate parent's details link
    Then I should navigate to Initial guidance Page
    And I click on Continue button
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should navigate to UPE entity type page
    When I select back link
    Then I should be on UPE business page
    When I select back link
    Then I should navigate to Initial guidance Page
    When I select back link
    Then I should be on Task list page
    And The Task Add ultimate parent’s details status should be In progress

  Scenario: 4 - Task list page status update validation after Task1 completion and navigating to different pages
    Given Organisation User logs in to subscribe for Pillar2
    Then I should be on Task list page
    And The Heading should be Register your group
    When I click Add ultimate parent’s details link
    Then I should navigate to Initial guidance Page
    And I click on Continue button
    Then I should be on UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test Task List
    Then I should navigate to input-upe-address page
    When I enter Address Line 1 as Address Line 1
    And I enter City as City
    When I enter Postal Code as EK567k34
    And I enter Country as China
    And I click on Country selected
    And I click on Continue button
    Then I should navigate to UPE Contact person/team Name page
    When I enter UPE Person/Team name as Contact
    And I click on Continue button
    Then I should navigate to UPE Contact Email page
    When I enter UPE Email address as test@email.com
    And I click on Continue button
    Then I should navigate to UPE Telephone page
    When I select option Yes and continue to next
    Then I should navigate to input telephone page
    And I enter Telephone Number as 1234569
    When I click on Continue button
    Then I should be on Check your answers page
    When I click on Continue button
    Then I should be on Task list page
    And I should see the task name Edit ultimate parent's details on Business details section
    And The Task Edit ultimate parent's details status should be Completed
    When I click Edit ultimate parent's details link
    Then I should navigate to Initial guidance Page
    And I click on Continue button
    Then I should be on UPE business page
    And I click on Continue button
    Then I should navigate to input-upe-name page
    And I click on Continue button
    Then I should navigate to input-upe-address page
    And I click on Continue button
    Then I should navigate to UPE Contact person/team Name page
    And I click on Continue button
    Then I should navigate to UPE Contact Email page
    And I click on Continue button
    Then I should navigate to UPE Telephone page
    And I click on Continue button
    Then I should navigate to input telephone page
    When I navigate back to TaskList Page from Telephone Page
    Then I should be on Task list page
    And The Task Edit ultimate parent's details status should be Completed

  Scenario: 5 - User completes GRS journey and Navigate to different pages of GRS journey and validates status
    Given Organisation User logs in to subscribe for Pillar2
    Then I should be on Task list page
    And The Heading should be Register your group
    When I click Add ultimate parent’s details link
    Then I should navigate to Initial guidance Page
    And I click on Continue button
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    And I click on Save&Continue button
    When I click Add filing member details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to NFM UKCompany GRS page
    And I click on Save&Continue button
    Then I should be on Task list page
    And The Task Edit ultimate parent's details status should be Completed
    When I click Edit ultimate parent's details link
    Then I should navigate to Initial guidance Page
    And I click on Continue button
    Then I should be on UPE business page
    And I click on Continue button
    Then I should be on UPE entity type page
    And I click on Continue button
    Then I should navigate to UKCompany GRS page
    When I navigate back to TaskList Page from GRS Page
    Then I should be on Task list page
    And The Task Edit ultimate parent's details status should be Completed
