package testNGExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.w3c.dom.DOMConfiguration;

public class ReporterDemo {
		
	String baseURL="http://demo.guru99.com/test/newtours/";
	String path ="D:\\selinum\\chromedriver.exe";
	
	WebDriver driver;
	
	String expected;
	
	String actual;
	
	@BeforeTest(description="Launching the Browser")
	public void LaunchURL()
	{
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get(baseURL);
		driver.manage().window().maximize();
		Reporter.log("Browser Launched Successfully");
	}
	
	@Test
	public void register()
	{
		WebDriverWait wait = new WebDriverWait(driver, 5);
		if(wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("REGISTER"))).isEnabled())
		{
			expected = "Register: Mercury Tours";
			
			driver.findElement(By.linkText("REGISTER")).click();
			
			if(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='submit']"))).isEnabled())
			{
				actual = driver.getTitle();
				Assert.assertEquals(actual, expected,"Titles are not Same");
				Reporter.log("Reporter site Launched Successfully");
			}
			else
			{
				System.out.println("Register Page is not completely Loaded");
			}
			
		}
		else
		{
			System.out.println("Register link not displayed");
		}
		
	}
	
	@Test
	public void support()
	{
		WebDriverWait wait = new WebDriverWait(driver, 5);
		if(wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("SUPPORT"))).isEnabled())
		{
			expected = "Under Construction: Mercury Tours";
			
			driver.findElement(By.linkText("SUPPORT")).click();;
			
			if(wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[src='images/home.gif']"))).isDisplayed())
			{
				actual=driver.getTitle();
				Assert.assertEquals(actual, expected,"Titles are not same");	
				Reporter.log("Support site Launched Successfully");
			}
			else
			{
				System.out.println("Support Page is not completely Loaded");
			}
		}
		else
		{
			System.out.println("Support link not displayed");
		}
	}
	
	@AfterMethod
	public void navigateBack()
	{
		WebDriverWait wait = new WebDriverWait(driver, 5);
		driver.navigate().back();
		if(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='submit']"))).isDisplayed())
		{
			System.out.println("Home Page displayed");
			Reporter.log("Home Page Launched Successfully");
		}
		else
		{
			System.out.println("Failed to Load Home Page");
		}
		
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
	}
	
	

}
