@tests
Feature: RFM Start page
  As a New Filing member
  I want to access start page of Replace Filing Member(RFM) journey

  @zap_accessibility
  Scenario: 1 - Verify RFM start page and validations
    Given I access RFM start page
    Then I should be on RFM start page
    And The caption must be Replace filing member
    And The Heading should be Replace the filing member for a Pillar 2 top-up taxes account
    And I should see 4 sections on RFM start page
    And I should see the section 1 as Not yet registered to report Pillar 2 top-up taxes
    And I should see the section 2 as Who can replace a filing member
    And I should see the section 3 as Before you start
    And I should see the section 4 as Replace a filing member
    And I should see go back to the service start page for more information link
    And I should see confirmation checkbox
    When I click on Continue button
    Then I should see error message You must select the checkbox to continue on the RFM start Page
    When I click go back to the service start page for more information link
    Then I should navigate to gov uk guidance page3
    When I click the browser back button
    Then I should be on RFM start page
    When I select confirmation checkbox
    And I click on Continue button
    Then I should be on under construction page
    When I select back link
    Then I should be on RFM start page

  @zap_accessibility @tests
  Scenario: 2 - Verify Individual RFM KB page
    Given I access RFM start page
    Then I should be on RFM start page
    When I select confirmation checkbox
    And I click on Continue button
    Then I should be on auth-login page
    And I should see the Redirect URL field is pre-populated with /replace-filing-member/security/enter-pillar2-id
    When Individual User logs in with rfm URL to Pillar2
    Then I should be on Individual RFM KB Page
    And The Heading should be Sorry, you’re unable to use this service
    And The Body content should be You’ve signed in with an individual account. Only users with an organisation account can replace their nominated filing member.
    And The Body content should be If you need to replace a nominated filing member, sign in to Government Gateway with an organisation account.
    When I click sign in to Government Gateway with an organisation account link
    Then I should be on auth-login page
    And I should see the Redirect URL field is pre-populated with /replace-filing-member/start
    When I click the browser back button
    Then I should be on Individual RFM KB Page
    When I click Go back to the Replace filing member for Pillar 2 top-up taxes start page for more information on who can use this service link
    Then I should be on RFM start page

  @tests
  Scenario: 3 - Verify Agent RFM KB page
    Given I access RFM start page
    Then I should be on RFM start page
    When I select confirmation checkbox
    And I click on Continue button
    Then I should be on auth-login page
    And I should see the Redirect URL field is pre-populated with /replace-filing-member/security/enter-pillar2-id
    When Agent User logs in with rfm URL to Pillar2
    Then I should be on Agent RFM KB Page
    And The Heading should be Sorry, you’re unable to use this service
    And The Body content should be You’ve signed in using an agent’s Government Gateway user ID.
    And The Body content should be Agents cannot use this service to replace a nominated filing member.
    And The Body content should be Someone with an administrator’s Government Gateway user ID who is the new nominated filing member will need to replace the current filing member.
    When I click Go back to the Replace filing member for Pillar 2 top-up taxes start page for more information on who can use this service link
    Then I should be on RFM start page
    
  @zap_accessibility @tests1
  Scenario: 4 - Verify security question1 page
    Given I access RFM start page
    Then I should be on RFM start page
    When I select confirmation checkbox
    And I click on Continue button
    Then I should be on auth-login page
    And I should see the Redirect URL field is pre-populated with /replace-filing-member/security/enter-pillar2-id
    When Organisation User logs in with rfm URL to Pillar2








