@tests
Feature: Create a new subscription
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
    And The Heading should be Your group is already registered
    And The Body content should be You will need to contact your administrator to give you access.
    And The Body content should be You can email pillar2mailbox@hmrc.gov.uk if you are having problems accessing the service.

  Scenario: 2 - User redirected to a placeholder error page, for a duplicate subscription on UPE No ID flow,NFM GRS flow path.
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
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option Yes and continue to next
    Then I should be on NFM entity type page
    When I select option UK limited company and continue to GRS page
    Then I should navigate to NFM UKCompany GRS page
    When I registered successfully with BV enabled
    And I click on Save&Continue button
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
    And The Heading should be Your group is already registered
    And The Body content should be You will need to contact your administrator to give you access.
    And The Body content should be You can email pillar2mailbox@hmrc.gov.uk if you are having problems accessing the service.

  Scenario: 3 - User redirected to a placeholder error page, for a duplicate subscription on UPE No ID flow,NFM NO flow ID path.
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
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option No and continue to next
    Then I should navigate to NFM Name page
    When I enter NFM name as Test CYA
    And I enter Address Line 1 as Address Line 1 CYA
    And I enter City as City CYA
    And I enter Postal Code as EH5 5WY
    And I enter Country as United Kingdom
    And I click on Country selected
    When I click on Continue button
    Then I should navigate to NFM Contact Name page
    When I enter NFM Contact name as Contact CYA
    And I click on Continue button
    Then I should navigate to NFM Contact Email page
    When I enter NFM Contact Email as testcya@email.com
    And I click on Continue button
    Then I should navigate to NFM Telephone page
    When I select option Yes and continue to next
    Then I should navigate to input nfm telephone page
    When I enter NFM Telephone Number as 1234569
    And I click on Continue button
    Then I should navigate to NFM Check your answers page
    When I click on Continue button
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
    And The Heading should be Your group is already registered
    And The Body content should be You will need to contact your administrator to give you access.
    And The Body content should be You can email pillar2mailbox@hmrc.gov.uk if you are having problems accessing the service.
  @zap_accessibility
  Scenario: 4 - User redirected to a placeholder error page, for a Registration with NO ID path.
    Given Organisation User logs in to subscribe for Pillar2
    Then I should be on Task list page
    When I click Add ultimate parent’s details link
    Then I should navigate to Initial guidance Page
    When I click on Continue button
    Then I should navigate to UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    And I enter UPE name as regNoIDInvalidSubmission
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
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option No and continue to next
    Then I should navigate to NFM Name page
    When I enter NFM name as Test CYA
    And I enter Address Line 1 as Address Line 1 CYA
    And I enter City as City CYA
    And I enter Postal Code as EH5 5WY
    And I enter Country as United Kingdom
    And I click on Country selected
    When I click on Continue button
    Then I should navigate to NFM Contact Name page
    When I enter NFM Contact name as Contact CYA
    And I click on Continue button
    Then I should navigate to NFM Contact Email page
    When I enter NFM Contact Email as testcya@email.com
    And I click on Continue button
    Then I should navigate to NFM Telephone page
    When I select option Yes and continue to next
    Then I should navigate to input nfm telephone page
    When I enter NFM Telephone Number as 1234569
    And I click on Continue button
    Then I should navigate to NFM Check your answers page
    When I click on Continue button
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
    Then I should navigate to Create Subscription Error page
    And The Heading should be Sorry, there is a problem with the service
    And The Body content should be You must still register, please try again later.
    And The Body content should be We saved your answers. They will be available for 28 days.
    And I should see Return to registration to try again link
