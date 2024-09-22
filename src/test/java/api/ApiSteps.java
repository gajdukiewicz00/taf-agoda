package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.junit.Assert.assertEquals;
import io.cucumber.java.en.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ApiSteps extends BaseApiTest {
    private static final Logger logger = LogManager.getLogger(ApiSteps.class);
    private Response response;

    @When("I send a GET request to {string}")
    public void iSendAGETRequestTo(String endpoint) {
        logger.info("Отправка GET запроса к: {}", endpoint);
        response = RestAssured.get(endpoint);
    }

    @Then("the status code should be {int}")
    public void theStatusCodeShouldBe(int statusCode) {
        logger.info("Проверка кода ответа. Ожидаемый: {}, Полученный: {}", statusCode, response.getStatusCode());
        assertEquals(statusCode, response.getStatusCode());
    }
}
