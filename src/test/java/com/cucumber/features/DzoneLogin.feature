Feature: Dzone login

  Scenario: login without username and password
    Given user is on dzone homepage
    When user clicks on Sign in button
    Then user is displayed login screen
    When user clicks on login button