@tests @zap_accessibility
Feature: Ultimate parent entity GRS journies
  As a MNE user
  I want to determine that the UPE is based in UK or LLP
  So that I can navigate to the correct GRS journey.

  Scenario: 1 - Display an error message, when user continue without selecting an option
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    And The caption must be Business details
    And The Heading should be Is the ultimate parent entity registered in the UK?
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    And The caption must be Business details
    And The Heading should be What type of company is the ultimate parent entity?
    When I click on Continue button
    Then I should see error message Select what type of company the ultimate parent entity is on the UPE Org type Page

  Scenario: 2 - User registered as UkLimitedCompany successfully with BV enabled
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    And The caption must be Business details
    And The Heading should be Is the ultimate parent entity registered in the UK?
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    And The caption must be Business details
    And The Heading should be What type of company is the ultimate parent entity?
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    And The Heading should be Stub GRS Journey Data
    When I registered successfully with BV enabled
    And The json response Body should contain the status "registrationStatus" : "REGISTERED"
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit ultimate parent's details status should be Completed

  Scenario: 3 - User registered as UkLimitedCompany successfully with BV disabled
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    And The caption must be Business details
    And The Heading should be Is the ultimate parent entity registered in the UK?
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    And The caption must be Business details
    And The Heading should be What type of company is the ultimate parent entity?
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    And The Heading should be Stub GRS Journey Data
    When I registered successfully with BV disabled
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit ultimate parent's details status should be Completed

  Scenario: 4 - User registration as UkLimitedCompany failed with party type mismatch error
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    And The caption must be Business details
    And The Heading should be Is the ultimate parent entity registered in the UK?
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    And The caption must be Business details
    And The Heading should be What type of company is the ultimate parent entity?
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    And The Heading should be Stub GRS Journey Data
    When registration is unsuccessful with party type mismatch error
    And I click on Save&Continue button
#    Then I should navigate to under construction page # This Will be fixed in future

  Scenario: 5 - User registration as UkLimitedCompany failed with generic error
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    And The caption must be Business details
    And The Heading should be Is the ultimate parent entity registered in the UK?
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    And The caption must be Business details
    And The Heading should be What type of company is the ultimate parent entity?
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    And The Heading should be Stub GRS Journey Data
    When registration is unsuccessful with generic error error
    And I click on Save&Continue button
#    Then I should navigate to Task list page # This Will be fixed in future
#    And The Task Add ultimate parent's details status should be In progress

  Scenario: 6 - User registration as UkLimitedCompany failed with identifiers not match error
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    And The caption must be Business details
    And The Heading should be Is the ultimate parent entity registered in the UK?
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    And The caption must be Business details
    And The Heading should be What type of company is the ultimate parent entity?
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    And The Heading should be Stub GRS Journey Data
    When registration is unsuccessful with identifiers not match error
    And I click on Save&Continue button
#    Then I should navigate to under construction page # This Will be fixed in future

  Scenario: 7 - User registration as UkLimitedCompany failed with BV failed error
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    And The caption must be Business details
    And The Heading should be Is the ultimate parent entity registered in the UK?
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    And The caption must be Business details
    And The Heading should be What type of company is the ultimate parent entity?
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    And The Heading should be Stub GRS Journey Data
    When registration is unsuccessful with BV failed error
    And I click on Save&Continue button
#    Then I should navigate to under construction page # This Will be fixed in future

  Scenario: 8 - User registered as LimitedLiabilityPartnership successfully with BV enabled
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    And The caption must be Business details
    And The Heading should be Is the ultimate parent entity registered in the UK?
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    And The caption must be Business details
    And The Heading should be What type of company is the ultimate parent entity?
    When I select option Limited liability partnership and continue to GRS page
    Then I should navigate to LLP GRS page
    And The Heading should be Stub GRS Journey Data
    When I registered successfully with BV enabled
    And The json response Body should contain the status "registrationStatus" : "REGISTERED"
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit ultimate parent's details status should be Completed

  Scenario: 9 - User registered as UkLimitedCompany successfully with BV disabled
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    And The caption must be Business details
    And The Heading should be Is the ultimate parent entity registered in the UK?
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    And The caption must be Business details
    And The Heading should be What type of company is the ultimate parent entity?
    When I select option Limited liability partnership and continue to GRS page
    Then I should navigate to LLP GRS page
    And The Heading should be Stub GRS Journey Data
    When I registered successfully with BV disabled
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit ultimate parent's details status should be Completed

  Scenario: 10 - User registration as UkLimitedCompany failed with party type mismatch error
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    And The caption must be Business details
    And The Heading should be Is the ultimate parent entity registered in the UK?
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    And The caption must be Business details
    And The Heading should be What type of company is the ultimate parent entity?
    When I select option Limited liability partnership and continue to GRS page
    Then I should navigate to LLP GRS page
    And The Heading should be Stub GRS Journey Data
    When registration is unsuccessful with party type mismatch error
    And I click on Save&Continue button
#    Then I should navigate to under construction page # This Will be fixed in future

  Scenario: 11 - User registration as UkLimitedCompany failed with generic error
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    And The caption must be Business details
    And The Heading should be Is the ultimate parent entity registered in the UK?
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    And The caption must be Business details
    And The Heading should be What type of company is the ultimate parent entity?
    When I select option Limited liability partnership and continue to GRS page
    Then I should navigate to LLP GRS page
    And The Heading should be Stub GRS Journey Data
    When registration is unsuccessful with generic error error
    And I click on Save&Continue button
#    Then I should navigate to Task list page # This Will be fixed in future
#    And The Task Add ultimate parent's details status should be In progress

  Scenario: 12 - User registration as UkLimitedCompany failed with identifiers not match error
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    And The caption must be Business details
    And The Heading should be Is the ultimate parent entity registered in the UK?
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    And The caption must be Business details
    And The Heading should be What type of company is the ultimate parent entity?
    When I select option Limited liability partnership and continue to GRS page
    Then I should navigate to LLP GRS page
    And The Heading should be Stub GRS Journey Data
    When registration is unsuccessful with identifiers not match error
    And I click on Save&Continue button
#    Then I should navigate to under construction page # This Will be fixed in future

  Scenario: 13 - User registration as UkLimitedCompany failed with BV failed error
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    And The caption must be Business details
    And The Heading should be Is the ultimate parent entity registered in the UK?
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    And The caption must be Business details
    And The Heading should be What type of company is the ultimate parent entity?
    When I select option Limited liability partnership and continue to GRS page
    Then I should navigate to LLP GRS page
    And The Heading should be Stub GRS Journey Data
    When registration is unsuccessful with BV failed error
    And I click on Save&Continue button
#    Then I should navigate to under construction page # This Will be fixed in future

  Scenario: 14 - User navigates to UPE Page
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should navigate to UPE Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    When I select back link
    Then I should be on UPE Org type page
    When I select back link
    Then I should be on UPE business page
