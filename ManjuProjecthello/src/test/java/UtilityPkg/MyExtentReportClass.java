package UtilityPkg;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.OutputType;


public class MyExtentReportClass {
	
	public static WebDriver driver ;
	private static ExtentHtmlReporter htmlReporter ;
	public static ExtentReports extent ;
	
	
    

	//ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports1.html");
	//ExtentReports extent = new ExtentReports();
    
	
	public MyExtentReportClass()
	{  
		System.setProperty("webdriver.ie.driver", "C:\\Manju\\Selenium\\iedriver\\IEDriverServer.exe");		
    	driver = new InternetExplorerDriver();
		driver.get("https://www.hsn.com");
			htmlReporter= new ExtentHtmlReporter("extentReportsnew.html");
		    extent = new ExtentReports();
	    	extent.attachReporter(htmlReporter);    	
	    
	}

	
	
	public void tearDown() 
	{
			 extent.flush();
			 
	}
	
	 public static <FILE> String takeScreenShot(String screenShotName) throws IOException {
	        
	        //create a string variable which will be unique always
	        String df = new SimpleDateFormat("yyyyMMddhhss").format(new Date(0));
	        
	        //create object variable of TakeScreenshot class  
	        TakesScreenshot ts = (TakesScreenshot)driver;
	        
	        //create File object variable which holds the screen shot reference 
	        File source = ts.getScreenshotAs(OutputType.FILE);
	        
	        //store the screen shot path in path variable. Here we are storing the screenshots under screenshots folder 
	        String path = System.getProperty("user.dir") + "/test-output/screenshots/" + screenShotName + df + ".png";
	        
	        //create another File object variable which points(refer) to the above stored path variable
	        File destination = new File(path);
	        
	        //use FileUtils class method to save the screen shot at desired path
	        FileUtils.copyFile(source, destination);
	        
	        //return the path where the screen shot is saved 
	        return path;
	        
	    
	        
	        
	    }

}
