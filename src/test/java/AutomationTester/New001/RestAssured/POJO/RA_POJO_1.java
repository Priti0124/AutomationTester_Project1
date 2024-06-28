package AutomationTester.New001.RestAssured.POJO;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class RA_POJO_1 {

    @Test

    public void authRequest(){


//        String payload_auth = "{ \n" +
//                " \"username\" : \"admin\", \n" +
//                " \"password\" : \"password123\", \n" +
//                "}";


        Auth auth= new Auth();
        auth.setUsername("admin");
        auth.setPassword("password123");

        RestAssured

                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON)
                .when().body(auth).post()
                .then().log().all().statusCode(200);
    }
}
