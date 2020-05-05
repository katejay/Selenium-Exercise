package selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");			//Open google.com
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	//Casting to driver by TakesScreenshot and getScreenshotAs in FILE format output
		FileUtils.copyFile(src, new File("C:\\Users\\jayka\\Screenshot.png"));	//Save screenshot in system
	}

}
