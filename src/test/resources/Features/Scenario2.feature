Feature: Unacademy Subcription Page

Scenario Outline: Verify the User is able to get offer by apply valid refferal code
Given Chrome is opened and unacademy app is opened
Then User navigate onto Unacademy landing page
When User click on login button
Then User Navigates onto login page
When user enter mobile number
And clicks on login button
And User enter OTP
And User click on verify OTP button 
When User click on Subscription Plan 
Then User navigates on Subscription page
When user click on Get Plus button
Then  Get Plus button is clickable and user navigates to Subscription plan duration page
When user enter data in Referral code field "SAVE5"
And click on Apply button
Then User should see the Offer Message 

Examples:
 
 | Refferal code |
 | SAVE5         |
 
 Scenario Outline: Verify the User is able to get offer by apply invalid refferal code
Given Chrome is opened and unacademy app is opened
Then User navigate onto Unacademy landing page
When User click on login button
Then User Navigates onto login page
When user enter mobile number
And clicks on login button
And User enter OTP
And User click on verify OTP button 
When User click on Subscription Plan 
Then User navigates on Subscription page
When user click on Get Plus button
Then  Get Plus button is clickable and user navigates to Subscription plan duration page
When user enter data in invalid Referral code field "abcd3"
And click on Apply button for check Invalid data
Then User should  see Message that This code is invalid 

Examples:
 
 | Refferal code |
 | abcd3         |
 
 