package DriversExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.wordpress.org/?redirect_to=https%3A%2F%2Fwordpress.org%2Fsupport%2Ftopic-tag%2Fwp-loginphp%2F&locale=en_US");
		
		driver.manage().window().maximize();
		
//Dynamic XPath
		
		driver.findElement(By.xpath("//input[@type='text' and @name='log']")).sendKeys("Sabitha1");
		
		driver.findElement(By.xpath("//input[@type='text' or @name='log']")).sendKeys("Sabitha2");
		
		System.out.println("Text1:"+driver.findElement(By.xpath("//a[@href='https://wordpress.org/']")).getText());
				
		driver.findElement(By.xpath("//*[@class='input'][@name='pwd']")).sendKeys("Sabitha3");	
		
		System.out.println("Text2:"+driver.findElement(By.xpath("//a[contains(@title,'WordPress.org')]")).getText());
		
		driver.findElement(By.xpath("//*[text()='Freely usable photos & more']")).click();
		
		driver.findElement(By.xpath("//a[contains(@href,'commons.wikimedia.org')]//following :: a[2]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Wikimedia Foundation')]")).click();
		
		driver.findElement(By.xpath("//a[contains(@href,'wiktionary.org')]//preceding :: a[2]")).click();
		
		driver.findElement(By.xpath("//a[starts-with(text(),'Download for And')]")).click();
		
		//button[@id='js-lang-list-button']
		
		//button[starts-with(@id,'js-lang-list-button')]
		
		//input[@id='searchInput'][@name='search']
		
		//*[@id='searchLanguage'] 
		
		//label[starts-with(text(),'What is the story here ')]//following :: textarea
		
		//label[starts-with(text(),'What is the story here ')]//following :: input[@value='Submit »']
		
		//a[@href='//en.wikipedia.org/'][starts-with(@title,'English ')]//following::a
		
		//a[@href='//de.wikipedia.org/'][starts-with(@title,'Deutsch ')]//preceding::a
		
		//input[@name='log'] | //input[@id='user_login']
		
		
		
		

	}

}
