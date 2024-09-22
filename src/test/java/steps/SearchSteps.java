package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.SearchResultsPage;
import utils.DriverFactory;
import utils.ConfigReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.time.Duration;
import static org.junit.Assert.assertTrue;

public class SearchSteps {
    private static final Logger logger = LogManager.getLogger(SearchSteps.class);
    private WebDriver driver = DriverFactory.getDriver();
    private HomePage homePage = new HomePage(driver);
    private SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
    private WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Given("I am on the Agoda home page")
    public void iAmOnTheAgodaHomePage() {
        driver.get(ConfigReader.getAgodaBaseUrl());
        logger.info("Перешел на главную страницу Agoda.");
    }

    @When("I search for a hotel in {string}")
    public void iSearchForAHotelIn(String city) {
        logger.info("Поиск отеля в городе: {}", city);
        homePage.searchForLocation(city);
    }

    @Then("I should see results on the search results page")
    public void iShouldSeeResultsOnTheSearchResultsPage() {
        searchResultsPage.wait(webDriverWait);
        String hotelName = searchResultsPage.getFirstHotelName();
        logger.info("Получено имя первого отеля: {}", hotelName);
        assertTrue("Имя отеля не отображается!", hotelName.length() > 0);
    }
}
