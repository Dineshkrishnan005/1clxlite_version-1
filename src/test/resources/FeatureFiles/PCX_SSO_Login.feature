Feature: 1clxlite SSO Login testing

@Google
Scenario: Google sign in testing
    Given I want to enter 1clx site landing page
    When clicks the signin button
    When I clicks google icon and enters the signin with Google page
    And enters the mail id and clicks the next button
    And enters the password and clicks the next button
    
@Facebook
Scenario: Facebook sign in testing
    Given I clicks facebook icon and enters the signin with Fb page
    When enters the fb-mail id 
    And enters the fb-password 
    And i clicks the login button
    Then enters the PCX profile create section
    
@Twitter
Scenario: Twitter signin testing
    Given I clicks Twitter icon and enters the signin with Twitter page
    When enters the Twitter-mail id 
    And enters the Twitter-password 
    And i clicks the Signin button
    Then It should enters the PCX profile create section
