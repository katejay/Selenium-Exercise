package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedStaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		for(int i=0; i<2; i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();	//For Two more adult
		}
		
		driver.findElement(By.id("hrefIncChd")).click();		//For single child
		
		driver.findElement(By.id("btnclosepaxoption")).click();	//Close dropdown
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());	//Get current text on dropdown
		
		driver.close();
		
	}

}
