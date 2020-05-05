package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement search = driver.findElement(By.id("autocomplete"));
		search.sendKeys("uni");
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.moveToElement(search).sendKeys(Keys.ARROW_DOWN).build().perform();
		//System.out.println(search.getAttribute("value"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = "return document.getElementById(\"autocomplete\").value;";
		String text = (String) js.executeScript(script);
		
		while(!text.equalsIgnoreCase("United Kingdom (UK)")) {
			a.moveToElement(search).sendKeys(Keys.ARROW_DOWN).build().perform();
			text = (String) js.executeScript(script);
		}
		System.out.println(text);
		
		driver.close();
	}

}
