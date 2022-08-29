package UI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelPage extends BasePage{
    @FindBy(xpath = "//span[@data-selenium='area-city-text']")
    WebElement firstHotel;

    public String getHotel() {
        return firstHotel.getText();
    }
}
