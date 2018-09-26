package testNGRunFailedTC;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 {
	
	@Test
	public void verifySkype()
	{
		Assert.assertTrue(false);
		System.out.println("Skype Verified");
	}

}
