Feature: Verify the Cart functionality
Scenario: User is able to add items into cart
Given user is on Home Page
And user click on Add to cart Button 
Then item should be added to the cart successfully 
And User can see the item by pressing cart icon
And close the Broswer
