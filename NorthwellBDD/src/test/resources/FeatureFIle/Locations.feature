Feature: Locations functionality
@sanity
  Scenario: User should be able to view health clinics
    Given User is on the Northwell Homepage
    When User clicks on Locations button on top menu bar
    And User clicks on "zip code or city" search bar
    And User enters zip code "11373"
    Then User should see physicians nearby the zip code of 11373
    


    