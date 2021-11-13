package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;



public class TestBase {
	
	public static ChromeDriver driver;
	public static Properties prop;
	
	
	public TestBase()
	{
		try{
			
		
		prop=new Properties();
		FileInputStream ip= new FileInputStream("C:/Users/Parashuram/workspace/FreeCRMTest/src/main/java/com/crm/qa/config/config.properties");
	    
		prop.load(ip);
	
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
	
	}
	
	}


	public static void initiallization()
		{
		String browsername =prop.getProperty("browser");
		if(browsername.equals("chromeBrowser"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			 driver= new ChromeDriver();
		}
		else if(browsername.equals("FF"))
		    System.setProperty("webdriver.firfox.driver", "D:\\chromedriver.exe");
		    driver= new ChromeDriver();
		    
		    
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    driver.get(prop.getProperty("url"));
		}
	    
			
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
