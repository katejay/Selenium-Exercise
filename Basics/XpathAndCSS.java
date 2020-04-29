package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAndCSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//*Advanced Xpath and CSS Selector
		//By xPath	- Syntax ( //tagName[@attribute='value'] )
		
			//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
			//By putting tagName of Web Element.	Syntax - ( //tagName[@attribute='value'] )
		
			//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abc");
			//By putting * in tagName.		Syntax - ( //*[@attribute='value'] )
		
			//driver.findElement(By.xpath("//input[contains(@class,'login_form')]")).sendKeys("abc");
			//By using Contains, if partial (info / static info) available. Syntax - ( //tagName[contains(@attribute,'value')] )
		
			//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
			//Relative xPath (Does not depend on parent node - mostly prefer)	Syntax - ( //tagName[@attribute='value'] )
		
			//driver.findElement(By.xpath("//table[@role='presentation']/tbody/tr[2]/td/input")).sendKeys("abc");
			//Absolute xPath (Its Depend on parent - Not mostly Prefer)		Syntax - ( //tagName[@attribute='value']/child/child )
	
			//driver.findElement(By.xpath("//table[@role='presentation']/tbody/tr[2]/td/input")).sendKeys("abc");
			//Traverse Parent to Child		Syntax - ( //tagName[@attribute='value']/child/child )	~ parent/child
			
			//driver.findElement(By.xpath("//input[@id='email']/parent::td")).click();
			//Traverse Child to Parent		Syntax - ( //tagName[@attribute='value']/parent::Parent-tagName ) ~ child/parent
		
			//driver.findElement(By.xpath("//select[@id='day']/following-sibling::select[2]")).click();
			//Traverse to Sibling element	Syntax - ( //tagName[@attribute='value']/following-sibling::sibling-tagName )
		
		
		//By Text based - Used only if code is not available OR all elements attributes value are dynamic ~ Not prefer
		
			//driver.findElement(By.xpath("//*[text()='Log In']")).click();
			//Syntax - ( //tagName[text()='text on webpage'] ) Or ( //*[text()='text on webpage'] )
		
		
		//By CSS Selector - Syntax ( tagName[attribute='value']  Or  tagName#id  Or  tagname.classname )
		
			//driver.findElement(By.cssSelector("input#email")).sendKeys("abc");
			//By putting tagName of Web Element.	Syntax - ( tagName[attribute='value']  Or  tagName#id  Or  tagname.classname )
		
			//driver.findElement(By.cssSelector("#email")).sendKeys("abc");
			//without putting tagName or * of Web Element.	Syntax - ( [attribute='value']  Or  #id  Or  .classname )
		
			//driver.findElement(By.cssSelector("input[class*='login_form']")).sendKeys("abc");
			//By using (*) before (=) sign, if partial (info / static info) available. Syntax - ( tagName[attribute*='value')] )
			
			
		/* Imp
		
		Xpath supports Parent to Child as well as Child to Parent traverse.
		CSS support only Parent to Child traverse.
		CSS is faster than Xpath ~ Approx 10 times faster.
		
		 */
		
		
		driver.close();
	}

}
