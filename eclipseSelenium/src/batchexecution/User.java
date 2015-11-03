package batchexecution;

import org.testng.annotations.Test;


public class User {
	
	@Test(invocationCount=10)
	public void loginTest()
	{
		System.out.println("User Get Logged in Successfully...");
	}
	@Test
	public void logoutTest()
	{
		System.out.println("User Get Logged Out Successfully...");
	}

}
