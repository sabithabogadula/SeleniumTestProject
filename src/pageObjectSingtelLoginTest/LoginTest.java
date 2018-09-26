package pageObjectSingtelLoginTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjectSingtelLoginPage.HomePage;
import pageObjectSingtelLoginPage.LoginPage;

public class LoginTest {

	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.singtel.com");
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	public void login()
	{
		LoginPage loginpage= new LoginPage(driver);
		HomePage homepage= new HomePage(driver);
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		System.out.println("We are about to click Login Link");
		
		if(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'/personal/my-account/login')]"))).isDisplayed())
		{
			homepage.click_login_link();
		}
		else
		{
			System.out.println("Login Link not displayed");
		}
		
		driver.switchTo().frame("ssoLogin");
		
		if(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@value,'Log in')]"))).isDisplayed())
		{
			loginpage.set_user_name("ramakris18@gmail.com");
			loginpage.set_password("Bujji1$3");
			loginpage.click_submit();
			
		}
			
	
	}
	
	
	
	
	
}
