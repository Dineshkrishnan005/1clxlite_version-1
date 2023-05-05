Feature: 1clx ECX signup testing
Scenario Outline: As a  ECX user i want to signup with my valid credentials
    Given user want enter signup section
    When user enter "<ECXusername>" , "<ECXmailid>" and "<ECXpassword>"
    Then user clicks the create account button for otp verification

    Examples: 
      | ECXusername  | ECXmailid | ECXpassword  |
      | Testing | sachin33.theinfinityhub@gmail.com | Sachin@33 |
      |  |   |   |
      |123456|sachin12@gmmail.com|12345678|
      |!@%^!!!|%@^@^@gmail.com|Sachin@1|
      |Testing|kikib34759@saeoil.com|1234567890|