package endtoend;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import endtoend.pageobject.HomePage;
import endtoend.pageobject.LoginPage;
import endtoend.resources.Browser;

public class LoginUser extends Browser {

	public WebDriver driver;
	
	public static Logger log = LogManager.getLogger(LoginUser.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
	}
	
	@Test
	public void getUserLogin()
	{
		driver.get(prop.getProperty("url"));
		HomePage hp = new HomePage(driver);
		hp.signIn().click();
		LoginPage lp = new LoginPage(driver);
		lp.getUsername().sendKeys("abc");
		log.info("User name successfully provided");
		lp.getPassword().sendKeys("pass");
		log.info("Password successfully provided");
		lp.submit().click();
		log.error("Wrong User name & Password");
	}
	
	@AfterTest
	public void shutdown()
	{
		driver.close();
	}
	
	
}
