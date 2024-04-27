Feature: Login page Automation of SauceDemo 
Scenario: Check Login is successful with valid creds
Given User is on Login page
When user enter correct username and password
And Clicks on Login Button
Then user should redirect to Home Page
And close the Browser
