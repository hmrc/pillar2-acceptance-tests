@tests
Feature: RFM Final Review check your answers page
  As a replacing filing member
  I want to enter my subscription details and access Final Review CYA page to check my answers and change
  @zap_accessibility
  Scenario: 1 - Validating RFM Check your answers page
    Given Organisation User logs in with rfm URL to Pillar2
    And I access RFM corporate position page
    When I select corp position as UPE
    And I click on Continue button
    Then I should be on RFM Contact Guidance page
    And I click on Continue button
    Then I should navigate to RFM Contact Detail Page
    When I provide RFM contact name as RFM test contact
    And I click on Continue button
    Then I should navigate to RFM Contact Email Page
    When I provide RFM contact email as rfm@email.com
    And I click on Continue button
    Then I should navigate to RFM Contact Number Page
    When I select option No and continue to next
    Then I should navigate to RFM Second Contact Question Page
    And I click on Continue button
    Then I should navigate to RFM Second Contact Question Page
    And I select option No and continue to next
    Then I should be on RFM Second Contact Address Page
    When I enter Address Line 1 as RFM Address Line 1
    And I enter City as RFM City
    And I enter Postal Code as EH5 5WY
    And I enter Country as United Kingdom
    And I click on Country selected
    When I click on Continue button
    Then I should navigate to RFM Final Review Page
    And The Heading should be Review and submit
    And The second heading should be Filing member details
    And I should see row 1 key Position in the group’s corporate structure
    And I should see row 1 value Ultimate parent entity (UPE)
    When I click change link for RFM Corporate Position
    When I select corp position as NFM
    And I click on Continue button
    Then I should be on New NFM guidance page
    And I click on Continue button
    Then I should be on RFM registered in UK page
    When I select option No and continue to next
    And I click on Continue button
    Then I should navigate to RFM New NFM Contact Name Page
    When I provide RFM New NFM Name as Test CYA
    And I click on Continue button
    Then I should navigate to RFM New NFM Contact Address Page
    And I enter Address Line 1 as Address Line 1 CYA
    And I enter City as City CYA
    And I enter Postal Code as EH5 5WY
    And I enter Country as Australia
    And I click on Country selected
    And I click on Continue button
    Then I should be on RFM No ID CYA Page
    And I click on Continue button
    Then I should navigate to RFM Final Review Page
    When I select back link
    Then I should be on RFM No ID CYA Page
    And I click on Continue button
    Then I should navigate to RFM Final Review Page
    And I should see row 1 key Position in the group’s corporate structure
    And I should see row 2 key Name
    And I should see row 3 key Address
    And I should see row 1 value New nominated filing member
    And I should see row 2 value Test CYA
    And I should see row 3 value Address Line 1 CYA
    And I should see row 3 value City CYA
    And I should see row 3 value EH55WY
    And I should see row 3 value Australia
    When I click change link for RFM Input Name
    When I provide RFM New NFM Name as Test Change
    And I click on Continue button
    Then I should navigate to RFM Final Review Page
    When I click change link for RFM Input Address
    And I enter Address Line 1 as Address Line 1 Change
    And I enter City as City Change
    And I enter Postal Code as EH75WK
    And I click on Continue button
    Then I should navigate to RFM Final Review Page
    And I should see row 3 value Address Line 1 Change
    And I should see row 3 value City Change
    And I should see row 3 value EH75WK
    When I click change link for RFM Corporate Position
    When I select corp position as UPE
    And I click on Continue button
    And I should see row 1 value Ultimate parent entity (UPE)
    When I click change link for RFM Corporate Position
    When I select corp position as NFM
    And I click on Continue button
    Then I should be on New NFM guidance page
    And I click on Continue button
    Then I should be on RFM registered in UK page
    When I select option Yes and continue to next
    Then I should be on RFM UK based entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to RFM UK limited Company GRSPage
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    Then I should be on RFM Contact Guidance page
    And I click on Continue button
    Then I should navigate to RFM Contact Detail Page
    And I click on Continue button
    Then I should navigate to RFM Contact Email Page
    And I click on Continue button
    Then I should navigate to RFM Contact Number Page
    And I click on Continue button
    Then I should navigate to RFM Second Contact Question Page
    And I click on Continue button
    Then I should be on RFM Second Contact Address Page
    When I click on Continue button
    Then I should navigate to RFM Final Review Page
    And I should see row 1 key Position in the group’s corporate structure
    And I should see row 2 key Company
    And I should see row 3 key Company Registration Number
    And I should see row 4 key Unique Taxpayer Reference
    And I should see row 1 value New nominated filing member
    And I should see row 2 value Test Example Company Name
    And I should see row 3 value 76543210
    And I should see row 4 value 1234567890
    When I click change link for RFM Company
    Then I should be on RFM registered in UK page
    And I click on Continue button
    Then I should navigate to RFM UK based entity type page
    When I select back link
    Then I should be on RFM registered in UK page
















