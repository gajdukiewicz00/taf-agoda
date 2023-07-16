package UI.pages;

import UI.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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
    protected final int WAIT_TIMEOUT_SECONDS = 10;

    public BasePage() {
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    protected WebElement waitForVisibilityOfElement(WebElement webElement) {
        return new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS)).until(ExpectedConditions
                .visibilityOf(webElement));
    }

    @FindBy(xpath = "//button[@style=\"background-color: rgb(155, 155, 155); color: rgb(255, 255, 255); border-color: rgb(155, 155, 155);\"]")
    private WebElement closeSpamOffer;
    @FindBy(xpath = "//button[@data-modal-action=\"continue\"]")
    private WebElement acceptCookieFile;

    public BasePage openPage() {
        driver.get(BASE_URL);
        return this;
    }

    public BasePage SpamOffer(){
        closeSpamOffer.click();
        return this;
    }

    public BasePage cookieFile(){
        acceptCookieFile.click();
        return this;
    }

    public void openPage() {
    }
}


