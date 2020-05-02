package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");	//Open the-internet.herokuapp webpage
		
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();	//Click on Nested Frame
		
		driver.switchTo().frame(0);												//Switch to Main frame from defaultContent
		//System.out.println(driver.findElements(By.tagName("frame")).size());	//Find no of Frame present in Main Frame (i.e = 3)
		driver.switchTo().frame(1);												//Switch to 2nd Frame in Main Frame
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());	//Get text from Frame
		
		driver.close();
	}

}
