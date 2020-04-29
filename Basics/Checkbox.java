package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); 	//Check if given Checkbox is selected or not, return true if it is selected or false if not.
		driver.findElement(By.id("checkBoxOption1")).click();							//Click on given Checkbox.
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());	//Check if given Checkbox is selected or not, return true if it is selected or false if not.
		
		System.out.print(driver.findElements(By.xpath("//input[@type='checkbox']")).size()); //Find no of Checkbox is present on current webpage.
		
		driver.close();
	}

}
