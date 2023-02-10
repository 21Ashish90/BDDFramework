Feature: OrangeHRM Login Feature

  Scenario: Validate Login feature with Correct Credentials
    Given user is on login page
    When user enter the correct username
    And user enter the correct password
    And user clicks on Submit button
    Then user should be able to logged in successfully

  Scenario: Validate forgot password link
    Given user is on login page
    When user clicks on Forgot your password? link
    Then user should be redirected to Reset Password page
    