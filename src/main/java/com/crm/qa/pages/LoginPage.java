package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase
{
  //Page factory
	@FindBy(name="uid")
	WebElement Username ;
	
	@FindBy(name="password" )
	WebElement Password ;
	
	@FindBy(name="btnLogin")
	WebElement login ;

	//Initializing page objects 
	public LoginPage()
	{
	 PageFactory.initElements(driver, this );
	}
	

	//Actions 
	public HomePage LoginPage (String un, String pwd)
	{
	
	Username.sendKeys(un);
	Password.sendKeys(pwd);
	login.click();
	
	return new HomePage();
	
	}
}
	

	
	












