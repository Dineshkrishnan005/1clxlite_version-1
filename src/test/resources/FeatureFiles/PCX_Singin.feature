
Feature: 1clx SignIn feature for PCX User
  Scenario Outline: PCX Signin testing
    Given  the user enters the signin page
    When the user enters the "<mailid>" and "<password>"
    And the user clicks the login button
    Then user enters the pcx dashboard or displaying the results depends on their credentials

    Examples: 
      | mailid  | password |
      | sachinanand584@gmail.com | Sachin@11 |
      |     |     |
      |sachinanand584@gmail.com|12345678|
      |sachin@gmail.com|Sachin@11|
      |sachithanandhansp2533@gmail.com|Sachin@00|
