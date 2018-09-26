package CrossBrowserusingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserDemo {

	WebDriver driver;
	@Test
	//@Parameters({"browser","URL","expected"})
	public void VerifyTitle(String browsername,String URL, String expected) throws Exception
	{
		if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.firefox.driver", "D:\\selinum\\geckodriver.exe");

			driver =new FirefoxDriver();
		}
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");

			driver =new ChromeDriver();
		}
		
		if(browsername.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\selinum\\IEDriverServer.exe");

			driver =new InternetExplorerDriver();
		}
		
		driver.get(URL);
		
		String actual= driver.getTitle();
		
		System.out.println("Title is "+actual+" but passed Title is"+expected);
		
		Thread.sleep(3000);
		
		driver.close();
	}
	
	
}
