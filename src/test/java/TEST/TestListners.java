package TEST;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListners implements ITestListener {
	
	public void onTestStart(ITestResult result)
	{
		System.out.println(result.getName()+"Test has started");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println(result.getName()+"Test has failed");
	}
}
