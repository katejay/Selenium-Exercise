package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		String name = "Jay Kate";
		driver.findElement(By.id("name")).sendKeys("Jay");
		driver.findElement(By.id("alertbtn")).click();	
		driver.switchTo().alert().accept();		//Handle Popup/Alert by accepting it
		
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();	//Handle popup/alert by rejecting it
		
		driver.close();
	}

}
