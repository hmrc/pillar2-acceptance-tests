@tests
Feature: Duplicate Subscription Error
  As an user
  I want to create a new subscription

  @zap_accessibility
  Scenario: 1 - User redirected to a placeholder error page, for a duplicate subscription on UPE No ID flow,UPE as DFM path.
    Given Organisation User logs in to subscribe for Pillar2
    Then I should be on Task list page
    When I click Add ultimate parent’s details link
    Then I should navigate to Initial guidance Page
    When I click on Continue button
    Then I should navigate to UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    And I enter UPE name as XMPLR0009999999
    Then I should navigate to input-upe-address page
    When I enter Address Line 1 as Test Address Line 1
    And I enter City as Test City
    And I enter Postal Code as EH5 5WY
    And I enter Country as United Kingdom
    And I click on Country selected
    And I click on Continue button
    Then I should navigate to UPE Contact person/team Name page
    When I enter UPE Person/Team name as UPE Contact Name
    And I click on Continue button
    Then I should navigate to UPE Contact Email page
    When I enter UPE Email address as testteam@email.com
    And I click on Continue button
    Then I should navigate to UPE Telephone page
    When I select option No and continue to next
    Then I should be on Check your answers page
    And I click on Continue button
    When I click Add filing member’s details link
    Then I should navigate to NFM registration page
    When I select No option and continue to next
    Then I should navigate to Task list page
    When I click Add further group details link
    Then I should navigate to MNE or domestic page
    When I select option In the UK and other countries in further details group status page
    And I click on Continue button
    Then I should navigate to Group accounting period page
    When Accounting Period Start Day is entered as 15
    And Accounting Period Start Month is entered as 1
    And Accounting Period Start Year is entered as 2024
    When Accounting Period End Day is entered as 15
    And Accounting Period End Month is entered as 1
    And Accounting Period End Year is entered as 2025
    And I click on Continue button
    Then I should navigate to FD check your answers page
    And I click on Continue button
    Then I should navigate to Task list page
    When I click Add Contact details link
    Then I should navigate to Contact details guidance page
    When I click on Continue button
    Then I should navigate to Contact details display page
    When I select option Yes and continue to next
    Then I should navigate to Second Contact details page
    When I select option No and continue to next
    Then I should navigate to Contact address input page
    When I enter Address Line 1 as Address Line 1 Contact
    And I enter Address Line 2 as Address Line 2 Contact
    And I enter City as City Contact
    And I enter Region as Region Contact
    And I enter Postal Code as EH5 5WY
    And I enter Country as United Kingdom
    And I click on Country selected
    When I click on Continue button
    Then I should navigate to Contact details Check answers page
    When I click on Continue button
    Then I should navigate to Task list page
    And The Task Edit contact details status should be Completed
    And The Task Check your answers status should be Not started
    When I click Check your answers link
    Then I should navigate to Review answers page
    And I click on Save&Continue button
    Then I should navigate to duplicate ack ref error page
    And The Heading should be Your group has already registered to report Pillar 2 top-up taxes
    And The Body content should be You can find your group's Pillar 2 top-up taxes ID within your business tax account.
    And The Body content should be If you need to request access to this account, your administrator can give you access using 'Manage account' settings within their business tax account.