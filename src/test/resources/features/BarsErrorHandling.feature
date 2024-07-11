@tests @batch3
Feature: Bars Handling
  As a registered and subscribed user
  I should be able to navigate to Contact page after correct UK bank details

  @zap_accessibility
  Scenario: 1 - Organisation User bars integration validation
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345676 for Pillar2 service
    Then I should be on Dashboard page
    When I click Request a refund link
    When I click on Continue button
    When I provide Refund Amount as 100.00
    And I click on Continue button
    Then I should be on Reason For Refund Page
    When I provide value for Refund Reason as Bars Integration Test
    And I click on Continue button
    Then I should navigate to Repayment Method Page
    And I select repayment method as UK bank account
    And I click on Continue button
    And I provide value for UK Bank Name as Test
    And I provide value for UK Account Name as Sanguine Skincare
    And I provide value for Sort Code as 206705
    And I provide value for UK Account number as 86563612
    And I click on Continue button
    Then I should see bank account error message Enter the account number as it appears on your bank statement on the UK Account Number Element
    And I provide value for UK Bank Name as Test
    And I provide value for UK Account Name as Security Engima
    And I provide value for Sort Code as 207106
    And I provide value for UK Account number as 86473611
    And I click on Continue button
    Then I should see bank account error message Enter the sort code as it appears on your bank statement on the UK Sort Code Element
    And I provide value for UK Bank Name as Test
    And I provide value for UK Account Name as Lambent Illumination
    And I provide value for Sort Code as 207102
    And I provide value for UK Account number as 86563611
    And I click on Continue button
    Then I should see bank account error message Enter the name on the account as it appears on your bank statement on the UK Account Name Element
    And I provide value for UK Bank Name as Test
    And I provide value for UK Account Name as Eco Focus
    And I provide value for Sort Code as 206705
    And I provide value for UK Account number as 56945688
    And I click on Continue button
    Then I should be on Repayment Could Not Confirm Error Page
    When I click return to your bank details and try again link
    Then I should be on UK Bank Account Payment Page
    And I provide value for UK Bank Name as Test
    And I provide value for UK Account Name as Innovation Arch
    And I provide value for Sort Code as 206705
    And I provide value for UK Account number as 56523611
    And I click on Continue button
    Then I should be on Repayment Bank Details Error Page
    When I click try again with a different business bank account link
    Then I should be on UK Bank Account Payment Page
    And I provide value for UK Bank Name as Test
    And I provide value for UK Account Name as Flux Water Gear
    And I provide value for Sort Code as 207102
    And I provide value for UK Account number as 86473611
    And I click on Continue button
    Then I should be on Repayment Bars Error Page
    When I click Return to your account homepage link
    Then I should be on Dashboard page
    When I access UK payment page
    And I provide value for UK Bank Name as Test
    And I provide value for UK Account Name as Epic
    And I provide value for Sort Code as 206705
    And I provide value for UK Account number as 86473611
    And I click on Continue button
    Then I should be on Repayment Partial Name Error Page
    When I select option Yes on partial name error page
    And I click on Continue button
    Then I should be on Repayment Contact Page
    When I select back link
    And I select option No on partial name error page
    And I click on Continue button
    Then I should be on UK Bank Account Payment Page

  Scenario: 2 - Agent User bars integration validation
    Given Agent User logs in with existing entity group HMRC-AS-AGENT, AgentReference and 1234 for Pillar2 service
    And I add delegated enrolment with HMRC-PILLAR2-ORG, PLRID, XMPLR0012345674 and pillar2-auth for Pillar2 service
    Then I should be on ASA Pillar2 Input Page
    And I provide ASA Pillar2 ID as XMPLR0012345674
    And I click on Continue button
    Then I should navigate to ASA Confirmation Page
    And I click on Continue button
    Then I should navigate to ASA Dashboard page
    When I click Request a refund link
    When I click on Continue button
    When I provide Refund Amount as 100.00
    And I click on Continue button
    Then I should be on Agent Repayment Reason Page
    When I provide value for Refund Reason as Bars Integration Test
    And I click on Continue button
    Then I should navigate to Agent Repayment Method Page
    And I select repayment method as UK bank account
    And I click on Continue button
    And I provide value for UK Bank Name as Test
    And I provide value for UK Account Name as Eco Focus
    And I provide value for Sort Code as 206705
    And I provide value for UK Account number as 56945688
    And I click on Continue button
    Then I should be on Repayment Could Not Confirm Error Page
    When I click return to your bank details and try again link
    Then I should be on UK Bank Account Payment Page
    And I provide value for UK Bank Name as Test
    And I provide value for UK Account Name as Innovation Arch
    And I provide value for Sort Code as 206705
    And I provide value for UK Account number as 56523611
    And I click on Continue button
    Then I should be on Repayment Bank Details Error Page
    When I click try again with a different business bank account link
    Then I should be on UK Bank Account Payment Page
    And I provide value for UK Bank Name as Test
    And I provide value for UK Account Name as Flux Water Gear
    And I provide value for Sort Code as 207102
    And I provide value for UK Account number as 86473611
    And I click on Continue button
    Then I should be on Repayment Bars Error Page
    When I click Return to your account homepage link
    Then I should be on ASA Dashboard page
    When I click the browser back button
    When I select back link
    And I provide value for UK Bank Name as Test
    And I provide value for UK Account Name as Epic
    And I provide value for Sort Code as 206705
    And I provide value for UK Account number as 86473611
    And I click on Continue button
    Then I should be on Repayment Partial Name Error Page
    When I select option Yes on partial name error page
    And I click on Continue button
    Then I should be on Repayment Contact Page
    When I select back link
    And I select option No on partial name error page
    And I click on Continue button
    Then I should be on UK Bank Account Payment Page
