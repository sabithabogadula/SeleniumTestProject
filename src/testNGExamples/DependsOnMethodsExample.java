package testNGExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodsExample {
	
	
	public WebDriver driver;
	
	@Test 
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
		driver = new ChromeDriver();			
	}
	@Test (dependsOnMethods = "LaunchBrowser")
	public void VerifyGoogleTitle()
	{
		driver.get("http://www.gmail.com");
		
		driver.manage().window().maximize();
		
		String Title = driver.getTitle();
		
		Assert.assertEquals("Gmail",Title);
		
	}
	@Test (dependsOnMethods = "VerifyGoogleTitle" , enabled = false)
	public void VerifyYahooTitle()
	{
		driver.get("http://www.yahoo.com");
		
		driver.manage().window().maximize();
		
		String Title = driver.getTitle();
		
		Assert.assertEquals("Yahoo",Title);
		
	}
	@Test (dependsOnMethods = {"VerifyYahooTitle","VerifyGoogleTitle"})
	public void closeBrowser()
	{
		driver.close();
	}


}
