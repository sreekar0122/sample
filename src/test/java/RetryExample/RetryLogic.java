package RetryExample;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer{

	
	
	int count = 0;
	int retryCount = 3;
	
	
	public boolean retry(ITestResult result) {
		
		if(count < retryCount) {
			
			count++;
			return true;
			
		}
		
		
		
		return false;
		
		
	}
	
	
	
	
	
	

}
