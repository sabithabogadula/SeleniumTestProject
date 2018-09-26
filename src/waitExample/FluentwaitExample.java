package waitExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentwaitExample {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.sg/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(30, TimeUnit.SECONDS)
			       .pollingEvery(1, TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class);

			   WebElement ele1 = wait.until(new Function<WebDriver, WebElement>() 
			   {
			     public WebElement apply(WebDriver driver) 
			     {
			    	 
			    	 WebElement ele = driver.findElement(By.xpath("//*[@id='demo']"));
			    	 
			    	 String Value= ele.getAttribute("innerHTML");
			    	 
			    	 
			    	 if(Value.equalsIgnoreCase("webdriver"))
			    	 {
			    		 System.out.println("displayed : "+Value);	
			    		 return ele;
			    	 }
			    	 else
			    	 {
			    		 System.out.println("Not displayed : "+Value);
			    		 return null;
			    	 }
			    	 
			     }
			   });
			   System.out.println("Element is displayed"+ele1.isDisplayed());
	}

}
