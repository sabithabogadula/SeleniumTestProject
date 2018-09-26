package scrollExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
			
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//Scroll the page in vertical
		//((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		
		//Scroll the views inside the page
		
		
		WebElement ele = driver.findElement(By.xpath("//*[text()='Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil...']"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",ele);
		
		
		
		
		
		//This format also can be used
		//((JavascriptExecutor)driver).executeScript("document.getElementById('mCSB_8_container').scrollIntoView(true);");
		
	}

}
