package AutomationTester.New001.RestAssured.SerDes;

import com.google.gson.Gson;

public class DeSerialization {

    public static void main(String[] args) {


        //We will use deserialization when we have to verify 100s of things, then need to create class

        String bookingResponse= " {\n" +
                "    \"bookingid\": 86,\n" +
                "    \"booking\": {\n" +
                "        \"firstname\": \"Jim\",\n" +
                "        \"lastname\": \"Brown\",\n" +
                "        \"totalprice\": 111,\n" +
                "        \"depositpaid\": true,\n" +
                "        \"bookingdates\": {\n" +
                "            \"checkin\": \"2018-01-01\",\n" +
                "            \"checkout\": \"2019-01-01\"\n" +
                "        },\n" +
                "        \"additionalneeds\": \"Breakfast\"\n" +
                "    }\n" +
                "}";

        Gson gson= new Gson();
        BookingResponse bookingResponse1 = gson.fromJson(bookingResponse,BookingResponse.class);
        System.out.println(bookingResponse1.getBookingid());
        System.out.println(bookingResponse1.getBooking().getFirstname());



    }
}
