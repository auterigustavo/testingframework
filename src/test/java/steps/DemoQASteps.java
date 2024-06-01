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
}
