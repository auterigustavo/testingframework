package pages;

public class FreeRangeTestersPage extends BasePage {

    private String sectionLink = "//a[contains(text(),'%s') and @href]";

    public FreeRangeTestersPage() {
        super(driver);
    }

    public void navigateToWeb(String url) {
        navigateTo(url);
    }

    public void clickOnSectionNavigationBar(String section) {
        //Reemplaza el marcador '%s' en sectionLink con el nombre
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);
    }
}
