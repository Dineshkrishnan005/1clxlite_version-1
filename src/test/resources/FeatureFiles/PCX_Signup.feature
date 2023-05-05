Feature: 1clx signup testing
Scenario Outline: As a user i want to signup with my valid credentials
    Given I want enter signup section
    When I enter "<name>" , "<mailid>" and "<password>"
    Then I clicks the signup button for otp verification

    Examples: 
      | name  | mailid | password  |
      | SachinTesting | sachinanand584@gmail.com | Sachin@33 |
      |  |   |   |
      |123456|sachin@@gmail.com|12345678|
      |!@%^!!!|%@^@^@gmail.com|Sachin@1|
      
      
