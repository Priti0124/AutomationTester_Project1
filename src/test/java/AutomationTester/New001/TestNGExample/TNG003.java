package AutomationTester.New001.TestNGExample;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TNG003  {

    @Test
    public void test(){
        System.out.println("test 1");

        //TestNG also do Verification
        //Assertion-  Expected Result == Actual Result
        // Two types of assertion supported by TestNG
        //1- Soft
        //2- Hard

        //Name- Priti and ID- 123

        //Rest assured
        String name= "Priti";

        //Soft Assert- It will make sure that code will be executed even though there is an exception
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertEquals("Priti", name);
        System.out.println("Please Execute Me");
        softAssert.assertAll();

        //Hard Assert- JVM will break the execution if there is any Exception
        //It will make sure that nothing gets printed
        //80% we will use hard assert because i want to fail my test case if something is not expected
        Assert.assertEquals("Priti",name,"failed due to mismatch");
        System.out.println("End");

    }


}
