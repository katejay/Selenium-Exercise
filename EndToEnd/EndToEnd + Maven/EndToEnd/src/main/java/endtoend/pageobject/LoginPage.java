package endtoend.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By username = By.id("login_field");
	private By password = By.id("password");
	private By submit = By.xpath("//input[@type='submit']");
	
	public WebElement getUsername()
	{
		return driver.findElement(username);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);	
	}
	
	public WebElement submit()
	{
		return driver.findElement(submit);
	}
	
}
