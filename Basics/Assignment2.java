package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");	//Open Cleartrip website
		
		Select ad = new Select(driver.findElement(By.id("Adults")));	//Click on Adult dropdown
		ad.selectByValue("2");											//Select 2
		
		Select ch = new Select(driver.findElement(By.id("Childrens")));	//Click on Childrean dropdown
		ch.selectByValue("1");											//Select 1
		
		driver.findElement(By.id("DepartDate")).click();				//Click on Departdate
		Thread.sleep(2000);												//Wait for 2 seconds
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();	//Select current date
		
		driver.findElement(By.id("MoreOptionsLink")).click();			//Click on More Option tab
		Thread.sleep(2000);												//Wait for 2 seconds
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");	//Enter Indigo in editbox
		
		driver.findElement(By.id("SearchBtn")).click();					//Click on Search button
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());	//Get error message and print it on console
			
		driver.close();		//close browser window
	}

}
