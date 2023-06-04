@tag
Feature: Check registration functionality

  Background: 
    Given I open create new account page

  @tag1
  Scenario Outline: Create new account with valid data
    When I input valid first name <firstName> , valid last name <lastName> , valid email <email> , valid password <password> , and valid confirm password <confirmPassword>
    And I click create an account
    Then I see homepage

    Examples: 
      | firstName | lastName | email              | password     | confirmPassword |
      | Lili      | Samantha | lilisama@gmail.com | Newaccount1. | Newaccount1.    |
