package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation {

	public WebDriver driver;

	public Booking_Confirmation() {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "search_hotel")
	WebDriver searchhotel;

	public WebDriver getDriver() {
		return driver;
	}

	public WebDriver getSearchhotel() {
		return searchhotel;
	}

	public WebDriver getItinerary() {
		return itinerary;
	}

	public WebDriver getLogout() {
		return logout;
	}

	public WebDriver getTopsearch() {
		return topsearch;
	}

	public WebDriver getTopbooked() {
		return topbooked;
	}

	public WebDriver getToppassword() {
		return toppassword;
	}

	public WebDriver getToplogout() {
		return toplogout;
	}

	@FindBy(name = "my_itinerary")
	WebDriver itinerary;

	@FindBy(name = "logout")
	WebDriver logout;

	@FindBy(xpath = "//a[text()='Search Hotel']")
	WebDriver topsearch;

	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	WebDriver topbooked;

	@FindBy(xpath = "//a[text()='Change Password']")
	WebDriver toppassword;

	@FindBy(xpath = "//a[text()='Logout']")
	WebDriver toplogout;
	
	
}
