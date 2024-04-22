package steps;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.BasePage;

public class Evidence extends BasePage {

    public Evidence() {
        super(driver);
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            scenario.log("Escenario fallido, por favor verificar print de pantalla");
            final byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","captura del error");
        }
    }
}
