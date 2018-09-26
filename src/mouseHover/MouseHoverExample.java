package mouseHover;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverExample {

	public static void main(String[] args) throws Exception {

		ChromeOptions options=new ChromeOptions();
		
		Map<String, Object> prefs=new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		
		options.setExperimentalOption("prefs", prefs);
		
		options.addArguments("disable-infobars");
		options.addArguments("--disable-notifications");
		
		//https://peter.sh/experiments/chromium-command-line-switches/ can refer in this website for other values
		
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://www.singtel.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		
		WebElement ele = driver.findElement(By.xpath("//*[contains(@href,'https://www.singtel.com/personal/products-services')]"));
		
		act.moveToElement(ele).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[contains(@href,'https://www.singtel.com/personal/products-services/mobile/phone')]")).click();
	}

}
