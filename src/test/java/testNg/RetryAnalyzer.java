package testNg;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


/*this method decides how many times test need to be run
TestNg calls this method when ever the test fails
so we can put some code and decide how many times we rerun the test

Note : this method returns true if test needs to retire and false if not*/

public class RetryAnalyzer implements IRetryAnalyzer {
	
	
	int count=0;
	int retrylimit=3;

	public boolean retry(ITestResult result) {
		
		if(count<retrylimit) {
			
			count++;
			return true;
			
		}
		
		return false;
	}

}
