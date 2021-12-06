Feature: Creating an Open Shift Functionality

  Background:
    Given User is on Scheduler Page

  Scenario: User should be able to create a shift
    Given User clicks on a specific time on shift board
    When User clicks on create a custom shift
    And User enters time "9a-5p" for shift
    And User enters for unpaid "0" break amount
    And User clicks on save button
    Then User verifies that OpenShift schedule is displayed
    And User deletes the openShift

  @wip
  Scenario: User should be able to create an open shift
    Given User clicks on a specific time on openShift board
    When User clicks on create a custom shift
    And User enters time "9a-5p" for shift
    And User enters for unpaid "0" break amount
    And User clicks on save and publish
    And User clicks on edit
    And User assigns it to an employee
    And User clicks on save and publish
    Then User verifies that OpenShift schedule is displayed
    And User deletes the openShift





