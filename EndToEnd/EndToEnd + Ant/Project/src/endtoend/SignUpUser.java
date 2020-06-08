package endtoend;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.HomePage;
import pageobject.SignUpPage;

public class SignUpUser {
	
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void getUserSignUp()
	{
		driver.get("https://github.com/");
		HomePage hp = new HomePage(driver);
		hp.signUp().click();
		SignUpPage sp = new SignUpPage(driver);
		sp.getUsername().sendKeys("abc");
		sp.getEmail().sendKeys("abc@gmail.com");
		sp.getPassword().sendKeys("pass");
	}
	
	@AfterTest
	public void shutdown()
	{
		driver.close();
	}


}
