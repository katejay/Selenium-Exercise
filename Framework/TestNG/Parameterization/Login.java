package testng;

import org.testng.annotations.Parameters;
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
	
	@Test
	public void adminLogin()
	{
		System.out.println("Admin Login");
		//Write logic / Script Here:
	}

	@Parameters({"url"})
	@Test
	public void guestLogin(String urlname)
	{
		System.out.println("Guest Login");
		//Write logic / Script Here:
		System.out.println(urlname);
	}
	
	
}
