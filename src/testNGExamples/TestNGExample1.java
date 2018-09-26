package testNGExamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample1 {
	
	@Test(priority=1,description="This TC is for login")
	public void login()
	{
		long id =Thread.currentThread().getId();
		System.out.println("Thread id= "+id);
		System.out.println("We are in Login block");
	}
	
	@Test(priority=3,description="This TC is for Logout")
	public void logout()
	{
		long id =Thread.currentThread().getId();
		System.out.println("Thread id= "+id);
		System.out.println("We are in Logout block");
	}
	
	@Test(priority=2,description="This TC is for Initialize")
	public void initialize()
	{
		long id =Thread.currentThread().getId();
		System.out.println("Thread id= "+id);
		System.out.println("We are in Initialize block");
	}
	

}
