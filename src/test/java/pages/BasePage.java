package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    protected static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    static {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }

    public static void navigateTo(String url) {
        driver.get(url);
    }

    public static void closeBrowser() {
        driver.quit();
    }

    private WebElement Find(String locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    //Usando este metodo no es necesario agregar esperas
    public void clickElement(String locator) {
        Find(locator).click();
    }

    public void write(String locator, String keysToSend) {
        Find(locator).clear();
        Find(locator).sendKeys(keysToSend);
    }

    public void selectFromDropdownByValue(String locator, String value) {
        Select dropdown = new Select(Find(locator));
        dropdown.selectByValue(value);
    }

    public void selectFromDropdownByIndex(String locator, Integer index) {
        Select dropdown = new Select(Find(locator));
        dropdown.selectByIndex(index);
    }

    public int dropdownSize(String locator) {
        Select dropdown = new Select(Find(locator));
        List<WebElement> dropdownOptions = dropdown.getOptions();

        return dropdownOptions.size();
    }

}
