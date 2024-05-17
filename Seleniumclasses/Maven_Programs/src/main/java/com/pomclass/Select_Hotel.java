package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	public WebDriver driver;

	public Select_Hotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
}
	@FindBy(id = "radiobutton_2")
	WebDriver radio;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebDriver getRadio() {
		return radio;
	}

	public WebDriver getContinues() {
		return continues;
	}

	public WebDriver getCancel() {
		return cancel;
	}
	@FindBy(id = "continue")
	WebDriver continues;
	
	@FindBy(id = "cancel")
	WebDriver cancel;
	
	
}
