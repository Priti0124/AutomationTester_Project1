package AutomationTester.New001.RestAssured.Verify;

import org.testng.Assert; //80% of the work is done by Assertion

public class Verify001 {

    public static void main(String[] args) {


        String responseName= "Priti";
        Assert.assertEquals("Priti",responseName );
        Assert.assertTrue(true);
        System.out.println(responseName);
    }
}
