Feature: all login tests

  Background: opening the browser first
    Given I open browser


  Scenario: to test the functionality of login button for valid input
    Given Login page is opned
    When I enter correct username and correct password
    And I click on login button
    Then I should be redirected to home page

    @billingLogin @forTestingBackground
    Scenario: to test the functionality of login button for billing page
      Given login page of billing is opened
      When I enter "admin" as username and "admin" as password on billing page
      And I click the login button on billing page
      Then I should be redirected to Dashboard

  @billingLogin @forTestingBackground
  Scenario: to test the functionality of login button for billing page
    Given login page of billing is opened
    When I enter "dsdsd" as username and "dsds" as password on billing page
    And I click the login button on billing page
    Then I should get error message

  @billingLogin @forTestingBackground
  Scenario: to test the functionality of login button for billing page
    Given login page of billing is opened
    When I enter " " as username and " " as password on billing page
    And I click the login button on billing page
    Then I should get another error message


    @userReg @forTestingBackground
    Scenario: to test the functionality of submit button for user registration page
      Given I am on user registration page
      When I enter below data
      | amol | ujagare | 898989 | amol@gmail.com |
      And I click on submit button
      Then data should be submitted

      @userDetails
      Scenario Outline: to test the user registration page
        Given I am on user details page
        When I enter <name> , <email> ,<phone>
        And I click on submit
        Then the form should be submitted

        Examples:
          | name     | email              | phone   |
          | monica   | monica@gmail.com   | 7988898 |
          | visha    | visha@gmail.com    | 434343  |
          | Gowthama | Gowthama@gmail.com | 43422   |
          | pooja    | pooja@gmail.com    | 988898  |
