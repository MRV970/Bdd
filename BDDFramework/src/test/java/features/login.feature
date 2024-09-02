Feature: Login


Scenario:
Validate user is able to Login with valid credentials


Given Browser is open and URL is navigated
And Login page is dispalyed
When user enters valid username and valid password
And user click on login button
Then user should be successfully logged in
And browser should be close

