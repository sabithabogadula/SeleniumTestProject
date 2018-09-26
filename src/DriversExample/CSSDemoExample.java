package DriversExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSDemoExample {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		//Single Attribute
		//driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("Sabitha");
		
		//Multiple Attribute
		//driver.findElement(By.cssSelector("input[id='login1'][name='login']")).sendKeys("Sabitha");
		
		//Using id (#) and Classname (.)
		//driver.findElement(By.cssSelector("input#login1")).sendKeys("Sabitha");
		//driver.findElement(By.xpath("//a[text()='Create a new account']")).click();
		
		//driver.findElement(By.cssSelector("input.btn_checkavail")).click();
		
		// * is used in place of contains
		driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(10) > td:nth-child(3) > input[type*='pass']")).sendKeys("test");
		
		//^ is used in place of starts-with 
		driver.findElement(By.cssSelector("input[id^='pass']")).sendKeys("Test");
		
		//$ is used in place of ends-with
		driver.findElement(By.cssSelector("input[name$='login'][id*='login1']")).sendKeys("Test");
		
		//multiple entries
		driver.findElement(By.cssSelector("input#login1[name='login']")).sendKeys("Test");
				
		
	}

}
