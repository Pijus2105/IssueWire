package com.issuewire.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.issuewire.qa.base.Test_Base;

public class Home_Page extends Test_Base {
	
	//PageFactory-Object repository
	@FindBy(xpath="//i[@class='fa fa-newspaper-o fa-5x']")
	WebElement PressRelease;
	
	
	public Home_Page() {
		PageFactory.initElements(driver, this);
	}

 public String verifyHomePageTitle() {
	return driver.getTitle();
 }

 public PressRel clickPR() {
	 PressRelease.click();
	 return new PressRel();
 }
}
