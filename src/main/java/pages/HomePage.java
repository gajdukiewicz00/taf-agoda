package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;
    private final By searchBox = By.xpath("//input[@id='textInput']");
    private final By searchButton = By.xpath("//button[@radius='M']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchFor(String query) {
        driver.findElement(searchBox).sendKeys(query);
        driver.findElement(searchButton).click();
    }
}
