package UI.tests;

import UI.driver.DriverSingleton;
import UI.pages.HomePage;
import UI.pages.LogPage;
import org.junit.After;
import org.junit.Before;

public class BaseTest {

    @Before
    public void openPage() {
        HomePage homePage = new HomePage();
        homePage.openPage();
        LogPage logPage = new LogPage();
        logPage.openPage();
    }


    @After
    public void finishTest() {
        DriverSingleton.closeDriver();
    }
}

