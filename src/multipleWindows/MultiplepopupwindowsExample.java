package multipleWindows;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class MultiplepopupwindowsExample {

	public static void main(String[] args) throws Exception {
	
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("disable-infobars");
		
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
		
		Map <String,Object> prefs = new HashMap <String,Object>();
		
		prefs.put("profile.default_content_setting_values.notifications", 2);
		
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://www.icicibank.com");
			
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//driver.switchTo().frame("header");
		
		String Parent = driver.getWindowHandle();
		
		Set <String> handle = driver.getWindowHandles();
		
		int count = handle.size();
		
		System.out.println("No.of windows: "+count);
		
		driver.findElement(By.xpath("//*[@onclick='toggle_visibility()']")).click();
	}

}
