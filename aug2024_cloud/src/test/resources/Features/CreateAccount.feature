Feature: Create Account

  Background:
    Given I am on the create account page

  Scenario: New user should be able to create account

    #Given I navigate to the login screen
    And I enter all mandatory information
    When I select the register button
    Then My account should be created successfully