#    When I click Return to registration to try again link
#    Then I should navigate to Task list page

  Scenario: 5 - User redirected to a placeholder error page, for a Create subscription with invalid payload.
    Given Organisation User logs in to subscribe for Pillar2
    Then I should be on Task list page
    When I click Add ultimate parent’s details link
    Then I should navigate to Initial guidance Page
    When I click on Continue button
    Then I should navigate to UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    And I enter UPE name as subInvalidRequest
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
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option No and continue to next
    Then I should navigate to NFM Name page
    When I enter NFM name as Test CYA
    And I enter Address Line 1 as Address Line 1 CYA
    And I enter City as City CYA
    And I enter Postal Code as EH5 5WY
    And I enter Country as United Kingdom
    And I click on Country selected
    When I click on Continue button
    Then I should navigate to NFM Contact Name page
    When I enter NFM Contact name as Contact CYA
    And I click on Continue button
    Then I should navigate to NFM Contact Email page
    When I enter NFM Contact Email as testcya@email.com
    And I click on Continue button
    Then I should navigate to NFM Telephone page
    When I select option Yes and continue to next
    Then I should navigate to input nfm telephone page
    When I enter NFM Telephone Number as 1234569
    And I click on Continue button
    Then I should navigate to NFM Check your answers page
    When I click on Continue button
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
    Then I should navigate to Create Subscription Error page
    And The Heading should be Sorry, there is a problem with the service
    And The Body content should be You must still register, please try again later.
    And The Body content should be We saved your answers. They will be available for 28 days.
    And I should see Return to registration to try again link

  Scenario: 6 - User redirected to a placeholder error page, for a Create subscription request not processed.
    Given Organisation User logs in to subscribe for Pillar2
    Then I should be on Task list page
    When I click Add ultimate parent’s details link
    Then I should navigate to Initial guidance Page
    When I click on Continue button
    Then I should navigate to UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    And I enter UPE name as subReqNotProcessed
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
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option No and continue to next
    Then I should navigate to NFM Name page
    When I enter NFM name as Test CYA
    And I enter Address Line 1 as Address Line 1 CYA
    And I enter City as City CYA
    And I enter Postal Code as EH5 5WY
    And I enter Country as United Kingdom
    And I click on Country selected
    When I click on Continue button
    Then I should navigate to NFM Contact Name page
    When I enter NFM Contact name as Contact CYA
    And I click on Continue button
    Then I should navigate to NFM Contact Email page
    When I enter NFM Contact Email as testcya@email.com
    And I click on Continue button
    Then I should navigate to NFM Telephone page
    When I select option Yes and continue to next
    Then I should navigate to input nfm telephone page
    When I enter NFM Telephone Number as 1234569
    And I click on Continue button
    Then I should navigate to NFM Check your answers page
    When I click on Continue button
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
    Then I should navigate to Create Subscription Error page
    And The Heading should be Sorry, there is a problem with the service
    And The Body content should be You must still register, please try again later.
    And The Body content should be We saved your answers. They will be available for 28 days.
    And I should see Return to registration to try again link

  Scenario: 7 - User redirected to a placeholder error page, when server is unavailable.
    Given Organisation User logs in to subscribe for Pillar2
    Then I should be on Task list page
    When I click Add ultimate parent’s details link
    Then I should navigate to Initial guidance Page
    When I click on Continue button
    Then I should navigate to UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    And I enter UPE name as subServerError
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
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option No and continue to next
    Then I should navigate to NFM Name page
    When I enter NFM name as Test CYA
    And I enter Address Line 1 as Address Line 1 CYA
    And I enter City as City CYA
    And I enter Postal Code as EH5 5WY
    And I enter Country as United Kingdom
    And I click on Country selected
    When I click on Continue button
    Then I should navigate to NFM Contact Name page
    When I enter NFM Contact name as Contact CYA
    And I click on Continue button
    Then I should navigate to NFM Contact Email page
    When I enter NFM Contact Email as testcya@email.com
    And I click on Continue button
    Then I should navigate to NFM Telephone page
    When I select option Yes and continue to next
    Then I should navigate to input nfm telephone page
    When I enter NFM Telephone Number as 1234569
    And I click on Continue button
    Then I should navigate to NFM Check your answers page
    When I click on Continue button
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
    Then I should navigate to Create Subscription Error page
    And The Heading should be Sorry, there is a problem with the service
    And The Body content should be You must still register, please try again later.
    And The Body content should be We saved your answers. They will be available for 28 days.
    And I should see Return to registration to try again link

  Scenario: 8 - User redirected to a placeholder error page, when details not found for a create subscription request.
    Given Organisation User logs in to subscribe for Pillar2
    Then I should be on Task list page
    When I click Add ultimate parent’s details link
    Then I should navigate to Initial guidance Page
    When I click on Continue button
    Then I should navigate to UPE business page
    When I select option No and continue to next
    Then I should navigate to input-upe-name page
    And I enter UPE name as subRecordNotFound
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
    When I select Yes option and continue to next
    Then I should navigate to NFM details page
    When I select option No and continue to next
    Then I should navigate to NFM Name page
    When I enter NFM name as Test CYA
    And I enter Address Line 1 as Address Line 1 CYA
    And I enter City as City CYA
    And I enter Postal Code as EH5 5WY
    And I enter Country as United Kingdom
    And I click on Country selected
    When I click on Continue button
    Then I should navigate to NFM Contact Name page
    When I enter NFM Contact name as Contact CYA
    And I click on Continue button
    Then I should navigate to NFM Contact Email page
    When I enter NFM Contact Email as testcya@email.com
    And I click on Continue button
    Then I should navigate to NFM Telephone page
    When I select option Yes and continue to next
    Then I should navigate to input nfm telephone page
    When I enter NFM Telephone Number as 1234569
    And I click on Continue button
    Then I should navigate to NFM Check your answers page
    When I click on Continue button
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
    Then I should navigate to Create Subscription Error page
    And The Heading should be Sorry, there is a problem with the service
    And The Body content should be You must still register, please try again later.
    And The Body content should be We saved your answers. They will be available for 28 days.
    And I should see Return to registration to try again link
