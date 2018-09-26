import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLoginExample {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.gmail.com");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bogadula.sabitha@gmail.com");
		
	Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
		
	Thread.sleep(1000);
		
	driver.findElement(By.xpath("//*[@id='password']/div[1]/div[1]/div[1]/input")).sendKeys("ncssabitha$123");
	//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Minnu1$3");
	Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id='passwordNext']")).click();
	Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[text()='COMPOSE']")).click();
	Thread.sleep(3000);
		
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("ramakris18@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Hello");
		
		driver.findElement(By.xpath("//*[@role='textbox']")).sendKeys("How are you?? what are you doing?");
		
		driver.findElement(By.xpath("//*[text()='Send']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[contains(@href,'SignOutOptions')]")).click();
	
		WebDriverWait wait = new WebDriverWait(driver,5);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@href,'Logout')]")));
		
		System.out.println("About to Logout");
		
		driver.findElement(By.xpath("//*[contains(@href,'Logout')]")).click();		
		
		System.out.println("Mail Sent");
		

	}

}
