@tests
Feature: RFM Corporate position page
  As a Replacing Filing member
  I want to access corporate position question page, so that I can select the position

  @zap_accessibility
  Scenario: 1 - Verify RFM corporate position page and validations
    Given Organisation User logs in as upe for Pillar2
    And I access RFM corporate position page
    Then I should be on RFM Corp Position Page
    And The caption must be Replace filing member
    And The Heading should be What is your position in the corporate structure of the group?
    And The hint text should be To replace the existing filing member for this account you must have access to the information required to report Pillar 2 top-up taxes on the group’s behalf.
    When I click on Continue button
    Then I should see an error message Select if you are the ultimate parent entity or a new nominated filing member on the RFM journey error Page
    When I select corp position as UPE
    And I click on Continue button
    Then I should navigate to under construction page
    When I select back link
    Then I should be on RFM Corp Position Page
    When I select corp position as NFM
    And I click on Continue button
    Then I should be on New NFM guidance page
