package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();			//Click on first radio button
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();	//Click on from tab
		driver.findElement(By.xpath("//a[@value='BOM']")).click();						//Click on mumbai option
		
		Thread.sleep(2000);																//Wait for 2 seconds
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='PNQ']")).click();	//Click on Pune as destination
		
		Thread.sleep(2000);																	//Wait for 2 seconds
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();	//Select current date
		
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))	//Make sure return date field not allow
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		driver.findElement(By.id("divpaxinfo")).click();		//Click on Passengers Dropdown
		Thread.sleep(2000);
		for(int i=0; i<2; i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();	//For Two more adult
		}
		driver.findElement(By.id("hrefIncChd")).click();		//For single child
		driver.findElement(By.id("btnclosepaxoption")).click();	//Close dropdown
		
		Select s= new Select (driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))); //Click on currency Dropdown
		s.selectByValue("USD");			//Select option by value attribute
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();	//Select first checkbox
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();		//Click on search button
		
		driver.close();	//close window
	}

}
