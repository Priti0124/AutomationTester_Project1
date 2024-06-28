package AutomationTester.New001.RestAssured.CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class RA_POST_NON_BDD_STYLE {

    //You need to remember 3 things in non-BDD style
    //1 RequestSpecification for Given or Preparing a Request
    //2 RequestString for When or getting a Request as a response
    //3 ValidatableResponse for Then or validate the status, token

    @Test
    public void postRequest(){

        String payload= "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

//This is Non-BDD Style, this is not chained, this is by using the references.

        //Step 1- Given
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/auth");

        //Step 2- When
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payload);
        requestSpecification.post(); //When becomes optional in case of Non-BDD, we can skip this
        Response response= requestSpecification.post();
        String responseString= response.asString();
        System.out.println(responseString);


        // Step 3- Verification of Status and Token

        ValidatableResponse validatableResponse= response.then();
        validatableResponse.statusCode(200);

    }
}




