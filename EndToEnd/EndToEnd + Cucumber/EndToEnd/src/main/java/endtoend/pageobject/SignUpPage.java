package endtoend.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {
	
public WebDriver driver;
	
	public SignUpPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By username = By.id("user_login");
	private By email = By.id("user_email");
	private By password = By.id("user_password");
	
	public WebElement getUsername()
	{
		return driver.findElement(username);
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}

}
