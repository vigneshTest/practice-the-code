package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Details_Fillings {
	public WebDriver driver;

	public Details_Fillings (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
}
	@FindBy(name = "location")
	WebElement selectlocation;
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSelectlocation() {
		return selectlocation;
	}

	public WebElement getSelecthotel() {
		return selecthotel;
	}

	public WebElement getSelectroom() {
		return selectroom;
	}

	public WebElement getNumofrooms() {
		return numofrooms;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getReset() {
		return reset;
	}
	@FindBy(id = "hotels")
	WebElement selecthotel;
	
	@FindBy(name = "room_type")
	WebElement selectroom;
	
	@FindBy(id = "room_nos")
	WebElement numofrooms;
	
	@FindBy(id = "datepick_in")
	WebElement checkin;
	
	@FindBy(name = "datepick_out")
	WebElement checkout;
	
	@FindBy(id = "adult_room")
	WebElement adult;
	
	@FindBy(id = "child_room")
	WebElement child;
	
	@FindBy(id = "Submit")
	WebElement search;
	
	@FindBy(id = "Reset")
	WebElement reset;
	
	
}