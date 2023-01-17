package api;

import core.utils.restAssured.BaseTest;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;
import static core.utils.restAssured.RestAssuredUtil.getBaseUrl;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

public class Cognito extends BaseTest {


    static String jwtToken ;
    static String ownerName = "zubairalam123";
    static String loginPath = "/api/cognito/authentication/login";
    String email = "srijan-admin@srijan.net";
    String password = "Srijan@12345";
    String description = RandomStringUtils.randomAlphanumeric(20);

    @Test
    public void loginUser() {
        System.out.println("Login Request : " + getBaseUrl()  + loginPath);
        Response res = given()
                .contentType(ContentType.JSON)
                .body("{\"email\":\""+ email +"\", \"password\":\""+password+"\"}")
                .when()
                .post(getBaseUrl()  + loginPath);
                 res.then().assertThat()
                .statusCode(200)
                .body("application_code", equalTo(200))
                .body("message", equalTo("Authenticated"))
                .body("error", equalTo(false));

        JsonPath body = res.getBody().jsonPath();
        System.out.println("Login Response Body: " + res.getBody().asString());
        jwtToken = res.getBody().jsonPath().get("data.jwt").toString();
        System.out.println("Token :"+ jwtToken);

    }
//
//    public void verifyUsingGetLocationDetails(String name , String description) {
//        Response getResponse = given().when().get(getBaseUrl() + requestPath +  "?access_token=" + LocationFilter.accessToken);
//        getResponse.then()
//                .statusCode(200)
//                .body("name", hasItem(name))
//                .body("description",hasItem(description));
//        System.out.println("Get Request Call"+ getResponse.getBody().asString());
//    }
//
//    @Test
//    public void addNewLocationWithoutToken() {
//        System.out.println("Request : " + getBaseUrl()  + requestPath+"?access_token=");
//        Response res = given()
//                .contentType(ContentType.JSON)
//                .body("{\"name\":\"New-Location\", \"description\":\"Testing Location Services\" }")
//                .when()
//                .post(getBaseUrl()  + requestPath+"?access_token=");
//                 res.then().assertThat()
//                .statusCode(401)
//                .body("message", equalTo("Unauthorized"));
//    }
//
//    @Test
//    public void addNewLocationWithInvalidToken() {
//        System.out.println("Request : "+ getBaseUrl()  + requestPath+"?access_token="+ LocationFilter.invalidAccessToken);
//        Response res = given()
//                .contentType(ContentType.JSON)
//                .body("{\"name\":\"New-Location\", \"description\":\"Testing Location Services\" }")
//                .when()
//                .post(getBaseUrl()  + requestPath+"?access_token=" + LocationFilter.invalidAccessToken);
//                res.then().assertThat()
//                .statusCode(401)
//                .body("message", equalTo("Unauthorized"));
//    }
//
//    @Test
//    public void addNewLocationWithPutMethod() {
//        System.out.println("Request : "+ getBaseUrl()  + requestPath+"?access_token="+ LocationFilter.accessToken);
//        Response res = given()
//                .contentType(ContentType.JSON)
//                .body("{\"name\":\"New-Location\", \"description\":\"Testing Location Services\" }")
//                .when()
//                .put(getBaseUrl()  + requestPath+"?access_token=" + LocationFilter.accessToken);
//                res.then().assertThat()
//                .statusCode(404)
//                .body("message", equalTo("Not Found"));
//    }
//
//    @Test
//    public void addNewLocationInvalidBody() {
//        System.out.println("Request : "+getBaseUrl()  + requestPath+"?access_token="+ LocationFilter.accessToken);
//        Response res = given()
//                .contentType(ContentType.JSON)
//                .body("{\"name123\":\"New-Location\", \"de$criptionS\":\"Testing Location Services\" }")
//                .when()
//                .put(getBaseUrl()  + requestPath+"?access_token=" + LocationFilter.accessToken);
//                 res.then().assertThat()
//                .statusCode(404 )
//                .body("message", equalTo("Not Found"));
//    }
}
