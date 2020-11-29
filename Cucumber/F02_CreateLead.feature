@functional
Feature: Create Lead Functionality
Scenario Outline: To check the functionality of create Lead page
Given Enter the username as demosalesmanager
And Enter the password as crmsfa
When Click on the login button
Then Homepage should be displayed
When click on crmsfa link
Then MyHome page should be displayed  
When click on the leads link
Then My Leads should be displayed
When click on the create lead link
Then CreateLead Page should be displayed
Given Enter the companyname as <CompanyName> 
And Enter the firstname as <Fname>
And Enter the lastname as <LName>
When Click on the link Create Lead 
Then View Lead Page should be displayed 
 
Examples:
|CompanyName|Fname|LName|
|TCS|Sachin|Tendulkar|
|HCL|Yuvraj|Singh|