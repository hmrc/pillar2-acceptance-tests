@tests @zap_accessibility
Feature: Register NFM and enter NFM details
  As a NFM user
  I want to create a new subscription

  Scenario: 1 - Enter NFM details - No path
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    And The Heading should be Stub GRS Journey Data
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Enter ultimate parent's details status should be Completed
    And The Task Enter filing member's details status should be Not Started
    When I click Enter filing member's details link
    Then I should navigate to NFM registration page
    And The caption is Business details
    And The Heading should be Do you want to register a nominated filing member for this group?
    And The Body content should be This step is optional. If you do not enter the details for a nominated filing member, the ultimate parent entity (UPE) will be used as the default.
    And The Body content should be You must have permission from the UPE to nominate a company as a filing member and be able to access the information required to file Pillar 2 top-up tax on the groups behalf.
    When I continue to next page
    Then I should see error message Select yes if there is a nominated filing member for this group on the NFM registration page Page
    When I select option No and continue to next
    Then I should navigate to Task list page
    And The Task Enter filing member's details status should be Completed

  Scenario: 2 - Enter NFM details - Yes path
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    And The Heading should be Stub GRS Journey Data
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Enter ultimate parent's details status should be Completed
    And The Task Enter filing member's details status should be Not Started
    When I click Enter filing member's details link
    Then I should navigate to NFM registration page
    When I select option Yes and continue to next
    Then I should navigate to NFM details page
    And The caption is Business details
    And The Heading should be Is the nominated filing member registered in the UK?
    When I continue to next page
    Then I should see error message Select yes if the nominated filing member is registered in the UK on the NFM details page Page
    When I select option Yes and continue to next
    



