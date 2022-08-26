Feature: Login to the Leaftaps Application

Background:
Given open the chrome browser
And Load the URL and Maximize

Scenario: Positive Login 
Given Enter the username as 'Democsr'
And Type the password as 'crmsfa'
When Click on the Login button 
Then Verify the home page is displayed

Scenario: Negative Login 
Given Enter the username as 'Demosalesmanager'
And Type the password as 'crmsfa'
When Click on the Login button 
But Error message is displayed


