package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();	//Click on Edittext
		Thread.sleep(2000);
		WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));	//Select Source Edittext
		from.sendKeys("MU");		//Enter 'MU'
		Thread.sleep(2000);			//Wait for 2 seconds
		for(int i=0; i<2;i++)		
		{
			from.sendKeys(Keys.ARROW_DOWN);		//Click arrow down 2 times
		}
		from.sendKeys(Keys.ENTER);				//Click Enter
		
		
		WebElement to = driver.findElement(By.xpath("//input[@placeholder='To']")); //Select destination Edittext
		to.sendKeys("PUN");					//Enter 'PUN'
		Thread.sleep(2000);					//Wait for 2 seconds
		to.sendKeys(Keys.ARROW_DOWN);		//Click arrow down 1 time
		to.sendKeys(Keys.ENTER);			//Click Enter
		
		driver.close();
	}

}
