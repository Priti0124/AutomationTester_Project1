package AutomationTester.New001.RestAssured.CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class PostRequest {

    //First you need to write a PseudoCode then write the code
    //Make a POST Request to create a Token

    //URL- https://restful-booker.herokuapp.com/auth
    //Base URI- https://restful-booker.herokuapp.com
    //Base Path- /auth

    //Payload- {
    //    "username" : "admin",
    //    "password" : "password123"
    //}

    //HTTP method- POST
    //HTTP header- Content type- json

    //Then Verify->
    // TC#1 Status Code- 200
    //TC#2 Token should not be NULL

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
