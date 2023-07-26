Feature: SuccessFull login.

  Scenario Outline: Successful Login
    Given that I am on the login page
    When I enter my valid <usuario> and <contrasenia>
    And click on the login button
    Then I see a message or redirection confirming that the login has been successful.

    Examples:
      | usuario     | contrasenia |
      | Alejandro12 | 2163500aA   |
      | Alejandro   | 2163500aA   |
      | Alejandro12 | 2163500a    |