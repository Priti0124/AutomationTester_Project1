package AutomationTester.New001.RestAssured.Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener2 implements ITestListener {

    //How this is useful
    //If my Test case fails then i can write a code to take a screenshot at line 38
    //Or i can write a code to email the failed test case

    /**
     * @param result
     */
    @Override
    public void onTestStart(ITestResult result) {
//        ITestListener.super.onTestStart(result);
        System.out.println("Start the Test");
    }

    /**
     * @param result
     */
    @Override
    public void onTestSuccess(ITestResult result) {
//        ITestListener.super.onTestSuccess(result);
        System.out.println("Pass the Test");
    }

    /**
     * @param result
     */
    @Override
    public void onTestFailure(ITestResult result) {
//        ITestListener.super.onTestFailure(result);
        System.out.println("Fail the Test");
    }

    /**
     * @param result
     */
    @Override
    public void onTestSkipped(ITestResult result) {
//        ITestListener.super.onTestSkipped(result);
        System.out.println("Skip the Test");
    }

    /**
     * @param result
     */
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    /**
     * @param result
     */
    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    /**
     * @param context
     */
    @Override
    public void onStart(ITestContext context) {
//        ITestListener.super.onStart(context);
        System.out.println("Started, Report to Mother");
    }

    /**
     * @param context
     */
    @Override
    public void onFinish(ITestContext context) {
//        ITestListener.super.onFinish(context);
        System.out.println("Finished, Report to Mother");

    }
}
