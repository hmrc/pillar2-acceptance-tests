@tests @zap_accessibility
Feature: Enter NFM contact Telephone number
  As an NFM user
  I want to enter the Telephone number

  Scenario: 1 - Create a new subscription for validating MNE Selection on Further details status page
    Given Organisation User logs in as upe with credId MNESelection for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    And The Heading should be Stub GRS Journey Data
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    Then I should navigate to Task list page
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select option Yes and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to NFM UKCompany GRS page
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Add further group details status should be Not started
    When I click Add further group details link
    Then I should navigate to MNE or domestic page
    And The caption must be Business details
    And The Heading should be Where does the group operate?
    When I select option In the UK and other countries in further details group status page
    And I click on Continue button
    Then I should navigate to under construction page
    When I select back link
    Then I should navigate to MNE or domestic page
    And I should see the option In the UK and other countries remain selected
    When I select back link
    Then I should navigate to Task list page
    And The Task Add further group details status should be In progress
    When I click Sign out link
    Then I am on feedback survey page
    Given Organisation User logs in with credId MNESelection for Pillar2
    And The Task Add further group details status should be In progress
    When I click Add further group details link
    Then I should navigate to MNE or domestic page
    And I should see the option In the UK and other countries remain selected

  Scenario: 2 - Create a new subscription for validating Domestic Selection on Further details status page
    Given Organisation User logs in as upe with credId DomesticSelection for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    And The Heading should be Stub GRS Journey Data
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    Then I should navigate to Task list page
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select option Yes and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to NFM UKCompany GRS page
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Add further group details status should be Not started
    When I click Add further group details link
    Then I should navigate to MNE or domestic page
    And The caption must be Business details
    And The Heading should be Where does the group operate?
    When I select option Only in the UK in further details group status page
    And I click on Continue button
    Then I should navigate to under construction page
    When I select back link
    Then I should navigate to MNE or domestic page
    And I should see the option Only in the UK remain selected
    When I select back link
    Then I should navigate to Task list page
    And The Task Add further group details status should be In progress
    When I click Sign out link
    Then I am on feedback survey page
    Given Organisation User logs in with credId DomesticSelection for Pillar2
    And The Task Add further group details status should be In progress
    When I click Add further group details link
    Then I should navigate to MNE or domestic page
    And I should see the option Only in the UK remain selected

  Scenario: 3 - Further details group status page error validations
    Given I clear the cache
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit ultimate parent's details status should be Completed
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select option Yes and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to NFM UKCompany GRS page
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    Then I should navigate to Task list page
    When I click Add further group details link
    Then I should navigate to MNE or domestic page
    And I click on Continue button
    Then I should see error message Select where the group operates on the Further Details Group Status Page

  Scenario: 4 - Validate Bookmark for Further details group status page
    Given Organisation User logs in Further details group status page for Pillar2
    Then The Heading should be Page not available

