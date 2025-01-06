package Day29;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Demo2 {

	public static void main(String[] args) {
	
		ExtentReports extent =new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("./target/myreport.html");
		extent.attachReporter(spark);
		ExtentTest test1=extent.createTest("ValidLogin");
		test1.log(Status.INFO,"open the browser");
		test1.info("Enter the url");
		
		ExtentTest test2=extent.createTest("InvalidLogin");
		test2.info("this is info");
		test2.warning("this is warning");
		test2.pass("this is pass");
		test2.fail("this is fail");
		
		
		extent.flush();
		System.out.println("done");
		

	}

}
