@tests
Feature: RFM Corporate position page and further validation
  As a Replacing Filing member
  I want to select options from corporate position question page and continue my journey of RFM.

  @zap_accessibility
  Scenario: 1 - Verify RFM corporate position as an UPE and further validations
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
    Then I should be on under construction page

  Scenario:2 - Verify RFM corporate position as a new NFM and further validations - No ID flow
    Given Organisation User logs in as upe for Pillar2
    And I access RFM corporate position page
    Then I should be on RFM Corp Position Page
    When I select corp position as NFM
    And I click on Continue button
    Then I should be on New NFM guidance page
    And The caption must be Group details
    And The Heading should be We need to match the details of the new nominated filing member to HMRC records
    And The Body content should be We will ask you for several pieces of identifying information about the new nominated filing member so that we can best match them to our records.
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

