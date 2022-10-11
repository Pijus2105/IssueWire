package com.issuewire.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.issuewire.qa.base.Test_Base;

public class Log_In extends Test_Base {
	
	//PageFactory-Object repository
	
	
	@FindBy(xpath="//ul[@class=\"nav navbar-nav navbar-right\"]//li[6]")
	WebElement login;

	@FindBy(name = "email")
	WebElement Email;
	
	@FindBy(name ="password")
	WebElement password;
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement click;
//	
//	@FindBy(linkText="Forgot Password")
//	//(xpath="//a[contains(text(),'Forgot Password')]")
//	WebElement forgotpassword;
//	
//	@FindBy(xpath="//a[contains(text(),'Signup')]")
//	WebElement signup;
//	
//	@FindBy(xpath="//a[@class='navbar-brand']//img[@title='Issuewire']")
//	WebElement issueWireLogo;
//	

	
	//initializing the page object
	public Log_In() {
		PageFactory.initElements(driver, this);
	}
	

	
	
	//Actions:
	public String validateLoginPageTitle() 
	{
		return driver.getTitle();
	}
	



	public Home_Page login(String us, String Pass) {
		
		login.click();	
		Email.sendKeys(us);
		password.sendKeys(Pass);
	    click.click();
	   
	    	    
	return new Home_Page();
	}
}
