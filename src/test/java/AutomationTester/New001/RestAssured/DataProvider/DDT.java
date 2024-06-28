package AutomationTester.New001.RestAssured.DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT {

    //Data Driven testing
    //Run a method or a code from a source- csv, excel, json
    //CSV- 10,000 -> DDT

    @DataProvider
    public Object[][] getData(){
return new Object[][]{
        new Object[]{"admin","pass001"},
        new Object[]{"admin2","pass002"},
        new Object[]{"admin3","pass003"},

};
    }

    @Test(dataProvider = "getData")
    public void loginTest(String username, String password){

        System.out.println(username+ "->" +password);
    }



}
