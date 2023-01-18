package test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import main.BaseTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static main.RestAssuredUtil.getBaseUrl;
import static org.hamcrest.Matchers.equalTo;

public class DeleteLocation extends BaseTest {

    @Test
    public void deleteLocation() {
        AddLocation addLocation = new AddLocation();
        addLocation.addNewLocation();

        System.out.println("Delete Location Request : " + getBaseUrl() + AddLocation.requestPath + "/" + AddLocation.id + "?access_token=" + LocationFilter.accessToken);
        System.out.println("Validate Response Code With Success Status");
        deleteRequest(AddLocation.id,LocationFilter.accessToken)
                .then()
                .statusCode(204);
    }

    @Test
    public void deletingDataSetAlreadyDeleted() {
        AddLocation addLocation = new AddLocation();
        addLocation.addNewLocation();

        System.out.println("Delete Location Request : " + getBaseUrl() + AddLocation.requestPath + "/" + AddLocation.id + "?access_token=" + LocationFilter.accessToken);
        System.out.println("Validate Response Code With Success Status");
        deleteRequest(AddLocation.id,LocationFilter.accessToken)
                .then()
                .statusCode(204);

        // second delete request with 422  response code
        System.out.println("Validate Response Code with 422 Unprocessable Entity");
        deleteRequest(AddLocation.id,LocationFilter.accessToken)
                .then()
                .statusCode(422)
                .body("message", equalTo("No dataset"));
    }

    @Test
    public void deleteLocationWithInvalidId() {
        String invalidID = "xyz123ID";
        System.out.println("Delete Location Request : " + getBaseUrl() + AddLocation.requestPath + "/" + invalidID + "?access_token=" + LocationFilter.accessToken);

        System.out.println("Validate Response Code with 422 Unprocessable Entity");
        deleteRequest(invalidID, LocationFilter.accessToken)
                .then()
                .statusCode(422)
                .body("message", equalTo("No dataset"));
    }

    @Test
    public void deleteLocationWithNullId() {
        System.out.println("Delete Location Request : " + getBaseUrl() + AddLocation.requestPath + "/" + null + "?access_token=" + LocationFilter.accessToken);

        System.out.println("Validate Response Code with 422 Unprocessable Entity");
        deleteRequest(null
                , LocationFilter.accessToken)
                .then()
                .statusCode(422)
                .body("message", equalTo("No dataset"));
    }

    @Test
    public void deleteLocationWithInvalidToken()  {
        System.out.println("Delete Location Request : " + getBaseUrl() + AddLocation.requestPath + "/" + AddLocation.id + "?access_token=" + LocationFilter.invalidAccessToken);

        System.out.println("Validate Response Code With 401 Unauthorized");
        deleteRequest(AddLocation.id,LocationFilter.invalidAccessToken)
                .then()
                .statusCode(401)
                .body("message", equalTo("Unauthorized"));
    }

    @Test
    public void deleteLocationWithoutToken()  {
        System.out.println("Delete Location Request : " + getBaseUrl() + AddLocation.requestPath + "/" + AddLocation.id + "?access_token=" );

        System.out.println("Validate Response Code With 401 Unauthorized");
        deleteRequest(AddLocation.id,"")
                .then()
                .statusCode(401)
                .body("message", equalTo("Unauthorized"));
    }

    public Response deleteRequest(String id, String token)  {
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .delete(getBaseUrl() + AddLocation.requestPath + "/" + id + "?access_token=" + token);
        System.out.println("Delete Location Response Body: " + response.getBody().asString());
        return response;
    }
}
