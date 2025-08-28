Feature: Mercury Tours Registration

  Scenario: Successful registration
    Given user navigates to registration page
    When user enters registration details
      | firstName    | lastName | phone       | email           | address       | city       | state       | postalCode | country   | userName   | password | confirmPassword |
      | Kalisetti      | Sireesha   | 1234567890  | siri@example.com | 123 abc IND    | Anytown    | AnyState    | 12345      | INDIA     | siri5468    | pass323  | pass323         |
    And user submits the form
    Then registration should be successful