package api;

import org.junit.jupiter.api.Test;

public class BasePage {
    HomePageAgoda homePageAgoda = new HomePageAgoda();

    @Test
    public void getHeadersInfo() {
        //получение headers
        String headersInfo = homePageAgoda.getHeaders(Utils.BASE_URL);
        System.out.println(headersInfo);
    }

    @Test
    public void getStatusLine() {
        //получение statusLine: протокол, код ответа, фраза ответа
        String statusLine = homePageAgoda.getStatusLine(Utils.BASE_URL);
        System.out.println(statusLine);
    }

    @Test
    public void getContentType() {
        //получение ContentType
        String contentType = homePageAgoda.getContentType(Utils.BASE_URL);
        System.out.println(contentType);
    }
}
