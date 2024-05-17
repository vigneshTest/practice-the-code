package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Again {
	public WebDriver driver;
	public Login_Again(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath = "//a[text()='Click here to login again']")
WebDriver loginagain;
public WebDriver getDriver() {
	return driver;
}
public WebDriver getLoginagain() {
	return loginagain;
}

}
