package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;


public class LoginPageTest extends TestBase 
{
	LoginPage LoginPage;
	public LoginPageTest()
	{
		super();
	}
	

	@BeforeMethod
	public void setup()
	{
		initiallization();
		
		LoginPage  = new LoginPage();
	}
	
	@Test 
	public void LoginTest()
	
	{
		LoginPage.LoginPage(prop.getProperty("username"), prop.getProperty("password"));
   
	}

	@AfterMethod
		public void teardown()
		{
		driver.quit();// This will close the browser all session
		}
		
	}

