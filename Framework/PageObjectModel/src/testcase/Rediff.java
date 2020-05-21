package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import object.RediffHomePage;
import object.RediffLoginPage;

public class Rediff {

	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");

		RediffHomePage hp = new RediffHomePage(driver);		//Rediff Home Page
		hp.search().sendKeys("abc");
		hp.submit().click();
		hp.signin().click();
		
		RediffLoginPage lp = new RediffLoginPage(driver);	//Rediff Login Page
		lp.login().sendKeys("abc");
		lp.password().sendKeys("pass");
		lp.submit().click();
		
		driver.close();
		
	}
	
}
