package multipleWindows;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class MultipleWindowDemo {

	public static void main(String[] args) throws Exception {
	
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("disable-infobars");
		
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://projectconnect.ncs.com.sg/site/index.do");
			
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.switchTo().frame("header");
		
		driver.findElement(By.xpath("//*[contains(@href,'getStarted')]")).click();
		
		Runtime.getRuntime().exec("D:\\selinum\\AutoITScript\\HandleAuth.exe");
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/ul/li[2]/a/span")).click();
		
		String Parent = driver.getWindowHandle();
		
		Set <String> handle = driver.getWindowHandles();
		
		//int count = handle.size();
		
		for(String s1 : handle)
		{
			if(!s1.equals(Parent))
			{
				driver.switchTo().window(s1);
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}
		}
		driver.switchTo().window(Parent);
	}

}
