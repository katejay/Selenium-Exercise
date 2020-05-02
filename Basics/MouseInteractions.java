package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseInteractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");		//Open Amazon website
		
		Actions a= new Actions(driver);				//Use Action class for mouse interaction
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();		//Move to specific element
		
		WebElement prime = driver.findElement(By.id("nav-link-prime"));		//Using WebElement
		a.moveToElement(prime).build().perform();							//Move to specific element
		
		a.moveToElement(prime).contextClick().build().perform();			//Right Click on webpage
		
		driver.close();
	}

}
