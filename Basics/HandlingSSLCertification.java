package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingSSLCertification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DesiredCapabilities dc = DesiredCapabilities.chrome();
		
		dc.acceptInsecureCerts();		//Accept Insecure Certificate by acceptInsecureCerts()
					//OR
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);	//Accept Insecure Certificate by setCapability
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true); 		//Accept SSL Certificate by setCapability
		
		ChromeOptions c = new ChromeOptions();
		c.merge(dc);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		
		driver.get("https://www.google.com");
		
		driver.close();
	}

}
