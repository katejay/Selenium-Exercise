package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/"); //Open rahulshettyacademy/AutomationPractice webpage
		
		driver.findElement(By.id("checkBoxOption2")).click();				//Click/Check on Checkbox option2
		
		WebElement option = driver.findElement(By.xpath("//label[@for='benz']"));	//Get the Label path and store it in option variable
		String optionText = option.getText();										//Get the Label/option text and store in optionText variable
		//System.out.println(optionText);											//Print optionText in console (Extra Step)
		
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));	//Select Static drop down
		s.selectByVisibleText(optionText);											//Select option from drop down by optionText variable
		
		driver.findElement(By.id("name")).sendKeys(optionText);						//Enter the text in editbox by optionText variable
		driver.findElement(By.id("alertbtn")).click();								//Click on alert button
		
		System.out.println(driver.switchTo().alert().getText().contains(optionText));	//Check if enter text in editbox is present in alert, return true if yes, or false if not present.
		driver.switchTo().alert().accept();											//Extra step to accept the alert
		
		driver.close();			//Close the current window open by selenium
	}

}
