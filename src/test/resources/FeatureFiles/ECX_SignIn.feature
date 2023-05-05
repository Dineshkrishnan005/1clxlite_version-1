Feature: 1clx signin feature for ECX User
  
  Scenario Outline: ECX Signin Testing
    Given the user enters the ECX Signin page
    When the user enters the credentials like "<userid>" and "<passid>"
    And the user clicks the ECX Login button
    Then the user enters the ECX Dashboard

    Examples: 
      | userid  | passid | 
      | sachithanandhansp2533@gmail.com|Sachin@00|
      |      |      |
      | sachinanand584@gmail.com |Sachin@11|
      |sachithanandhansp2533@gmail.com|12345678|
      |sachin@gmail.com|Sachin@00|
