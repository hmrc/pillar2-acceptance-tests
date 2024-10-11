@tests
Feature: RFM Start page
  As a New Filing member
  I want to access start page of Replace Filing Member(RFM) journey

  @zap_accessibility @batch3
  Scenario: 1 - Verify Individual RFM KB page
    Given I access RFM start page
    Then I should be on RFM start page
    And I click on Continue button
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
    When I click Find out more about who can use this service link
    Then I should be on RFM start page
    When I select back link
    Then I should be on Individual RFM KB Page
    When I select back link
    Then I should be on auth-login page

  @zap_accessibility @batch3
  Scenario: 2 - Verify Agent RFM KB page
    Given Agent User logs in with rfm URL to Pillar2
    Then I should be on Agent RFM KB Page
    And The Heading should be Sorry, you’re unable to use this service
    And The Body content should be You’ve signed in using an agent’s Government Gateway user ID.
    And The Body content should be Agents cannot use this service to replace a nominated filing member.
    And The Body content should be Someone with an administrator’s Government Gateway user ID who is the new nominated filing member will need to replace the current filing member.
    When I click Find out more about who can use this service link
    Then I should be on RFM start page
    When I select back link
    Then I should be on Agent RFM KB Page
    When I select back link
    Then I should be on auth-login page

  @zap_accessibility @batch3
  Scenario: 3 - Verify Organisation Assistant User RFM KB page
    Given Assistant User logs in with rfm URL to Pillar2
    Then I should be on Assistant User RFM KB Page
    And The Heading should be Sorry, you’re unable to use this service
    And The Body content should be You’ve signed in with a standard organisation account.
    And The Body content should be Only Government Gateway accounts with an administrator role can replace their nominated filing member.
    When I click Find out more about who can use this service link
    Then I should be on RFM start page
    When I select back link
    Then I should be on Assistant User RFM KB Page
    When I select back link
    Then I should be on auth-login page

  @zap_accessibility @batch3
  Scenario: 4 - Verify already enrolled Organisation User KB page
    Given Organisation User logs in with existing entity group HMRC-PILLAR2-ORG, PLRID and XMPLR0012345674 with rfm URL to Pillar2 service
    Then I should be on Duplicate RFM KB Page
    And The Heading should be You cannot replace the current filing member for this group
    And The Body content should be The Government Gateway user ID you entered as the replacement is currently registered as the nominated filing member for this group.
    And The Body content should be To replace the nominated filing member for this group, the new nominated filing member will need to try again with their Government Gateway user ID.
    When I click Find out more about who can use this service link
    Then I should be on RFM start page
    When I select back link
    Then I should be on Duplicate RFM KB Page
    When I select back link
    Then I should be on auth-login page

  @zap_accessibility @batch3
  Scenario: 5 - Verify existing FM (with same group id) trying to access RFM journey and getting redirected to KB page
    Given I clear the cache
    Given Organisation User logs in as upe for Pillar2
    And I access RFM start page
    And I click on Continue button
    Then I should be on RFM enter pillar2 id page
    When I provide RFM pillar2 id as XEPLR0444444400
    Then I should be on RFM Existing Member KB Page
    When I select back link
    Then I should be on RFM enter pillar2 id page
    And I click on Continue button
    And I click go to your business tax account link
    When I click the browser back button
    And I click Sign out link

  @batch2 @tests1
  Scenario: 6 - Verify RFM start page and error validations on Enter pillar2 ID and Registration date page
    Given I clear the cache
    Given Organisation User logs in as upe for Pillar2
    And I access RFM start page
    And I click on Continue button
    Then I should be on RFM enter pillar2 id page
    And I click on Continue button
    Then I should see an error message Enter the group’s Pillar 2 top-up taxes ID on the RFM enter pillar2 id Page
    When I provide RFM pillar2 id as AXMPLR0123456785
    And I click on Continue button
    Then I should see an error message Pillar 2 top-up taxes ID must be 15 characters on the RFM enter pillar2 id Page
    When I provide RFM pillar2 id as a0000000909090
    And I click on Continue button
    Then I should see an error message Pillar 2 top-up taxes ID must be 15 characters on the RFM enter pillar2 id Page
    When I provide RFM pillar2 id as 0MPLR0123456789
    And I click on Continue button
    Then I should see an error message Enter the group’s Pillar 2 top-up taxes ID in the correct format on the RFM enter pillar2 id Page
    When I provide RFM pillar2 id as XMplr0123456789
    And I click on Continue button
    Then I should be on RFM Registration Date Page
    And I click on Continue button
    Then I should see an error message Enter the registration date to the Report Pillar 2 top-up taxes service on the RFM Registration Date Page
    When Registration Day is entered as 15
    And I click on Continue button
    Then I should see an error message Registration date must include a month and year on the RFM Registration Date Page
    When I refresh the page
    And Registration Month is entered as 1
    And I click on Continue button
    Then I should see an error message Registration date must include a day and year on the RFM Registration Date Page
    When I refresh the page
    And Registration Year is entered as 2024
    And I click on Continue button
    Then I should see an error message Registration date must include a day and month on the RFM Registration Date Page
    When I refresh the page
    When Registration Day is entered as 15
    And Registration Month is entered as 1
    And I click on Continue button
    Then I should see an error message Registration date must include a year on the RFM Registration Date Page
    When I refresh the page
    When Registration Day is entered as 15
    And Registration Year is entered as 2024
    And I click on Continue button
    Then I should see an error message Registration date must include a month on the RFM Registration Date Page
    When I refresh the page
    When Registration Month is entered as 1
    And Registration Year is entered as 2024
    And I click on Continue button
    Then I should see an error message Registration date must include a day on the RFM Registration Date Page
    When I refresh the page
    When Registration Day is entered as 0
    When Registration Month is entered as 0
    And Registration Year is entered as 2024
    And I click on Continue button
    Then I should see an error message Registration date must be a real date on the RFM Registration Date Page
    When I refresh the page
    When Registration Day is entered as 1
    When Registration Month is entered as aa
    And Registration Year is entered as y2024
    And I click on Continue button
    Then I should see an error message Registration date must be a real date on the RFM Registration Date Page
    When I refresh the page
    When Registration Day is entered as aa
    When Registration Month is entered as m3
    And Registration Year is entered as y2024
    And I click on Continue button
    Then I should see an error message Registration date must be a real date on the RFM Registration Date Page
    When I refresh the page
    When Registration Day is entered as 1
    When Registration Month is entered as aa
    And Registration Year is entered as y2024
    And I click on Continue button
    Then I should see an error message Registration date must be a real date on the RFM Registration Date Page
    When I refresh the page
    When Registration Day is entered as 32
    When Registration Month is entered as 11
    And Registration Year is entered as 2024
    And I click on Continue button
    Then I should see an error message Registration date must be a real date on the RFM Registration Date Page
    When I refresh the page
    When Registration Day is entered as 10
    When Registration Month is entered as 13
    And Registration Year is entered as 2024
    And I click on Continue button
    Then I should see an error message Registration date must be a real date on the RFM Registration Date Page
    When I refresh the page
    When Registration Day is entered as 10
    When Registration Month is entered as 10
    And Registration Year is entered as 20244
    And I click on Continue button
    Then I should see an error message Registration date must be a real date on the RFM Registration Date Page
    When I refresh the page
    When Registration Day is entered as 10
    When Registration Month is entered as 10
    And Registration Year is entered as 2025
    And I click on Continue button
    Then I should see an error message Registration date must be in the past on the RFM Registration Date Page
    When I refresh the page
    When Registration Day is entered as 10
    When Registration Month is entered as 10
    And Registration Year is entered as 2023
    And I click on Continue button
    Then I should see an error message Registration date must be on or after 31 December 2023 on the RFM Registration Date Page
    When I refresh the page
