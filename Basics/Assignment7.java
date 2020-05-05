package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement table = driver.findElement(By.cssSelector("table.table-display"));	//Scope Limiting to table
		
		System.out.println(table.findElements(By.cssSelector("tr")).size());			//Print no of rows in console
		
		System.out.println(table.findElements(By.cssSelector("tr th")).size());			//Print no of column in console
		
		System.out.println(table.findElement(By.xpath("//tr[3]")).getText());			//Print 3rd row include title in console

		driver.close();
	}

}
