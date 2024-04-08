@e2e1
Feature: User registration and subscription e2e journey
  As a MNE user
  I want to create a new registration and subscription
  So that I can access my dashboard

  Scenario: 1 - Create a new registration & subscription with UPE GRS Flow and NFM GRS flow
    Given Organisation User logs in as upe for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    And I click on Save&Continue button
    Then I should navigate to Task list page
    When I click Add filing member’s details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to NFM UKCompany GRS page
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit filing member’s details status should be Completed
    When I click Add further group details link
    Then I should navigate to MNE or domestic page
    When I select option In the UK and other countries in further details group status page
    And I click on Continue button
    Then I should navigate to Group accounting period page
    When I enter account period as below
    

    When Accounting Period Start Day is entered as 15
    And Accounting Period Start Month is entered as 1
    And Accounting Period Start Year is entered as 2024
    When Accounting Period End Day is entered as 15
    And Accounting Period End Month is entered as 1
    And Accounting Period End Year is entered as 2025
    And I click on Continue button
    Then I should navigate to FD check your answers page
    And I click on Continue button
    Then I should navigate to Task list page
    When I click Add contact details link
    Then I should navigate to Contact details guidance page
    When I click on Continue button
    When I enter Contact Name as Contact Name Test
    And I click on Continue button
    Then I should navigate to Contact details input email page
    When I enter Contact Email as testContact@email.com
    And I click on Continue button
    Then I should navigate to Contact details telephone page
    When I select option No and continue to next
    Then I should navigate to Second Contact details page
    When I select back link
    Then I should navigate to Contact details telephone page
    When I select option Yes and continue to next
    Then I should navigate to Contact details input telephone page
    When I enter Contact Telephone as 1234554
    And I click on Continue button
    Then I should navigate to Second Contact details page
    When I select option No and continue to next
    Then I should navigate to Contact address input page
    When I select back link
    Then I should navigate to Second Contact details page
    When I select option Yes and continue to next
    Then I should navigate to Second Contact name page
    When I enter Second Contact Name as Second Contact Name Test
    And I click on Continue button
    Then I should navigate to Second Contact email page
    And The caption must be Contact details
    And The Heading should be What is the email address for Second Contact Name Test?
    And The Body content should be We will only use this to contact you about Pillar 2 top-up taxes.
    And the page title should be What is the email address? - Report Pillar 2 top-up taxes - GOV.UK
    When I enter Second Contact Email as secondContact@email.com
    And I click on Continue button
    Then I should navigate to Second Contact number page
    And the page title should be Can we contact by telephone? - Report Pillar 2 top-up taxes - GOV.UK
    When I select option Yes and continue to next
    Then I should navigate to Second Contact Input page
    When I enter Second Contact Input as 1234554
    And I click on Continue button
    Then I should navigate to Contact address input page
    When I enter Address Line 1 as Address Line 1
    And I enter City as City
    And I enter Postal Code as EH5 5WY
    And I enter Country as United Kingdom
    And I click on Country selected
    When I click on Continue button
    Then I should navigate to Contact details Check answers page
    And I click on Continue button
    When I click Check your answers link
    Then I should navigate to Review answers page
    And I click on Save&Continue button
    Then I should navigate to Registration confirmation page
    And I click report and manage your Pillar 2 top-up taxes link
    And I should be on Dashboard page
