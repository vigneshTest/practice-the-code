package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public WebDriver driver;

	public Login_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	WebElement username;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebDriver getForgotpswd() {
		return forgotpswd;
	}

	public WebDriver getRecoverymail() {
		return recoverymail;
	}

	public WebDriver getMailpswd() {
		return mailpswd;
	}

	public WebDriver getReset() {
		return reset;
	}

	public WebDriver getBacktologin() {
		return backtologin;
	}

	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	
	@FindBy(id = "login")
	WebElement login;
	
	@FindBy(xpath = "//a[text()='Forgot Password?']")
	WebDriver forgotpswd;
	
	@FindBy(name = "emailadd_recovery")
	WebDriver recoverymail;
	
	@FindBy(id = "Submit")
	WebDriver mailpswd;
	
	@FindBy(id = "Reset")
	WebDriver reset;
	
	@FindBy(xpath = "//a[text()='Go back to Login page']")
	WebDriver backtologin;
}
