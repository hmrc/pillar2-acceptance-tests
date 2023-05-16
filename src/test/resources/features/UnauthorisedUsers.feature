@tests @zap_accessibility
Feature: Unauthorised user should go to You can’t access page

  Scenario: 1 - Individual login
    Given Individual User logs in to register for Pillar2
    Then The Heading should be You can’t access this service with this account