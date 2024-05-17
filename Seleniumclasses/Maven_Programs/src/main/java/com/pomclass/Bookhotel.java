package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookhotel {
	public WebDriver driver;
	public Bookhotel() {
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	@FindBy(name = "first_name")
	WebDriver frstname;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebDriver getFrstname() {
		return frstname;
	}

	public WebDriver getLastname() {
		return lastname;
	}

	public WebDriver getAddress() {
		return address;
	}

	public WebDriver getCardno() {
		return cardno;
	}

	public WebDriver getCardtype() {
		return cardtype;
	}

	public WebDriver getExpmonth() {
		return expmonth;
	}

	public WebDriver getExpyear() {
		return expyear;
	}

	public WebDriver getCvvno() {
		return cvvno;
	}

	public WebDriver getBooknow() {
		return booknow;
	}

	public WebDriver getCancel() {
		return cancel;
	}
	@FindBy(name = "last_name")
	WebDriver lastname;
	
	@FindBy(name = "address")
	WebDriver address;
	
	@FindBy(name = "cc_num")
	WebDriver cardno;
	
	@FindBy(name = "cc_type")
	WebDriver cardtype;
	
	@FindBy(name = "cc_exp_month")
	WebDriver expmonth;
	
	@FindBy(name = "cc_exp_year")
	WebDriver expyear;
	
	@FindBy(name = "cc_cvv")
	WebDriver cvvno;
	
	@FindBy(name = "book_now")
	WebDriver booknow;
	
	@FindBy(name = "cancel")
	WebDriver cancel;
	
	

}
