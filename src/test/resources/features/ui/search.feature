Feature: Search for hotels on Agoda


  Scenario: Search for a hotel in a city
    Given I am on the Agoda home page
    When I search for a hotel in "Warsaw"
    Then I should see results on the search results page