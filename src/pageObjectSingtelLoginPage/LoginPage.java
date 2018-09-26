package pageObjectSingtelLoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(name="loginid")
	WebElement userid;
	
	@FindBy(name="pass")
	WebElement password;
	
	@FindBy(xpath="//input[contains(@value,'Log in')]")
	WebElement submit;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void set_user_name(String uname)
	{
		userid.sendKeys(uname);
	}
	
	
	public void set_password(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	
	public void click_submit()
	{
		submit.click();
	}
	
	
}
