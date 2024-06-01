package pages;

public class DemoQAPage extends BasePage{

    private String nameField = "//input[@id='firstName']";
    private String lastNameField = "//input[@id='lastName']";

    public DemoQAPage() {
        super(driver);
    }

    public void navigateToPage(String url) {
        navigateTo(url);
    }

    public void fillNameField(String name) {
        write(nameField, name);
    }

    public void fillLastNameField(String lastName) {
        write(lastNameField, lastName);
    }
}
