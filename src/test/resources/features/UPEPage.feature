@tests1 @zap_accessibility
Feature: Ultimate parent entity based in UK EQs
  As a MNE user
  I want to answer the Ultimate parent entity based in UK EQ

  Scenario: 1 - Display an error message, when user continue without selecting an option
    Given Organisation User logs in to subscribe for Pillar2
    Then I should be on UPE page
    And The caption should be Business details
    And The Heading should be Is this ultimate parent entity registered in the UK?
    When I continue without selecting an option
    Then I should see error message Select yes if the ultimate parent entity is registered in the UK on the UPE EQ Page

  Scenario: 2 - User navigates to input crn page
    Given I am on UPE EQ Page
    And The caption should be Business details
    And The Heading should be Is this ultimate parent entity registered in the UK?
    When I choose Yes and continue
    Then I should navigate to input-crn page

  Scenario: 3 - User navigates to enter UPE name page
    Given I am on UPE EQ Page
    And The caption should be Business details
    And The Heading should be Is this ultimate parent entity registered in the UK?
    When I choose No and continue
    Then I should navigate to input-upe-name page
    And The Heading should be What is the name of the ultimate parent entity?
    When I select back link
    Then I should navigate to UPE EQ page
    When I choose No and continue
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test UPE and continue
    Then I should navigate to input-upe-address page

  Scenario: 4 - User navigates to previous eligibility question
    Given I am on UPE EQ Page
    And The caption should be Business details
    And The Heading should be Is this ultimate parent entity registered in the UK?
    When I choose Yes and continue
    Then I should navigate to input-crn page
    When I select back link
    Then I should navigate to UPE EQ