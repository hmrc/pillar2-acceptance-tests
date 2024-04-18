@tests
Feature: RFM check your answers page
  As a replacing filing member
  I want to enter my subscription details and access CYA page to check my answers and change

  @zap_accessibility
  Scenario: 1 - Verify RFM corporate position as an UPE and further validations
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
    And I click on Continue button
    And I click on Save&Continue button
    Then I should be on RFM Contact Guidance page
    And I click on Continue button
    Then I should navigate to RFM Contact Detail Page
    When I provide RFM contact name as RFM test contact
    And I click on Continue button
    Then I should navigate to RFM Contact Email Page
    When I provide RFM contact email as rfm@email.com
    And I click on Continue button
    Then I should navigate to RFM Contact Number Page
    And I select option Yes and continue to next
    Then I should navigate to RFM Contact Input Page
    When I provide RFM contact number as 01632960001
    And I click on Continue button
    Then I should navigate to RFM Second Contact Question Page
    And I select option No and continue to next
    Then I should be on RFM Contact Address Page
    And I enter Address Line 1 as Address Line 1 CYA
    And I enter City as City CYA
    And I enter Postal Code as EH5 5WY
    And I enter Country as Australia
    And I click on Country selected
    And I click on Continue button
    Then I should navigate to RFM Contact Details CYA Page
    When  I click change link for RFM Change Second Contact Preference
    And I select option Yes and continue to next
    Then I should navigate to RFM second contact name page
    When I provide RFM contact name as RFM second test contact
    And I click on Continue button
    Then I should be on RFM second contact email page
    When I provide RFM contact email as rfmsecondcontact@email.com
    And I click on Continue button
    Then I should be on RFM second contact telephone question page
    When I select option Yes and continue to next
    Then I should be on RFM second contact telephone page
    When I provide RFM second contact number as 09872960001
    And I click on Continue button
    Then I should navigate to RFM Contact Details CYA Page
    #Then I should navigate to Change Second contact page
    And I should see the row 5 value Yes
    And I should see the row 6 value RFM second test contact
    And I should see the row 7 value rfmsecondcontact@email.com
    And I should see the row 8 value Yes
    And I should see the row 9 value 09872960001
    When I click change link for RFM New NFM Name
    And I provide RFM contact name as RFM test contact change
    And I click on Continue button
    Then I should navigate to RFM Contact Details CYA Page
    And I should see the row 1 value RFM test contact change
    When I click change link for RFM New RFM CYA Change Contact preference
    And I select option No and continue to next
    Then I should navigate to RFM Contact Details CYA Page
    When I click change link for RFM Change Address
    And I enter Address Line 1 as Address Line 1 CYA change
    And I click on Continue button
    Then I should navigate to RFM Contact Details CYA Page
    And I should see the row 9 value Address Line 1 CYA change




























