package test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import main.BaseTest;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static main.RestAssuredUtil.getBaseUrl;
import static org.hamcrest.Matchers.equalTo;

public class ModifyLocation extends BaseTest {

    @Test
    public void modifyLocation() {
        String updatedName = RandomStringUtils.randomAlphanumeric(10);
        String updatedDscription = RandomStringUtils.randomAlphanumeric(20);

        AddLocation addLocation = new AddLocation();
        addLocation.addNewLocation();
        System.out.println("Update Location Request : " + getBaseUrl()  + AddLocation.requestPath +"/"+ AddLocation.id+"?access_token=" + LocationFilter.accessToken);
        Response response = given()
                .contentType(ContentType.JSON)
                .body("{\"name\":\""+ updatedName +"\", \"description\":\""+updatedDscription+"\"}")
                .when()
                .patch(getBaseUrl()  + AddLocation.requestPath +"/"+ AddLocation.id + "?access_token="+ LocationFilter.accessToken);
                 response.then().assertThat()
                .statusCode(200)
                .body("name", equalTo(updatedName))
                .body("description", equalTo(updatedDscription));

        System.out.println("Update Location Response Body: " + response.getBody().asString());

        //Verify using get call to validate the updated changes
        addLocation.verifyUsingGetLocationDetails(updatedName, updatedDscription);
    }

    @Test
    public void modifyLocationWithNullId(){
        given()
                .contentType(ContentType.JSON)
                .body("{\"name\":\""+ "Name" +"\", \"description\":\""+ "Description"+"\"}")
                .when()
                .patch(getBaseUrl()  + AddLocation.requestPath + null + "?access_token="+ LocationFilter.accessToken)
                .then()
                .assertThat()
                .statusCode(404)
                .body("message",equalTo("Not Found"));
    }

    @Test
    public void modifyLocationWithInvalidId(){
        given()
                .contentType(ContentType.JSON)
                .body("{\"name\":\""+ "Name" +"\", \"description\":\""+ "Describtion"+"\"}")
                .when()
                .patch(getBaseUrl()  + AddLocation.requestPath + "123131" + "?access_token="+ LocationFilter.accessToken)
                .then()
                .assertThat()
                .statusCode(404)
                .body("message",equalTo("Not Found"));
    }

    @Test
    public void modifyLocationWithoutToken(){
        given()
                .contentType(ContentType.JSON)
                .body("{\"name\":\""+ "Name" +"\", \"description\":\""+ "Description"+"\"}")
                .when()
                .patch(getBaseUrl()  + AddLocation.requestPath + AddLocation.id + "?access_token=")
                .then()
                .assertThat()
                .statusCode(401)
                .body("message",equalTo("Unauthorized"));
    }

    @Test
    public void modifyLocationInvalidToken(){
            given()
                    .contentType(ContentType.JSON)
                    .body("{\"name\":\""+ "Name" +"\", \"description\":\"Description"+"\"}")
                    .when()
                    .patch(getBaseUrl()  + AddLocation.requestPath +  AddLocation.id + "?access_token=" + LocationFilter.invalidAccessToken)
                    .then()
                    .assertThat()
                    .statusCode(401)
                    .body("message",equalTo("Unauthorized"));
    }
}
