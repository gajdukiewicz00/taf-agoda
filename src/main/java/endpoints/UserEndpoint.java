package endpoints;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class UserEndpoint {
    private static final String BASE_URL = config.Config.getBaseUrl();

    public static io.restassured.response.Response getAllUsers() {
        return given()
                .when()
                .get(BASE_URL + "/users")
                .then()
                .extract()
                .response();
    }

    public static Response getUserById(int userId) {
        return given()
                .when()
                .get(BASE_URL + "/users/" + userId)
                .then()
                .extract()
                .response();
    }
}
