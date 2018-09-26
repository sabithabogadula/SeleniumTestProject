package waitExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitwaitDemo {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		WebElement ele = driver.findElement(By.xpath("//*[@label='Find Trains']"));
				
	//  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebDriverWait wait= new WebDriverWait(driver,5);
		
	//	WebElement ele1=wait.until(ExpectedConditions.visibilityOf(ele));
		
		WebElement ele1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@label='Find Trains']")));
		
		if(ele1.isEnabled())
		{
			System.out.println("Displayed");
		}
				

	}

}
