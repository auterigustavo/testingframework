package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class DemoQAPage extends BasePage{

    private String nameField = "//input[@id='firstName']";
    private String lastNameField = "//input[@id='lastName']";
    private String emailField = "//input[@id='userEmail']";
    private String genderRadio = "//label[contains(text(),'Male')]/..";
    private String numberField = "//input[@id='userNumber']";
    private String dateOfBirthField = "//input[@id='dateOfBirthInput']";
    private String subjectField = "//input[@id='subjectsInput']";
    private String hobbieRadio = "//label[contains(text(),'Music')]/..";
    private String uploadInput = "//input[@id='uploadPicture']";
    private String addressField = "//textarea[@id='currentAddress']";
    private String stateSelector = "//*[contains(text(), 'Select State')]";
    private String citySelector = "//*[contains(text(), 'Select City')]";
    private String statecityValue = "//*[contains(text(), '%s')]";
    private String submitButton = "//button[@id='submit']";

    public DemoQAPage(){
        super(driver);
    }

    public void navigateToPage(String url){
        navigateTo(url);
    }

    public void fillNameField(String name){
        write(nameField, name);
    }

    public void fillLastNameField(String lastName){
        write(lastNameField, lastName);
    }

    public void fillEmailField(String email){
        scrollTo(emailField);
        write(emailField, email);
    }

    public void selectGender(){
        scrollTo(genderRadio);
        clickElement(genderRadio);
    }

    public void fillNumberField(String number){
        write(numberField, number);
    }

    public void fillDateField(String date){
        WebElement element = driver.findElement(By.xpath(dateOfBirthField));
        element.clear();
        element.sendKeys(date);
        element.sendKeys(Keys.ENTER);
    }

    public void fillSubjectField(String subject){
        WebElement element = driver.findElement(By.xpath(subjectField));
        element.sendKeys(subject);
        element.sendKeys(Keys.TAB);
    }

    public void selectHobbie(){
        scrollTo(hobbieRadio);
        clickElement(hobbieRadio);
    }

    public void uploadImage(){
        uploadArchive(uploadInput, "F:/gauteri/OneDrive - Getronics/Desktop/Programacion/clones-github/selenium/testingframework/src/image/monkey.png");
    }

    public void fillAddressField(String address){
        write(addressField, address);
    }

    public void selectState(String state){
        String selection = String.format(statecityValue, state);
        clickElement(stateSelector);
        clickElement(selection);
    }

    public void selectCity(String city){
        String selection = String.format(statecityValue, city);
        clickElement(citySelector);
        clickElement(selection);
    }

    public void submitForm(){
        clickElement(submitButton);
        WebElement message = driver.findElement(By.xpath("//div[@id='example-modal-sizes-title-lg']"));
        Assert.assertEquals("Thanks for submitting the form", message.getText());
    }
}
