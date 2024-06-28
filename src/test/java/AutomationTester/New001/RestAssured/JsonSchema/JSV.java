package AutomationTester.New001.RestAssured.JsonSchema;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.testng.annotations.Test;

import java.io.File;

public class JSV {

    @Test
    public void JSValidator(){

        RestAssured.given().baseUri("https://json-schema.org/draft/2019-09/schema").given().when().get()
                .then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(new File("src/test/java/AutomationTester/New001/RestAssured/JsonSchema/SchemaJson")));



    }
}
