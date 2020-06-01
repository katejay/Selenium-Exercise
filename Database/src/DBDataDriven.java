import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DBDataDriven {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String host = "localhost";
		String port = "3306";
		String user = "root";
		String password = "root";
		
		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/demo", user, password);
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from employee_info where emp_transaction_attempt = 0");
		
		rs.next();
		
		String emp_username = rs.getString("emp_username");
		String emp_password = rs.getString("emp_password");
		System.out.println(emp_username +" "+ emp_password );
		
		
		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys(emp_username);
		driver.findElement(By.id("password")).sendKeys(emp_password);
		driver.findElement(By.className("signinbtn")).click();
		
		driver.close();
	}
}