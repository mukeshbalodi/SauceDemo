Feature: Verify the order Place functionality
Scenario: User is able to place order
Given user is on cart page
When user clicks on Checkout Button 
Then User is Redirect to Checkout: Your Information page
And fill details
And click on continue Button
Then user should Redirected to Checkout: Overview page
When User click on finish Button
Then user see a message Thank you for your order!
And Close the Browser

