Feature: Login Functionality
 
#@regression
#Scenario: Verify the login functionality for valid credentials
#And user enters teh password
#And user clicks on the login button
#Then user is naqvigated to home page 
#@SmokeTest
 #Scenario: Unsuccessful login with invalid credentials
 #Given User is on the login page
 #When the user enters invalid username
 #And the user enters password
 #And the user clicks on the login button
 #Then an error message should be displayed
# Background: Given User is on the login page
# @sanity
#Scenario Outline: Verify the login functionality for valid credentials using parameters
#	When user enters the "<username>" and "<password>"
#	And user clicks on the login button	
#	Then user is naqvigated to home page 
#	Examples:
#	|username| password |
#	|Admin| admin123 |
#	|Admin | admin123 |
#	|Admin | admin123 |
@sanity
Scenario: Login with multiple users
	 Given User is on the login page
	 When user enters credentials
     | username | password  |
    | Admin    | admin123  |  
   And user clicks on the login button	
	Then user is naqvigated to home page