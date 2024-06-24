@tests
Feature: Repayment Journey
  As a registered and subscribed user
  I should be able to access repayment journey pages

  @batch3
  Scenario: 1 - User navigates to Non UK bank account details page
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
    Then I should be on Repayment Contact Page
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

  @zap_accessibility @batch3
  Scenario: 2 - Organisation User navigates to repayment pages
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service
    Then I should be on Dashboard page
    When I click Request a refund link
    Then I should navigate to Repayment Guidance Page
    When I click on Continue button
    Then I should navigate to Repayment Amount Page
    When I provide Refund Amount as 100.00
    Then I should navigate to Reason For Refund Page
    And I select back link
    Then I should navigate to Repayment Amount Page
    And I click on Continue button
    Then I should navigate to Reason For Refund Page
    When I click Report Pillar 2 top-up taxes link
    Then I should be on Dashboard page
    And I click the browser back button
    Then I should be on Reason For Refund Page
    When I enter Refund Reason as A content designer works on the end-to-end journey of a service to help users complete their goal and government deliver a policy intent. Their work may involve the creation of, or change to, a transaction, product or single piece of content.
    And The character limit text should display You have 8 characters remaining
    And I click on Continue button
    Then I should navigate to Repayment Method Page
    When I select back link
    Then I should navigate to Reason For Refund Page
    And I click on Continue button
    Then I should navigate to Repayment Method Page
    And I select repayment method as UK bank account
    And I click on Continue button
    Then I should navigate to under construction page
    And I select back link
    Then I should be on Repayment Method Page
    When I select repayment method as Non-UK bank account
    And I click on Continue button
    Then I should be on Non UK Bank Account Payment Page
    And I enter Bank Name as HSBC
    And I enter Account Name as Test Name
    And I enter Swift Code as HBUKGB4B
    And I enter Iban as GB29NWBK60161331926819
    And I click on Continue button
    Then I should be on Repayment Contact Page
    And I provide Repayment contact name as Repayment Contact Name
    Then I should be on Repayment Contact Email Page
    When I provide Repayment contact email as repayment@email.com
    Then I should be on Repayment Telephone Page
    When I select option Yes and continue to next
    Then I should be on Repayment Telephone Input Page
    When I provide Repayment contact telephone as 789765423
    Then I should be on under construction page
    When I select back link
    Then I should be on Repayment Telephone Input Page
    When I select back link
    Then I should be on Repayment Telephone Page
    When I select back link
    Then I should be on Repayment Contact Email Page
    When I select back link
    Then I should be on Repayment Contact Page
    When I click Report Pillar 2 top-up taxes link
    Then I should be on Dashboard page

  @zap_accessibility @batch3
  Scenario: 3 - Agent User navigates to repayment journey pages
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
    When I provide Refund Amount as 9999.99
    And I click on Continue button
    Then I should navigate to Agent Repayment Reason Page
    When I click Report Pillar 2 top-up taxes link
    Then I should navigate to ASA Dashboard page
    When I click the browser back button
    Then I should navigate to Agent Repayment Reason Page
    When I enter Refund Reason as A content designer works on the end-to-end journey of a service to help users complete their goal and government deliver a policy intent. Their work may involve the creation of, or change to, a transaction, product or single piece of content.
    And I click on Continue button
    Then I should navigate to Agent Repayment Method Page
    And I select repayment method as UK bank account
    And I click on Continue button
    Then I should navigate to under construction page
    When I select back link
    When I click Report Pillar 2 top-up taxes link
    Then I should navigate to ASA Dashboard page
    When I click Request a refund link
    Then I should navigate to Agent Repayment Guidance Page
    When I click on Continue button
    Then I should navigate to Agent Repayment Amount Page
    And I should see Refund Amount field is pre-populated with 9999.99
    And I click on Continue button
    Then I should navigate to Agent Repayment Reason Page
    And I should see Repayment reason field is pre-populated with A content designer works on the end-to-end journey of a service to help users complete their goal and government deliver a policy intent. Their work may involve the creation of, or change to, a transaction, product or single piece of content.
    And I click on Continue button
    Then I should navigate to Agent Repayment Method Page
    And I should see the repayment method UK bank account remain selected
