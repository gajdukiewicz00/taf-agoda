package UI.tests;

import UI.pages.HomePage;
import UI.pages.LogPage;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void agodaLoginTest(){
        String text = "Sing in";
        LogPage logPage = new LogPage();
        HomePage homePage = new HomePage();
        logPage.openPage();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        logPage.inputEmail();
        logPage.inputPassword();
        logPage.buttonSingIn();
        Assert.assertEquals(text,logPage.getCheckText());

    }
}
