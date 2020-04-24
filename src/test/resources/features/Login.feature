@login
Feature: Login
  Scenario: User Login
    Given user is on the login page
    When user enters credentials
    Then user verifies header as Web Orders