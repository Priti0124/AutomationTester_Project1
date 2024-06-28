package AutomationTester.New001;

public class Main {
    public static void main(String[] args) {
        //Rest Assured- Library,which help you to make HTTP request + verify it
        //TestNG- To manage our test cases- testing framework
        //Allure Report- Reporting Purpose
        //Maven- Build and dependency management and taking care of our projects
        // Rest assured- BDD Syntacx- Given -> When -> Then
        //It follows a Builder Pattern

        NonBuilderPattern nonBuilderPattern= new NonBuilderPattern();
        nonBuilderPattern.groundFloor();
        nonBuilderPattern.firstFloor();
        nonBuilderPattern.secondFloor();

        BuilderPattern bp= new BuilderPattern();
        bp.groundFloor().firstFloor().secondFloor(); //this is called as function chaining
    }
}
