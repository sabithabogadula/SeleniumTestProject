package DriversExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriverExample {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.ie.driver", "D:\\selinum\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		
		driver.get("http://www.facebook.com");
		

	}

}
