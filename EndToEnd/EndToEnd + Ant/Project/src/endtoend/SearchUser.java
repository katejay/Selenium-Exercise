package endtoend;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.HomePage;
import pageobject.SearchPage;

public class SearchUser {

	public WebDriver driver;
	public SearchPage sp;

	@BeforeTest
	public void initialize() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void getUserSearch()
	{
		driver.get("https://github.com/");
		HomePage hp = new HomePage(driver);
		hp.getSearch().sendKeys("katejay");
		Actions a = new Actions(driver);
		a.moveToElement(hp.getSearch()).sendKeys(Keys.ENTER).build().perform();
		sp = new SearchPage(driver);
		sp.getUser().click();
		System.out.println(sp.selectUser().getText());
		sp.selectUser().click();	
	}	
	
	@Test
	public void getValidateUserName()
	{	
		Assert.assertEquals(sp.getUsername().getText(), "jaykate");	
	}
	
	@AfterTest
	public void shutdown()
	{
		driver.close();
	}
	
}
