package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardInteractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");		//Open Amazon website
		
		Actions a = new Actions(driver);
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("iphone").build().perform();	//Move to specific element
		
		driver.close();
	}

}
