package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//For Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close(); 	// close current window
		//driver.quit(); 	//close all windows open by selenium
		
	/*	
		//For Firefox Browser
		System.setProperty("webdriver.gecko.driver", "Path");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.close();
		
		//For IE Browser
		System.setProperty("webdriver.ie.driver", "Path");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
		driver.close();
	*/
		
	}

}
