@tests @batch3
Feature: RFM Corporate position page and further validation
  As a Replacing Filing member
  I want to select options from corporate position question page and continue my journey of RFM.

  @zap_accessibility
  Scenario: 1 - Verify RFM corporate position as an UPE and further validations
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
    And I access RFM corporate position page
    Then I should be on RFM Corp Position Page
    And The caption must be Replace filing member
    And The Heading should be What is your position in the corporate structure of the group?
    When I click on Continue button
    Then I should see an error message Select if you are the ultimate parent entity or a new nominated filing member on the RFM journey error Page
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
    When I select back link
    And I select option Yes and continue to next
    Then I should navigate to RFM Contact Input Page
    When I provide RFM contact number as 01632960001
    And I click on Continue button
    Then I should navigate to RFM Second Contact Question Page
    And I select option Yes and continue to next
    Then I should navigate to RFM second contact name page
    And I click on Continue button
    Then I should see an error message Enter name of the person of team we should contact on the RFM contact name change Page
    When I provide RFM contact name as RFM second test contact
    And I click on Continue button
    Then I should be on RFM second contact email page
    And I click on Continue button
    Then I should see an error message You need to enter the email address for RFM second test contact on the RFM contact email Page
    When I provide RFM contact email as rfmsecondcontact@email.com
    And I click on Continue button
    Then I should be on RFM second contact telephone question page
    And I click on Continue button
    Then I should see an error message Select yes if we can contact RFM second test contact by telephone on the RFM journey error Page
    When I select option Yes and continue to next
    Then I should be on RFM second contact telephone page
    When I provide RFM second contact number as 09872960001
    And I click on Continue button
    Then I should be on RFM Contact Address Page

  Scenario:2 - Verify RFM corporate position as a new NFM and further validations - No ID flow
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
    And I access RFM corporate position page
    Then I should be on RFM Corp Position Page
    When I select corp position as NFM
    And I click on Continue button
    Then I should be on New NFM guidance page
    And The caption must be Group details
    And The Heading should be We need to match the details of the new nominated filing member to HMRC records
    And The Body content should be If the new filing member is registered in the UK, we will ask you for identifying information so we can best match it with our records.
    And The Body content should be If the new filing member is registered outside of the UK or if they are not a listed entity type, we will ask you for identifying information so we can create a new HMRC record.
    When I click on Continue button
    Then I should be on RFM registered in UK page
    When I select back link
    Then I should be on New NFM guidance page
    And I click on Continue button
    Then I should be on RFM registered in UK page
    And The caption is Group details
    And The Heading should be Is the new nominated filing member registered in the UK?
    And I click on Continue button
    Then I should see an error message Select yes if the new nominated filing member is registered in the UK on the RFM journey error Page
    When I select option No and continue to next
    And I click on Continue button
    Then I should navigate to RFM New NFM Contact Name Page

  @zap_accessibility
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
