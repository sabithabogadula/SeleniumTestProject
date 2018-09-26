package untrustedCertExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandleUntrustedCertDemoChrome {

	public static void main(String[] args) {
		

		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(cap);
		
		driver.get("https://192.168.204.173:7503/intranet/");
		
		driver.manage().window().maximize();

		System.out.println("URL Launched");
	}
	

}
