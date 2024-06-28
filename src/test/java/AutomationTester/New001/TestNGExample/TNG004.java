package AutomationTester.New001.TestNGExample;

import org.testng.annotations.Test;

public class TNG004 {


    //Grouping- To manage our test cases
    //Multiple QAs are working on different test cases

    @Test(groups = {"Smoke", "QA"})
    public void test1(){
        System.out.println("T1");

    }

    @Test(groups = {"Regression", "PreProd"})
    public void test2(){
        System.out.println("T2");

    }

    @Test(groups = {"Sanity", "QA"})
    public void test3(){
        System.out.println("T3");

    }
}
