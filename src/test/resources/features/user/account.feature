Feature: User
  As an user
  I want to get detail user
  So that I can update the user data

  Scenario: GET - As a user I have to be able to get detail user
    Given I set an endpoint for GET detail user
    When I request GET detail user
    Then I validate the status code is 200
    And I validate the data detail