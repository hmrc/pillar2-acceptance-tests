@tests
Feature: Ultimate parent entity GRS journey
  As a MNE user
  I want to determine that the UPE is based in UK or LLP
  So that I can navigate to the correct GRS journey.
  @zap_accessibility
  Scenario: 1 - Validate Error scenario and Entity type not listed hyperlink on UPE Org type page
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    And The caption must be Group details
    And The Heading should be Is the ultimate parent entity registered in the UK?
    When I select option Yes and continue to next
    Then I should be on UPE entity type page
    And The caption must be Group details
    And The Heading should be What entity type is the ultimate parent?
    And I should see Entity type not listed hyperLink
    When I click Entity type not listed link
    #Then I should navigate to input-upe-name page #need to be fixed as part of PIL-598
    #When I select back link
    #Then I should be on UPE entity type page
    #When I click on Continue button
    #Then I should see error message Select what type of company the ultimate parent entity is on the UPE Org type Page
  @zap_accessibility
  Scenario: 2 - User registered as UkLimitedCompany successfully with BV enabled
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE entity type page
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
    When I select option Yes and continue to next
    Then I should be on UPE entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    And The Heading should be Stub GRS Journey Data
    When I registered successfully with BV disabled
    And I click on Save&Continue button
    Then I should navigate to Task list page

  Scenario: 4 - User registration as UkLimitedCompany failed with party type mismatch error
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    And The Heading should be Stub GRS Journey Data
    When registration is unsuccessful with party type mismatch error
    And I click on Save&Continue button
    Then I should be on UPE registration failed error page
    And The Heading should be The details you entered did not match our records
    And The second heading should be How can I confirm my details
    And The Body content should be We could not match the details you entered with records held by HMRC.
    And The Body content should be If you think you made an error when entering them you can go back to select the entity type and try again using different details.
    And The Body content should be You can search Companies House for the company registration number and registered office address (opens in a new tab).
    And The Body content should be You can ask for a copy of your Corporation Tax Unique Taxpayer Reference (opens in a new tab).
    When I click go back to select the entity type link
    Then I should be on UPE entity type page
    When I select back link
    Then I should be on UPE registration failed error page
    When I click search Companies House for the company registration number and registered office address (opens in a new tab). link
    Then I should be navigated to new tab
    And  I should navigate to search register page
    Then I close new tab
    And I should navigate back to main tab
    Then I should be on UPE registration failed error page
    When I click ask for a copy of your Corporation Tax Unique Taxpayer Reference (opens in a new tab). link
    Then I should be navigated to new tab
    And  I should be on Corporation Tax UTR page
    Then I close new tab
    And I should navigate back to main tab
    Then I should be on UPE registration failed error page

  Scenario: 5 - User registration as UkLimitedCompany failed with generic error
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    And The caption must be Group details
    And The Heading should be Is the ultimate parent entity registered in the UK?
    When I select option Yes and continue to next
    Then I should be on UPE entity type page
    And The caption must be Group details
    And The Heading should be What entity type is the ultimate parent?
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    When registration is unsuccessful with generic error error
    And I click on Save&Continue button
    Then I should be on UPE registration failed error page

  Scenario: 6 - User registration as UkLimitedCompany failed with identifiers do not match error
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    And The Heading should be Stub GRS Journey Data
    When registration is unsuccessful with identifiers not match error
    And I click on Save&Continue button
    Then I should be on UPE registration not called error page
    And The Heading should be Sorry, there is a problem with the service
    And The Body content should be Try again later.
    And The Body content should be Your company details could not be confirmed.
    And The Body content should be Go back to select the entity type to try again.
    When I click Go back to select the entity type link
    Then I should be on UPE entity type page
    When I select back link
    Then I should be on UPE registration not called error page

  Scenario: 7 - User registration as UkLimitedCompany failed with BV failed error
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    And The Heading should be Stub GRS Journey Data
    When registration is unsuccessful with BV failed error
    And I click on Save&Continue button
    Then I should be on UPE registration not called error page
#

  Scenario: 8 - User registered as LimitedLiabilityPartnership successfully with BV enabled
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE entity type page
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
    When I select option Yes and continue to next
    Then I should be on UPE entity type page
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
    When I select option Yes and continue to next
    Then I should be on UPE entity type page
    When I select option Limited liability partnership and continue to GRS page
    Then I should navigate to LLP GRS page
    And The Heading should be Stub GRS Journey Data
    When registration is unsuccessful with party type mismatch error
    And I click on Save&Continue button
    Then I should be on UPE registration failed error page


  Scenario: 11 - User registration as UkLimitedCompany failed with generic error
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE entity type page
    When I select option Limited liability partnership and continue to GRS page
    Then I should navigate to LLP GRS page
    And The Heading should be Stub GRS Journey Data
    When registration is unsuccessful with generic error error
    And I click on Save&Continue button
    Then I should be on UPE registration failed error page


  Scenario: 12 - User registration as UkLimitedCompany failed with identifiers not match error
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE entity type page
    When I select option Limited liability partnership and continue to GRS page
    Then I should navigate to LLP GRS page
    And The Heading should be Stub GRS Journey Data
    When registration is unsuccessful with identifiers not match error
    And I click on Save&Continue button
    Then I should be on UPE registration not called error page


  Scenario: 13 - User registration as UkLimitedCompany failed with BV failed error
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE entity type page
    When I select option Limited liability partnership and continue to GRS page
    Then I should navigate to LLP GRS page
    And The Heading should be Stub GRS Journey Data
    When registration is unsuccessful with BV failed error
    And I click on Save&Continue button
    Then I should be on UPE registration not called error page

  Scenario: 14 - User navigates to UPE Page
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should navigate to UPE entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    When I select back link
    Then I should be on UPE entity type page
    When I select back link
    Then I should be on UPE business page

  @zap_accessibility @ignore
  Scenario: 15 - UPE User error pages - ZAP-Accessibility Test
    Given Organisation User logs in as upe for Pillar2
    And I am on UPE registration failed error Page
    And I am on UPE registration not called error Page