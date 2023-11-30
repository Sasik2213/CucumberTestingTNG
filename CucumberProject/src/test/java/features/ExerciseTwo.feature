Feature: Performing LoginCredentials with Valid and Invalid Operations

  Scenario: performing Login Page Functionalities
    Given test the Login functionality with empty input fields
    When user enters with correct username and wrong password
    When user enter both correct details of username and password
    When user click Login
    Then user closes the browser
