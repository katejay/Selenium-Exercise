package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");	//Open the-internet.herokuapp webpage
		
		driver.findElement(By.xpath("//a[text()='Dynamic Loading']")).click();	//Click on Multiple windows
		driver.findElement(By.xpath("//a[text()='Example 1: Element on page that is hidden']")).click();	//Click on Multiple windows
		driver.findElement(By.xpath("//div[@id='start']/button")).click();
		
		
	}

}
