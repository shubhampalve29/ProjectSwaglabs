Feature: Login Feature

  Scenario: Successful login with valid credentials
    Given user is on login page
    And user enters valid credentials
    Then user is navigated to the home page
