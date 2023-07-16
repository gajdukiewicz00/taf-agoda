package UI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogPage extends BasePage{

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

    public String getCheckText() {
        return checkText.getText();
    }
}
