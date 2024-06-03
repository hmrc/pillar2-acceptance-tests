@tests @zap_accessibility
Feature: Agent user journeys
  As an Agent
  I should be able to access clients accounts using Pillar2 ID

  @batch3
  Scenario: 1 - Agent user capturing Pillar2 ID
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    When I click Report Pillar 2 top-up taxes link
    Then I should navigate to ASA Home Page
    When I click on Continue button
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XMPLR0012345674
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    When I click Report Pillar 2 top-up taxes link
    Then I should navigate to ASA Home Page
    When I select back link
    Then I should navigate to ASA Confirmation Page
    When I select back link
    And I provide ASA Pillar2 ID as XEPLR0123456500
    And I click on Continue button
    Then I should navigate to ASA No record Match Error Page
    When I click Report Pillar 2 top-up taxes link
    Then I should navigate to ASA Home Page
    When I click on Continue button
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XEPLR0123456500
    And I click on Continue button
    When I click Re-enter your client’s Pillar 2 top-up taxes ID to try again link
    Then I should be on ASA Pillar2 Input Page
    When I provide ASA Pillar2 ID as XMPLR0012345674
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    When I click Enter a different client’s Pillar 2 top-up taxes ID link
    Then I should be on ASA Pillar2 Input Page
    And I should see the PLRID field is pre-populated with XMPLR0012345674
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    And I click on Continue button
    Then I should navigate to ASA Dashboard page
    And I can see Agent Services Account link
    When I click Report Pillar 2 top-up taxes link
    Then I should navigate to ASA Dashboard page
    When I click Change client link
    And I provide ASA Pillar2 ID as XMPLR0123456789
    And I click on Continue button
    And I click on Continue button
    Then I should navigate to ASA Not Authorised page
    When I click request authorisation to report and manage this client’s Pillar 2 top-up taxes link
    Then I should navigate to ASA Home Page
    When I select back link
    When I click Report Pillar 2 top-up taxes link
    Then I should navigate to ASA Home Page

  @batch3
  Scenario: 2 - Agent user accessing dashboard features after login
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XMPLR0012345674
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    And I click on Continue button
    Then I should navigate to ASA Dashboard page
    And I click Make a payment link
    Then I should navigate to Agent Make a Payment page
    And I select back link
    Then I should navigate to ASA Dashboard page
    And I click View and amend contact details link
    Then I should navigate to Agent Contact Detail Summary Page
    And I should see row 2 value fred.flintstone@aol.com
    When I click on change link for Email address
    When I enter Contact Email as updatecontact@email.com
    And I click on Continue button
    Then I should navigate to Agent Contact Detail Summary Page
    And I should see row 2 value updatecontact@email.com
    When I click on Continue button
    Then I should navigate to ASA Dashboard page
    And I click View and amend group details link
    Then I should navigate to Agent Account Summary Page
    And I should see row 4 value 6 April 2025
    When I click on change hyperlink next to the Accounting Period
    And Accounting Period End Month is entered as 12
    When I click on Continue button
    Then I should navigate to Agent Account Summary Page
    And I should see row 4 value 6 December 2025
    And I click on Continue button
    Then I should navigate to ASA Dashboard page

  @batch2
  Scenario: 3 - Agent user API failure scenarios and service banner navigation
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XEPLR0123456404
    And I click on Continue button
    Then I should navigate to ASA No record Match Error Page
    When I click Report Pillar 2 top-up taxes link
    Then I should navigate to ASA Home Page
    And I click on Continue button
    And I provide ASA Pillar2 ID as XMPLR0012345674
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    And I click on Continue button
    Then I should navigate to ASA Dashboard page
    And I click View and amend contact details link
    When I click on change link for Contact Name
    When I enter Contact Name as 400
    And I click on Continue button
    And I click on Continue button
    Then I should navigate to Agent Amend API error Page
    When I click Report Pillar 2 top-up taxes link
    Then I should navigate to ASA Dashboard page
    And I click Make a payment link
    Then I should navigate to Agent Make a Payment page
    When I click Report Pillar 2 top-up taxes link
    Then I should navigate to ASA Dashboard page
    And I click Sign out link

  @batch3
  Scenario: 4 - Verify Agent service account user unauthorised pages
    Given Individual User logs in to register for Pillar2 Agent service
    Then I should be on ASA Individual KB Page
    When I click sign in via agent services link
    Then I should navigate to Agent services account page
    When I click the browser back button
    Then I should be on ASA Individual KB Page
    When I click request authorisation on agent services link
    Then I should navigate to Agent services account page2
    When I click the browser back button
    Then  I should be on ASA Individual KB Page
    And I click Find out more about who can report for Pillar 2 top-up taxes link
    Then I should navigate to guidance page
    When I click the browser back button
    Then I should navigate to ASA Individual KB Page
    When I select back link
    Then I should be on auth-login page

  @batch3
  Scenario: 5 - Verify Agent service account user unauthorised pages
    Given Organisation User logs in to register for Pillar2 Agent service
    Then I should be on ASA Organisation KB Page
    When I click sign in via agent services link
    Then I should navigate to Agent services account page
    When I click the browser back button
    Then I should be on ASA Organisation KB Page
    When I click request authorisation on agent services link
    Then I should navigate to Agent services account page2
    When I click the browser back button
    Then  I should be on ASA Organisation KB Page
    And I click Find out more about who can report for Pillar 2 top-up taxes link
    Then I should navigate to guidance page
    When I click the browser back button
    Then I should navigate to ASA Organisation KB Page
    When I select back link
    Then I should be on auth-login page
    When Assistant User logs in to register for Pillar2 Agent service
    Then I should be on ASA Organisation KB Page
