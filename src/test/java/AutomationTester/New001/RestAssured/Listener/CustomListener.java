package AutomationTester.New001.RestAssured.Listener;

import org.testng.IExecutionListener;
public class CustomListener implements IExecutionListener {


    //IExecutionListener has only 2 powers, it only tells the Start and Finish
    /**
     *
     */
    @Override
    public void onExecutionStart() {
//        IExecutionListener.super.onExecutionStart();
        long startTime= System.currentTimeMillis();
        System.out.println(" *** Started Execution At-  " +  startTime + " *** ");
    }

    /**
     *
     */
    @Override
    public void onExecutionFinish() {
//        IExecutionListener.super.onExecutionFinish();
        long endTime= System.currentTimeMillis();
        System.out.println(" *** Finished Execution At-  " +  endTime + " *** ");
    }
}
