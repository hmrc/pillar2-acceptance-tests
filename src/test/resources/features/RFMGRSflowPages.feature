@tests @batch3
Feature: RFM ultimate parent entity and New nominated Filling Member GRS journey
  As a MNE user
  I want to determine that in RFM journey, UPE or New NFM journey is based in UK for LLP and Limited company
  So that I can navigate to the correct GRS journey and complete the navigation.

  Scenario: 1 - Verify RFM GRS journey when New NFM is based in UK - UK limited company
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
    Then I should be on RFM Corp Position Page
    And The Heading should be What is your position in the corporate structure of the group?
    When I click on Continue button
    Then I should see an error message Select if you are the ultimate parent entity or a new nominated filing member on the RFM journey error Page
    When I select corp position as NFM
    And I click on Continue button
    Then I should be on New NFM guidance page
    When I click on Continue button
    Then I should be on RFM registered in UK page
    And The caption is Group details
    And The Heading should be Is the new nominated filing member registered in the UK?
    And I click on Continue button
    Then I should see an error message Select yes if the new nominated filing member is registered in the UK on the RFM journey error Page
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

  Scenario: 2 - Verify that New NFM can replace existing FM through GRS registration flow on the Pillar 2 account and validations
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
    And I click on Continue button
    And I should be on RFM Corp Position Page
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
    And I click on Continue button
    Then I should navigate to RFM Confirmation Page

  @batch3
  Scenario: 3 - Verify that UPE can replace existing FM on the Pillar 2 account
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
    And I click on Continue button
    Then I should be on RFM Corp Position Page
    When I select corp position as UPE
    And I click on Continue button
    When I click on Continue button
    When I provide RFM contact name as RFM test contact
    And I click on Continue button
    When I provide RFM contact email as rfm@email.com
    And I click on Continue button
    And I select option Yes and continue to next
    When I provide RFM contact number as 01632960001
    And I click on Continue button
    And I select option Yes and continue to next
    And I click on Continue button
    Then I should see an error message Enter name of the person of team we should contact on the RFM second contact name Page
    When I provide RFM contact name as RFM second test contact
    And I click on Continue button
    When I click on Continue button
    Then I should see an error message You need to enter the email address for RFM second test contact on the RFM contact email Page
    When I provide RFM contact email as rfmsecondcontact@email.com
    And I click on Continue button
    When I click on Continue button
    Then I should see an error message Select yes if we can contact RFM second test contact by telephone on the RFM input telephone Page
    When I select option Yes and continue to next
    When I provide RFM second contact number as 09872960001
    And I click on Continue button
    Then I should be on RFM Contact Address Page
    And I enter Address Line 1 as Address Line 1 CYA
    And I enter City as City CYA
    And I enter Postal Code as EH5 5WY
    And I enter Country as Australia
    And I click on Country selected
    And I click on Continue button
    Then I should navigate to RFM Final Review Page
    And I click on Continue button
    Then I should navigate to RFM Confirmation Page
    And I should see report and manage your group's Pillar 2 top-up taxes link
    And I can see Print this page link
    When I click report and manage your group's Pillar 2 top-up taxes link
    Then I should be on Dashboard page

  Scenario: 4 - User registration as Limited liability partnership failed with party type mismatch error and success scenario
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
    And I click on Continue button
    Then I should be on RFM Corp Position Page
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

  Scenario: 5 - User registration as UK limited company failed with identifiers mismatch error and entity type page validation
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
    And I click on Continue button
    Then I should be on RFM Corp Position Page
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

