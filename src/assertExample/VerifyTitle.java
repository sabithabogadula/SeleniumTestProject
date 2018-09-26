package assertExample;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {
	
	
	@Test
	public void VerifyTitle1() {
		
		System.setProperty("webdriver.chrome.driver","D:\\selinum\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		String title = driver.getTitle();
		
		System.out.println("Title:"+title);
		
		String Expected="Rediffmaillll";
		
	//	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
	//	Assert.assertEquals(title, Expected);
		
	//	Assert.assertEquals(title, Expected, "Not equal");
		
	//	Assert.assertTrue(title.contains("Rediff1"));
		
	//	Assert.assertNotEquals(title,"Rediff1","Both should not match then test pass");
				
	//	Assert.assertTrue(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected(),"Checkbox not selected");
		
	//	Assert.assertFalse(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected(),"Checkbox selected");	
		
	//	Assert.assertNull(null);
		
	//	Assert.assertNotNull("not null");
		
		
	}
	
	

}
