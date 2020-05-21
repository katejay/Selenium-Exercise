package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPage {

	WebDriver driver;
	public RediffLoginPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Login Page class implemented by page object factory method using @FindBy tag.
	
	@FindBy(name="logid")
	WebElement login;
	
	@FindBy(name="pswd")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	
	public WebElement login()
	{
		return login;
	}
	
	public WebElement password()
	{
		return password;
	}
	
	public WebElement submit()
	{
		return submit;
	}
	
}
