Feature: OrangeHRM Login Feature

  Scenario Outline: Validate Login feature with Correct Credentials
    Given user is on login page
    When user enter the correct username as <username> and password as <password>
    And user clicks on Submit button
    Then user should be able to logged in successfully

    Examples: 
      | username |  | password |
      | Admin    |  | admin123 |
      | test     |  | test124  |
