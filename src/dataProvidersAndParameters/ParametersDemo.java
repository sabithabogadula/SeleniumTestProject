package dataProvidersAndParameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {

	WebDriver driver;

	@BeforeClass
	@Parameters({"URL"})
	public void launchBrowser(String baseURL)
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(baseURL);
		
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	@Parameters({"author","Searchkey"})
	public void searchGoogle(String author, String key)
	{
		
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys(key);
		
		System.out.println("Author is "+author+" and key is "+key);
		
		System.out.println("Author is "+author+" and key is "+driver.findElement(By.cssSelector("input[name='q']")).getAttribute("value"));
		
				
	}

	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
}
