Feature: Entering new user registration.

  Scenario: User Registration
    Given that I am on the registration page
    When I enter the data requested by the form
    Then it shows me a successful registration.
