package scrollExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollEx {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.gmail.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bogadula.sabitha@gmail.com");
		
	Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
		
	Thread.sleep(1000);
		
	driver.findElement(By.xpath("//*[@id='password']/div[1]/div[1]/div[1]/input")).sendKeys("ncssabitha$123");
	//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Minnu1$3");
	Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id='passwordNext']")).click();
	Thread.sleep(3000);
		
	WebElement ele = driver.findElement(By.xpath("//*[contains(@href,'https://www.google.com/intl/en/policies/terms')]"));
	
	//((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
	
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",ele);
		
		System.out.println("Scrolled down");

	}

}
