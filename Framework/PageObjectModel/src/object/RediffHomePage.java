package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {
	
	WebDriver driver;
	public RediffHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	// Home Page class implemented by normal page object pattern style using By tag.
	
	By search = By.id("srchword");
	By submit = By.className("newsrchbtn");
	By signin = By.linkText("Sign In");
	
	
		
	public WebElement search()
	{
		return driver.findElement(search);
	}
	
	public WebElement submit()
	{
		return driver.findElement(submit);
	}
	
	public WebElement signin()
	{
		return driver.findElement(signin);
	}
	
}
