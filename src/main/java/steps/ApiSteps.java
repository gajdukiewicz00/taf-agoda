package steps;

import endpoints.UserEndpoint;
import io.restassured.response.Response;

public class ApiSteps {

    public Response getAllUsers() {
        return UserEndpoint.getAllUsers();
    }

    public Response getUserById(int userId) {
        return UserEndpoint.getUserById(userId);
    }
}
