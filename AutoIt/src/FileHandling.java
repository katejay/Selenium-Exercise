import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileHandling {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		//File Upload, Download and Delete (EndToEnd - File Handling)
		String path = System.getProperty("user.dir");
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", path);
		options.setExperimentalOption("prefs", prefs);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://pdftoimage.com/");
		
		driver.findElement(By.id("pick-files")).click();
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("D:\\Autoit\\File.exe");		//File Upload
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='download-all']")));
		driver.findElement(By.xpath("//button[@id='download-all']")).click();		//Click on download button
		
		Thread.sleep(6000);
		
		File f = new File(path+"/pdftoimage.zip");
		if(f.exists())
		{
			System.out.println("File Successfully Downloaded");
			if(f.delete())
				System.out.println("File Deleted");
		}
		else {
			System.out.println("File not found");
		}
		
		driver.close();
		
	}

}
