import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		//Use this -> syntax http://username:password@url
		
		driver.findElement(By.linkText("Basic Auth")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/p")).getText());
		
		driver.close();
	}

}
