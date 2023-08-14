Feature: contact us functionality

  Scenario: As a user should not be able to Request an appointment without providing all information
    Given user on the homepage
    When user clicks on contact us
    And user clicks on requst appointment
    And user clicks on radio button call me
    And user clicks in check box
    And user puts first name and last name
    And user clicks on language  english
    And user clicks on radio button for call me
    And user select on month and day and year
    And user puts phone number
    And user input email address
    And user puts 5 digits of zip code
    And user clicks on next
    Then user should see error messsage
