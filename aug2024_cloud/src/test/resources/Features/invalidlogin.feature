Feature: Login

  Background:
    Given I navigate to the login page

  Scenario Outline: Users with incorrect credentials should be unsuccessful


    When I type in my "<username>"
    And I provide my "<Password>"
    When attempt to log in
    Then I should see the correct "<errorMessage>"

    Examples:

      |  username                   | Password                |   errorMessage                                                                                                  |
      |  mabadejeoluseun@yahoo.com  | Auguta2024              |   The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.   |
      |  mabadejeluseun@yahoo.com   | Augu5t2024              |   The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.   |
      |  mabadejeeluseun@yahoo.com  | Augut2024               |   The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.   |
