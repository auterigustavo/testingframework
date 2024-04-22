package steps;

import io.cucumber.java.en.*;
import pages.MainPage;

public class Steps {

    MainPage website = new MainPage();

    @Given("I navigate to {word}")
    public void iNavigateTo(String url) {
        website.navigateToWeb(url);
    }

    @When("I go to {word} using the navigation bar")
    public void navigationBarUse(String section) {
        website.clickOnSectionNavigationBar(section);
    }
}
