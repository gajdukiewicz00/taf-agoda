package steps;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.SearchPage;

public class UiSteps {
    private WebDriver driver;
    private HomePage homePage;
    private SearchPage searchPage;

    public UiSteps(WebDriver driver) {
        this.driver = driver;
        homePage = new HomePage(driver);
        searchPage = new SearchPage(driver);
    }

    public void searchForCity(String city) {
        homePage.searchFor(city);
    }

    public boolean verifyResults() {
        return searchPage.isResultPresent();
    }
}
