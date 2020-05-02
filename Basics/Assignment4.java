package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");	//Open the-internet.herokuapp webpage
		
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();	//Click on Multiple windows
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();		//Click on Click Here
		
		Set<String> id= driver.getWindowHandles();								//Get all windows
		Iterator<String> itr= id.iterator();									//Iterate them
		String parentId = itr.next();											//Get Parent Window id
		String childId = itr.next();											//Get Child Window id
		
		driver.switchTo().window(childId);										//Switch to Child window
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());	//Get text from child window and print it on console
		
		driver.switchTo().window(parentId);										//Switch back to Parent window
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());	//Get text from Parent window and print it on console
		
		driver.quit();		//Close all window open by Selenium
	}

}
