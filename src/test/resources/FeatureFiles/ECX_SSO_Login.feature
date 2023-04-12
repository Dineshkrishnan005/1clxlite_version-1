Feature: 1clx site SSO Login for ECX

@Google
Scenario: Google signin for Ecx
Given the enters the Google signin page
When user enters their credentials
Then User sees the results depends on their credentils

@Facebook
Scenario: Fb Sigin for Ecx
Given the user enters the Fb-Signin page
When user enters their valid credentials
Then Users should click login button for signin

@Twitter
Scenario: Twitter Signin for Ecx
Given the User enters the Twitter-Sigin page
When the user enters credentials 
Then User should click signin button for entering account dashboard