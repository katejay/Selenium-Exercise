package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCookie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Delete all Cookies
		driver.manage().deleteAllCookies();
		
		//Delete particular cookie	- if it is named as sessionKey then after that we need to login again for such scenario
		driver.manage().deleteCookieNamed("sessionKey");
		
		driver.get("https://www.google.com/");
		
		driver.close();
	}

}
