package UI.tests;

import UI.pages.HomePage;
import UI.pages.HotelPage;
import org.junit.Assert;
import org.junit.Test;

public class HotelPageTest extends BaseTest{

    @Test
    public void testLocation() {
        String city = "warsaw";
        HotelPage hotelPage = new HotelPage();
        HomePage homePage = new HomePage();
        homePage.Search()
                        .inputSearch()
                                .clickOnCalendar()
                                        .clickButtonSpan()
                                                .dataOnCalendar()
                                                        .dataOnCalendarOut()
                                                                .clickOnButton();
        Assert.assertEquals(city,hotelPage.getHotel());
    }
}
