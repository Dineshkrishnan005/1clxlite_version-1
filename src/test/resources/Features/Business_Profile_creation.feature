Feature: To create Business Profile

Scenario: Business profile
Given Successful Login with Valid entries and navigate to Business Profile
When User able to click the checkbox for Service or product
And User able to enter the Business Name
And User able to enter the Multiple category of Business
Then Click the next button

Scenario: Location & Contact Info
Given User able to enter the Street Name 
When User able to enter the city name 
And User able to enter the state 
And User able to enter the country 
And user able to enter the pincode 
And user able to enter the PhoneNumber 
And user able to enter the Whatsapp No  
Then User able to click the next button

Scenario: ADD BUSINESS DESCRIPTION
When User able to fill the Business Page Description
And User able to enter the Email Id
And User able to enter the Existing Website
Then user able click the next button

Scenario: ADD PHOTOS OF YOUR BUSINESS
When User able to upload the Logo Image
And User able to upload the Header Image 
Then user able to click Next Button

Scenario: EASILY IN MINUTES
When User able to enter the Publish button
Then user able to click the DashBoard button




