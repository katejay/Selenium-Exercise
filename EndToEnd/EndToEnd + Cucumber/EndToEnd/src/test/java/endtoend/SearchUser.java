package endtoend;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import endtoend.pageobject.HomePage;
import endtoend.pageobject.SearchPage;
import endtoend.resources.Browser;

public class SearchUser extends Browser {

	public WebDriver driver;
	public SearchPage sp;
	
	public static Logger log = LogManager.getLogger(SearchUser.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
	}
	
	@Test
	public void getUserSearch()
	{
		driver.get(prop.getProperty("url"));
		HomePage hp = new HomePage(driver);
		hp.getSearch().sendKeys("katejay");
		Actions a = new Actions(driver);
		a.moveToElement(hp.getSearch()).sendKeys(Keys.ENTER).build().perform();
		sp = new SearchPage(driver);
		sp.getUser().click();
		System.out.println(sp.selectUser().getText());
		sp.selectUser().click();	
		log.info("Successfully user identify");		
	}	
	
	@Test
	public void getValidateUserName()
	{	
		log.error("expected [jaykate] but found [katejay]");
		Assert.assertEquals(sp.getUsername().getText(), "jaykate");	
	}
	
	@AfterTest
	public void shutdown()
	{
		driver.close();
	}
	
}
