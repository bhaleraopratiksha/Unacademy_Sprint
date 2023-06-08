Feature: Unacademy Subcription Page

Scenario: Validate User navigates onto Subscription Plan Page.
Given Chrome is opened and unacademy app is opened
Then User navigate onto Unacademy landing page
When User click on login button
Then User Navigates onto login page
When user enter mobile number "8805486052"
And clicks on login button
And User enter OTP
And User click on verify OTP button 
When User click on Subscription Plan 
Then User navigates on Subscription page


Scenario: UI
Given Chrome is opened and unacademy app is opened
Then User navigate onto Unacademy landing page
When User click on login button
Then User Navigates onto login page
When user enter mobile number "8805486052"
And clicks on login button
And User enter OTP
And User click on verify OTP button 
When User click on Subscription Plan 
Then User navigates on Subscription page
Then Subscription plan page fields are visible to User

Scenario: Validate Field on Subscription Plan page(Get Plus buttons is clickable)
Given Chrome is opened and unacademy app is opened
Then User navigate onto Unacademy landing page
When User click on login button
Then User Navigates onto login page
When user enter mobile number "8805486052"
And clicks on login button
And User enter OTP
And User click on verify OTP button 
When User click on Subscription Plan 
Then User navigates on Subscription page
When user click on Get Plus button
Then  Get Plus button is clickable and user navigates to Subscription plan duration page 


