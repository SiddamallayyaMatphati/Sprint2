Feature: user is able to post the data in the database

  Scenario: user is able to post the data in the database
    Given user wants to provide the data in the database
    When user posts the data bu using the api is "http://localhost:8080/packages"
    Then user checks the status code is 201
