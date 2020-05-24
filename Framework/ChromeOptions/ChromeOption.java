import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");			//Opens Chrome in headless mode
		//option.addArguments("start-maximized");		//Opens Chrome in maximize mode
		//option.addArguments("incognito");			//Opens Chrome in incognito mode
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.rediff.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.className("live")).getText());
		driver.close();
	}

}
