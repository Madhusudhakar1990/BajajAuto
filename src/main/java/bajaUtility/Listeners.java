package bajaUtility;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners implements ITestListener
{
	ExtentTest test ;
	ExtentReports reprt = new ExtentReports();
	
	public void onTestStart(ITestResult result) 
	{
		
		test = Base.reprt.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) 
	{
		test.log(Status.PASS, "Test Pass");
		Base.reprt.flush();
	}
	public void onTestFailure(ITestResult result) 
	{
		test.log(Status.FAIL, "Test Fail");
		test.fail(result.getThrowable());
	//	Base.reprt.flush();
	}
	public void onTestSkipped(ITestResult result) 
	{
	
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
	
	}
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		
	}
	public void onStart(ITestResult result) 
	{
	
	}
	public void onFinish(ITestResult result) 
	{
		Base.reprt.flush();
	}
	
}
