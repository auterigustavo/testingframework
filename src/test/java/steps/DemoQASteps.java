package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.DemoQAPage;

public class DemoQASteps {

    DemoQAPage website = new DemoQAPage();

    @Given("Navego a {word}")
    public void navegoA(String url) {
        website.navigateToPage(url);
    }

    @When("Ingreso el nombre {word}")
    public void ingresoElNombre(String nombre) {
        website.fillNameField(nombre);
    }

    @And("Ingreso el apellido {word}")
    public void ingresoElApellido(String apellido) {
        website.fillLastNameField(apellido);
    }

    @And("Ingreso el mail {word}")
    public void ingresoElMail(String email){
        website.fillEmailField(email);
    }

    @And("Selecciono un genero")
    public void seleccionoUnGenero(){
        website.selectGender();
    }

    @And("Ingreso el numero {word}")
    public void ingresoElNumero(String number){
        website.fillNumberField(number);
    }

    @And("Ingreso la fecha {string}")
    public void ingresoLaFecha(String date){
        website.fillDateField(date);
    }

    @And("Ingreso la materia {word}")
    public void ingresoLaMateria(String subject){
        website.fillSubjectField(subject);
    }

    @And("Selecciono el hobbie Music")
    public void seleccionoElHobbie(){
        website.selectHobbie();
    }

    @And("Adjunto una imagen")
    public void adjuntoUnaImagen(){
        website.uploadImage();
    }

    @And("Ingreso la direccion {string}")
    public void ingresoLaDireccion(String address){
        website.fillAddressField(address);
    }

    @And("Selecciono el estado {word}")
    public void seleccionoElEstado(String state){
        website.selectState(state);
    }

    @And("Selecciono la ciudad {word}")
    public void seleccionoLaCiudad(String city){
        website.selectCity(city);
    }

    @And("Envio el formulario y verifico respuesta exitosa")
    public void envioElFormularioYVerificoRespuesta(){
        website.submitForm();
    }
}
