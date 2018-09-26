package dataProvidersAndParameters;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderFromExcel {
	
	String data[][];
	
	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://www.gmail.com");
		
		driver.manage().window().maximize();
		
	}
	
	
	@DataProvider(name="logindata")
	public String[][] readExcel() throws IOException
	{
		String sheetname="Sheet1";
		
		String filename ="Gmail.xlsx";
		
		String filepath = System.getProperty("user.dir")+"\\src";
		
		//Create an object of File class to open xlsx file
		File fileobj = new File(filepath+"\\"+filename);
		
	    //Create an object of FileInputStream class to read excel file
		FileInputStream fso = new FileInputStream(fileobj);
		
		//Find the file extension by splitting file name in substring  and getting only extension name
		String fileextension= filename.substring(filename.indexOf("."));
		
		Workbook wb = null;
		
		if(fileextension.equals(".xls"))
		{
			//If it is xls file then create object of HSSFWorkbook class
			wb = new HSSFWorkbook(fso);
		}
		else if(fileextension.equals(".xlsx"))
		{
			//If it is xlsx file then create object of XSSFWorkbook class
			 wb = new XSSFWorkbook(fso);
		}
		
		//Read sheet inside the workbook by its name
		Sheet sh =  wb.getSheet(sheetname);
		
		//Find the number of Rows and columns
		
		System.out.println("LAstrow: " +sh.getLastRowNum());
		System.out.println("firstRow: " +sh.getFirstRowNum());
		
		int rowcount = sh.getLastRowNum()-sh.getFirstRowNum()+1;
		System.out.println("Rowcount: " +rowcount);
		
		Row row = sh.getRow(1);
		
		int colcount = row.getLastCellNum();
		System.out.println("Colcount: " +colcount);
		
		data = new String[rowcount][colcount];
		
		//Create a loop over all the rows of excel file to read it		
		for(int i=0;i<rowcount;i++)
		{
			row = sh.getRow(i);
			for(int j=0 ; j<colcount ; j++)
			{
				
				data[i][j] = row.getCell(j).getStringCellValue();
				
				System.out.println("Data: "+data[i][j]);
				
			}
		}
		
		return data;
	}
	
		
	@Test(dataProvider="logindata")
	public void Login(String user,String pwd) throws Exception
	{
		System.out.println("USer: "+user);
		System.out.println("PWd: "+pwd);
		
		System.out.println("Title: "+driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(user);
		
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div[1]/div[1]/input")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(@href,'https://accounts.google.com/SignOutOptions')]")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//a[contains(@href,'https://accounts.google.com/Logout')]")).click();
		
		driver.close();
	}
		
		


}
