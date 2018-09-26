package multipleWindows;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class CloseChildPopUps {

	public static void main(String[] args) throws Exception {
	
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("disable-infobars");
		
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.monster.com.sg/");
			
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
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
