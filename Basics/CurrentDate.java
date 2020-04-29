package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentDate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.cssSelector(".ui-datepicker-trigger")).click();	//Click on calendar button
		Thread.sleep(2000);														//Wait for 2 seconds
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();	//Click on current date
		
		driver.close();
	}

}
