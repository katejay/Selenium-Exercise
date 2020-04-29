package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		
		//Locators - locate web elements.
		/* 1) Id	2) Class	3) Name	  4) link text  * 5) xPath  * 6) CSS Selector */
		
		//By Id
		//driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("pass");
		
		//By Class
		//driver.findElement(By.className("inputtext login_form_input_box")).sendKeys("abc");
		//driver.findElement(By.className("inputtext login_form_input_box")).sendKeys("pass");
		// Its shows error Compound class cannot be accepted if there is blank spaces in class name. it can be resolve by replacing blank spaces with (.) dot but class name should not alpha numeric
		
		//By Name
		//driver.findElement(By.name("email")).sendKeys("abc");
		//driver.findElement(By.name("pass")).sendKeys("pass");
		
		//By Link text
		//driver.findElement(By.linkText("Forgotten account?")).click();
		
		//By xPath - Syntax ( //tagName[@attribute='value'] )
		//driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("abc");
		//driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("pass");
		//driver.findElement(By.xpath("//*[@value=\'Log In']")).click();
		
		//By CSS Selector - Syntax ( tagName[attribute='value']  Or  tagName#id  Or  tagname.classname )
		driver.findElement(By.cssSelector("input#email")).sendKeys("abc");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("pass");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		
		
		/* Note
		1)  Classes should not have spaces- Compound classes cannot be accepted
		2)  Multiple values - Selenium identifies the first one- Scans from top left
		3)  Double quotes inside double quotes are not accepted
		4)  Xpath/CSS  can be defined in n number of ways
		5)  Rightclick copy on blue highlighted html code to generate xpath
		6)  Firepath depreciated from firefox- 
		7)  when xpath starts with html-Not reliable- Switch browser to get another one
		8)  There is no direct way to get CSS in chrome. You will find it in tool bar
		9)  Degrade browser to less firefox 55 to ge Firepath
		10) $("") - for css ,    $x("")  - for xpath
		11) //tagName[@attribute='value']  - xpath syntax
		12) tagName[attribute='value']  Or  tagName#id  Or  tagname.classname
		13) //tagName[contains(@attribute,'value')]  - xpath regular expression
		14) tagName[Atrribute*='value'] - Css regular expression 
		*/

		
		driver.close();
		
	}

}
