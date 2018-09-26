package objectRepositoryExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(id="login1")
	WebElement uid;
	
	@FindBy(how=How.ID,using="password")
	WebElement pwd;
	
	@FindBy(how=How.NAME,using="proceed")
	WebElement proceed;
	
	/*@FindBy(how = How.NAME, using = "logonName")
	private WebElement logonNameField;

	Now, as for How., you can have: CLASS_NAME, CSS, ID, ID_OR_NAME, LINK_TEXT, NAME, PARTIAL_LINK_TEXT, TAG_NAME,	XPATH,	class*/
	
	public LoginPage(WebDriver driver)
	{
		this.driver =driver;
		
		//To instantiate the elements, we call the initElements method of the PageFactory class. 
		//PageFactory.initElements(driver, pageObjectClass) implicitly creates the findElement calls behind the scene.
		PageFactory.initElements(driver,this);
	}
	
	
	public void setUserName(String uname)
	{
		uid.sendKeys(uname);
	}
	
	public void setPassword(String pass)
	{
		pwd.sendKeys(pass);
	}
	
	public void clickGo()
	{
		proceed.click();
	}

}
