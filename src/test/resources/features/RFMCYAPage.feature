@tests
Feature: RFM check your answers page
  As a replacing filing member
  I want to enter my subscription details and access CYA page to check my answers and carry on in the journey
  @zap_accessibility
  Scenario: 1 - Verify RFM check your answers page and successful navigation to corporate position page
    Given Organisation User logs in with rfm URL to Pillar2
    Then I should be on RFM enter pillar2 id page
    When I provide RFM pillar2 id as XMPLR0123456789
    And I click on Continue button
    Then I should be on RFM Registration Date Page
    When Registration Day is entered as 31
    When Registration Month is entered as 1
    And Registration Year is entered as 2024
    And I click on Continue button
    Then I should be on RFM CYA Page
    When I select back link
    Then I should be on RFM Registration Date Page
    And I click on Continue button
    Then I should be on RFM CYA Page
    And The caption must be Replace filing member
    And The Heading should be Check your answers
    And I should see row 1 key Pillar 2 top-up taxes ID
    And I should see row 2 key Registration date
    And I should see row 1 value XMPLR0123456789
    And I should see row 2 value 31 January 2024
    When I click change link for RFM Pillar 2 top-up taxes ID
    When I provide RFM pillar2 id as XMPLR0123456111
    And I click on Continue button
    And I should see row 1 value XMPLR0123456111
    And I click on Continue button
    Then I should navigate to RFM Corp Position Page

  Scenario: 2 - Verify error handling on submission of Pillar id and registration date for RFM journey
    Given Organisation User logs in with rfm URL to Pillar2
    When I provide RFM pillar2 id as XEPLR0123456400
    And I click on Continue button
    Then I should be on RFM Registration Date Page
    When Registration Day is entered as 31
    When Registration Month is entered as 1
    And Registration Year is entered as 2024
    And I click on Continue button
    Then I should be on RFM CYA Page
    And I click on Continue button
    Then I should navigate to RFM No record Match Error Page
    And I click go back to try again using different details. link
    Then I should be on RFM enter pillar2 id page
    And I provide RFM pillar2 id as XEPLR0123456222
    And I click on Continue button
    Then I should be on RFM Registration Date Page
    When Registration Day is entered as 27
    When Registration Month is entered as 1
    And Registration Year is entered as 2024
    And I click on Continue button
    And I click on Continue button
    Then I should navigate to RFM No record Match Error Page
    And I select back link
    Then I should be on RFM CYA Page
    And I click Sign out link

  Scenario: 3 - Verify RFM corporate position as an UPE and further validations
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
    Then I should navigate to RFM Final Review Page
    When  I click change link for RFM Change Second Contact Preference
    And I select option Yes and continue to next
    When I provide RFM contact name as RFM second test contact
    And I click on Continue button
    When I provide RFM contact email as rfmsecondcontact@email.com
    And I click on Continue button
    When I select option Yes and continue to next
    When I provide RFM second contact number as 09872960001
    And I click on Continue button
    Then I should navigate to RFM Final Review Page
    And I should see the row 9 value Yes
    And I should see the row 10 value RFM second test contact
    And I should see the row 11 value rfmsecondcontact@email.com
    And I should see the row 12 value Yes
    And I should see the row 13 value 09872960001
    When I click change link for RFM New NFM Name
    And I provide RFM contact name as RFM test contact change
    And I click on Continue button
    Then I should navigate to RFM Final Review Page
    And I should see the row 5 value RFM test contact change
    When I click change link for RFM New RFM CYA Change Contact preference
    And I select option No and continue to next
    Then I should navigate to RFM Final Review Page
    When I click change link for RFM Change Address
    And I enter Address Line 1 as Address Line 1 CYA change
    And I click on Continue button
    Then I should navigate to RFM Final Review Page
    And I should see the row 13 value Address Line 1 CYA change
    And I should see Print this page link on Review answers page