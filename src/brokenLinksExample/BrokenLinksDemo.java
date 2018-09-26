package brokenLinksExample;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksDemo {

	public static void main(String[] args) {
	
		
			System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			
			List<WebElement> list = driver.findElements(By.tagName("a"));
			
			System.out.println("Length = "+list.size());
			
			for(int i=0;i<list.size();i++)
			{
				
				WebElement ele = list.get(i);
				
				String url = ele.getAttribute("href");
				
				System.out.println("URL: "+url);
				
				verifyLinkActive(url);
				
			}
			

	}

	
	public static void verifyLinkActive(String linkURL)
	
	{
		
			try {
				
				
				URL url = new URL(linkURL);
			
				//Establish a HttpURLConnection
				HttpURLConnection con = (HttpURLConnection)url.openConnection();
			
				//Wait 3 seconds to connect
				con.setConnectTimeout(3000);
				
				con.connect();
				
				if(con.getResponseCode()==200)
				{
					System.out.println("URL Connected " + linkURL + con.getResponseMessage());
				}
				else
				{
					System.out.println("URL Not Connected " + linkURL + con.getResponseMessage());
				}
			
			
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
	
	
}
