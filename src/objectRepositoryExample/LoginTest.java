package objectRepositoryExample;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjectFactoryPages.LoginPage;

public class LoginTest {
	
	WebDriver driver;
	
	ExtractPropValues prop;
	
	@BeforeTest
	public void setUp()
	{
		System.out.println("We are in SEtup method");
		prop = new ExtractPropValues();
			
		String browsername=prop.getBrowser();
		System.out.println("Browser: "+browsername);
		
		if (browsername.equalsIgnoreCase("chrome"))
		{
			System.out.println("We are in Chrome method");
			System.setProperty("webdriver.chrome.driver", prop.getChromePath());
			driver = new ChromeDriver();
			driver.get(prop.getUrl());
			driver.manage().window().maximize();
		}
		
		if (browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", prop.getFirefoxPath());

			driver = new FirefoxDriver();
		
			driver.get(prop.getUrl());		
			
			driver.manage().window().maximize();
		}
		
		
	}
	
	@Test
	public void loginToRediff()
	{
		LoginPage loginobj = new LoginPage(driver);
		
		loginobj.setUserName(prop.getUserName());
		loginobj.setPassword(prop.getPassword());
		
		loginobj.clickGo();
		
		
	}
	

}
