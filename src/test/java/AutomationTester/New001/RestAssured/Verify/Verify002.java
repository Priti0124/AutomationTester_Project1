package AutomationTester.New001.RestAssured.Verify;

import AutomationTester.New001.RestAssured.JacksonAPI.Booking;
import io.qameta.allure.internal.shadowed.jackson.core.JsonProcessingException;
import io.qameta.allure.internal.shadowed.jackson.databind.ObjectMapper;
import org.testng.Assert;
import static org.assertj.core.api.Assertions.*;

public class Verify002 {

    public static void main(String[] args) throws JsonProcessingException {


        String jsonString = " {\n" +
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

        ObjectMapper objectMapper = new ObjectMapper();
        Booking booking = objectMapper.readValue(jsonString, Booking.class);

        System.out.println(booking.getLastname());

        //Booking - First name should be Jim, not NULL and should be a String

        Assert.assertEquals("Jim",booking.getFirstname() ); //80% time, we will use this

        //Use below for remaining 20% testcases
        //Use this until test cases are more than 2000
        assertThat(booking.getLastname()).isNotNull().isNotBlank().contains("Brown").isNotEmpty();
        System.out.println(booking.getLastname());

    }
}
