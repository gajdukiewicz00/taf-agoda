package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SearchResultsPage extends BasePage {
    private static final Logger logger = LogManager.getLogger(SearchResultsPage.class);

    @FindBy(xpath = "//div[4]/ol[1]/li[1]/div/div/a/div/div[2]/div/header/div[1]/h3")
    private WebElement firstHotel;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public String getFirstHotelName() {
        String hotelName = firstHotel.getText();
        logger.info("Получаем имя первого отеля: {}", hotelName);
        return hotelName;
    }
}
