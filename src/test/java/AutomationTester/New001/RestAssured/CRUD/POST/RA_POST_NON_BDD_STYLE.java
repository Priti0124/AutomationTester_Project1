package AutomationTester.New001.RestAssured.CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class RA_POST_BDD_STYLE {

    // RA is very small
    // Step 1- Prepare a request -> Given
    // Step 2- Make a request -> When
    // Step 3- Verify the request -> Then


    @Test
    public void postRequest(){


        //Payload- String, HashMap, Class
        //String Payload is the worst method in payload
        //Class is the best method

        String payload= "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";


        //This is BDD Style- Chaining style
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("/auth")
                .contentType(ContentType.JSON)

                .when().body(payload).post()

                .then().log().all().statusCode(200);


    }
}




