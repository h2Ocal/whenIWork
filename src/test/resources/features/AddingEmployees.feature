Feature: Adding Employees on Employee Page

  Background:
    Given User is on Employee Page

  Scenario: User should be able to add Employee on Employee Page
    Given User clicks on continue button
    And User clicks on addEmployee button
    And User enters enters valid credentials
      | first_name   | TestFirstName     |
      | last_name    | TestLastName      |
      | email        | Test111@gmail.com |
      | phone_number | 12345678999       |
    And user clicks on submit button
    Then Employee first name "TestFirstName" and last name "TestLastName" should be displayed


