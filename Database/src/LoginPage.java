import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends Base {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		LoginPage lp = new LoginPage();
		lp.initialize();
		
		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys(lp.getUsername());
		driver.findElement(By.id("password")).sendKeys(lp.getPassword());
		driver.findElement(By.className("signinbtn")).click();
		
		System.out.println(lp.getUsername());
		System.out.println(lp.getPassword());
		
		driver.close();
		
	}

}
