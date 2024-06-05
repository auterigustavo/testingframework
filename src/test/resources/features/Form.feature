Feature: Formulario
  Para practicar y aprender
  Voy a completar un formulario de datos

  Background: Estoy en la pagina demoqa en el apartado Forms
    Given Navego a https://demoqa.com/automation-practice-form

  @2
  Scenario: Completo los datos en el formulario
    When Ingreso el nombre Gustavo
    And Ingreso el apellido Auteri
    And Ingreso el mail auterigustavo@gmail.com
    And Selecciono un genero
    And Ingreso el numero 1111111111
    And Ingreso la fecha "10 May 1997"
    And Ingreso la materia Maths
    And Selecciono el hobbie Music
    And Adjunto una imagen
    And Ingreso la direccion "Corrientes 707"
    And Selecciono el estado NCR
    And Selecciono la ciudad Delhi
    And Envio el formulario y verifico respuesta exitosa