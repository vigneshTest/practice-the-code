Feature: Adactin is a hotel booking app
Scenario: login module of adactin app
Given user should launch the application
When user enter the correct username
And user enter the correct password
Then user click the login button move to next page

Scenario: search the hotel in adactin app
Given user fill the particular aspect
When user select the location 
And user select hotels
And user select room type
And user enter in Date
And user enter the out date
And user select the adults per room
And user select the children per room
Then user click search button

Scenario: select the hotel in adactin app
Given user select particular hotel
When user select the hotel in given list
Then user click search button

Scenario: booking the particular hotel
Given user pay hotel amount in payer
When user enter the first name 
And user enter the last name
And user enter the 16 digit credit card number
And user enter the credit card type
And user enter the expire month in card
And user enter the expire year in card
And user enter the CVV number
And user click the book now button
And user got order no
Then user click my itinerary button

Scenario: booked itinerary in adactin app
Given user verify booking details
