package pageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	
	WebDriver driver;
	
	By uname = By.name("userName");
	By pwd = By.name("password");
	By signin = By.name("submit");
	By title = By.xpath("//form[@action='index.php']/table/tbody/tr/td/img[contains(@src,'findflight')]");
	
	
	public LoginPage (WebDriver driver)
	{
		this.driver = driver;
	}

	public void setUserName(String user)
	{
		driver.findElement(uname).sendKeys(user);
	}
	
	public void setPwd(String pass)
	{
		driver.findElement(pwd).sendKeys(pass);
	}
	
	public void clickLogin()
	{
		driver.findElement(signin).click();
	}
	
	public  String getTitleText()
	{
		System.out.println("Title Text");
		System.out.println("Text:"+driver.findElement(By.xpath("//form[@action='index.php']/table/tbody/tr/td/img[contains(@src,'findflight')]")).getAttribute("alt"));
		System.out.println("Title: "+driver.findElement(title).getAttribute("alt"));
		return driver.findElement(title).getAttribute("alt");
	}
	
}
