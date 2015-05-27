#Deyvson Lazaro da Silva

Feature: Discipline
  As a teacher
  I want insert the disciplines who i teach
  So I can group the students and evaluations

  Scenario: insert Discipline
    Given I do not have a Discipline with the code "IF682"
    And  I do not have a Discipline with the name "ENGENHARIA SOFTWARE E SISTEMAS"
    When I create the Discipline "IF682" with the name "ENGENHARIA SOFTWARE E SISTEMAS"
    Then I gonna be the Discipline of code "IF682" whit the name "ENGENHARIA SOFTWARE E SISTEMAS" in my system

  Scenario: insert Discipline GUI
    Given i am on register Discipline page
    When I fill in field Code with "IF682"
    And I fill in field Name with "ENGENHARIA SOFTWARE E SISTEMAS"
    And I press "Save"
    Then I should see the Discipline of code "IF682" with the Name "ENGENHARIA SOFTWARE E SISTEMAS" in the page listDiscipline
