package testng;

import org.testng.annotations.Test;

public class Loan {

	@Test
	public void personalLoan()
	{
		System.out.println("Personal Loan");
		//Write logic / Script Here:
	}
	
	@Test(groups= {"Smoke"})
	public void homeLoan()
	{
		System.out.println("Home Loan");
		//Write logic / Script Here:
	}
	
	@Test
	public void carLoan()
	{
		System.out.println("Car Loan");
		//Write logic / Script Here:
	}
	
	@Test
	public void goldLoan()
	{
		System.out.println("Gold Loan");
		//Write logic / Script Here:
	}
	
}
