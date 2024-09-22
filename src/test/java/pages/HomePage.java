package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HomePage extends BasePage {
    private static final Logger logger = LogManager.getLogger(HomePage.class);

    @FindBy(xpath = "//*[@id='textInput']")
    private WebElement searchBox;

    @FindBy(xpath = "//button[@radius='M']")
    private WebElement searchButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchForLocation(String location) {
        logger.info("Вводим место для поиска: {}", location);
        searchBox.sendKeys(location);
        searchButton.click();
        logger.info("Запрос на поиск отправлен.");
    }
}
