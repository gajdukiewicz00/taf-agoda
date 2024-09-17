package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;

public class SearchTests extends BaseTest {

    @Test
    public void testSearchResultsAreDisplayed() {
        HomePage homePage = new HomePage(driver);
        homePage.searchFor("Warsaw");

        SearchPage searchPage = new SearchPage(driver);
        Assert.assertFalse(searchPage.isResultPresent(), "No results found.");
    }
}
