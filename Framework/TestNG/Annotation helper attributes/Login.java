package testng;

import org.testng.annotations.Test;

public class Login {

	@Test(timeOut=2000)
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
	
	@Test(enabled=false)
	public void adminLogin()
	{
		System.out.println("Admin Login");
		//Write logic / Script Here:
	}
	
	@Test(dependsOnMethods = {"userLogin"})
	public void guestLogin()
	{
		System.out.println("Guest Login");
		//Write logic / Script Here:
	}
	
	
}
