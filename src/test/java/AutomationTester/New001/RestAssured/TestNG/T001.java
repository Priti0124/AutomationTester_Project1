package AutomationTester.New001.RestAssured.TestNG;

import org.testng.annotations.Test;

//Depends on TestNG
//If there are some TCs which depends on some TCs then we can use Depends On method
//Condition- Login should run first and then dashboard
//We can se the priority also
public class T001 {

    @Test
    public void Login(){

        System.out.println("Login First");
    }


    @Test(dependsOnMethods = {"Login"}) //As this TC is depends on the Login TestCase
    public void Dashboard(){

        System.out.println("Open Dashboard");
    }

}


