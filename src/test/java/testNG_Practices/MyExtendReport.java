package testNG_Practices;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class MyExtendReport implements ITestListener{

	public ExtentSparkReporter sparkreporter; // UI report
	public ExtentReports report;// populate common info on the report
	public ExtentTest test;// creating test case entries in the report and update status of the test methods
	
public void onStart(ITestContext context) {
	    
		sparkreporter=new ExtentSparkReporter(System.getProperty("C:\\Users\\P R MEGAVARSHINI\\git\\Selenium_Basics\\Reports\\report.html"));
		sparkreporter.config().setDocumentTitle("Automation Report");
		sparkreporter.config().setReportName("Fuctional Testing");
		sparkreporter.config().setTheme(Theme.DARK);
		
		report=new ExtentReports();
		report.attachReporter(sparkreporter);
		
		report.setSystemInfo("Computer Name", "Local host");
		report.setSystemInfo("Environment", "QA");
		report.setSystemInfo("Tester Name", "Radhakrishnan");
		report.setSystemInfo("os", "Windows11");
		report.setSystemInfo("Browser Name", "Chrome");
	  }

	public void onTestStart(ITestResult result) {
	    
		
		
	  }
	public void onTestSuccess(ITestResult result) {
	    
		test=report.createTest(result.getName()); //create a new entry in the report
		test.log(Status.PASS, "Test case PASSED is: " + result.getName()); // update status p/f/s
		
	  }
	public void onTestFailure(ITestResult result) {

		test=report.createTest(result.getName());
		test.log(Status.FAIL, "Test case FAILED is :" + result.getName());
		test.log(Status.FAIL, "Test case is fail cause :" + result.getThrowable());
	  }
	public void onTestSkipped(ITestResult result) {
	    
		test=report.createTest(result.getName());
		test.log(Status.SKIP, "Test case is skipped :" + result.getName());
	  }
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    
		
	  }
	public void onTestFailedWithTimeout(ITestResult result) {
	    
		
	  }
	
	public void onFinish(ITestContext context) {
	    
		report.flush();
	  }
}
