package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		
		String month = "June";
		String date = "29";
		
		calendar(driver,month,date);
		
		driver.close();
	}
	
	
public static void calendar(WebDriver driver,String month,String date)
{
	driver.findElement(By.xpath("//input[@id='travel_date']")).click();			//Click on calendar button
	while(!driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']")).getText().contains(month)) //pass month
	{
		driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next']")).click();
	}
	
	List<WebElement> allDate = driver.findElements(By.cssSelector(".day"));
	int dates = driver.findElements(By.cssSelector(".day")).size();
	
	for(int i=0; i<dates; i++)
	{
		String day=driver.findElements(By.cssSelector(".day")).get(i).getText();
		if(day.equalsIgnoreCase(date))			//pass date
		{
			driver.findElements(By.cssSelector(".day")).get(i).click();
			break;
		}
	}
}

}
 	