Feature: ShopperStackLogin
@Smoke @Regression
Scenario: Validate shopper can login using valid credentials

Given Browser is open and URL navigated
And Login page will be displayed
And Shopper Login is Displayed
When User enters "qa_testmerchantdell@gmail.com" and "Password@123"
And clicks on login button
Then shopper should be successfully logged in
And Browser must be closed

@Smoke @Regression
Scenario: Validate Merchant can login using valid credentials

Given Browser is open and URL navigated
And Login page will be displayed
And Merchant Login is Displayed
When User enters "qa_merchantlogin@gmail.com" and "Password@123"
And clicks on  login button
Then Merchant should be successfully logged in
And Browser must be closed

@Regression
Scenario: Validate Admin can login using valid credentials

Given Browser is open and URL navigated
And Login page will be displayed
And Admin Login is Displayed
When  User enters "qa_testadmindell@gmail.com" and "Password@123"
And  clicks on  login button
Then Admin should be successfully logged in
And Browser must be closed

