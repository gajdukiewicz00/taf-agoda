package api;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class HomePageAgoda {
    public int getResponseCode(String url) {
        return given()
                .contentType(ContentType.JSON)
                .get(url)
                .then()
                .log()
                .all()
                .extract()
                .statusCode();

    }

    public int postResponseCode(String url) {
        return given()
                .contentType(ContentType.JSON)
                .post(url)
                .then()
                .log()
                .all()
                .extract()
                .statusCode();

    }

    public String getHeaders(String url) {
        String headers = given()
                .contentType(ContentType.JSON)
                .get(url).then().extract().headers().toString();
        return headers;
    }

    public String getStatusLine(String url) {
        return given()
                .contentType(ContentType.JSON)
                .get(url)
                .then()
                .extract()
                .statusLine();
    }

    public String getContentType(String url) {
        return given()
                .contentType(ContentType.JSON)
                .get(url)
                .then()
                .extract()
                .contentType();
    }
}
