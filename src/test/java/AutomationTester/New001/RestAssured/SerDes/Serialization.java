package AutomationTester.New001.RestAssured.SerDes;

import AutomationTester.New001.RestAssured.POJO.Booking;
import AutomationTester.New001.RestAssured.POJO.Bookingdates;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Serialization {

    public static void main(String[] args) {

        //Converts Java Object to String
        //Because this is a lightweight mechanism to transfer from client to server


        Booking booking= new Booking();
        booking.setFirstname("Jim");
        booking.setLastname("Brown");
        booking.setTotalprice(111);
        booking.setDepositpaid(true);
        booking.setAdditionalneeds("Breakfast");


        AutomationTester.New001.RestAssured.POJO.Bookingdates bookingdates= new Bookingdates();
        bookingdates.setCheckin("2018-01-01");
        bookingdates.setCheckout("2019-01-01");

        booking.setBookingdates(bookingdates);

        Gson gson= new Gson();
        String bookingStringPayload = gson.toJson(booking);
        System.out.println(bookingStringPayload);

        RestAssured
                .given().baseUri("https://restful-booker.herokuapp.com").basePath("/booking")
                .contentType(ContentType.JSON)
                .when().body(bookingStringPayload).post()
                .then().log().all().statusCode(200);


    }


}
