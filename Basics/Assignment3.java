package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");	//Open itgeared demo webpage
		
		driver.findElement(By.xpath("//a[text()='Click to load get data via Ajax!']")).click();	//Click on Text Link
		
		WebDriverWait wait = new WebDriverWait(driver, 3);	//Wait for 3 seconds
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));	//Wait until to element is visible
		System.out.println(driver.findElement(By.id("results")).getText());			//Get text
		
		driver.close();
	}

}
