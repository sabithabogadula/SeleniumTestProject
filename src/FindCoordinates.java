	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class FindCoordinates {
		
		@Test
		public void findLocationcoordinates()
		{
			
			System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
				
			driver.get("http://seleniumpractise.blogspot.sg/2016/08/how-to-automate-radio-button-in.html");
			
			driver.manage().window().maximize();
			
			List<WebElement> radio = driver.findElements(By.id("male"));
			
			int size = radio.size();
			
			for(int i=0;i<size;i++)
			{
				
				int x = radio.get(i).getLocation().getX();
				
				if(x!=0)
				{
					radio.get(i).click();
				}
			}
			
		}



}
