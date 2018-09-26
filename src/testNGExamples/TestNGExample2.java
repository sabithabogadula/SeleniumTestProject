package testNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGExample2 {
	
	
	//IF want to execute in required order, we can specify Priority
	//if want to skip any function then we can specify enabled =false
	
	@Test(priority=4,description="This TC is for login",enabled=true)
	public void login()
	{
		System.out.println("We are in Login block");
		long id = Thread.currentThread().getId();
		System.out.println("Thread id: "+id);
		
	}
	
	@Test(priority=6,description="This TC is for Logout",enabled=true)
	public void logout()
	{
		System.out.println("We are in Logout block");
		long id = Thread.currentThread().getId();
		System.out.println("Thread id: "+id);
	}
	
	@Test(priority=5,description="This TC is for Initialize",enabled=false)
	public void initialize()
	{
		System.out.println("We are in Initialize block");
		long id = Thread.currentThread().getId();
		System.out.println("Thread id: "+id);
	}
	
	
	

}
