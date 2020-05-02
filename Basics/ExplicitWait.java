package selenium;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/");
		
		WebDriverWait wait = new WebDriverWait(driver,5);		//Explicit wait
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		
		String[] itemNeeded = {"Cucumber","Brocolli","Beetroot","Carrot"};
		addItem(driver,itemNeeded);
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
	}
	
	public static void addItem(WebDriver driver,String[] itemNeeded) {
		
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		int j=0;
		List itemNeededList = Arrays.asList(itemNeeded); 
		
		for (int i=0; i<product.size(); i++)
		{
			String[] name = product.get(i).getText().split("-");
			String items = name[0].trim();
			
			if(itemNeededList.contains(items))
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				j++;
				if(j==itemNeeded.length)
				{
					break;
				}
			}
		}
		
	}

}
