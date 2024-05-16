@tests @batch4
Feature: RFM ultimate parent entity and New nominated Filling Member GRS journey
  As a MNE user
  I want to determine that in RFM journey, UPE or New NFM journey is based in UK for LLP and Limited company
  So that I can navigate to the correct GRS journey and complete the navigation.

  Scenario: 1 - Verify RFM GRS journey when New NFM is based in UK - UK limited company
    Given Organisation User logs in as upe for Pillar2
    And I access RFM corporate position page
    When I select corp position as NFM
    And I click on Continue button
    Then I should be on New NFM guidance page
    When I click on Continue button
    Then I should be on RFM registered in UK page
    And I select option Yes and continue to next
    Then I should be on RFM UK based entity type page
    When I click on Continue button
    And I should see an error message Select what type of entity the new filing member is on the RFM journey error Page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to RFM UK limited Company GRSPage
    When I registered successfully with BV enabled
    And The json response Body should contain the status "registrationStatus" : "REGISTERED"
    And I click on Save&Continue button
    Then I should be on RFM Contact Guidance page
    And I select back link
    Then I should navigate to RFM UK limited Company GRSPage

  Scenario: 2 - User registration as Limited liability partnership failed with party type mismatch error and success scenario
    Given Organisation User logs in as upe for Pillar2
    And I access RFM corporate position page
    When I select corp position as NFM
    And I click on Continue button
    Then I should be on New NFM guidance page
    When I click on Continue button
    Then I should be on RFM registered in UK page
    And I select option Yes and continue to next
    Then I should be on RFM UK based entity type page
    When I select option Limited liability partnership and continue to GRS page
    Then I should navigate to RFM LLP GRS page
    When registration is unsuccessful with party type mismatch error
    And I click on Save&Continue button
    Then I should be on RFM GRS Registration Mismatch Error Page
    And The Heading should be The details you entered did not match our records
    When I click go back to select the entity type link
    Then I should be on RFM UK based entity type page
    When I select option Limited liability partnership and continue to GRS page
    Then I should navigate to RFM LLP GRS page
    When I registered successfully with BV disabled
    And The json response Body should contain the status "registrationStatus" : "REGISTERED"
    And I click on Save&Continue button
    Then I should be on RFM Contact Guidance page

  Scenario: 3 - User registration as UK limited company failed with identifiers mismatch error and entity type page validation
    Given Organisation User logs in as upe for Pillar2
    And I access RFM corporate position page
    When I select corp position as NFM
    And I click on Continue button
    Then I should be on New NFM guidance page
    When I click on Continue button
    Then I should be on RFM registered in UK page
    And I select option Yes and continue to next
    Then I should be on RFM UK based entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to RFM UK limited Company GRSPage
    When registration is unsuccessful with identifiers not match error
    And I click on Save&Continue button
    Then I should be on RFM GRS Registration Not Called Error Page
    And The Heading should be Sorry, there is a problem with the service
    When I click Go back to select the entity type link
    Then I should be on RFM UK based entity type page
    When I select option Entity type not listed and continue to Name page
    Then I should be on RFM New NFM Contact Name Page