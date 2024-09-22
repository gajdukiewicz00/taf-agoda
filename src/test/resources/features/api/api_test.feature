Feature: API testing


  Scenario: Validate Agoda API status
    When I send a GET request to "https://jsonplaceholder.typicode.com"
    Then the status code should be 200