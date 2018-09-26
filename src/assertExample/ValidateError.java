package assertExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ValidateError {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://www.gmail.com");
		
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	//	String Actual = driver.findElement(By.xpath("//*[@id='view_container']//*[text()='Enter an email or phone number']")).getText();
		
		String Actual = driver.findElement(By.xpath("//*[@id='view_container']//*[text()='Enter an email or phone number']")).getAttribute("innerHTML");
		
		String Expected ="Enter an email or phone number";
		
		Assert.assertEquals(Actual, Expected,"Error message doesnt match");

		System.out.println("Test Completed");
	}

}
