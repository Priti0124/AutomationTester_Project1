package AutomationTester.New001.RestAssured.CRUD.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

 public class BookingRequest {
    //Get a Token- Post method
    //Create a booking and get the ID
    //ID and token in the Put request
    //Then PUT- Verify

    //ID- 1704
    //Token- de8ec453d7907cd

     @Test
     public void putRequest(){

         //Step 1
         // Auth to get token

         RequestSpecification r= RestAssured.given();
         r.baseUri("https://restful-booker.herokuapp.com/");
         String payload= "{\n" +
                 "    \"username\" : \"admin\",\n" +
                 "    \"password\" : \"password123\"\n" +
                 "}";

         r.basePath("/auth");
         r.contentType(ContentType.JSON);
         r.body(payload);

         Response response= r.when().post();
         ValidatableResponse vr= response.then().log().all();
         vr.statusCode(200);

         //To Extract the Token
         String token = response.then().extract().path("token");
         System.out.println(token);


         //Step 2
         //Create Booking and get ID

         String payload_booking =
                 "{\n" +
                         "    \"firstname\": \"Jim\",\n" +
                         "    \"lastname\": \"Brown\",\n" +
                         "    \"totalprice\": 111,\n" +
                         "    \"depositpaid\": true,\n" +
                         "    \"bookingdates\": {\n" +
                         "        \"checkin\": \"2018-01-01\",\n" +
                         "        \"checkout\": \"2019-01-01\"\n" +
                         "    },\n" +
                         "    \"additionalneeds\": \"Breakfast\"\n" +
                         "}";


         r.basePath("booking");
         r.body(payload_booking);
         response = r.when().post();
         vr = response.then().log().all();
         vr.statusCode(200);

         //Extract Booking ID

         Integer bookingID = response.then().extract().path("bookingid");
         System.out.println(bookingID);


         //Step 3
         //We have Token and Booking ID
         //Change the name to Priti in Put Request and Verify

         String payloadPutRequest = "{\n" +
                 "    \"firstname\": \"PritiNew\",\n" +
                 "    \"lastname\": \"Brown\",\n" +
                 "    \"totalprice\": 111,\n" +
                 "    \"depositpaid\": true,\n" +
                 "    \"bookingdates\": {\n" +
                 "        \"checkin\": \"2018-01-01\",\n" +
                 "        \"checkout\": \"2019-01-01\"\n" +
                 "    },\n" +
                 "    \"additionalneeds\": \"Breakfast\"\n" +
                 "}";

         //Base path will also be changed

         r.basePath("booking/" + bookingID);
         r.cookie("token", token);
         r.body(payloadPutRequest);

         response = r.when().put();
         vr = response.then().log().all();


         //TestCase #1

         vr.statusCode(200);
         vr.body("firstname", Matchers.equalTo("PritiNew"));

         //To delete

         r.basePath("booking/" + bookingID);
         r.cookie("token", token);
         response = r.when().delete();
         vr = response.then().log().all();
         vr.statusCode(201);
     }
}
