package selenium.ExtentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Basic {

	ExtentReports report;
	
	@BeforeTest
	public void config() {
		
		String path = System.getProperty("user.dir")+"\\report\\index.html";	//Get location of project and add index.html file in report folder
		ExtentSparkReporter data = new ExtentSparkReporter(path);				//ExtentSparkReporter class used to customize the report file
		data.config().setDocumentTitle("Extent Report");						//Change report file title
		data.config().setReportName("Selenium Report File");					//Change report name 
		
		report = new ExtentReports();											//ExtentReports class used to create report file
		report.attachReporter(data);											//Attach ExtentSparkReporter object to ExtentReports object
		report.setSystemInfo("Tester", "Jay Kate");								//Put System info
		
	}
	
	@Test
	public void initial() {
		ExtentTest test = report.createTest("Initial");							//Create the test so it can continue listen to create extent report
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
		report.flush();															//At the end use flush method to finish the report so it can no more monitoring for report
	}
	
	
}
