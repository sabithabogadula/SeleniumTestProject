package dataProvidersAndParameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvideDemo {

	
	WebDriver driver;

	@BeforeMethod
	public void launchBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		
	}
	
	@Test(dataProvider="SearchData")
	public void searchGoogle(String author, String key)
	{
		
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys(key);
		
		System.out.println("Author is "+author+" and key is "+key);
		
		System.out.println("Author is "+author+" and key is "+driver.findElement(By.cssSelector("input[name='q']")).getAttribute("value"));
		
				
	}

	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
	@DataProvider(name="SearchData")
	public Object[][] getFromDataProvider()
	{
		return new Object[][] {
			
			{"Guru99" , "India"},
			{"Sabitha", "India"},
			{"Karthik", "India"}
		};
		
	}
	
	
	
}
