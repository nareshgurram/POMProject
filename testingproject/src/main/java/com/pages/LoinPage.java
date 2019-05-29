package com.pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseControl;

public class LoinPage extends BaseControl {
	
	@FindBy(name = "username")
	WebElement username1;
	
	@FindBy(name = "password")
	WebElement password1;
	
	@FindBy(name = "login")
	WebElement login1;
	
	@FindBy(linkText = "REGISTER")
	WebElement register1;
	
	public LoinPage() throws IOException{
		
		PageFactory.initElements(driver, this);
	}
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	//public RegisterPage validateRegisterPage(){
		//return register1.click();
	//}
	
	
	
	
}
