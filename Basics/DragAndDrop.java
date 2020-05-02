package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		
		WebElement source = driver.findElement(By.id("draggable"));	//Find drag element
		WebElement target = driver.findElement(By.id("droppable"));	//Find drop element
		
		Actions a = new Actions(driver);			//Use Action Class
		a.dragAndDrop(source, target).build().perform();	//Use DragAndDrop method
		
		driver.switchTo().defaultContent();			//Switch back to defaultContent from Frame
		
		driver.close();
	}

}
