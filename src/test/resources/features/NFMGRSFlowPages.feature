@tests @zap_accessibility
Feature: NFM GRS journies
  As a MNE user
  I want to determine that the NFM is based in UK or LLP
  So that I can navigate to the correct GRS flow journey.

  Scenario: 1 - Display an error message, when user continue without selecting an option
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
    And The Task Edit ultimate parent's details status should be Completed
    And The Task Add filing member's details status should be Not started
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM Org type page
    When I click on Continue button
    Then I should see error message Select what type of company the nominated filing member is on the NFM Org type Page

  Scenario: 2 - NFM User registered as UkLimitedCompany successfully with BV enabled
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
    And The Task Edit ultimate parent's details status should be Completed
    And The Task Add filing member's details status should be Not started
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to NFM UKCompany GRS page
    And The Heading should be Stub GRS Journey Data
    When I registered successfully with BV enabled
    And The json response Body should contain the status "registrationStatus" : "REGISTERED"
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit filing member's details status should be Completed

  Scenario: 3 - NFM User registered as UkLimitedCompany successfully with BV disabled
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
    And The Task Edit ultimate parent's details status should be Completed
    And The Task Add filing member's details status should be Not started
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to NFM UKCompany GRS page
    And The Heading should be Stub GRS Journey Data
    When I registered successfully with BV disabled
    And The json response Body should contain the status "registrationStatus" : "REGISTERED"
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit filing member's details status should be Completed

  Scenario: 4 - NFM User registration as UkLimitedCompany failed with party type mismatch error
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
    And The Task Edit ultimate parent's details status should be Completed
    And The Task Add filing member's details status should be Not started
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to NFM UKCompany GRS page
    And The Heading should be Stub GRS Journey Data
    When registration is unsuccessful with party type mismatch error
    And I click on Save&Continue button
    Then I should navigate to under construction page

  Scenario: 5 - NFM User registration as UkLimitedCompany failed with generic error
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
    And The Task Edit ultimate parent's details status should be Completed
    And The Task Add filing member's details status should be Not started
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to NFM UKCompany GRS page
    And The Heading should be Stub GRS Journey Data
    When registration is unsuccessful with generic error error
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit ultimate parent's details status should be Completed

  Scenario: 6 - NFM User registration as UkLimitedCompany failed with identifiers not match error
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
    And The Task Edit ultimate parent's details status should be Completed
    And The Task Add filing member's details status should be Not started
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to NFM UKCompany GRS page
    And The Heading should be Stub GRS Journey Data
    When registration is unsuccessful with identifiers not match error
    And I click on Save&Continue button
    Then I should navigate to under construction page

  Scenario: 7 - User registration as UkLimitedCompany failed with BV failed error
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
    And The Task Edit ultimate parent's details status should be Completed
    And The Task Add filing member's details status should be Not started
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to NFM UKCompany GRS page
    And The Heading should be Stub GRS Journey Data
    When registration is unsuccessful with BV failed error
    And I click on Save&Continue button
    Then I should navigate to under construction page

  Scenario: 8 - NFM User registered as LimitedLiabilityPartnership successfully with BV enabled
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
    And The Task Edit ultimate parent's details status should be Completed
    And The Task Add filing member's details status should be Not started
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM Org type page
    When I select option Limited liability partnership and continue to GRS page
    Then I should navigate to NFM LLP GRS page
    And The Heading should be Stub GRS Journey Data
    When I registered successfully with BV enabled
    And The json response Body should contain the status "registrationStatus" : "REGISTERED"
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit filing member's details status should be Completed

  Scenario: 9 - NFM User registered as UkLimitedCompany successfully with BV disabled
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
    And The Task Edit ultimate parent's details status should be Completed
    And The Task Add filing member's details status should be Not started
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM Org type page
    When I select option Limited liability partnership and continue to GRS page
    Then I should navigate to NFM LLP GRS page
    And The Heading should be Stub GRS Journey Data
    When I registered successfully with BV disabled
    And The json response Body should contain the status "registrationStatus" : "REGISTERED"
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit filing member's details status should be Completed

  Scenario: 10 - User registration as UkLimitedCompany failed with party type mismatch error
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
    And The Task Edit ultimate parent's details status should be Completed
    And The Task Add filing member's details status should be Not started
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM Org type page
    When I select option Limited liability partnership and continue to GRS page
    Then I should navigate to NFM LLP GRS page
    And The Heading should be Stub GRS Journey Data
    When registration is unsuccessful with party type mismatch error
    And I click on Save&Continue button
    Then I should navigate to under construction page

  Scenario: 11 - User registration as UkLimitedCompany failed with generic error
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
    And The Task Edit ultimate parent's details status should be Completed
    And The Task Add filing member's details status should be Not started
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM Org type page
    When I select option Limited liability partnership and continue to GRS page
    Then I should navigate to NFM LLP GRS page
    And The Heading should be Stub GRS Journey Data
    When registration is unsuccessful with generic error error
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit ultimate parent's details status should be Completed

  Scenario: 12 - User registration as UkLimitedCompany failed with identifiers not match error
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
    And The Task Edit ultimate parent's details status should be Completed
    And The Task Add filing member's details status should be Not started
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM Org type page
    When I select option Limited liability partnership and continue to GRS page
    Then I should navigate to NFM LLP GRS page
    And The Heading should be Stub GRS Journey Data
    When registration is unsuccessful with identifiers not match error
    And I click on Save&Continue button
    Then I should navigate to under construction page

  Scenario: 13 - User registration as UkLimitedCompany failed with BV failed error
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
    And The Task Edit ultimate parent's details status should be Completed
    And The Task Add filing member's details status should be Not started
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM Org type page
    When I select option Limited liability partnership and continue to GRS page
    Then I should navigate to NFM LLP GRS page
    And The Heading should be Stub GRS Journey Data
    When registration is unsuccessful with BV failed error
    And I click on Save&Continue button
    Then I should navigate to under construction page

  Scenario: 14 - User navigates to UPE Page
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
    And The Task Edit ultimate parent's details status should be Completed
    And The Task Add filing member's details status should be Not started
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to NFM UKCompany GRS page
    When I select back link
    Then I should be on NFM Org type page
    When I select back link
    Then I should be on NFM details page
    When I select back link
    Then I should be on NFM registration page

  Scenario: 15 - User can navigate to Entity type not listed hyperlink on NFM Org type page
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
    And The Task Edit ultimate parent's details status should be Completed
    And The Task Add filing member's details status should be Not started
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM Org type page
    And I should see Entity type not listed hyperLink
    When I click Entity type not listed link
    Then I should navigate to NFM Name page