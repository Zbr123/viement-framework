package test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import main.BaseTest;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static main.RestAssuredUtil.getBaseUrl;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

public class AddLocation extends BaseTest {

    static String id ;
    static String ownerName = "zubairalam123";
    static String requestPath = "datasets/v1/"+ownerName;
    String name = RandomStringUtils.randomAlphanumeric(10);
    String description = RandomStringUtils.randomAlphanumeric(20);

    @Test
    public void addNewLocation() {
        System.out.println("Add Location Request : " + getBaseUrl()  + requestPath+"?access_token=" + LocationFilter.accessToken);
        Response res = given()
                .contentType(ContentType.JSON)
                .body("{\"name\":\""+ name +"\", \"description\":\""+description+"\"}")
                .when()
                .post(getBaseUrl()  + requestPath+"?access_token="+ LocationFilter.accessToken);
                 res.then().assertThat()
                .statusCode(200)
                .body("name", equalTo(name))
                .body("description", equalTo(description))
                .body("owner", equalTo(ownerName));

        JsonPath body = res.getBody().jsonPath();
        System.out.println("Add Location Response Body: " + res.getBody().asString());
        id = body.get("id");
        System.out.println("Id :"+ id);
    }

    public void verifyUsingGetLocationDetails(String name , String description) {
        Response getResponse = given().when().get(getBaseUrl() + requestPath +  "?access_token=" + LocationFilter.accessToken);
        getResponse.then()
                .statusCode(200)
                .body("name", hasItem(name))
                .body("description",hasItem(description));
        System.out.println("Get Request Call"+ getResponse.getBody().asString());
    }

    @Test
    public void addNewLocationWithoutToken() {
        System.out.println("Request : " + getBaseUrl()  + requestPath+"?access_token=");
        Response res = given()
                .contentType(ContentType.JSON)
                .body("{\"name\":\"New-Location\", \"description\":\"Testing Location Services\" }")
                .when()
                .post(getBaseUrl()  + requestPath+"?access_token=");
                 res.then().assertThat()
                .statusCode(401)
                .body("message", equalTo("Unauthorized"));
    }

    @Test
    public void addNewLocationWithInvalidToken() {
        System.out.println("Request : "+ getBaseUrl()  + requestPath+"?access_token="+ LocationFilter.invalidAccessToken);
        Response res = given()
                .contentType(ContentType.JSON)
                .body("{\"name\":\"New-Location\", \"description\":\"Testing Location Services\" }")
                .when()
                .post(getBaseUrl()  + requestPath+"?access_token=" + LocationFilter.invalidAccessToken);
                res.then().assertThat()
                .statusCode(401)
                .body("message", equalTo("Unauthorized"));
    }

    @Test
    public void addNewLocationWithPutMethod() {
        System.out.println("Request : "+ getBaseUrl()  + requestPath+"?access_token="+ LocationFilter.accessToken);
        Response res = given()
                .contentType(ContentType.JSON)
                .body("{\"name\":\"New-Location\", \"description\":\"Testing Location Services\" }")
                .when()
                .put(getBaseUrl()  + requestPath+"?access_token=" + LocationFilter.accessToken);
                res.then().assertThat()
                .statusCode(404)
                .body("message", equalTo("Not Found"));
    }

    @Test
    public void addNewLocationInvalidBody() {
        System.out.println("Request : "+getBaseUrl()  + requestPath+"?access_token="+ LocationFilter.accessToken);
        Response res = given()
                .contentType(ContentType.JSON)
                .body("{\"name123\":\"New-Location\", \"de$criptionS\":\"Testing Location Services\" }")
                .when()
                .put(getBaseUrl()  + requestPath+"?access_token=" + LocationFilter.accessToken);
                 res.then().assertThat()
                .statusCode(404 )
                .body("message", equalTo("Not Found"));
    }
}
