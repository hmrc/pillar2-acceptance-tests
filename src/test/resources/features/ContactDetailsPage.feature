@ignore @zap_accessibility
Feature: Contact details guidance and logic to play back contact details
  As a Subscription user
  I should be displayed with contact details in use contact page

  Scenario: 1 - Create a new subscription for validating play back contact details
    #Complete the subscription journey until task 3
    Given Organisation User logs in with credId Test for Pillar2
    Then The Task Add Contact details status should be In progress
    When I click Add Contact details link
    Then I should navigate to Contact details guidance page
    And The caption must be Contact details
    And The Heading should be We need contact details for the filing member
    And The Body content should be We need information about the filing member of this group so we can contact the right person or team when reviewing your compliance with Pillar 2 top-up taxes.
    And The Body content should be These may be different to any contact details you have already provided during registration, which were used to match your business with our records.
    When I click on Continue button
    Then I should navigate to Contact details display page
    And The caption must be Contact details
    And The Heading should be Do you want to use this as your primary contact?
    And I should see the contact details NFM Test on use contact page
    And I should see the contact details TestNFM@email.com on use contact page
    And I should see the contact details 12345678 on use contact page
    When I select option No and continue to next
    Then I should navigate to Contact details input name page
    And The caption must be Contact details
    And The Heading should be What is the name of the person or team we should contact about compliance with Pillar 2 top-up tax?
    And I click on Continue button
    Then I should navigate to under construction page

    Scenario: 1 - Guidance and play back contact details page Error validations
    #Complete the subscription journey till task 3
      Then The Task Add Contact details status should be Not started
      When I click Add Contact details link
      Then I should navigate to Contact details guidance page
      When I click on Continue button
      Then I should navigate to Contact details display page
      When I click on Continue button
      Then I should see error message Select yes if you want to use this as your primary contact on the Contact details display Page
      When I select option No and continue to next
      Then I should navigate to Contact details input name page
      And I click on Continue button
      Then I should see error message Enter name of the person of team we should contact on the Contact details display Page
      When I enter Contact Details Name as Testing the character limit of contact details field is 160 character limit. Maximum character limit of contact details name field should be 160 characters, user should not be able to continue with more than 160 characters.
      And I click on Continue button
      Then I should see error message The name of the contact person or team should be 160 characters or less on the Contact details display Page

