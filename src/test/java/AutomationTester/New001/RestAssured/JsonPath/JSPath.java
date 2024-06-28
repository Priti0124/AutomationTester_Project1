package AutomationTester.New001.RestAssured.JsonPath;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class JSPath {

    public static void main(String[] args) {

//This JsonPath we are going to use when we do not want Deserialization
        // String ->Object

        String response= " {\n" +
                "    \"bookingid\": 1509,\n" +
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

        JsonPath jsonPath= JsonPath.from(response);
        System.out.println(jsonPath.getString("booking.firstname"));

        //Matchers - 5% We do not prefer them
        //There are 4-5 limited functions by default in RestAssured
        System.out.println(jsonPath.getString("booking.bookingdates.checkin"));



        //TestNG assert - 80%
        Assert.assertEquals(jsonPath.getString("firstname"),"Jim");

        //AssertJ  15%
        assertThat(jsonPath.getString("firstname")).isNotNull().isNotEmpty().isEqualTo("Jim");



    }
}



