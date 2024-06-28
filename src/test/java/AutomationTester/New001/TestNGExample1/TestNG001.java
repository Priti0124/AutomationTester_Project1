package AutomationTester.New001.TestNGExample1;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class TestNG001 {

    @Test

    public void getRequest(){
        RestAssured
                .given().baseUri("https://restful-booker.herokuapp.com/ping")

                .when().get()

                .then().log().all().statusCode(201);
    }
}
