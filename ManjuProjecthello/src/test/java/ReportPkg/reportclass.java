package ReportPkg;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import UtilityPkg.MyExtentReportClass;
import UtilityPkg.MyLoggerClass;

public class reportclass {
	
	MyExtentReportClass Er = new MyExtentReportClass();
	MyLoggerClass Lg =new MyLoggerClass();
  

@Test
public void Fr1Test1() throws IOException {
		
		
	
		Lg.loginfo("output");
		
		ExtentTest test1 = Er.extent.createTest("Fr1Test1 ", "Fr1Test1");
		test1.fail("failed in Fr1Test1");
		Er.takeScreenShot("test1");
		
		
  }
	
@Test
public void Fr1Test2() throws IOException {
			
			
		
			Lg.loginfo("output");
			
			ExtentTest test2 = Er.extent.createTest("Fr1Test2 ", "Fr1Test2");
			test2.pass("passed in Fr1Test2");
			Er.takeScreenShot("test2");
			
			
	  }
	
@AfterTest
public void beforeexit()
{
	Er.tearDown();
}
}





















































