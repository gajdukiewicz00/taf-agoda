package UI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogPage extends BasePage{

    @FindBy(xpath = "//button[@data-selenium='header-hamburger-menu']")
    private WebElement buttonMenu;
    @FindBy(xpath = "//button[@class='Buttonstyled__ButtonStyled-sc-5gjk6l-0 bctLsm']")
    private WebElement buttonLogin;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement inputMail;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement inputHas;
    @FindBy(xpath = "//button[@type ='submit']")
    private WebElement buttonSing;
    @FindBy(xpath = "//*[@class='sc-fzqyvX kJWwZs kite-js-Typography ']")
    private WebElement checkText;

    public LogPage() {
    }

    public LogPage openPage() {
        driver.get(BASE_URL);
        return this;
    }

    public LogPage clickButtonMenu() {
        buttonMenu.click();
        return this;
    }

    public LogPage clickButtonLog() {
        buttonLogin.click();
        return this;
    }

    public LogPage inputEmail() {
        inputMail.sendKeys(Email);
        return this;
    }
    public LogPage inputPassword() {
        inputHas.sendKeys(Password);
        return this;
    }

    public LogPage buttonSingIn() {
        buttonSing.click();
        return this;
    }

    public String getCheckText() {return checkText.getText();}
}
