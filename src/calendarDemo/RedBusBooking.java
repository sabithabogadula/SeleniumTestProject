package calendarDemo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBusBooking {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		
		prefs.put("profile.default_content_setting_values.notifications", 2);
		
		ChromeOptions Options = new ChromeOptions();
		
		Options.setExperimentalOption("prefs", prefs);
		
		driver = new ChromeDriver();
				
		driver = new ChromeDriver(Options);
			
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
				
		SelectFromCity("Hyderabad");
		
		SelectToCity("Vijayawada");
		
		SelectDate("10-Aug-2019");

	}
	
	
	public static void SelectFromCity(String fcity)
	{
		
		driver.findElement(By.cssSelector("#src")).click();
		
		driver.findElement(By.cssSelector("#src")).sendKeys(fcity);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List <WebElement> items = driver.findElements(By.xpath("//*[@id='search']/div/div[1]/div/ul/li"));
		
		for(WebElement ele : items)
		{
			if(ele.getText().equalsIgnoreCase(fcity))
			{
				ele.click();
				break;
			}
		}
		
	}

	public static void SelectToCity(String tcity)
	{
		
		driver.findElement(By.cssSelector("#dest")).click();
		
		driver.findElement(By.cssSelector("#dest")).sendKeys(tcity);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List <WebElement> items1 = driver.findElements(By.xpath("//*[@id='search']/div/div[2]/div/ul/li"));
		
		for(WebElement ele1 : items1)
		{
			if(ele1.getText().equalsIgnoreCase(tcity))
			{
				ele1.click();
				break;
			}
		}
		
	}
	
	public static void SelectDate(String d)
	{
		String[] splitter = d.split("-");
		
		String day = splitter[0];
				
		String month = splitter[1];
		
		String year = splitter[2];
		
		String date;
		
		int flag = 0;
		
	//	driver.findElement(By.cssSelector("#onward_cal")).click();
		
		do
		{
			List <WebElement> dates = driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table//td"));
		
			for(WebElement ele2 : dates)
			{
			
				date = ele2.getText();
				
				if(date.contains(year))
				{
					if(date.contains(month))
					{
						List <WebElement> days = driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table//td"));
					
						for(WebElement ele3 : days)
						{
							date = ele3.getText();
							if(date.contains(day))
							{
								ele3.click();
								flag = 1;
								break;
							}
						}
					}
				}
			
			}
			if(flag==0)
			{
				driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click();
			}
		}while(flag==0);
	}
	
	
	
	
}
