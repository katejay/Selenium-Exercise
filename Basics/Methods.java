package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		//Methods
		System.out.println(driver.getTitle());		//Get title of current webpage
		System.out.println(driver.getCurrentUrl());	//Get Current Url of webpage for validation
		System.out.println(driver.getPageSource());	//Get Page Source *(it helpful in some situation, where right click on webpage is disable)
		driver.close();
	}

}
