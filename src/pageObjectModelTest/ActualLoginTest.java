package pageObjectModelTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjectModelDemo.HomePage;
import pageObjectModelDemo.LoginPage;

public class ActualLoginTest {
	
	
	WebDriver driver;
	
	
	
	HomePage objHome;
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void TestHomePageAppearCorrect()
	{
		LoginPage objLogin= new LoginPage(driver);
		String title = objLogin.getTitleText();
		
		System.out.println("Title : "+title);
		Assert.assertTrue(title.toLowerCase().contains("find"));
		
		objLogin.setUserName("demo");
		objLogin.setPwd("demo");
		objLogin.clickLogin();
		
		objHome = new HomePage(driver);
		
		//String TitleHome = objHome.getTitle();
		
		//Assert.assertTrue(TitleHome.toLowerCase().contains("success"));
		
	}
	
	
	
	
	
	
	
	

}
