Feature: SauceDemo Functionalit
@regression
Scenario: Verify the login functionality for valid credentials
Given user is on the login page
When  user enters the Username
And user enters the Password
And user clicks on the Login button
And  user is navigated to home page
And user added the products to cart
And user enters into cart
And user clicks on checkout button
And user enters firstName
And user enters lastName
And user enters postalCode
And user clicks on continue button
And user clicks on finish button
And user clicks on back to home button
And user clicks on menu button
Then user clicks on logOut button