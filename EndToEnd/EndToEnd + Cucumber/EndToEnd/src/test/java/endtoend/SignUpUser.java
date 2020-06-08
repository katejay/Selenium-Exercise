package endtoend;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import endtoend.pageobject.HomePage;
import endtoend.pageobject.SearchPage;
import endtoend.pageobject.SignUpPage;
import endtoend.resources.Browser;

public class SignUpUser extends Browser{
	
	public WebDriver driver;
	
	public static Logger log = LogManager.getLogger(SignUpUser.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
	}
	
	@Test
	public void getUserSignUp()
	{
		driver.get(prop.getProperty("url"));
		HomePage hp = new HomePage(driver);
		hp.signUp().click();
		SignUpPage sp = new SignUpPage(driver);
		sp.getUsername().sendKeys("abc");
		log.info("User name successfully provided");
		sp.getEmail().sendKeys("abc@gmail.com");
		log.info("Email id successfully provided");
		sp.getPassword().sendKeys("pass");
		log.info("Password successfully provided");
	}
	
	@AfterTest
	public void shutdown()
	{
		driver.close();
	}


}
