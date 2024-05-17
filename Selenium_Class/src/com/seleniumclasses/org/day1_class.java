package com.seleniumclasses.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1 {
	public static void main(String[] args) {
		//property setup
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vicky\\eclipse-workspace\\Selenium_Class\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
			driver.manage().window().maximize();	
	}

}
