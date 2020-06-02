package endtoend.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;
	private By signin = By.linkText("Sign in");
	private By signup = By.linkText("Sign up");
	private By search = By.xpath("//input[@type='text']");
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement signIn()
	{
		return driver.findElement(signin);
	}
	
	public WebElement signUp()
	{
		return driver.findElement(signup);
	}
	
	public WebElement getSearch()
	{
		return driver.findElement(search);
	}
	
}
