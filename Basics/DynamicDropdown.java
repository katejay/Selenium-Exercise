package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='BOM']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='PNQ'])[2]")).click();	
		//Select element by index mech.  Syntax - (	   (//tagName[@attribute='value'])[index]	)
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='PNQ']")).click();
		//Select element by Parent - Child Relationship mech.  Syntax - ( //ParenttagName[@attribute='value'] //ChildtagName[@attribute='value'] ) 	~ Parent xPath Child xpath
		
		driver.close();
	}

}
