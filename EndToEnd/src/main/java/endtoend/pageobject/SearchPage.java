package endtoend.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

	public WebDriver driver;
	
	public SearchPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By users = By.partialLinkText("Users");
	private By selectuser = By.xpath("//a[@class='mr-1']");
	private By username = By.xpath("//span[@itemprop='additionalName']");
	
	
	public WebElement getUser()
	{
		return driver.findElement(users);
	}
	
	public WebElement selectUser()
	{
		return driver.findElement(selectuser);
	}
	
	public WebElement getUsername()
	{
		return driver.findElement(username);
	}
}
