 @zap_accessibility
Feature: Bookmark Feature
  I should not be able to navigate to next page without answering the previous question

  Scenario: 1 - User fill the information for UPE and NFM no ID flow and try moving ahead in the journey without answering mandatory questions
  Given Organisation User logs in as upe with credId Bookmark1 for Pillar2
  Then I should be on UPE business page
  When I select option No and continue to next
  Then I should navigate to input-upe-name page
  When I enter UPE name as Test Bookmark
  Then I should navigate to input-upe-address page
  When I enter Address Line 1 as Address Line 1
  And I enter City as City
  And I enter Postal Code as EH5 5WY
  And I select country as United Kingdom
  And I click on Continue button
  Then I should navigate to UPE Contact person/team Name page
  When I enter UPE Person/Team name as Bookmark contact
  And I click on Continue button
  Then I should navigate to UPE Contact Email page
  When I enter UPE Email address as test@email.com
  And I click on Continue button
  Then I should navigate to UPE Telephone page
  When I select option Yes and continue to next
  Then I should navigate to input telephone page
  And I enter Telephone Number as 1234569
  And I click on Continue button
  Then I should be on Check your answers page
  When I click on Continue button
  And I click Add filing member's details link
  Then I should navigate to NFM registration page
  When I select Yes option and continue to next
  Then I should navigate to NFM details page
  When I select option No and continue to next
  Then I should navigate to NFM Name page
  And I click Sign out link
  Then I am on feedback survey page
  When Organisation User logs in to NFM address page with credId Bookmark1
  Then The Heading should be Task not yet started
  Then I click return to your Pillar 2 top-up taxes registration link
  Then I should see task list sections
  And The Task Add filing member's details status should be In progress

  Scenario: 2 - User completes UPE GRS journey and try navigating to NFM NO ID flow
    Given Organisation User logs in as upe with credId Bookmark2 for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to NFM UKCompany GRS page
    And I click on Save&Continue button
    And I click Sign out link
    Then I am on feedback survey page
    When Organisation User logs in to NFM email page with credId Bookmark2
    Then The Heading should be Task not yet started
    Then I click return to your Pillar 2 top-up taxes registration link
    Then I should see task list sections
    And The Task Edit filing member's details status should be Completed

  Scenario: 3 - User completes GRS journey and validate populated value after sign out
    Given Organisation User logs in as upe with credId Bookmark3 for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit ultimate parent's details status should be Completed
    And I click Sign out link
    Then I am on feedback survey page
    When Organisation User logs in to upe registered in UK page with CredID Bookmark3 for Pillar2
    When I click on Continue button
    Then I should be on UPE Org type page
    And I should see the option UK limited company remain selected

  Scenario: 4 - User completes UPE GRS journey without answering mandatory questions
    Given Organisation User logs in as upe with credId Bookmark4 for Pillar2
    Then I should be on UPE business page
    And I click Continue button
    And I click Sign out link
    Then I am on feedback survey page
    Given Organisation User logs in to upe org page with CredID Bookmark4 for Pillar2
    Then The Heading should be Task not yet started
    And The Body content should be The task you are trying to access cannot be started until the previous task has been completed.
    And The Body content should be You must return to your Pillar 2 top-up taxes registration and complete the required tasks.
    Then I click return to your Pillar 2 top-up taxes registration link
    Then I should see task list sections
    And The Task Add ultimate parent's details status should be Not started

  Scenario: 5 - User completes UPE no id journey without answering mandatory questions
    Given Organisation User logs in as upe with credId Bookmark4 for Pillar2
    Then I should be on UPE business page
    And I click Continue button
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    When I enter UPE name as Test Bookmark
    Then I should navigate to input-upe-address page
    And I click Sign out link
    Then I am on feedback survey page
    Given Organisation User navigates to UPE check your answer page with credId Bookmark4
    Then The Heading should be Task not yet started
    Then I click return to your Pillar 2 top-up taxes registration link
    Then I should see task list sections
    And The Task Add ultimate parent's details status should be In progress

  Scenario: 6 - User completes UPE and NFM GRS journey and try navigating ahead in journey of Group Details task
    Given Organisation User logs in as upe with credId Bookmark2 for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    When I click Add filing member's details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM Org type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to NFM UKCompany GRS page
    And I click on Save&Continue button
    And I click Add further group details link
    And I click Sign out link
    Then I am on feedback survey page
    When Organisation User logs in to FD AccountingPeriod page with credId Bookmark2
    Then The Heading should be Task not yet started
    Then I click return to your Pillar 2 top-up taxes registration link
    Then I should see task list sections
    And The Task Add further group details status should be Not started

  Scenario: 6 - User completes UPE and NFM GRS journey and try navigating ahead in journey of Contact Details task
  Given Organisation User logs in as upe with credId SecondContact for Pillar2
  Then I should be on UPE business page
  When I select option Yes and continue to next
  Then I should be on UPE Org type page
  When I select option UK limited company and continue to GRS page
  Then I should navigate to UKCompany GRS page
  And The Heading should be Stub GRS Journey Data
  When I registered successfully with BV enabled
  And I click on Save&Continue button
  Then I should navigate to Task list page
  When I click Add filing member's details link
  Then I should navigate to NFM registration page
  When I select Yes option and continue to next
  Then I should navigate to NFM details page
  When I select option Yes and continue to next
  Then I should be on NFM Org type page
  When I select option UK limited company and continue to GRS page
  Then I should navigate to NFM UKCompany GRS page
  When I registered successfully with BV enabled
  And I click on Save&Continue button
  Then I should navigate to Task list page
  When I click Add further group details link
  Then I should navigate to MNE or domestic page
  When I select option In the UK and other countries in further details group status page
  And I click on Continue button
  Then I should navigate to Group accounting period page
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
  When I click Add Contact details link
  Then I should navigate to Contact details guidance page
  When I click on Continue button
  Then I should navigate to Contact details input name page
  And I click Sign out link
  Then I am on feedback survey page
  When Organisation User logs in to ContactDetails address page with credId Bookmark2
  Then The Heading should be Task not yet started
  Then I click return to your Pillar 2 top-up taxes registration link
  Then I should see task list sections










