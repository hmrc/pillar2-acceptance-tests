 @tests
Feature: Bookmark Feature
  I should not be able to navigate to next page without answering the previous question
  @ignore
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
  And I enter Country as United Kingdom
  And I click on Country selected
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
  And I click Add filing member’s details link
  Then I should navigate to NFM registration page
  When I select Yes option and continue to next
  Then I should navigate to NFM details page
  When I select option No and continue to next
  Then I should navigate to NFM Name page
  When I click Report Pillar 2 top-up taxes link
  Then I should navigate to Task list page
  And I click Sign out link
  Then I am on feedback survey page
  When Organisation User logs in to nfm org page with CredID Bookmark1 for Pillar2
  Then I should be on Bookmark page
  Then The Heading should be There has been an error
  Then I click return to your Pillar 2 top-up taxes registration link
  Then I should see task list sections
  And The Task Add filing member’s details status should be In progress

  @ignore
  Scenario: 2 - User completes UPE GRS journey and try navigating to NFM NO ID flow
    Given Organisation User logs in as upe with credId Bookmark2 for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    And I click Sign out link
    Then I am on feedback survey page
    When Organisation User logs in to upe name page with CredID Bookmark2 for Pillar2
    Then I should be on Bookmark page
    Then I click return to your Pillar 2 top-up taxes registration link
    Then I should be on Task list page
    And The Task Add ultimate parent’s details status should be In progress
    Then I click Add ultimate parent’s details link
    And The Heading should be We need to match the details of the ultimate parent entity to HMRC records
    Then I should be on Initial guidance Page
    And I click on Continue button
    Then I should see the answer Yes remain selected
    And I click on Continue button
    Then I should see the option UK limited company remain selected
    And I click on Continue button
    And I click on Save&Continue button
    When I click Add filing member’s details link
    Then I should navigate to NFM registration page
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to NFM UKCompany GRS page
    When I click Report Pillar 2 top-up taxes link
    Then I should navigate to Task list page
    When Organisation User logs in to nfm name page with CredID Bookmark2 for Pillar2
    Then I should be on Bookmark page
    Then I click return to your Pillar 2 top-up taxes registration link
    Then I should be on Task list page
    And The Task Add filing member’s details status should be In progress
  @ignore
  Scenario: 3 - User completes GRS journey and validate populated value after sign out
    Given Organisation User logs in as upe with credId Bookmark3 for Pillar2
    Then I should be on UPE business page
    When I select option Yes and continue to next
    Then I should be on UPE entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to UKCompany GRS page
    When I registered successfully with BV enabled
    And I click on Save&Continue button
    Then I should navigate to Task list page
    And The Task Edit ultimate parent’s details status should be Completed
    And I click Sign out link
    Then I am on feedback survey page
    When Organisation User logs in to upe registered in UK page with CredID Bookmark3 for Pillar2
    When I click on Continue button
    Then I should be on UPE entity type page
    And I should see the option UK limited company remain selected
    When I click Report Pillar 2 top-up taxes link
    Then I should navigate to Task list page
  @ignore
  Scenario: 4 - User completes UPE GRS journey without answering mandatory questions
    Given Organisation User logs in as upe with credId Bookmark4 for Pillar2
    Then I should be on UPE business page
    And I click Continue button
    And I click Sign out link
    Then I am on feedback survey page
    When Organisation User logs in to upe org page with CredID Bookmark4 for Pillar2
    Then I should be on Bookmark page
    And The Body content should be You must return to your Pillar 2 top-up taxes registration and complete the required tasks.
    Then I click return to your Pillar 2 top-up taxes registration link
    Then I should see task list sections
    And The Task Add ultimate parent’s details status should be Not started

  @zap_accessibility
  Scenario: 5 - Validate Bookmark error for NFM Contact Name and NFM Contact Email Pages
    Given Organisation User logs in NFM Contact Name page for Pillar2
    Then I should be on Bookmark page
    Given Organisation User logs in NFM Contact Email page for Pillar2
    Then I should be on Bookmark page

  @zap_accessibility @ignore
  Scenario: 6 - Validate Bookmark for UPE/NFM Name and NFM Address Pages
    When Organisation User logs in to upe name page with CredID Bookmark2 for Pillar2
    Then I should be on Bookmark page
    Given Organisation User logs in to nfm name page with CredID Bookmark2 for Pillar2
    Then I should be on Bookmark page
    Given Organisation User logs in NFM name page for Pillar2
    Then I should be on Bookmark page
    Given Organisation User logs in NFM address page for Pillar2
    Then I should be on Bookmark page

  @zap_accessibility @ignore
  Scenario: 7 - Validate Bookmark for UPE/NFM Name and NFM Address Pages
    When Organisation User logs in to nfm org page with CredID Bookmark1 for Pillar2
    Then I should be on Bookmark page










