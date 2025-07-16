Feature: Register
@Smoke @Regression
Scenario:
User should be able to register using valid credentials

Given Browser is open and URL is navigated to register page
And register page is dispalyed
When user  enters valid credentials
|   F   |   Test  |    manualtest  |qs_manualtest@gmail.com  |   Password@123 |
And clicks on register button
Then a new account should be created
And browser must be closed

