Feature: Login
  Scenario: Failed login wrong username
    Given access url
    When input wrong username
    When input password
    When click login
    Then validate wrong username

  Scenario: Failed login wrong password
    Given input username
    When input wrong password
    When click login1
    Then validate wrong password

  Scenario: Valid login
    Given input username1
    When input password1
    When click login2
    Then validate valid login