package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		//find no of frame present
		System.out.println(driver.findElements(By.tagName("iframe")).size());		// iframe ~ frameset
		
		//Switch to frame from defaultContent
		//driver.switchTo().frame(0);	//Switch to frame by index no
		//driver.switchTo().frame(id);	//Switch to frame by id
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame"))); //Switch to frame by web element
		
		//Get text present in frame
		System.out.println(driver.findElement(By.xpath("//div[@id='draggable']/p")).getText());
		
		//Switch back to defaultContent from frame
		driver.switchTo().defaultContent();
		
		//Get text present in defaultContent
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/h1")).getText());
		
		driver.close();
		
	}

}
