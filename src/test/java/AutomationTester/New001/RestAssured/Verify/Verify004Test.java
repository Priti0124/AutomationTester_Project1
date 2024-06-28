package AutomationTester.New001.RestAssured.Verify;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Verify004Test {


@Test
        public void verify_Test(){

    String responseName= "Priti";
    assertThat(responseName).isNotNull().isNotBlank().isEqualTo("Priti");
    System.out.println(responseName);

}



}
