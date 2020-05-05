package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Table1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22509/mi-vs-csk-final-indian-premier-league-2019");
		
		int sum = 0;
		WebElement table = driver.findElement(By.cssSelector("div.cb-col.cb-col-100.cb-ltst-wgt-hdr"));
		int rows = table.findElements(By.cssSelector("div.cb-col.cb-col-100.cb-scrd-itms")).size();
		int runs = table.findElements(By.cssSelector("div.cb-col.cb-col-100.cb-scrd-itms div:nth-child(3)")).size();
		
		for(int i=0; i<runs-2; i++)
		{
			String run = table.findElements(By.cssSelector("div.cb-col.cb-col-100.cb-scrd-itms div:nth-child(3)")).get(i).getText();	//Parent to child Traverse
			int runValue = Integer.parseInt(run);				//Convert string to int
			sum= sum + runValue;
		}
		//System.out.println(sum);
		
		String extras = table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();			//Sibling Traverse
		int extrasValue = Integer.parseInt(extras);				//Convert string to int
		int expectedTotal = sum + extrasValue;
		System.out.println(expectedTotal);						//Get expected total
		
		String total = table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();		
		int actualTotal = Integer.parseInt(total);
		System.out.println(actualTotal);						//Get actual total
		
		if(actualTotal==expectedTotal)							//Validate using if else
		{
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		Assert.assertEquals(expectedTotal, actualTotal);		//Validate using assert
		
		driver.close();
	}

}
