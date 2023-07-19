@tests @zap_accessibility
Feature: UPE within UK EQs
  As a MNE user
  I want to answer the UPE activity within UK EQ

  Scenario: 1 - User navigates to next eligibility question page
    Given I am on UPE EQ Page
    And The caption should be Check if the group needs to register
    And The Heading should be Are you registering the ultimate parent of this group?
    When I choose Yes and continue
    Then I should navigate to business EQ page

  Scenario: 2 - User navigates to NFM eligibility question page
    Given I am on UPE EQ Page
    And The caption should be Check if the group needs to register
    And The Heading should be Are you registering the ultimate parent of this group?
    When I choose No and continue
    Then I should navigate to NFM EQ page
    And The caption should be Check if the group needs to register
    And The Heading should be Are you registering the nominated filing member for this group?

  Scenario: 3 - User navigates to NFM guidance page
    Given I am on UPE EQ Page
    When I choose No and continue
    Then I should be on NFM EQ page
    And The caption should be Check if the group needs to register
    And The Heading should be Are you registering the nominated filing member for this group?
    When I choose Yes and continue
    Then I should navigate to business EQ page
    When I select back link
    Then I should be on NFM EQ page
    When I choose No and continue
    Then I should navigate to NFM guidance page
    And The Heading should be Based on your answers, you cannot register this group for Pillar 2 top-up tax
    And The Body content should be Only the ultimate parent or nominated filing member for an eligible group can register for Pillar 2 top-up tax.
    And The Body content should be This group may still need to register.
    When I select back link
    Then I should be on NFM EQ page
    When I choose No and continue
    Then I should navigate to NFM guidance page
    When I click Go back to the start page for more information link
    Then I should navigate to gov uk guidance page

  Scenario: 4 - Display an error message, when user continue without selecting an option on UPE EQ page
    Given I clear the cache
    Given I am on UPE EQ Page
    And The caption should be Check if the group needs to register
    And The Heading should be Are you registering the ultimate parent of this group?
    When I continue without selecting an option
    Then I should see error message Select yes if you are registering the ultimate parent of this group on the UPE EQ Page

  Scenario: 5 - Display an error message, when user continue without selecting an option on NFM EQ page
    Given I clear the cache
    Given I am on UPE EQ Page
    When I choose No and continue
    Then I should be on NFM EQ page
    And The caption should be Check if the group needs to register
    And The Heading should be Are you registering the nominated filing member for this group?
    When I continue without selecting an option
    Then I should see error message Select yes if you are registering the nominated filing member for this group on the NFM EQ Page
