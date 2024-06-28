package AutomationTester.New001.TestNGExample;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TNG002 {

    //Pre Condition
    @BeforeMethod
    public void demo1()
    {
        System.out.println("Before Method");
    }

    //This is my code
    @Test
    public void demo2()
    {
        System.out.println("Test1");
    }

    @Test
    public void demo4()
    {
        System.out.println("Test2");
    }

    //Post Condition
    @AfterMethod
    public void demo3()
    {
        System.out.println("After Method");
    }

}
