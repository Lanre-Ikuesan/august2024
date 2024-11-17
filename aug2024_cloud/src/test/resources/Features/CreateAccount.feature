Feature: Create Account

  Scenario: New user should be able to create account

    Given I am on the create account page
    And I enter all mandatory information
    When I select the register button
    Then My account should be created successfully