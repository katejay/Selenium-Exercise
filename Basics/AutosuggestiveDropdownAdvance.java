package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropdownAdvance {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
		int i = 0;
		WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
		search.sendKeys("jay kate");
		Thread.sleep(2000);
		search.sendKeys(Keys.ARROW_DOWN);
		String text = search.getAttribute("value");		//Using getAttribute method
		
		while(!text.equalsIgnoreCase("jay kate")) {
			i++;
			search.sendKeys(Keys.ARROW_DOWN);
			text = search.getAttribute("value");
			if(i>10) {
				break;
			}
		}
		System.out.println(text);
		
		if(i<10) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}
		
		driver.close();
	}

}
