package AutomationTester.New001.RestAssured.Verify;

import static org.assertj.core.api.Assertions.assertThat;

public class Veify003Test {

    public static void main(String[] args) {




        String responseName= "Priti";
        assertThat(responseName).isNotNull().isNotBlank().isEqualTo("Priti");
        

    }
}
