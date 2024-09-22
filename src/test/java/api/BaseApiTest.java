package api;

import utils.ConfigReader;
import io.restassured.RestAssured;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseApiTest {
    private static final Logger logger = LogManager.getLogger(BaseApiTest.class);

    public BaseApiTest() {
        String baseUrl = ConfigReader.getAgodaBaseAPI();
        RestAssured.baseURI = baseUrl;
        logger.info("Настроен базовый URL для API: {}", baseUrl);
    }
}
