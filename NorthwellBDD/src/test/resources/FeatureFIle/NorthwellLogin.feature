Feature: Login Functionality

@sanity
Scenario: User should not be able to login with invalid credentials

Given User is on Northwell homepage
When user clicks on login button
And User enters invalid email
And User enters invalid password
And User clicks on Login button
Then User should see "Invalid LoginID" message