Feature: user is able to get the data by using id

  Scenario: user wants to get the data from database by using database
    When user is able to get the data by using an url is "http://localhost:8080/packages/49"
    Then user validate the get status code of the id is 200
