feature: User API tests
  Scenario: Get all users
    When I send a request to get all users
    Then the response status code should be 200
    And the user list should not be empty

  Scenario: Get user by ID
    When I send a request to get user with ID 1
    Then the response status code should be 200
    And the user ID should be 1