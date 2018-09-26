package hashmap;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashmapExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.makemytrip.com");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='hp-widget__sfrom']")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> list= driver.findElements(By.xpath("//*[@id='js-filterOptins']/div/div/ul/li/div/p/span[@class='autoCompleteItem__label']"));
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		for(WebElement ele : list)
		{
			//ele.findElement(By.xpath(""));
			
			System.out.println(ele.getAttribute("innerHTML"));
		}
	}

}
