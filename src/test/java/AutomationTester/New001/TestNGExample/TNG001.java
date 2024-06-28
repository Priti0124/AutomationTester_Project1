package AutomationTester.New001.TestNGExample;

import org.testng.annotations.*;

public class TNG001 {

    // TestNG Concept
    // Annotation and how TestNG works with RA

//    @Test
//    public void personal_loan()
//    {
//        System.out.println("Personal Loan");
//    }


    //Pre

    @BeforeSuite //Read data from Excel
    public void before_suite()
    {
        System.out.println("First method");
    }

    @BeforeTest
    public void before_test()
    {
        System.out.println("Second method");
    }

    @BeforeClass
    public void before_class()
    {
        System.out.println("Third method");
    }

    @BeforeMethod
    public void before_method()
    {
        System.out.println("Forth method");
    }

    @Test  //This will be my code
    public void test()
    {
        System.out.println("Fifth method");
    }

    //Post

    @AfterMethod
    public void after_method()
    {
        System.out.println("Sixth method");
    }

    @AfterClass
    public void after_class()
    {
        System.out.println("Seven method");
    }

    @AfterTest
    public void after_test()
    {
        System.out.println("Eight method");
    }

    @AfterSuite // Close the SQL database here
    public void after_suite()
    {
        System.out.println("Nine method");
    }
}
