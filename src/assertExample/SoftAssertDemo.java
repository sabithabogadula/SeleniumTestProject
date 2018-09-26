package assertExample;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	
	@Test
	public void softassertDemo()
	{
		
		SoftAssert assertion = new SoftAssert();
		
		System.out.println("Test1");
		assertion.assertEquals(10,10);
		
		System.out.println("Test2");
		assertion.assertEquals(10,12);
		
		System.out.println("Test3");
		assertion.assertEquals(13,13);
		
		assertion.assertAll();
		
	}
	
	@Test
	public void hardassertDemo()
	{
		
		System.out.println("Hard assert Test1");
		Assert.assertEquals(10,10);
		
		System.out.println("Hard assert Test2");
		Assert.assertEquals(10,12);
		
		System.out.println("Hard assert Test3");
		Assert.assertEquals(13,13);
		
		
	}

}
