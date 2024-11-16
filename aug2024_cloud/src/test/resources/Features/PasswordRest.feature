Feature:Reset Password

  Scenario: Users should be able to reset forgotten password

    Given l am on the login page
    And l click on forget passowrd
    And l enter the correct email address
    When l click on the reset password button
    Then l should receive a message