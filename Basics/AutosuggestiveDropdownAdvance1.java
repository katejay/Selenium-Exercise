package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropdownAdvance1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		int i = 0;
		WebElement search = driver.findElement(By.id("autocomplete"));
		search.sendKeys("uni");
		Thread.sleep(2000);
		search.sendKeys(Keys.ARROW_DOWN);
		//System.out.println(search.getText()); 	//When getText() is not working because of hidden element, at that time use JavascriptExecutor
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = "return document.getElementById(\"autocomplete\").value;";
		String text = (String) js.executeScript(script);
		
		while(!text.equalsIgnoreCase("United Kingdom (UK)")) {
			i++;
			search.sendKeys(Keys.ARROW_DOWN);
			text = (String) js.executeScript(script);
			if(i>10) {
				break;
			}	
		}
		System.out.println(text);
		
		if(i<5) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}
		
		driver.close();
	}

}
