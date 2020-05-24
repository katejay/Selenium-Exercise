package endtoend.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	public static WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\endtoend\\resources\\data.properties");
		prop.load(fis);
		//String BrowserName = System.getProperty("browser");
		String BrowserName = prop.getProperty("browser");
		
		if(BrowserName.contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "src\\main\\java\\endtoend\\resources\\chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("start-maximized");
			if(BrowserName.contains("headless"))
			{
				option.addArguments("--headless");
			}
			driver = new ChromeDriver(option);
		}
		
		else if(BrowserName.contains("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "src\\main\\java\\endtoend\\resources\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}
	
	
	public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));		//Use Apache Commons IO dependency
		return destinationFile;
	}
	
}
