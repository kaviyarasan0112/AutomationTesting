Feature: Leaftaps Login Functionality

#Background:
#Given Launch the chrome browser
#And Load the application URL

@smoke
Scenario: To check the functionality of login page with positive credentials
Given Enter the username as demosalesmanager
And Enter the password as crmsfa
When Click on the login button
Then Homepage should be displayed

@functional
Scenario Outline: To check the functionality of login page with negative credentials
Given Enter the username as <username>
And Enter the password as <password>
When Click on the login button
But Error Message should be displayed

Examples:
|username|password|
|demosalesmanager|crmsfa123|
|demosalesmanager|crmsfa|
 

 
