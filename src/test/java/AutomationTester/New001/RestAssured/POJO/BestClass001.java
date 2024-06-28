package AutomationTester.New001.RestAssured.POJO;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class BestClass001 {

    //3 Class - Best Way

    @Test
    public void postRequest(){

//        {
//            "firstname": "Jim",
//                "lastname": "Brown",
//                "totalprice": 111,
//                "depositpaid": true,
//                "bookingdates": {
//            "checkin": "2018-01-01",
//                    "checkout": "2019-01-01"
//        },
//            "additionalneeds": "Breakfast"
//        }

        Booking booking= new Booking();
        booking.setFirstname("Jim");
        booking.setLastname("Brown");
        booking.setTotalprice(111);
        booking.setDepositpaid(true);
        booking.setAdditionalneeds("Breakfast");


        Bookingdates bookingdates= new Bookingdates();
        bookingdates.setCheckin("2018-01-01");
        bookingdates.setCheckout("2019-01-01");

        booking.setBookingdates(bookingdates);



        RestAssured
                .given().baseUri("https://restful-booker.herokuapp.com").basePath("/booking")
                .contentType(ContentType.JSON)
                .when().body(booking).post()
                .then().log().all().assertThat().statusCode(200);

    }


}
