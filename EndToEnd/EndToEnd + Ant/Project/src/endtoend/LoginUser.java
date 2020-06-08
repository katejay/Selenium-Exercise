package endtoend;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.HomePage;
import pageobject.LoginPage;

public class LoginUser {
	
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void getUserLogin()
	{
		driver.get("https://github.com/");
		HomePage hp = new HomePage(driver);
		hp.signIn().click();
		LoginPage lp = new LoginPage(driver);
		lp.getUsername().sendKeys("abc");
		lp.getPassword().sendKeys("pass");
		lp.submit().click();
	}
	
	@AfterTest
	public void shutdown()
	{
		driver.close();
	}
	
	
}
