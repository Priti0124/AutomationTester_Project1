package AutomationTester.New001.RestAssured.CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NON_BDD_STYLE_2 {

    RequestSpecification requestSpecification; //Added this in main function. Instance Variable
    Response response; //Making them as an Instance Variable
    ValidatableResponse validatableResponse; //Instance Variable

    //You need to remember 3 things in non-BDD style
    // RequestSpecification requestSpecification;
    //ResponseSpecification responseSpecification;
    //Response response;
    //ValidatableResponse validatableResponse;

    //1 RequestSpecification for Given or Preparing a Request
    //2 RequestString for When or getting a Request as a response
    //3 ValidatableResponse for Then or validate the status, token

    @BeforeTest
    public void prePostRequestCode(){

        //Added in main function, so that i don't have to run the same URL for every test case
        //Step 1- Given
        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/auth");

    }

    @Test
    public void postRequest1(){

        String payload= "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        //Step 2- When
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payload);
        requestSpecification.post(); //When becomes optional in case of Non-BDD, we can skip this
        response = requestSpecification.post();
        String responseString= response.asString();
        System.out.println(responseString);


        // Step 3- Verification of Status and Token
        validatableResponse = response.then();
        validatableResponse.statusCode(200);

    }

    @Test
    public void postRequest2(){

        String payload= "{\n" +
                "    \"username\" : \"admin1\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        //Step 2- When
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payload);
        requestSpecification.post(); //When becomes optional in case of Non-BDD, we can skip this
        response = requestSpecification.post();
        String responseString= response.asString();
        System.out.println(responseString);


        // Step 3- Verification of Status and Token
        validatableResponse = response.then();
        validatableResponse.statusCode(404);

    }
}




