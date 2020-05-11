package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {

	@Test
	public void custLogin()
	{
		System.out.println("Customer Login");
		//Write logic / Script Here:
	}
	
	@Test(dataProvider="getData")
	public void userLogin(String name, String pass)
	{
		System.out.println("User Login");
		//Write logic / Script Here:
		System.out.println(name +" "+ pass);
	}	
	
	@Test
	public void adminLogin()
	{
		System.out.println("Admin Login");
		//Write logic / Script Here:
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0] = "firstusername";
		data[0][1] = "firstuserpass";
		
		data[1][0] = "secondusername";
		data[1][1] = "seconduserpass";
		
		data[2][0] = "thirdusername";
		data[2][1] = "thirduserpass";
		
		return data;
	}

	@Test
	public void guestLogin()
	{
		System.out.println("Guest Login");
		//Write logic / Script Here:
	}
	
	
}
