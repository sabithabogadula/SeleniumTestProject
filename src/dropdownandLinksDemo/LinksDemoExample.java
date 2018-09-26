package dropdownandLinksDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemoExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.wikipedia.org/");
		
		driver.manage().window().maximize();
	
		//	using xpath	
		//  List<WebElement> list = driver.findElements(By.xpath("//a[starts-with(@id,'js-link-box')]"));
		
		//	using CSSSelector
		List<WebElement> list = driver.findElements(By.cssSelector("a.link-box"));
		
		int length = list.size();
		
		System.out.println("Length="+length);
	
		//using Enhanced For Loop
		for(WebElement ele : list)
		{
		//	System.out.println(ele.getText());
		}
		
		//using normal for loop
		for(int i=0;i<length;i++)
		{
			
			//System.out.println(list.get(i).getAttribute("href"));
			System.out.println(list.get(i).getAttribute("title"));
			
			if(list.get(i).getAttribute("title").contains("Eng"))
			{
				list.get(i).click();
				break;
			}
		}
		
		
		//Find all the anchor links on the page
		//List<WebElement> list1 = driver.findElements(By.tagName("a"));
		
		//int len = list1.size();
		
		//System.out.println("Length:"+len);
		
		//Link Text
		//driver.findElement(By.linkText("Wikimedia Foundation")).click();
		//driver.findElement(By.partialLinkText("Wikimedia Fou")).click();
		
		

	}

}
