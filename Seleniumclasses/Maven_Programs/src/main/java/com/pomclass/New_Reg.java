package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class New_Reg {
	
	public WebDriver driver;

	public New_Reg(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

}
	@FindBy(xpath = "//a[text()='New User Register Here']")
	WebDriver register;
	
	@FindBy(name = "username")
	WebDriver reg_username;
	
	@FindBy(name = "password")
	WebDriver reg_password;
	
	@FindBy(id = "re_password")
	WebDriver conformpassword;
	
	@FindBy(name = "full_name")
	WebDriver fullname;
	
	@FindBy(name = "email_add")
	WebDriver email;
	
	@FindBy(name = "tnc_box")
	WebDriver checkbox;
	
	@FindBy(name = "Submit")
	WebDriver submit;
	
}