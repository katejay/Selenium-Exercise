package selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabs {

	public static final String USERNAME = "YOUR_USERNAME";			//Enter your username
	public static final String ACCESS_KEY = "YOUR_ACCESS_KEY";		//Enter your access key
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	  
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.setCapability("platform", "Windows 10");
		dc.setCapability("version", "70.0");

			//MutableCapabilities sauceOptions = new MutableCapabilities();
			//ChromeOptions browserOptions = new ChromeOptions();
			//browserOptions.setExperimentalOption("w3c", true);
			//browserOptions.setCapability("platformName", "Windows 10");
			//browserOptions.setCapability("browserVersion", "70.0");
			//browserOptions.setCapability("sauce:options", sauceOptions);
		
		WebDriver driver = new RemoteWebDriver(new URL(URL), dc);

		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
