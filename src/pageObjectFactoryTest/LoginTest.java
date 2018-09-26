package pageObjectFactoryTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjectFactoryPages.LoginPage;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
	}
	
	@Test
	public void loginToRediff()
	{
		LoginPage loginobj = new LoginPage(driver);
		
		loginobj.setUserName("sabitha.2018");
		loginobj.setPassword("Minnu1$3");
		
		loginobj.clickGo();
		
		
	}
	

}
