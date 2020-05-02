package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");	//Open Gmail webpage
		
		driver.manage().window().maximize();							//Maximize the window
		
		driver.findElement(By.xpath("//a[text()='Privacy']")).click();	//Click on privacy Button
		System.out.println(driver.getTitle());							//Get Parent window title
		
		Set<String> id= driver.getWindowHandles();						//Get all windows
		Iterator<String> itr = id.iterator();							//Iterate them
		String parentId = itr.next();									//Get parent window
		String childId = itr.next();									//Get child window
		
		driver.switchTo().window(childId);								//Switch to Child window
		System.out.println(driver.getTitle());							//Get Child window title
		
		driver.switchTo().window(parentId);								//Switch back to Parent window
		System.out.println(driver.getTitle());							//Get Parent window title
		
		driver.quit();
	}

}
