package testNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenersInTestNg implements ITestListener{

	public void onTestStart(ITestResult result) {
		
		
		Reporter.log("test started :"+ getMethodName(result));
		
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("test passsed :"+getMethodName(result));
		Reporter.log("test passsed :"+getMethodName(result));
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("test failed :"+getMethodName(result));
		Reporter.log("test failed :"+getMethodName(result));
		
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped :"+getMethodName(result));
		Reporter.log("test skipped :"+getMethodName(result));
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("test passed based on percentage : "+ getMethodName(result) );
		Reporter.log("test passed based on percentage : "+ getMethodName(result) );
		
		
	}

	public void onStart(ITestContext context) {
		
		
		
	}

	public void onFinish(ITestContext context) {
		
		
	}
	
	
	private static String getMethodName(ITestResult result) {
		
		return result.getMethod().getConstructorOrMethod().getName();
		
	}

}
