@tests
Feature: Pillar 2 validation page
  As a MNE user
  I want to see Pillar 2 validation page

  @zap_accessibility
  Scenario: 1 - Pillar2 Validation page and error validation.
    Given Organisation User logs in with BTA for Pillar2
    Then I should be on bta pillar2 ID check page
    And The Heading should be Do you have a Pillar 2 top-up taxes ID
    And The hint text should be This is 15 characters, for example, XMPLR0123456789.
    When I click on Continue button
    Then I should see error message Select yes if you have a Pillar 2 top-up taxes ID on the BTA Pillar2 validation Page
    When I select option Yes and continue to next
    Then I should navigate to under construction page
    When I select back link
    When I select option No and continue to next
    Then I should navigate to bta register guidance page
    And The Heading should be You need a Pillar 2 top-up taxes ID to access this service
    And The Body content should be Register to report Pillar 2 top-up taxes to get a Pillar 2 top-up taxes ID.
    And I should see Find out how to register to report Pillar 2 top-up taxes (opens in new tab) link
    And I should see return to BTA button
