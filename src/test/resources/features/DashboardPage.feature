@tests
Feature: Dashboard Page
As a registered user
  I should be able to navigate to Links on dashboard page
  
  Scenario: 1 - User navigates to Dashboard page and validates the links
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service
    Then I should be on Dashboard page
    And The Heading should be Your Pillar 2 top-up taxes account
    And The inactive status should be Your account is currently inactive. For additional information, please refer to the draft guidance (opens in a new tab).
    When I click draft guidance (opens in a new tab) link
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
    And I click on toggle link How long it takes
    And The inset text should be You have no payments due.
    And The second heading should be How to make a payment
    And The Body content should be Payments can be made by bank transfer.
    And The Body content should be To make a bank transfer payment, you can visit your bank’s website, use their mobile app, or go to a branch and use HMRC’s banking details.
    And The Body content should be Faster Payments will usually reach HMRC the same or next day, including weekends and bank holidays.
    And The Body content should be CHAPS payments usually reach HMRC the same working day if you pay within your bank’s processing times.
    And The Body content should be Bacs payments usually take 3 working days.
    And The warning message should be You must use XMPLR0012345674 as your payment reference. HMRC will use this to match your payment.
    And The caption for section 1 should be HMRC’s bank details
    And The section 1 with header Sort code value should be 08 32 10
    And The section 2 with header Account number value should be 12001020
    And The section 3 with header Account name value should be HMRC Shipley
    And I click on toggle link Make a payment from outside the UK
    And The caption for section 2 should be HMRC’s overseas bank details
    When I select back link
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
    When I click draft guidance (opens in new tab) link
    Then I should be navigated to new tab
    And  I should be on Draft guidance page
    Then I close new tab
    And I should navigate back to main tab
    And I should be on Dashboard page
    When I click Sign out link
    Then I am on feedback survey page

  @zap_accessibility
  Scenario: 2 - User navigates to group details page and validates the data
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service
    Then I should be on Dashboard page
    And I should see User details in dashboard page
    And I should see user details row 1 key Group’s Pillar 2 top-up taxes ID:
    And I should see user details row 2 key Registration date:
    And I should see user details row 3 key Ultimate parent entity:
    And I should see user details row 1 value XMPLR0012345676
    And I should see user details row 2 value 31 January 2022
    And I should see user details row 3 value International Organisation Inc.
    And I should see the heading 1 on Dashboard page as Payments
    And I should see the heading 2 on Dashboard page as Manage your account
    When I click View and amend group details link
    Then I should navigate to accounts summary page
    And The Heading should be Group details
    And I should see row 1 key Where does the group operate?
    And I should see row 2 key Group’s consolidated accounting period
    And I should see row 3 key Start date
    And I should see row 4 key End date
    And I should see row 1 value In the UK and other countries
    And I should see row 3 value 6 January 2024
    And I should see row 4 value 6 April 2025
    When I click on change hyperlink next to the FD Group Status
    And The caption must be Group details
    And The Heading should be Group operations
    And The Body content should be Group operations refer to the collective activities of the group. You must answer this question on behalf of the whole group.
    And The Body content should be There are two Pillar 2 top-up taxes in the UK:
    And The Body content should be Multinational Top-up Tax
    And The Body content should be Domestic Top-up Tax
    And The Body content should be Groups that operate only in the UK will register to report for Domestic Top-up Tax.
    And The Body content should be Groups that operate in the UK and other countries will register to report for both Domestic Top-up Tax and Multinational Top-up Tax.
    And The Body content should be If group operations change, you must amend the group’s details.
    And The field heading should be Where does the group operate?
    When I select option Only in the UK in further details group status page
    When I click on Continue button
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

  @zap_accessibility
  Scenario: 3 - User navigates to amend contact details page and validates the data
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service
    Then I should be on Dashboard page
    And I should see User details in dashboard page
    And I should see user details row 1 key Group’s Pillar 2 top-up taxes ID:
    And I should see user details row 2 key Registration date:
    And I should see user details row 3 key Ultimate parent entity:
    And I should see user details row 1 value XMPLR0012345676
    And I should see user details row 2 value 31 January 2022
    And I should see user details row 3 value International Organisation Inc.
    When I click View and amend contact details link
    Then I should navigate to contact details summary page
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
    And I select back link
    And I select back link
    Then I should navigate to contact details summary page
    When I click on change link for Email address
    When I enter Contact Email as contact@email.com
    And I click on Continue button
    And I select back link
    And I select back link
    Then I should navigate to contact details summary page
    When I click on change link for Telephone number
    When I enter Contact Telephone as 123456789
    And I click on Continue button
    And I select back link
    And I select back link
    Then I should navigate to contact details summary page
    When I click on change link for Do you have a second contact?
    When I select option No and continue to next
    And I select back link
    And I select back link
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
    And I click on Continue button
    Then I should navigate to contact details summary page
    When I click on change link for Address
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

  @zap_accessibility
  Scenario: 5 - verify that user routed to a placeholder error page, when etmp  returns Error while amending contact details
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
    And I select back link
    And I select back link
    Then I should navigate to contact details summary page
    When I click on Continue button
    Then I should be on error place holder page
    When I click return to your Pillar 2 top-up taxes registration link
    Then I should be on Dashboard page

  Scenario: 6 - verify that user routed to a placeholder error page, when etmp  returns Error while amending contact details
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service
    Then I should be on Dashboard page
    And I should see User details in dashboard page
    When I click View and amend contact details link
    Then I should navigate to contact details summary page
    And I should see row 1 key Contact name
    And I should see row 1 value Fred Flintstone
    When I click on change link for Contact Name
    When I enter Contact Name as 409
    And I click on Continue button
    And I select back link
    And I select back link
    Then I should navigate to contact details summary page
    When I click on Continue button
    Then I should be on error place holder page
    When I click return to your Pillar 2 top-up taxes registration link
    Then I should be on Dashboard page

  Scenario: 7 - verify that user routed to a placeholder error page, when etmp  returns Error while amending contact details
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service
    Then I should be on Dashboard page
    And I should see User details in dashboard page
    When I click View and amend contact details link
    Then I should navigate to contact details summary page
    And I should see row 1 key Contact name
    And I should see row 1 value Fred Flintstone
    When I click on change link for Contact Name
    When I enter Contact Name as 422
    And I click on Continue button
    And I select back link
    And I select back link
    Then I should navigate to contact details summary page
    When I click on Continue button
    Then I should be on error place holder page
    When I click return to your Pillar 2 top-up taxes registration link
    Then I should be on Dashboard page

  Scenario: 8 - verify that user routed to a placeholder error page, when etmp  returns Error while amending contact details
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service
    Then I should be on Dashboard page
    And I should see User details in dashboard page
    When I click View and amend contact details link
    Then I should navigate to contact details summary page
    And I should see row 1 key Contact name
    And I should see row 1 value Fred Flintstone
    When I click on change link for Contact Name
    When I enter Contact Name as 500
    And I click on Continue button
    And I select back link
    And I select back link
    Then I should navigate to contact details summary page
    When I click on Continue button
    Then I should be on error place holder page
    When I click return to your Pillar 2 top-up taxes registration link
    Then I should be on Dashboard page

  Scenario: 9 - verify that user routed to a placeholder error page, when etmp  returns Error while amending contact details
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service
    Then I should be on Dashboard page
    And I should see User details in dashboard page
    When I click View and amend contact details link
    Then I should navigate to contact details summary page
    And I should see row 1 key Contact name
    And I should see row 1 value Fred Flintstone
    When I click on change link for Contact Name
    When I enter Contact Name as 503
    And I click on Continue button
    And I select back link
    And I select back link
    Then I should navigate to contact details summary page
    When I click on Continue button
    Then I should be on error place holder page
    When I click return to your Pillar 2 top-up taxes registration link
    Then I should be on Dashboard page