Feature: all login tests


  Scenario: to test the functionality of login button for valid input
    Given Login page is opned
    When I enter correct username and correct password
    And I click on login button
    Then I should be redirected to home page