package AutomationTester.New001.RestAssured.CRUD.POST;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class RA001 {

    @Test (groups = {"Positive"}, priority = 0)
    public void getRequest_Positive(){

        //Get Request
        //Fetch URL

        RestAssured
                .given().baseUri("https://restful-booker.herokuapp.com/ping")

                .when().get()

                .then().log().all().statusCode(201);
    }

    @Test (groups = {"Negative"}, priority = 1)
    public void getRequest_Negative(){

        RestAssured
                .given().baseUri("https://restful-booker.herokuapp.com/ping")

                .when().get()

                .then().log().all().statusCode(200);
    }
}
