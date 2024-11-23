Feature: Login

  Background:
    Given I am on the login page

  Scenario: Users with valid credentials should be able to login

    When I enter the correct username
    And I enter the correct password
    When I click login button
    Then I should be logged in successfully