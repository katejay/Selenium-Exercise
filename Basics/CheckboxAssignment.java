package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption1")).click();							//Click on first Checkbox.
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());	//Check if first Checkbox is selected or not, return true if it is selected or false if not.
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		driver.findElement(By.id("checkBoxOption1")).click();							//Click again on first Checkbox.
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); 	//Check if first Checkbox is unselected or not, return true if it is selected or false if not.
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		System.out.print(driver.findElements(By.xpath("//input[@type='checkbox']")).size()); //Find no of Checkbox is present on current webpage.
		Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(), "3");
		
		driver.close();
	}

}
