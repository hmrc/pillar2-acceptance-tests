@tests
Feature: RFM check your answers page
  As a replacing filing member
  I want to enter my subscription details and access CYA page to check my answers and carry on in the journey

  @batch2
  Scenario: 1 - Verify error handling on submission of Pillar id and registration date for RFM journey
    Given Organisation User logs in with rfm URL to Pillar2
    When I provide RFM pillar2 id as XEPLR0123456400
    And I click on Continue button
    Then I should be on RFM Registration Date Page
    When Registration Day is entered as 31
    When Registration Month is entered as 1
    And Registration Year is entered as 2024
    And I click on Continue button
    Then I should be on RFM CYA Page
    And I should see row 1 key Pillar 2 top-up taxes ID
    And I should see row 2 key Registration date
    And I should see row 1 value XEPLR0123456400
    And I should see row 2 value 31 January 2024
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
    When I click change link for RFM Pillar 2 top-up taxes ID
    When I provide RFM pillar2 id as XMPLR0123456111
    And I click on Continue button
    And I should see row 1 value XMPLR0123456111
    And I click Sign out link

  @batch2
  Scenario: 3 - Verify error handling on submission of Pillar id and registration date for RFM journey
    Given Organisation User logs in with rfm URL to Pillar2
    When I provide RFM pillar2 id as XMPLR0123456789
    And I click on Continue button
    Then I should be on RFM Registration Date Page
    When Registration Day is entered as 31
    When Registration Month is entered as 1
    And Registration Year is entered as 2024
    And I click on Continue button
    Then I should be on RFM CYA Page
    When I click on Save&Continue button
    Then I should be on RFM Saving Progress Page
    When I click on Continue button
    And I access RFM corporate position page
    When I select corp position as NFM
    And I click on Continue button
    When I click on Continue button
    And I select option No and continue to next
    When I provide RFM New NFM Name as Test CYA
    And I click on Continue button
    And I enter Address Line 1 as Address Line 1 CYA
    And I enter City as City CYA
    And I enter Postal Code as EH5 5WY
    And I enter Country as Australia
    And I click on Country selected
    And I click on Continue button
    And I click on Continue button
    And I click on Continue button
    When I provide RFM contact name as RFM test contact
    And I click on Continue button
    Then I should navigate to RFM Contact Email Page
    When I provide RFM contact email as rfm@email.com
    And I click on Continue button
    And I select option No and continue to next
    And I select option No and continue to next
    And I enter Address Line 1 as Address Line 1 CYA
    And I enter City as City CYA
    And I enter Postal Code as EH5 5WY
    And I enter Country as Australia
    And I click on Country selected
    And I click on Continue button
    Then I should navigate to RFM Final Review Page
    And I click on Continue button
    Then I should navigate to RFM Confirmation Page
    When I click the browser back button
    Then I should navigate to RFM No Return Back Error Page
    And I click report and manage your Pillar 2 top-up taxes link
    Then I should be on Dashboard page

  @batch2
  Scenario: 4 - Verify that system throws an error on generic failure from ETMP when calling Amend API in replacing rfm journey
    Given Organisation User logs in as upe for Pillar2
    And I access RFM start page
    And I click on Continue button
    When I provide RFM pillar2 id as XMPLR0012345674
    And I click on Continue button
    When Registration Day is entered as 31
    When Registration Month is entered as 1
    And Registration Year is entered as 2024
    And I click on Continue button
    Then I should be on RFM CYA Page
    When I click on Save&Continue button
    Then I should be on RFM Saving Progress Page
    When I click on Continue button
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
    And I select option No and continue to next
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
    And I click on Continue button
    Then I should navigate to Amend API error Page for RFM
    And I click to replace the filing member for a Pillar 2 top-up taxes account to try again link
    Then I should navigate to RFM Final Review Page

  @batch2
  Scenario: 5 - Verify Journey Recovery and Incomplete data errors.
    Given Organisation User logs in as upe for Pillar2
    And I access RFM start page
    And I click on Continue button
    When I provide RFM pillar2 id as XMPLR0123456789
    And I click on Continue button
    When Registration Day is entered as 31
    When Registration Month is entered as 1
    And Registration Year is entered as 2024
    And I click on Continue button
    Then I should be on RFM CYA Page
    When I click on Save&Continue button
    Then I should be on RFM Saving Progress Page
    When I click on Continue button
    And I access RFM corporate position page
    When I select corp position as NFM
    And I click on Continue button
    When I click on Continue button
    And I select option No and continue to next
    When I provide RFM New NFM Name as Test CYA
    And I click on Continue button
    And I enter Address Line 1 as Address Line 1 CYA
    And I enter City as City CYA
    And I enter Postal Code as EH5 5WY
    And I enter Country as Australia
    And I click on Country selected
    And I click on Continue button
    And I click on Continue button
    And I click on Continue button
    And I access RFM contact email page
    Then I should be on RFM journey recovery page
    When I click replace the filing member for a Pillar 2 top-up taxes account to try again link
    Then I should be on RFM start page
    When I click the browser back button
    And I click the browser back button
    And I provide RFM contact name as RFM test contact
    And I click on Continue button
    Then I should navigate to RFM Contact Email Page
    When I provide RFM contact email as rfm@email.com
    And I click on Continue button
    And I select option No and continue to next
    And I select option No and continue to next
    And I enter Address Line 1 as Address Line 1 CYA
    And I enter City as City CYA
    And I enter Postal Code as EH5 5WY
    And I enter Country as Australia
    And I click on Country selected
    And I click on Continue button
    Then I should navigate to RFM Final Review Page
    When  I click change link for RFM Change Second Contact Preference
    And I select option Yes and continue to next
    When I select back link
    When I select back link
    And I click on Continue button
    Then I should navigate to RFM incomplete task error page
    When I click replace the filing member for a Pillar 2 top-up taxes account to try again link
    Then I should be on RFM Final Review Page

  @zap_accessibility @batch3
  Scenario: 3 - Verify Security questions are not pre populated for RFM journey
    Given Organisation User logs in to RFM with credId RFMSaveProgress for Pillar2
    Then I should be on RFM enter pillar2 id page
    When I provide RFM pillar2 id as XMPLR0123456789
    And I click on Continue button
    Then I should be on RFM Registration Date Page
    When Registration Day is entered as 31
    And Registration Month is entered as 1
    And Registration Year is entered as 2024
    And I click on Continue button
    Then I should be on RFM CYA Page
    When I click on Save&Continue button
    Then I should be on RFM Saving Progress Page
    When I select back link
    Then I should be on RFM CYA Page
    When I click on Continue button
    Then I should be on RFM Saving Progress Page
    When I click on Continue button
    Then I access RFM corporate position page
    When I select corp position as UPE
    And I click on Continue button
    Then I should be on RFM Contact Guidance page
    When I click on Continue button
    Then I should navigate to RFM Contact Detail Page
    When I provide RFM contact name as RFM test contact
    And I click on Continue button
    Then I should navigate to RFM Contact Email Page
    When I provide RFM contact email as rfm@email.com
    And I click Sign out link
    And Organisation User logs in to RFM with credId RFMSaveProgress for Pillar2
    Then I access RFM start page
    And I click on Continue button
    Then I should be on RFM enter pillar2 id page
    And The caption must be Replace filing member
    And The Heading should be Enter the group’s Pillar 2 top-up taxes ID
    And I should see RFM Pillar2 Id field as blank
    Then I provide RFM pillar2 id as XMPLR0123456789
    And I click on Continue button
    Then I should be on RFM Registration Date Page
    And I should see RFM Registration Day field as blank
    And I should see RFM Registration Month field as blank
    And I should see RFM Registration Year field as blank
    When Registration Day is entered as 31
    And Registration Month is entered as 1
    And Registration Year is entered as 2024
    And I click on Continue button
    Then I should be on RFM CYA Page
    When I click on Save&Continue button
    Then I should be on RFM Saving Progress Page
    When I click on Continue button
    Then I access RFM corporate position page
    And I should see the corporate position UPE remain selected

