@smoke
Feature: To Validate the login functionality of Facebook Application

Scenario: To Validate the login invalid username and valid password

Given User have to launch Facebook application thru Chrome Browser

When User have to enter invalid username and valid password

And User have to click the login button

Then User have to reach the invalid credential page

Scenario: To Validate the login invalid username and valid password

Given User have to launch Facebook application thru Chrome Browser

When User have to enter invalid username and invalid password

And User have to click the login button

Then User have to reach the invalid credential page

