@tests
Feature: Dashboard Page
As a registered user
  I should be able to navigate to Links on dashboard page
  @batch1
  Scenario: 1 - User navigates to Dashboard page and validates the links
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service
    Then I should be on Dashboard page
    And The Heading should be Your Pillar 2 top-up taxes account
    And The inactive status should be HMRC has received a Below Threshold Notification for this account. Please contact the pillar2mailbox@hmrc.gov.uk if your circumstances change.
    When I click draft guidance (opens in new tab). link
    Then I should be navigated to new tab
    And  I should be on Draft guidance page
    Then I close new tab
    And I should navigate back to main tab
    And I should be on Dashboard page
    And I should see User details in dashboard page
    And I should see user details row 1 key Group’s Pillar 2 top-up taxes ID:
    And I should see user details row 2 key Registration date:
    And I should see user details row 3 key Ultimate parent entity:
    And I should see the heading 1 on Dashboard page as Payments
    And The Body content should be You have no payments due
    And The Body content should be Make a payment
    And I should see the heading 2 on Dashboard page as Manage your account
    And The Body content should be View and amend contact details
    And The Body content should be View and amend group details
    And The Body content should be This service is being developed as the UK’s implementation of Pillar 2, part of the G20 and the Organisation for Economic Cooperation and Development’s (OECD) two-pillar solution.
    And The Body content should be The first deadline to submit a return is 18 months after the last day of the group’s accounting period that started on or after 31 December 2023.
    And The Body content should be This service will allow groups to access other features such as the submission of UK tax returns (UKTR), ahead of this deadline.
    And The Body content should be For more information about the UK’s implementation of Pillar 2 top-up taxes, please refer to the draft guidance (opens in new tab).
    When I click Make a payment link
    Then I should navigate to Make a payment page
    And The Heading should be Pay your Pillar 2 top-up taxes
    And The second heading should be How to make a payment
    And The Body content should be Payments can only be made by bank transfer.
    And The Body content should be Faster Payments will usually reach HMRC the same or next day, including weekends and bank holidays.
    And The Body content should be CHAPS payments usually reach HMRC the same working day if you pay within your bank’s processing times.
    And The Body content should be Bacs payments usually take 3 working days.
    And The warning message should be You must use XMPLR0012345674 as your payment reference. We need this to match your payment.
    And The caption for section 1 should be HMRC’s bank details for UK payments
    And The section 1 with header Sort code value should be 08 32 10
    And The section 2 with header Account number value should be 12001020
    And The section 3 with header Account name value should be HMRC Shipley
    And The caption for section 2 should be HMRC’s bank details for payments outside the UK
    When I click Report Pillar 2 top-up taxes link
    Then I should be on Dashboard page
    #Then I should be on Dashboard page
    #When I click View your payment history link
    #Then I should navigate to under construction page
    #When I select back link
    #Then I should be on Dashboard page
    #When I click Request a repayment link
    #Then I should navigate to under construction page
    #When I select back link
    #Then I should be on Dashboard page
    When I click View and amend contact details link
    Then I should navigate to contact details summary page
    When I click the browser back button
    Then I should be on Dashboard page
    When I click View and amend group details link
    Then I should navigate to accounts summary page
    When I click the browser back button
    Then I should be on Dashboard page
    When I click draft guidance (opens in new tab). link
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
    And I should see User details in dashboard page
    And I should see user details row 1 key Group’s Pillar 2 top-up taxes ID:
    And I should see user details row 2 key Registration date:
    And I should see user details row 3 key Ultimate parent entity:
    And I should see user details row 1 value XMPLR0012345676
    And I should see user details row 2 value 31 January 2024
    And I should see user details row 3 value International Organisation Inc.
    And I should see the heading 1 on Dashboard page as Payments
    And I should see the heading 2 on Dashboard page as Manage your account
    When I click View and amend group details link
    Then I should navigate to accounts summary page
    And the page title should be Group details - Report Pillar 2 top-up taxes - GOV.UK
    And The Heading should be Group details
    And I should see row 1 key Where are the entities in your group located?
    And I should see row 2 key Group’s current consolidated accounting period
    And I should see row 3 key Start date
    And I should see row 4 key End date
    And I should see row 1 value In the UK and other countries
    And I should see row 3 value 6 January 2024
    And I should see row 4 value 6 April 2025
    When I click on change hyperlink next to the FD Group Status
    And The caption must be Group details
    When I select option Only in the UK in further details group status page
    When I click on Continue button
    Then I should navigate to accounts summary page
    And I should see row 1 value Only in the UK
    When I click on change hyperlink next to the Accounting Period
    When Accounting Period Start Day is entered as 5
    And Accounting Period Start Month is entered as 5
    And Accounting Period Start Year is entered as 2025
    When Accounting Period End Day is entered as 5
    And Accounting Period End Month is entered as 6
    And Accounting Period End Year is entered as 2026
    When I click on Continue button
    And I should see row 3 value 5 May 2025
    And I should see row 4 value 5 June 2026
    And I click on Continue button
    Then I should be on Dashboard page

  @zap_accessibility @batch1
  Scenario: 3 - User navigates to amend contact details page and validates the data
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service
    Then I should be on Dashboard page
    And I should see User details in dashboard page
    And I should see user details row 1 key Group’s Pillar 2 top-up taxes ID:
    And I should see user details row 2 key Registration date:
    And I should see user details row 3 key Ultimate parent entity:
    And I should see user details row 1 value XMPLR0012345676
    And I should see user details row 2 value 31 January 2024
    And I should see user details row 3 value International Organisation Inc.
    When I click View and amend contact details link
    Then I should navigate to contact details summary page
    And the page title should be Contact details - Report Pillar 2 top-up taxes - GOV.UK
    And The Heading should be Contact details
    And I should see sub section 1 as First contact
    And I should see sub section 2 as Second contact
    And I should see sub section 3 as Contact address
    And I should see row 1 key Contact name
    And I should see row 2 key Email address
    And I should see row 3 key Can we contact by telephone?
    And I should see row 4 key Telephone number
    And I should see row 1 value Fred Flintstone
    And I should see row 2 value fred.flintstone@aol.com
    And I should see row 3 value Yes
    And I should see row 4 value 0115 9700 700
    And I should see row 5 key Do you have a second contact?
    And I should see row 6 key Second contact name
    And I should see row 7 key Second contact email address
    And I should see row 8 key Can we contact by telephone?
    And I should see row 9 key Second contact telephone number
    And I should see row 5 value Yes
    And I should see row 6 value Donald Trump
    And I should see row 7 value onald.trump@potus.com
    And I should see row 8 value Yes
    And I should see row 9 value 0115 9700 701
    And I should see row 10 key Address
    And I should see row 10 value 1 High Street
    And I should see row 10 value Egham
    And I should see row 10 value Wycombe
    And I should see row 10 value Surrey
    And I should see row 10 value HP13 6TT
    And I should see row 10 value United Kingdom
    When I click on change link for Contact Name
    When I enter Contact Name as Contact Name Test
    And I click on Continue button
    Then I should navigate to contact details summary page
    When I click on change link for Email address
    When I enter Contact Email as contact@email.com
    And I click on Continue button
    Then I should navigate to contact details summary page
    When I click on change link for Telephone number
    When I enter Contact Telephone as 123456789
    And I click on Continue button
    Then I should navigate to contact details summary page
    When I click on change link for Do you have a second contact?
    When I select option No and continue to next
    Then I should navigate to contact details summary page
    And I should see row 5 key Do you have a second contact?
    And I should see row 5 value No
    Then I should navigate to contact details summary page
    When I click on change link for Do you have a second contact?
    When I select option Yes and continue to next
    When I enter Second Contact Name as Second Contact Name Test
    And I click on Continue button
    When I enter Second Contact Email as secondContact@email.com
    And I click on Continue button
    When I select option Yes and continue to next
    When I enter Second Contact Input as 1234554878
    And I click on Continue button
    Then I should navigate to contact details summary page
    When I click on change link for Dashboard Address
    When I enter Address Line 1 as Test Address Line 1
    When I enter Address Line 2 as Test Address Line 2
    And I enter City as Test City
    And I enter Region as Test Region
    And I enter Postal Code as EH5 5WY
    And I select country as United Kingdom
    And I click on Continue button
    Then I should navigate to contact details summary page
    And I should see row 1 value Contact Name Test
    And I should see row 2 value contact@email.com
    And I should see row 3 value Yes
    And I should see row 4 value 123456789
    And I should see row 5 key Do you have a second contact?
    And I should see row 6 key Second contact name
    And I should see row 7 key Second contact email address
    And I should see row 8 key Can we contact by telephone?
    And I should see row 9 key Second contact telephone number
    And I should see row 5 value Yes
    And I should see row 6 value Second Contact Name Test
    And I should see row 7 value secondContact@email.com
    And I should see row 8 value Yes
    And I should see row 9 value 1234554878
    And I should see row 10 key Address
    And I should see row 10 value Test Address Line 1
    And I should see row 10 value Test Address Line 2
    And I should see row 10 value Test City
    And I should see row 10 value Test Region
    And I should see row 10 value EH5 5WY
    And I should see row 10 value United Kingdom
    When I click on Continue button
    Then I should be on Dashboard page

  @zap_accessibility @batch2
  Scenario: 4 - Verify that user is navigated to an error page, when ETMP returns Error when connecting to view subscription API
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XEPLR0123456500 for Pillar2 service
    Then I should be on Subscription API error page
    And The Heading should be Sorry, there is a problem with the service
    And The Body content should be Please try again later.
    When I click Return to your account homepage to try again link
    Then I should be on Subscription API error page

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
    And I click on Continue button
    Then I should navigate to contact details summary page
    When I click on Continue button
    Then I should be on Subscription API error page
    And The Heading should be Sorry, there is a problem with the service
    And The Body content should be Please try again later.
    When I click Return to your account homepage to try again link
    Then I should be on Dashboard page
  @batch3
  Scenario: 6 - User navigates to Non UK bank account details page
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service
      Then I should be on Dashboard page
      And I access Non UK payment page
      When I select back link
      Then I should be on Dashboard page
      And I access Non UK payment page
      And The Heading should be Bank account details
      When I click on Continue button
      Then I should see bank account error message Enter the name of the bank on the Name of the Bank Element
      And I should see bank account error message Enter the name on the account on the Account Name Element
      And I should see bank account error message Enter the BIC or SWIFT code on the Swift Code Element
      And I should see bank account error message Enter the IBAN on the Iban Element
      When I refresh the page
      And I enter Bank Name as HSBC
      And I enter Account Name as HMRC Shipley
      And I click on Continue button
      Then I should see bank account error message Enter the BIC or SWIFT code on the Swift Code Element
      And I should see bank account error message Enter the IBAN on the Iban Element
      When I refresh the page
      And I enter Bank Name as HSBC
      And I enter Account Name as HMRC Shipley
      And I enter Swift Code as HbuKGb4B
      And I enter Iban as gb29NWBK60161331926819
      And I click on Continue button
      Then I should navigate to under construction page
      When I select back link
      Then I should be on Non UK Bank Account Payment Page
      When I enter Bank Name as NameOfTheBankMustBe40CharactersOrLessError
      And I click on Continue button
      Then I should see bank account error message Name of the bank must be 40 characters or less on the Name of the Bank Element
      When I refresh the page
      And I enter Bank Name as HSBC
      And I enter Account Name as NameOnTheAccountMustBe60CharactersOrLessOrThereWillBeAnErrorAsSeen
      And I enter Swift Code as HBUKGB4B
      And I enter Iban as GB29NWBK60161331926819
      And I click on Continue button
      Then I should see bank account error message Name on the account must be 60 characters or less on the Account Name Element
      When I refresh the page
      And I enter Bank Name as HSBC
      And I enter Account Name as HMRC Shipley
      And I enter Swift Code as HBUKG
      And I enter Iban as GB29NWBK60161331926819
      And I click on Continue button
      Then I should see bank account error message BIC or SWIFT code must be between 8 and 11 characters long on the Swift Code Element
      When I refresh the page
      And I enter Bank Name as HSBC
      And I enter Account Name as HMRC Shipley
      And I enter Swift Code as 0BCDEF01A1C
      And I enter Iban as GB29NWBK60161331926819
      And I click on Continue button
      Then I should see bank account error message Enter a valid BIC or SWIFT code like HBUKGB4B on the Swift Code Element
      When I refresh the page
      And I enter Bank Name as HSBC
      And I enter Account Name as HMRC Shipley
      And I enter Swift Code as 12345678
      And I enter Iban as 1Z03A1234567890ABCBBH1
      And I click on Continue button
      And I should see bank account error message Enter a valid IBAN like GB29NWBK60161331926819 on the Iban Element
      When I refresh the page
      And I enter Bank Name as HSBC
      And I enter Account Name as HMRC Shipley
      And I enter Swift Code as 12345678
      And I enter Iban as ErrorMessageIBANMustBeUpto34Characters
      And I click on Continue button
      And I should see bank account error message Enter a valid BIC or SWIFT code like HBUKGB4B on the Swift Code Element
      And I should see bank account error message IBAN must be up to 34 characters on the Iban Element
      When I click Sign out link
      Then I am on feedback survey page
      When Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service
      And I access Non UK payment page
      When I click Report Pillar 2 top-up taxes link
      Then I should be on Dashboard page
      And I click Sign out link
      When Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
      And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service
      Then I should be on ASA Pillar2 Input Page
      And I directly access Agent Non UK Payment Page page
      And I enter Account Name as NameOnTheAccountMustBe60CharactersOrLessOrThereWillBeAnErrorAsSeen
      And I enter Swift Code as 0BCDEF01A1C
      And I enter Iban as 1Z03A1234567890ABCBBH1
      And I click on Continue button
      Then I should see bank account error message Enter the name of the bank on the Name of the Bank Element
      And I should see bank account error message Name on the account must be 60 characters or less on the Account Name Element
      And I should see bank account error message Enter a valid BIC or SWIFT code like HBUKGB4B on the Swift Code Element
      And I should see bank account error message Enter a valid IBAN like GB29NWBK60161331926819 on the Iban Element

  @zap_accessibility @batch1
  Scenario: 7 - Organisation User navigates to repayment guidance and refund amount pages
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service
    Then I should be on Dashboard page
    When I click Request a refund link
    Then I should navigate to Repayment Guidance Page
    When I click on Continue button
    Then I should navigate to Repayment Amount Page
    When I provide Refund Amount as 100.00
    Then I should be on under construction page

  @zap_accessibility @batch1
  Scenario: 8 - Agent User navigates to repayment guidance and refund amount pages
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XMPLR0012345674
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    And I click on Continue button
    Then I should navigate to ASA Dashboard page
    When I click Request a refund link
    Then I should navigate to Agent Repayment Guidance Page
    When I click on Continue button
    Then I should navigate to Agent Repayment Amount Page
    When I provide Refund Amount as 100.00
    Then I should be on under construction page










