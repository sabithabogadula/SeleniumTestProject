package dropdownandLinksDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropdownExample {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe")	;	
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.wikipedia.org/");
		
		driver.manage().window().maximize();
		
		//Select single value
		Select sel1 = new Select(driver.findElement(By.xpath("//*[@id='searchLanguage']")));
		sel1.selectByVisibleText("Deutsch");
		
		//Extract the length and dropdown values
		List<WebElement> links1 = driver.findElements(By.tagName("option"));
		
		int length = links1.size();
		
		System.out.println("Length:"+length);
		
		for(int i=0;i<length;i++)
		{
			
			String title = links1.get(i).getText();
			
			System.out.println("Title:"+title);
			
			if(title.contains("Eng"))
			{
				links1.get(i).click();
				break;
			}
			
		}
		

	}

}
