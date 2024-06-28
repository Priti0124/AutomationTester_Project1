package AutomationTester.New001.RestAssured.Full_CRUD;

import AutomationTester.New001.RestAssured.POJO.Booking;
import AutomationTester.New001.RestAssured.POJO.Bookingdates;
import AutomationTester.New001.RestAssured.SerDes.BookingResponse;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostRequest {

    @Test

            public void postRequestTC1(){

        Gson gson;


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

        gson= new Gson();
        String bookingStringPayload = gson.toJson(booking);
        System.out.println(bookingStringPayload);

        RequestSpecification r= RestAssured.given();
                r.baseUri("https://restful-booker.herokuapp.com");
                r.basePath("/booking");
                r.contentType(ContentType.JSON);


                        Response response= r.when().body(bookingStringPayload).post();
                        ValidatableResponse vr= response.then().log().all().statusCode(200);

                        String responseString= response.asString();

        gson= new Gson();
       BookingResponse bookingResponse1 = gson.fromJson(responseString, BookingResponse.class);
        System.out.println(bookingResponse1.getBookingid());
        System.out.println(bookingResponse1.getBooking().getFirstname());

        Assert.assertEquals(bookingResponse1.getBooking().getLastname(),"Brown");
        Assert.assertEquals(bookingResponse1.getBooking().getBookingdates().getCheckin(),"2018-01-01");






    }



}
