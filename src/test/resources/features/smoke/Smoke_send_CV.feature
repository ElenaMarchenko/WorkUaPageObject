Feature: Send CV

  Scenario: I as a job seeker WTBAT send my CV and apply for  job
    Given I go "https://www.work.ua/"
    When Fill search bar with position
    Then I click on search button
    When I click on any available vacancy in the list
    And I click on call out button
    And I fill CV form with valid data
    When I click on Send button
    Then CV sent to employer