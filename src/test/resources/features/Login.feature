Feature: Login Functionalities

  Background:
    Given User is on home page
    When User clicks on login

  @pos
  Scenario Outline: User should be able to login with valid credentials
    And User should be able to enter "<email>" and "<password>"
    And User should be able to click login button
    Then Title should be "When I Work :: Schedule, Track, Communicate"

    Examples:
      | email               | password   |
      | hanocal88@gmail.com | Test123456 |

  @neg
  Scenario Outline: User should NOT be able to login with invalid credentials
    And User should be able to enter invalid "<email>" and valid "<password>"
    And User should be able to click login button
    Then Login button should NOT be clickable

    Examples:
      | email              | password   |
      | hanocal88@gmail    | Test123456 |
      | hanocal88gmail.com | Test123456 |
      | hanocal88          | Test123456 |
      | !*%$#              | Test123456 |
      |                    | Test123456 |

  @neg
  Scenario Outline: User should NOT be able to login with invalid credentials
    And User should be able to enter valid "<email>" and invalid "<password>"
    And User should be able to click login button
    Then "Incorrect username and/or password. Please try again." should be displayed


    Examples:
      | email               | password   |
      | hanocal88@gmail.com | Test       |
      | hanocal88@gmail.com | 123456     |
      | hanocal88@gmail.com | test123456 |

    @neg
  Scenario Outline: User should NOT be able to login with invalid credentials
    And User should be able to enter invalid "<email>" and invalid "<password>"
    And User should be able to click login button
    Then Login button should NOT be clickable

    Examples:
      | email           | password |
      | hanocal88@gmail | Test     |
      | hanocal88       | 123456   |
      |                 |          |
