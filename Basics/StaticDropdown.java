package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));	//Select dropdown list
		s.selectByValue("USD");			//Select option by value attribute
		s.selectByIndex(2);				//Select option by there index value
		s.selectByVisibleText("INR");	//Select option by text visible in dropdown
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText()); //Get current text on dropdown
		
		driver.close();	
	}

}
