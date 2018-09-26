package scrollExample;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDemo {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.goibibo.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,800)");
		

	}
	
	
}
