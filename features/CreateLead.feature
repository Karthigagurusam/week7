Feature: Create a new Lead in Leaftaps Application

Background: Positive Login
Given Enter the username as 'Demosalesmanager'
And Type the password as 'crmsfa'
When Click on the Login button 
Then Verify the home page is displayed

Scenario Outline:Create Lead with different data
Given Click CRM/SFA Link
And Click Leads Tab
And Click Create Leads Link
When Type the company name as </companyName?
And Type the first Name as <firstName>
And Type the  last Name as <LastName>
And Click Create Leads Link in Create Leads Page

Examples:
|companyName|firstName|lastName|
|TestLeaf|Karthiga|Gurusamy|
|Qeagle|Hari|R|