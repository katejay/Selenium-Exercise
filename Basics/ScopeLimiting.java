package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScopeLimiting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());		//Get all links present in webpage
		
		WebElement footer = driver.findElement(By.id("gf-BIG"));				//Scope Limiting
		System.out.println(footer.findElements(By.tagName("a")).size());		//Get all links present in footer of this webpage
		
		WebElement footerCol = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));	//Scope Limiting
		System.out.println(footerCol.findElements(By.tagName("a")).size());		//Get all links present in footer first column
		
		driver.close();
	}

}
