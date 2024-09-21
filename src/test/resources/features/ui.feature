feature: Search on Agoda
  Scenario: Search for hotels in a city
    Given I open the homepage
    When I search for "Warsaw"
    Then I should see the search results