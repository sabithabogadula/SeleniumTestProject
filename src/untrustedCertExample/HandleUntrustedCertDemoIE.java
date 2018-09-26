package untrustedCertExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandleUntrustedCertDemoIE {

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		

		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		System.setProperty("webdriver.ie.driver", "D:\\selinum\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://192.168.204.173:7503/intranet/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='overridelink']")).click();
		
		driver.findElement(By.xpath("//*[@id='overridelink']")).click();

		System.out.println("URL Launched");
	}
	

}
