package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", //indico donde estan los features files
        glue = "steps", //indico donde estan los steps definitions
        plugin = {"pretty","html:target/cucumber-reports/cucumber.html"})

public class TestRunner {

    @AfterClass
    public static void cleanDriver() {
        BasePage.closeBrowser();
    }
}
