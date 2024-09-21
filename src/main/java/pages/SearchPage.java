package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;
    private By results = By.cssSelector("#sort-bar-group-label");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isResultPresent() {
        return driver.findElements(results).size() > 0;
    }
}
