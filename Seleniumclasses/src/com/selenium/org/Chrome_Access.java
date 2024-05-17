package com.selenium.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Access {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vicky\\eclipse-workspace\\Seleniumclasses\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://web.whatsapp.com/");
	
	
}
}
