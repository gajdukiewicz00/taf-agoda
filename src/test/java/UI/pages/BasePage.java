package UI.pages;

import UI.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BasePage {

    protected final String BASE_URL = "https://www.agoda.com/";
    protected WebDriver driver;
    public final static String LOCATION = "warsaw";
    public final String Email = "den.94dew@gmail.com";
    public final String Password = "test1234";
    protected final int WAIT_TIMEOUT_SECONDS = 130;

    protected BasePage() {
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    protected WebElement waitForVisibilityOfElement(WebElement webElement) {
        return new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS)).until(ExpectedConditions
                .visibilityOf(webElement));
    }
}

