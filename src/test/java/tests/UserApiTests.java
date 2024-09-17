package tests;

import endpoints.UserEndpoint;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.LoggerUtil;

public class UserApiTests {
    Response response;

    @Test
    public void testGetAllUsers() {
        LoggerUtil.logInfo("Starting test: Get All Users");

        response = UserEndpoint.getAllUsers();
        Assert.assertEquals(response.getStatusCode(), 200, "Status code is not 200");
        Assert.assertTrue(response.jsonPath().getList("$").size() > 0, "User list is empty");

        LoggerUtil.logInfo("Test passed: Get All Users");
    }

    @Test
    public void testGetUserById() {
        LoggerUtil.logInfo("Starting test: Get User By ID");

        int userId = 1;
         response = UserEndpoint.getUserById(userId);
        Assert.assertEquals(response.getStatusCode(), 200, "Status code is not 200");
        Assert.assertEquals(response.jsonPath().getInt("id"), userId, "User ID does not match");

        LoggerUtil.logInfo("Test passed: Get User By ID");
    }
}
