package pageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	
	WebDriver driver;
	
	By title = By.xpath("/html/body/div[2]/table/tbody/tr//h3");
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String getTitle()
	{
		return driver.findElement(title).getText();
	}
}
