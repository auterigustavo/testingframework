Feature: Navigation bar
  To see the subpages
  Without loggin in
  I can click the navigation bar links

  Background: I am on the Free Range Testers web without loggin in
    Given I navigate to www.freerangetesters.com

  Scenario Outline: I can access the subpages through the navigation bar
    When  I go to <section> using the navigation bar
    Examples:
      | section |
      | Cursos |
      | Recursos |
      | Blog |
      | Mentorías |
      | Udemy |