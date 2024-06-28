package AutomationTester.New001.RestAssured.MISC;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class PostRequest {

    //Keep your payload in 3 ways
    //1 String - Worst Way
    //2 HashMap - Also a bad way to manage the payload
    //3 Class - Best Way

    @Test
    public void postRequest(){
        Map h= new HashMap();
        h.put("name","Jim");
        System.out.println(h);

        Map<String,Object> jsonBodyUsingMap = new LinkedHashMap();
        jsonBodyUsingMap.put("firstname","Jim");
        jsonBodyUsingMap.put("lastname","Brown");
        jsonBodyUsingMap.put("totalprice",111);
        jsonBodyUsingMap.put("depositpaid",true);
        jsonBodyUsingMap.put("additionalneeds","Breakfast");


        Map<String, Object> bookingDatesMap = new LinkedHashMap();
        bookingDatesMap.put("checkin", "2018-01-01");
        bookingDatesMap.put("checkout", "2018-02-01");

        jsonBodyUsingMap.put("bookingDates", bookingDatesMap);
        System.out.println(jsonBodyUsingMap);

        RestAssured
                .given().baseUri("https://restful-booker.herokuapp.com").basePath("/booking")
                .contentType(ContentType.JSON)
                .when().body(jsonBodyUsingMap).post()
                .then().log().all().assertThat().statusCode(500);

    }


}
