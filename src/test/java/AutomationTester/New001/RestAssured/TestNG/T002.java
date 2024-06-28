package AutomationTester.New001.RestAssured.TestNG;

import org.testng.annotations.Test;

//Depends on TestNG
//Group wise also

public class T002 {

    @Test(groups = {"init"})
    public void Login(){

        System.out.println("Login First");
    }

    @Test(groups = {"init"})
    public void Dashboard(){

        System.out.println("Open Dashboard");
    }

    @Test(dependsOnGroups = {"init.*"})
    public void Payment(){

        System.out.println("Then Payment will be done");
    }

}


