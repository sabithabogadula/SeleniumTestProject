package objectRepositoryExample;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ExtractPropValues {
	
	String filename ="config.properties";
	
	String filepath = System.getProperty("user.dir")+"\\ConfigurationSettings\\"+filename;
	
	Properties obj = new Properties(); 
	
	File fileobj;
	
	FileInputStream fso;
	
	public ExtractPropValues()
	{
		try {
			fileobj = new File(filepath);
			
			fso = new FileInputStream(fileobj);
		
			obj.load(fso);
				
			} 
		catch (IOException e) 
			{
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
			
	}
	
	public String getUrl()
	{
		
		return obj.getProperty("url");
	}
	
	public String getBrowser()
	{
		
		return obj.getProperty("browser");
	}
	
	public String getChromePath()
	{
		
		return obj.getProperty("chromepath");
	}
	
	public String getFirefoxPath()
	{
		
		return obj.getProperty("firefoxpath");
	}
	
	public String getUserName()
	{
		
		return obj.getProperty("username");
	}
	
	public String getPassword()
	{
		
		return obj.getProperty("pwd");
	}

}
