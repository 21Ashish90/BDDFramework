Feature: OrangeHRM Login Feature

  Scenario: Validate Login feature with Correct Credentials
    Given user is on login page
    When user enter the correct username as "Admin"
    And user enter the correct password as "admin123"
    And user clicks on Submit button
    Then user should be able to logged in successfully