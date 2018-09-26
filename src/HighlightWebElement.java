

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighlightWebElement {

	
	public static void HighligtElement(WebDriver driver, WebElement ele)
	{
		
		JavascriptExecutor je=(JavascriptExecutor)driver;
		
		je.executeScript("arguments[0].setAttribute('style','background:yellow; border: 2px solid red;');", ele);
		
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		je.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", ele);
	}
	
	
}
