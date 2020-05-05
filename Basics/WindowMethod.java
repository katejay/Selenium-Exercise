package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Fullscreen the window
		//driver.manage().window().fullscreen();
		
		//Get window position x,y
		System.out.println(driver.manage().window().getPosition());
		
		//Get window size h,w
		System.out.println(driver.manage().window().getSize());
		
		driver.get("https://www.google.com/");
		
		driver.close();

	}

}
