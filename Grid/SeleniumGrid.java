package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		DesiredCapabilities dc = DesiredCapabilities.chrome();	//Use DesiredCapabilities to set property.
		dc.setBrowserName("chrome");							//Set browser name
		dc.setPlatform(Platform.WINDOWS);						//Set platform name
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.100:4444/wd/hub"),dc);
		driver.get("https://www.google.com");
		driver.getTitle();
		
		driver.close();
	}

}
