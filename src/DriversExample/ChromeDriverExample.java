package DriversExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverExample {
	
	
	
	public static void main(String[] args) {
		
		System.out.println("in chrome driver example");
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
		System.out.println("Title:"+driver.getTitle());
	}

}
