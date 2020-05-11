package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {

	@Test
	public void custLogin()
	{
		System.out.println("Customer Login");
		//Write logic / Script Here:
	}
	
	@Test
	public void userLogin()
	{
		System.out.println("User Login");
		//Write logic / Script Here:
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
		//Write logic / Script Here:
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
		//Write logic / Script Here:
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
		//Write logic / Script Here:
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
		//Write logic / Script Here:
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
		//Write logic / Script Here:
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
		//Write logic / Script Here:
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
		//Write logic / Script Here:
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
		//Write logic / Script Here:
	}
	
	
	@Test
	public void adminLogin()
	{
		System.out.println("Admin Login");
		//Write logic / Script Here:
	}
	
	@Test
	public void guestLogin()
	{
		System.out.println("Guest Login");
		//Write logic / Script Here:
	}
	
	
}
