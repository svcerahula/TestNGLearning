package TestNGDemoClasses;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTest1 implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("successfully came to method onTestSuccess() in the listernersTest1 class ");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Test failed and came to method of listeners onTestFailure() after executing the test");
        // screenshot code for taking screenshot when a selenium testcase fails
        // rest api response if we do not get a successful status code
        System.out.println("testcase which has failed "+ iTestResult.getName());
        System.out.println(iTestResult.getMethod()+" ---- "+iTestResult.getParameters()+" ---- "+ iTestResult.getStatus());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
