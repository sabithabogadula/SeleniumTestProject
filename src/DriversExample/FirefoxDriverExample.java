package DriversExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FirefoxDriverExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\selinum\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
	
		driver.get("http://www.facebook.com");
		
		System.out.println("Title:"+driver.getTitle());
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	    //driver.findElement(By.id("email")).sendKeys("bogadula.sabitha@gmail.com");
		
		//driver.findElement(By.id("pass")).sendKeys("Minnu1$3");
		
		//driver.findElement(By.id("loginbutton")).click();
		
//By Xpath
	//  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bogadula.sabitha@gmail.com");
		
	//  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Minnu1$3");
		
	//	driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
		
//Select Class
		
	//  Select sel1 = new Select(driver.findElement(By.xpath("//select[@id='day']")));
	//  sel1.selectByIndex(6);
	
		
	//	Select sel2 = new Select (driver.findElement(By.xpath("//select[@id='month']")));
	//	sel2.selectByVisibleText("Sept");
		
	//	Select sel3 = new Select(driver.findElement(By.xpath("//select[@id='year']")));
	//	sel3.selectByValue("1982");
		
		
	
	//	driver.findElement(By.xpath("//input[@id='u_0_9']")).click();
	
//Navigate to forward and backward pages
	//  driver.navigate().back();
		
		
		
	}

}
