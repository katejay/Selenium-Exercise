package datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Selenium\\Project\\Selenium-Exercise\\datadriven\\data.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		
		FileOutputStream op = new FileOutputStream("C:\\Selenium\\Project\\Selenium-Exercise\\datadriven\\data.properties");
		prop.store(op, "New comment");
		prop.setProperty("os", "Windows");
		System.out.println(prop.getProperty("os"));
		
	}

}
