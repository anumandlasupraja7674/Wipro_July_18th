Feature: Registration Functionality

  @sanity
  Scenario Outline: Register with multiple data
    Given user is on the registration page
    When user enters "<name>" as name
    And user enters "<email>" as email
    And user selects gender
    And user enters "<MoNum>" as mobile number
    And user enters "<DOB>" as DOB
    And user enters "<subject>" as subject
    And user selects hobbies
    #And user uploads picture "<pic>"
    And user enters "<address>" as address
    And user selects "<state>" as state
    And user selects "<city>" as city
    And user clicks on login button
    Then user should sees "<expectedResult>"

    Examples:
      | name                        | email           | MoNum      | DOB       | #subject   | pic                           	                                | address                       | state          | city | expectedResult |
      | Supraja | sup@123.com    | 630423334656 | 11-07-2003 | Selenium  | #C:\Users\Supraja\OneDrive\Pictures\Screenshots\2025-04-30 (1).png" | abc road,xyz street,big city  | Uttar Pradesh  | Agra | Success        |