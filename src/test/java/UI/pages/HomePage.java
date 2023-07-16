package UI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class HomePage extends BasePage {
     @FindBy(xpath = "//*[@id=\\\"SearchBoxContainer\\\"]/div[1]/div/div[2]/div/div/div[1]/div/div\"]")
    private WebElement buttonSearch;
     @FindBy(xpath = "//input[@placeholder='Enter a destination or property']")
     private WebElement inputLocation;
     @FindBy(xpath = "//div[@class='SearchBoxTextDescription__title']")
     private WebElement clickCalendar;
     @FindBy(xpath = "//span[@aria-label='Previous Month']")
     private WebElement clickSpan;
     @FindBy(xpath = "//div[@aria-label='Wed Aug 31 2022']")
     private WebElement clickFirstDay;
     @FindBy(xpath = "//div[@aria-label='Wed Sep 07 2022']")
     private WebElement clickLastDay;
     @FindBy(xpath = "//button[@data-element-name='search-button'")
     private WebElement buttonOnSearch;

    public HomePage() {
    }


    public HomePage Search() {
        waitForVisibilityOfElement(buttonSearch);
        buttonSearch.click();
        return this;
    }

    public HomePage inputSearch() {
        inputLocation.sendKeys(LOCATION);
       return this;
    }

    public HomePage clickOnCalendar() {
        clickCalendar.click();
        return this;
    }

    public HomePage clickButtonSpan() {
        clickSpan.click();
        return this;
    }

    public HomePage dataOnCalendar() {
        clickFirstDay.click();
        return this;
    }

    public HomePage dataOnCalendarOut() {
        clickLastDay.click();
        return this;
    }

    public HomePage clickOnButton() {
        buttonOnSearch.click();
        return this;
    }

}
