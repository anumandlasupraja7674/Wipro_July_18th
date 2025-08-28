
Feature: Student Registration Form Automation

 Scenario Outline: Fill and submit student registration form
    Given the user is on the practice registration page
    When the user fills in the registration form with "<name>", "<email>", "<gender>", "<mobile>", "<dob>", "<subjects>", "<hobbies>", "<address>", "<picture>", "<state>", "<city>"
    Then the form should be submitted successfully

    Examples:
      | name   | email            | gender | mobile     | dob        | subjects    | hobbies | address              | picture                                   | state     | city   |
      | smith  | smith@gmail.com  | Male   | 7647657676 | 01-01-2004 | Mathematics | Sports  | Vizag, Andhra        | C:\Users\Supraja\OneDrive\Pictures\Screenshots\Screenshot (162).png  | Rajasthan | Agra   |
      | gold   | gold@gmail.com   | Female | 7457656566 | 02-02-2003 | Physics     | Music   | Hyderabad, Telangana | C:\Users\Supraja\OneDrive\Pictures\Screenshots\Screenshot (161).png        | Haryana   | Lucknow|

      
      
      #regpom.feature is same as RegistrationPageOne.feature