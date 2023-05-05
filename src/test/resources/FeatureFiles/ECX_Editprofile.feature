Feature: 1clxlite website testing
Scenario: ECX Edit profile module testing
    Given the user enters the ECX-Dashboard
    When the user enters edit profile section
    And the user enters the name
    And the user enters the Phone number
    And the user clicks the update button1
    And the user enters the old password
    And the user enters the new password
    And the user enters the verify password
    And the user clicks the update button2
    And the user choose the country name
    And the user choose the state name
    And the user choose the city name
    And the user enters the pincode
    And the user enters the landmark
    And the user enters the Address
    And the user clicks shipping address checkbox
    And the user clicks the update button3
    And the user cliks the change the profile picture
    And the user delete the profile picture
    Then the user logout from the ECX account
    
    
