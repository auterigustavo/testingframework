Feature: Formulario
  Para practicar y aprender
  Voy a completar un formulario de datos

  Background: Estoy en la pagina demoqa en el apartado Forms
    Given Navego a https://demoqa.com/automation-practice-form

  @2
  Scenario: Completo los datos en el formulario
    When Ingreso el nombre Gustavo
    And Ingreso el apellido Auteri