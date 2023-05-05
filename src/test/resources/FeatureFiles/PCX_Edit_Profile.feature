Feature: PCX Edit profile Testing

Scenario: Name Updation
Given Login with Valid entries and navigate to Dashboard
When User enters the PCX Profile dashboard section and clicks the navbar
And User clicks the My profile
And User enters the name
And User enters the Phone number
Then User clicks the UpdateButton1

Scenario: Password Updation
Given  User enters the Old password
When  User enters the New Password 
And User enters the Verify password
Then  User clicks the UpdateButton2

Scenario: Razorpay Updation
Given  User enters the Razorpay id
When User enters the Razorpay Key
Then  User clicks the UpdateButton3

Scenario: Business Updation
Given  User choose the business
Then  User clicks the UpdateButton4

Scenario: Gst Updation
And User enters the Gst Number
And User clicks the Update Button5

Scenario: Profile Pic Updation
Given User clicks edit pic label and upload the picture
When User Clicks delete lable for deleting the upload picture
Then User logout from the pcx account