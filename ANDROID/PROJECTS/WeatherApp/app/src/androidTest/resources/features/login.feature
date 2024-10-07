Feature: User login

  Scenario: User successfully logs in with valid credentials
    Given the user is on the login screen
    When the user enters valid username and password
    And the user taps the login button
    Then the user should see the home screen
