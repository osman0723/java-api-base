Feature: jsonplace holder suite

  Background:
    * url "https://jsonplaceholder.typicode.com"

  Scenario: get a specicific resourse with id
    When param '{"id" : "3"}'
    And method get "/posts"
    Then status should be 200

    Scenario: create a resource
      When request new resource
      And method post "/posts"
      Then status should be 201




