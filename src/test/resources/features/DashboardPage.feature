@tests
Feature: Dashboard Page
  As a registered user
  I should be able to navigate to Links on dashboard page

  @batch1
  Scenario: 1 - User navigates to Dashboard page and validates the links
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service
    Then I should be on Dashboard page
    When I click Refer to the Pillar 2 Top-up Taxes manual (opens in new tab) link
    Then I should be navigated to new tab
    And  I should be on Draft guidance page
    Then I close new tab
    And I should navigate back to main tab
    And I should be on Dashboard page
    When I click Make a payment link
    Then I should navigate to Make a payment page
    When I click Report Pillar 2 Top-up Taxes link
    Then I should be on Dashboard page
    When I click Make a payment link
    Then I should navigate to Make a payment page
    When I select back link
    Then I should be on Dashboard page
    When I click View and amend contact details link
    Then I should navigate to contact details summary page
    When I click the browser back button
    Then I should be on Dashboard page
    When I click View and amend group details link
    Then I should navigate to accounts summary page
    When I click the browser back button
    Then I should be on Dashboard page
    When I click Refer to the Pillar 2 Top-up Taxes manual (opens in new tab) link
    Then I should be navigated to new tab
    And  I should be on Draft guidance page
    Then I close new tab
    And I should navigate back to main tab
    And I should be on Dashboard page
    When I click Sign out link
    Then I am on feedback survey page

  @zap_accessibility @batch1
  Scenario: 2 - User navigates to group details page and validates the data
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service
    Then I should be on Dashboard page
    When I click View and amend group details link
    Then I should navigate to accounts summary page
    And the page title should be Group details - Report Pillar 2 Top-up Taxes - GOV.UK
    And The Heading should be Group details
    And I should see row 1 key Where are the entities in your group located?
    And I should see row 2 key Group’s current consolidated accounting period
    And I should see row 3 key Start date
    And I should see row 4 key End date
    And I should see row 1 value In the UK and outside the UK
    And I should see row 3 value 6 January 2024
    And I should see row 4 value 6 April 2025
    When I click on change hyperlink next to the FD Group Status
    And The caption must be Group details
    When I select option Only in the UK in further details group status page
    Then I should navigate to accounts summary page
    And I should see row 1 value Only in the UK
    When I click on change hyperlink next to the Accounting Period
    When I enter account period as:
      | KEY             | VALUE |
      | startDate.day   | 5     |
      | startDate.month | 5     |
      | startDate.year  | 2025  |
      | endDate.day     | 5     |
      | endDate.month   | 6     |
      | endDate.year    | 2026  |
    And I should see row 3 value 5 May 2025
    And I should see row 4 value 5 June 2026
    And I click on Continue button
    Then I should be redirected to "Manage Account processing Page" or "Dashboard page"
    And I should be on Dashboard page

  @zap_accessibility @batch1
  Scenario: 3 - User navigates to amend contact details page and validates the data
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service
    Then I should be on Dashboard page
    And I should see User details in dashboard page
    When I click View and amend contact details link
    Then I should navigate to contact details summary page
    When I click on change link for Contact Name
    When I enter Contact Name as Contact Name Test #
    Then I should navigate to contact details summary page
    When I click on change link for Email address
    When I enter Contact Email as contact*@email.com
    When I click on change link for Phone number
    When I enter Telephone Number as 123456789
    When I click on change link for Do you have a second contact?
    When I select option No and continue to next
    When I click on change link for Do you have a second contact?
    When I select option Yes and continue to next
    When I enter Second Contact Name as Second Contact £ Name Test
    When I enter Second Contact Email as second&Contact@email.com
    When I select option Yes and continue to next
    When I enter Second Contact Input as 1234554878
    When I click on change link for Dashboard Address
    When I enter Address Line 1 as Test Address Line 1
    When I enter Address Line 2 as Test Address Line 2
    And I enter City as Test City
    And I enter Region as Test Region
    And I enter Postal Code as EH5 5WY
    And I click on Continue button
    Then I should navigate to contact details summary page
    When I click on Continue button
    Then I should be redirected to "Manage Contact processing Page" or "Dashboard page"
    And I should be on Dashboard page

  @batch2
  Scenario: 5 - Verify that user is navigated to an error page, when ETMP returns Error when connecting to amend subscription API
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service
    Then I should be on Dashboard page
    And I should see User details in dashboard page
    When I click View and amend contact details link
    Then I should navigate to contact details summary page
    And I should see row 1 key Contact name
    And I should see row 1 value Fred Flintstone
    When I click on change link for Contact Name
    When I enter Contact Name as 400
    Then I should navigate to contact details summary page
    When I click on Continue button
    Then I should be on Subscription API error page
    And The Heading should be Sorry, there is a problem with the service
    And The Body content should be Please try again later.
    When I click Return to your account homepage to try again link
    Then I should be on Dashboard page

  @batch1
  Scenario: 6 - Verify Transaction History pages for Org user
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0000000122 for Pillar2 service
    Then I should be on Dashboard page
    When I click View your transaction history link
    Then I should be on Transaction History Page
    When I select back link
    Then I should be on Dashboard page
    When I click View your transaction history link
    Then I should be on Transaction History Page
    And I should see Next CTA
    When I click Next CTA
    Then I should be on Transaction History Second Page
    And I should see Previous CTA
    When I click Previous CTA
    Then I should be on Transaction History Page
    When I click Report Pillar 2 Top-up Taxes link
    Then I should be on Dashboard page
    And I click Sign out link
    Then Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR4040000000 for Pillar2 service
    And I should be on Dashboard page
    When I click View your transaction history link
    Then I should be on Transaction History Empty Page
    When I select back link
    Then I should be on Dashboard page
    When I click View your transaction history link
    Then I should be on Transaction History Empty Page
    When I click Report Pillar 2 Top-up Taxes link
    Then I should be on Dashboard page
    And I click Sign out link
    Then Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR4000000000 for Pillar2 service
    And I should be on Dashboard page
    When I click View your transaction history link
    Then I should be on Transaction History Error Page
    When I click Return to your account homepage link
    Then I should be on Dashboard page
    When I click View your transaction history link
    Then I should be on Transaction History Error Page
    When I select back link
    Then I should be on Dashboard page
    And I click Sign out link
    Then Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR6666666666 for Pillar2 service
    And I should be on Dashboard page
    When I click View your transaction history link
    Then I should be on Transaction History Page
    And I click Sign out link
    Then Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR5555551111 for Pillar2 service
    And I should be on Dashboard page
    When I click View your transaction history link
    Then I should be on Transaction History Page

  @batch2
  Scenario Outline: 7 - Verify Unauthorised access of payment,repayment,view transactions, amend contact & group details pages
    Given Organisation User logs in to register for Pillar2
    And I should be on Task list page
    When I access the <page name> page
    Then I should be on Unauthorised Page
    When I click Sign out link
    And Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service
    Then I should be on Dashboard page
    When I access the <page name> page
    Then I should be on <page>
    And I click Sign out link
    Examples:
      | page name                  | page                                  |
      | contact details summary    | contact details summary page          |
      | account summary            | accounts summary page                 |
      | MakePayment                | Make a payment page                   |
      | repayment guidance         | Repayment Guidance Page               |
      | repayment amount           | Repayment Amount Page                 |
      | repayment reason           | Reason For Refund Page                |
      | repayment method           | Repayment Method Page                 |
      | uk bank account            | UK Bank Account Payment Page          |
      | non-uk bank account        | Non UK Bank Account Payment Page      |
      | repayment contact name     | Repayment Contact Page                |
      | repayment contact email    | Repayment Journey Recovery Error Page |
      | repayment telephone        | Repayment Journey Recovery Error Page |
      | repayment telephone input  | Repayment Journey Recovery Error Page |
      | repayment CYA              | Repayment CYA Page                    |
      | repayment change amount    | Repayment change amount Page          |
      | repayment change method    | Repayment change method Page          |
      | repayment change name      | Repayment change name Page            |
      | transaction history        | Transaction History Page              |
      | manage contact name        | Manage contact name Page              |
      | manage second contact name | Manage second contact name            |
      | manage contact address     | Manage contact address Page           |
      | manage group status        | Manage group status Page              |
      | manage accounting period   | Manage accounting period Page         |

  @batch3
  Scenario: 8 - Make successful payment as Organisation user
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service
    Then I should be on Dashboard page
    When I click Make a payment link
    Then I should navigate to Make a payment page
    When I click on Continue button
    Then I make successful payment
    And I should navigate to Transaction History Page
    When I click Report Pillar 2 Top-up Taxes link
    Then I should be on Dashboard page


  @batch3
  Scenario: 9 - Make successful payment as Agent
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XMPLR0012345674
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    And I click on Continue button
    Then I should navigate to ASA Dashboard page
    And I can see Agent Services Account link
    When I click Make a payment link
    Then I should navigate to Make a payment page
    When I click on Continue button
    Then I make successful payment
    And I should navigate to Transaction History Page
    When I click Report Pillar 2 Top-up Taxes link
    Then I should be on Dashboard page

  @batch3
  Scenario: 10 - Back journey from Get ready to approve your payment page
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service
    Then I should be on Dashboard page
    When I click Make a payment link
    Then I should navigate to Make a payment page
    When I click on Continue button
    And I go till Get ready to approve your payment page
    Then I should be able to navigate back to make a payment page
    Then I should navigate to Make a payment page

