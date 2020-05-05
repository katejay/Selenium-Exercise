package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowTitle {

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
		
		for(int i=1; i<footerCol.findElements(By.tagName("a")).size(); i++)
		{
			String click = Keys.chord(Keys.CONTROL,Keys.ENTER);					// Press control
			footerCol.findElements(By.tagName("a")).get(i).sendKeys(click);		//Click on links
		}
		
		Set<String> windowId = driver.getWindowHandles();						//Get all windows
		Iterator<String> itr = windowId.iterator();								//Iterate them
		
		while(itr.hasNext())													//Check any window is available
		{
			driver.switchTo().window(itr.next());								//Switch to next window
			System.out.println(driver.getTitle());								//Get title of the window
		}
		
		driver.quit();
	}

}
