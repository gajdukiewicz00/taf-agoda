package api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomePage extends BasePage{

    @Test
    //проверка, что код ответа 200
    public void testIsResponseOK() {
        Assertions.assertEquals(Utils.codeOK, homePageAgoda.getResponseCode(Utils.BASE_URL));
    }

    @Test
    //проверка, что код ответа 403
    public void testIsResponseForbidden() {
        Assertions.assertEquals(Utils.codeForbidden, homePageAgoda.postResponseCode(Utils.BASE_URL));
    }
}
