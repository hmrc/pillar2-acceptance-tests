@newTests
Feature: Repayment Journey
  As a registered and subscribed user
  I should be able to access repayment journey pages

  @batch3
  Scenario: 1 - Validate error for Non UK bank account details page
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service
    Then I should be on Dashboard page
    And I access Non UK payment page
    And The Heading should be Bank account details
    When I click on Continue button
    When I refresh the page
    When I enter Non UK Bank Account details as:
      | KEY               | VALUE                  |
      | bankName          | HSBC                   |
      | nameOnBankAccount | HMRC Shipley           |
      | bic               | HbuKGb4B               |
      | iban              | gb29NWBK60161331926819 |
    Then I should be on Repayment Contact Page
    When I select back link
    When I enter Non UK Bank Account details as:
      | KEY               | VALUE                                                              |
      | bankName          | NameOfTheBankMustBe40CharactersOrLessError                         |
      | nameOnBankAccount | NameOnTheAccountMustBe60CharactersOrLessOrThereWillBeAnErrorAsSeen |
      | bic               | HBUKG                                                              |
      | iban              | 1Z03A1234567890ABCBBH1                                             |
    When I refresh the page
    When I enter Non UK Bank Account details as:
      | KEY               | VALUE                                  |
      | bankName          | HSBC                                   |
      | nameOnBankAccount | HMRC Shipley                           |
      | bic               | 0BCDEF01A1C                            |
      | iban              | ErrorMessageIBANMustBeUpto34Characters |
    When I click Sign out link
    Then I am on feedback survey page
    When Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 for Pillar2 service
    And I access Non UK payment page
    When I click Report Pillar 2 Top-up Taxes link
    Then I should be on Dashboard page
    And I click Sign out link
    When Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XMPLR0012345674
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    And I click on Continue button
    Then I should navigate to Dashboard page
    And I access the non-uk bank account page
    When I enter Non UK Bank Account details as:
      | KEY               | VALUE                                                              |
      | nameOnBankAccount | NameOnTheAccountMustBe60CharactersOrLessOrThereWillBeAnErrorAsSeen |
      | bic               | 0BCDEF01A1C                                                        |
      | iban              | 1Z03A1234567890ABCBBH1                                             |
    When I click Report Pillar 2 Top-up Taxes link
    Then I should be on Dashboard page

  @batch3 @zap_accessibility
  Scenario: 2 - Organisation User navigates to repayment pages
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service
    Then I should be on Dashboard page
    When I click Request a repayment link
    Then I should navigate to Repayment Guidance Page
    When I click on Continue button
    Then I should navigate to Repayment Amount Page
    When I provide Refund Amount as 100.00
    Then I should navigate to Reason For Refund Page
    And I select back link
    Then I should navigate to Repayment Amount Page
    And I click on Continue button
    Then I should navigate to Reason For Refund Page
    When I click Report Pillar 2 Top-up Taxes link
    Then I should be on Dashboard page
    And I click the browser back button
    Then I should be on Reason For Refund Page
    When I provide value for Refund Reason as A content designer works on the end-to-end journey of a service to help users complete their goal and government deliver a policy intent. Their work may involve the creation of, or change to, a transaction, product or single piece of content.
    And The character limit text should display You have 8 characters remaining
    And I click on Continue button
    Then I should navigate to Repayment Method Page
    When I select back link
    Then I should navigate to Reason For Refund Page
    And I click on Continue button
    And I select repayment method as UK bank account
    Then I should navigate to UK Bank Account Payment Page
    And I select back link
    Then I should be on Repayment Method Page
    When I select repayment method as Non-UK bank account
    Then I should be on Non UK Bank Account Payment Page
    When I enter Non UK Bank Account details as:
      | KEY               | VALUE                  |
      | bankName          | HSBC                   |
      | nameOnBankAccount | Test Name              |
      | bic               | HBUKGB4B               |
      | iban              | GB29NWBK60161331926819 |
    And I provide Repayment contact name as Repayment Contact Name
    When I provide Repayment contact email as repayment@email.com
    When I select option Yes and continue to next
    When I provide Repayment contact phone as 789765423
    Then I should be on Repayment CYA Page
    When I select back link
    Then I should be on Repayment Phone Input Page
    When I select back link
    Then I should be on Repayment Phone Page
    When I select back link
    Then I should be on Repayment Contact Email Page
    When I select back link
    Then I should be on Repayment Contact Page
    When I navigate from Contact page to CYA page
    Then I should be on Repayment CYA Page
    When  I click change link for Repayment Amount
    When I provide Refund Amount as 1000.00
    When  I click change link for Repayment Reason
    And I provide Refund Reason as Test Reason
    And I click on Continue button
    Then I should be on Repayment CYA Page
    When  I click change link for Repayment Bank Name
    When I enter Non UK Bank Account details as:
      | KEY               | VALUE                  |
      | bankName          | HSBC2                  |
      | nameOnBankAccount | Test Name2             |
      | bic               | HBUKGB4C               |
      | iban              | GB29NWBK60161331926820 |
    When  I click change link for Repayment Contact Name
    And I provide Repayment contact name as Repayment Contact Name change
    When  I click change link for Repayment Contact Email
    When I provide Repayment contact email as email@change.com
    When  I click change link for Repayment Contact Phone
    When I select option No and continue to next
    Then I should be on Repayment CYA Page
    And I should see details as below:
      | KEY                      | VALUE                         |
      | Name of the bank         | HSBC2                         |
      | Name on account          | Test Name2                    |
      | BIC or SWIFT code        | HBUKGB4C                      |
      | IBAN                     | GB29NWBK60161331926820        |
      | Contact name             | Repayment Contact Name change |
      | Email address            | email@change.com              |
      | Can we contact by phone? | No                            |
    And I can see Print this page link
    When I click change link for Repayment UK Bank Method
    And I click on Continue button
    Then I should be on Repayment CYA Page
    And I click on Continue button
    Then I should be redirect to Repayment processing page
    And I should be on Repayment Confirmation Page
    And I can see Print this page link
    When I click Back to group homepage link
    Then I should be on Dashboard page

  @batch3 @zap_accessibility
  Scenario: 3 - Agent User navigates to repayment journey pages
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XMPLR0012345674
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    And I click on Continue button
    Then I should navigate to Dashboard page
    When I click Request a repayment link
    Then I should navigate to Repayment Guidance Page
    When I click on Continue button
    Then I should navigate to Repayment Amount Page
    When I provide Refund Amount as 9999.99
    And I click on Continue button
    Then I should navigate to Reason For Refund Page
    When I click Report Pillar 2 Top-up Taxes link
    Then I should navigate to Dashboard page
    When I click the browser back button
    Then I should navigate to Reason For Refund Page
    When I provide value for Refund Reason as A content designer works on the end-to-end journey of a service to help users complete their goal and government deliver a policy intent. Their work may involve the creation of, or change to, a transaction, product or single piece of content.
    And I click on Continue button
    Then I should navigate to Repayment Method Page
    And I select repayment method as UK bank account
    And I click on Continue button
    Then I should be on UK Bank Account Payment Page
    When I click Report Pillar 2 Top-up Taxes link
    Then I should navigate to Dashboard page
    When I click Request a repayment link
    Then I should navigate to Repayment Guidance Page
    When I click on Continue button
    Then I should navigate to Repayment Amount Page
    And I click on Continue button
    Then I should navigate to Reason For Refund Page
    And I click on Continue button
    Then I should navigate to Repayment Method Page
    When I select repayment method as Non-UK bank account
    When I enter Non UK Bank Account details as:
      | KEY               | VALUE                  |
      | bankName          | HSBC                   |
      | nameOnBankAccount | Test Name              |
      | bic               | HBUKGB4B               |
      | iban              | GB29NWBK60161331926819 |
    And I provide Repayment contact name as Repayment Contact Name
    When I provide Repayment contact email as repayment@email.com
    When I select option Yes and continue to next
    When I provide Repayment contact phone as 789765423
    Then I should be on Repayment CYA Page
    When I select back link
    Then I should be on Repayment Phone Input Page
    When I click Report Pillar 2 Top-up Taxes link
    Then I should be on Dashboard page
    When I click the browser back button
    Then I should be on Repayment Phone Input Page
    When I select back link
    Then I should be on Repayment Phone Page
    When I select back link
    Then I should be on Repayment Contact Email Page
    When I select back link
    Then I should be on Repayment Contact Page
    When I navigate from Contact page to CYA page
    Then I should be on Repayment CYA Page
    When  I click change link for Repayment Amount
    When I provide Refund Amount as 1000.00
    Then I should be on Repayment CYA Page
    When  I click change link for Repayment Reason
    And I provide Refund Reason as Test Reason
    And I click on Continue button
    Then I should be on Repayment CYA Page
    When I click change link for Repayment Bank Name
    And I provide value for Bank Name as HSBC2
    And I provide value for Account Name as Test Name2
    And I provide value for Swift Code as HBUKGB4C
    And I provide value for Iban as GB29NWBK60161331926820
    And I click on Continue button
    Then I should be on Repayment CYA Page
    When  I click change link for Repayment Contact Name
    And I provide Repayment contact name as Repayment Contact Name change
    Then I should be on Repayment CYA Page
    When  I click change link for Repayment Contact Email
    When I provide Repayment contact email as email@change.com
    Then I should be on Repayment CYA Page
    When  I click change link for Repayment Contact Phone
    When I select option No and continue to next
    Then I should be on Repayment CYA Page
    And I should see details as below:
      | KEY                      | VALUE                         |
      | Name of the bank         | HSBC2                         |
      | Name on account          | Test Name2                    |
      | BIC or SWIFT code        | HBUKGB4C                      |
      | IBAN                     | GB29NWBK60161331926820        |
      | Contact name             | Repayment Contact Name change |
      | Email address            | email@change.com              |
      | Can we contact by phone? | No                            |
    When I click change link for Repayment UK Bank Method
    When I select repayment method as UK bank account
    And I click on Continue button
    And I provide value for UK Bank Name as Natwest
    And I provide value for UK Account Name as Epic Adventure Inc
    And I provide value for Sort Code as 206705
    And I provide value for UK Account number as 86473611
    And I click on Continue button
    And I can see Print this page link
    And I click on Continue button
    Then I should be redirected to "Repayment processing page" or "Repayment Confirmation Page"
    And I should be on Repayment Confirmation Page
    Then I can see Sign out link
    And I can see Print this page link
    When I click the browser back button
    Then I should be on Repayment Return Error Page
    Then I can see Sign out link
    When I click Report Pillar 2 Top-up Taxes link
    Then I should be on Dashboard page
    When I click the browser back button
    And I click report and manage your Pillar 2 Top-up Taxes link
    Then I should be on Dashboard page

  @batch3 @zap_accessibility
  Scenario: 4 - Agent User navigates to repayment journey pages for UK bank account
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XMPLR0012345674
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    And I click on Continue button
    When I click Request a repayment link
    Then I should navigate to Repayment Guidance Page
    When I click on Continue button
    Then I should navigate to Repayment Amount Page
    When I provide Refund Amount as 999.99
    And I click on Continue button
    Then I should navigate to Reason For Refund Page
    When I provide value for Refund Reason as A content designer works on the end-to-end journey of a service to help users complete their goal and government deliver a policy intent. Their work may involve the creation of, or change to, a transaction, product or single piece of content.
    And I click on Continue button
    Then I should navigate to Repayment Method Page
    And I select repayment method as UK bank account
    Then I should be on UK Bank Account Payment Page
    When I select back link
    Then I should navigate to Repayment Method Page
    And I click on Continue button
    Then I should be on UK Bank Account Payment Page
    When I enter UK Bank Account details as:
      | KEY               | VALUE              |
      | bankName          | Natwest            |
      | accountHolderName | Epic Adventure Inc |
      | sortCode          | 206705             |
      | accountNumber     | 86473611           |
    Then I should be on Repayment Contact Page
    When I select back link
    And I click on Continue button
    And I provide Repayment contact name as Repayment Contact Name
    When I provide Repayment contact email as repayment@email.com
    When I select option Yes and continue to next
    When I provide Repayment contact phone as 789765423
    Then I should be on Repayment CYA Page
    When I click change link for Repayment UK Bank Name
    When I enter UK Bank Account details as:
      | KEY               | VALUE                 |
      | bankName          | Natwest Change        |
      | accountHolderName | O'Connor Construction |
      | sortCode          | 609593                |
      | accountNumber     | 96863604              |
    When I click change link for Repayment UK Bank Method
    And I click on Continue button
    Then I should be on Repayment CYA Page
    And I select back link
    When I click Report Pillar 2 Top-up Taxes link
    Then I should navigate to Dashboard page
    And I click Sign out link

  @batch3
  Scenario: 5 - Organisation User navigates to repayment journey pages for UK bank account
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service
    Then I should be on Dashboard page
    When I click Request a repayment link
    Then I should navigate to Repayment Guidance Page
    When I click on Continue button
    Then I should navigate to Repayment Amount Page
    When I provide Refund Amount as 100.00
    Then I should navigate to Reason For Refund Page
    When I provide value for Refund Reason as A content designer works on the end-to-end journey of a service to help users complete their goal and government deliver a policy intent. Their work may involve the creation of, or change to, a transaction, product or single piece of content.
    And I click on Continue button
    Then I should navigate to Repayment Method Page
    And I select repayment method as UK bank account
    And I click on Continue button
    Then I should navigate to UK Bank Account Payment Page
    When I enter UK Bank Account details as:
      | KEY               | VALUE              |
      | bankName          | Natwest            |
      | accountHolderName | Epic Adventure Inc |
      | sortCode          | 206705             |
      | accountNumber     | 86473611           |
    Then I should be on Repayment Contact Page
    When I select back link
    Then I should navigate to UK Bank Account Payment Page
    And I click on Continue button
    And I provide Repayment contact name as Repayment Contact Name
    When I provide Repayment contact email as repayment@email.com
    When I select option Yes and continue to next
    When I provide Repayment contact phone as 789765423
    Then I should be on Repayment CYA Page
    When I click change link for Repayment UK Bank Name
    When I enter UK Bank Account details as:
      | KEY               | VALUE                 |
      | bankName          | Natwest Change        |
      | accountHolderName | O'Connor Construction |
      | sortCode          | 609593                |
      | accountNumber     | 96863604              |
    When I click change link for Repayment UK Bank Method
    When I select repayment method as Non-UK bank account
    When I enter Non UK Bank Account details as:
      | KEY               | VALUE                  |
      | bankName          | HSBC                   |
      | nameOnBankAccount | Test Name              |
      | bic               | HBUKGB4C               |
      | iban              | GB29NWBK60161331926820 |

  @batch3
  Scenario: 6 - Organisation User navigates to error page when repayment submission API fails to submit data to ETMP
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service
    Then I should be on Dashboard page
    When I click Request a repayment link
    Then I should navigate to Repayment Guidance Page
    When I click on Continue button
    Then I should navigate to Repayment Amount Page
    When I provide Refund Amount as 100.00
    And I provide value for Refund Reason as Test Refund
    And I click on Continue button
    And I access Repayment CYA page
    Then I should be on Repayment CYA Page
    When I click Continue button
    Then I should be on Repayment Incomplete Error Page
    When I click Report Pillar 2 Top-up Taxes link
    Then I should navigate to Dashboard page
    When I click the browser back button
    Then I should be on Repayment Incomplete Error Page
    When I select back link
    Then I should be on Repayment CYA Page
    When I click Continue button
    Then I should be on Repayment Incomplete Error Page
    When I click go back and complete all the required answers link
    Then I should navigate to Repayment Guidance Page
    When I click on Continue button
    And I click on Continue button
    Then I should navigate to Reason For Refund Page

  @batch3
  Scenario: 7 - Agent User navigates to error page when repayment submission API fails to submit data to ETMP
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XMPLR0012345674
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    And I click on Continue button
    Then I should navigate to Dashboard page
    When I click Request a repayment link
    Then I should navigate to Repayment Guidance Page
    When I click on Continue button
    Then I should navigate to Repayment Amount Page
    When I provide Refund Amount as 100.00
    And I provide value for Refund Reason as Test Refund
    And I click on Continue button
    And I access Repayment CYA page
    Then I should be on Repayment CYA Page
    When I click Continue button
    Then I should be on Repayment Incomplete Error Page
    When I click Report Pillar 2 Top-up Taxes link
    Then I should navigate to Dashboard page
    When I click the browser back button
    Then I should be on Repayment Incomplete Error Page
    When I select back link
    Then I should be on Repayment CYA Page
    When I click Continue button
    Then I should be on Repayment Incomplete Error Page
    When I click go back and complete all the required answers link
    Then I should navigate to Repayment Guidance Page
    When I click on Continue button
    And I click on Continue button
    Then I should navigate to Reason For Refund Page

  @batch3
  Scenario: 8 - Organisation User navigates to journey recovery error page when they try to skip mandatory questions
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service
    Then I should be on Dashboard page
    When I click Request a repayment link
    Then I should navigate to Repayment Guidance Page
    When I click on Continue button
    When I provide Refund Amount as 100.00
    And I provide Refund Reason as Test Reason
    And I click on Continue button
    Then I should be on Repayment Method Page
    When I select repayment method as Non-UK bank account
    Then I should be on Non UK Bank Account Payment Page
    When I enter Non UK Bank Account details as:
      | KEY               | VALUE                  |
      | bankName          | HSBC                   |
      | nameOnBankAccount | Test Name              |
      | bic               | HBUKGB4B               |
      | iban              | GB29NWBK60161331926819 |
    Then I should be on Repayment Contact Page
    When I access Repayment contact email page
    Then I should be on Repayment Journey Recovery Error Page
    When I click Report Pillar 2 Top-up Taxes link
    Then I should navigate to Dashboard page
    When I click the browser back button
    Then I should be on Repayment Journey Recovery Error Page
    When I click Return to account homepage link
    Then I should navigate to Dashboard page

  @batch3
  Scenario: 9 - Agent User navigates to journey recovery error page when they try to skip mandatory questions
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XMPLR0012345674
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    And I click on Continue button
    Then I should navigate to Dashboard page
    When I click Request a repayment link
    Then I should navigate to Repayment Guidance Page
    When I click on Continue button
    When I provide Refund Amount as 100.00
    And I provide Refund Reason as Test Reason
    And I click on Continue button
    Then I should be on Repayment Method Page
    When I select repayment method as Non-UK bank account
    Then I should be on Non UK Bank Account Payment Page
    When I enter Non UK Bank Account details as:
      | KEY               | VALUE                  |
      | bankName          | HSBC                   |
      | nameOnBankAccount | Test Name              |
      | bic               | HBUKGB4B               |
      | iban              | GB29NWBK60161331926819 |
    Then I should be on Repayment Contact Page
    When I access Repayment contact email page
    Then I should be on Repayment Journey Recovery Error Page
    When I click Report Pillar 2 Top-up Taxes link
    Then I should navigate to Dashboard page
    When I click the browser back button
    Then I should be on Repayment Journey Recovery Error Page
    When I click Return to account homepage link
    Then I should navigate to Dashboard page