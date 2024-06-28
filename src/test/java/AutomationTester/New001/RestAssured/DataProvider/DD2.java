package AutomationTester.New001.RestAssured.DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DD2 {

    //Data Driven testing
    //Run a method or a code from a source- csv, excel, json
    //CSV- 10,000 -> DDT

    @DataProvider
    public Object[][] getData(){
return new Object[][]{
        new Object[]{"admin","pass001"},
        new Object[]{"admin2","pass002"},
        new Object[]{"admin3","pass003"},

        //Instead of the above code we will Read the data from Excel file
        // and convert them into Object [][]
};
    }

    @DataProvider
    public Object[][] getDataFromExcel(){
        return new Object[][]{
                new Object[]{"admin","pass001"},
                new Object[]{"admin2","pass002"},
                new Object[]{"admin3","pass003"},
        };
    }

    //Here we can run our test cases parallely, if we have more number of test cases
    @DataProvider(name = "LoginData", parallel = true)
    public Object[][] getDataParallel(){
        return new Object[][]{
                new Object[]{"admin1","pass001"},
                new Object[]{"admin2","pass002"},
                new Object[]{"admin3","pass003"},
                new Object[]{"admin4","pass004"},
                new Object[]{"admin5","pass005"},
                new Object[]{"admin6","pass006"},
        };
    }


    @Test(dataProvider = "LoginData")
    public void loginTest(String username, String password){

        System.out.println(username+ "->" +password);
    }



}
