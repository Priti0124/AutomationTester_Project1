package AutomationTester.New001.RestAssured.Listener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//Using the CustomListener Class and we need to tell XML file also that this is a Listener
//@Listeners(CustomListener.class)
@Listeners(CustomListener2.class)

public class ListenerDemoClass {

    //Execution Starts here
    @Test(groups = {"Sanity"})
    public void test1(){
        System.out.println("test1");
        Assert.assertTrue(true);
    }

    @Test(groups = {"Smoke"})
    public void test2(){
        System.out.println("test2");
        Assert.assertTrue(true);
    }

    //Execution Ends here
}
