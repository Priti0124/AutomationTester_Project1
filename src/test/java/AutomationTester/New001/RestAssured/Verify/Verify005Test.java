package AutomationTester.New001.RestAssured.Verify;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class Verify005Test {


@Test
        public void verify_Test(){

    String responseName= "Priti";
    assertThat(responseName).isNotNull().isNotBlank().isEqualTo("Priti");
    System.out.println(responseName);

    List<String> name= Arrays.asList("Pri", "Prity", "Priti");
    assertThat(name).hasSize(3).contains("Priti").doesNotContain("Kumari");

    Integer bookID= 123;
    assertThat(bookID).isNegative().isNotNull().isGreaterThan(0);




}



}
