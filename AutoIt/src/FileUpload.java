import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://pdftoimage.com/");
		
		driver.findElement(By.id("pick-files")).click();
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("D:\\Autoit\\File.exe");
		
		driver.close();
		
	}

}
