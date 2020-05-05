package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22509/mi-vs-csk-final-indian-premier-league-2019");
		
		WebElement table = driver.findElement(By.cssSelector("div.cb-col.cb-col-100.cb-ltst-wgt-hdr"));
		int rows = table.findElements(By.cssSelector("div.cb-col.cb-col-100.cb-scrd-itms")).size();
		int runs = table.findElements(By.cssSelector("div.cb-col.cb-col-100.cb-scrd-itms div:nth-child(3)")).size();
		
		for(int i=0; i<runs-2; i++)
		{
			System.out.println(table.findElements(By.cssSelector("div.cb-col.cb-col-100.cb-scrd-itms div:nth-child(3)")).get(i).getText());
		}
		
		System.out.println(table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
		
		System.out.println(table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
		
		driver.close();
	}

}
