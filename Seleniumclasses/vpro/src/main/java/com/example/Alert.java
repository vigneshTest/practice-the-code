package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vicky\\eclipse-workspace\\Seleniumclasses\\vpro\\driver\\chromedriver(1).exe");
WebDriver driver = new ChromeDriver();
driver.get("https://demo.automationtesting.in/Alerts.html");
WebElement rr = driver.findElement(By.xpath("//a[@href='#OKTab']"));
rr.click();
WebElement pp = driver.findElement(By.xpath("//button[contains(@class,'btn btn-danger')]"));
pp.click();
driver.switchTo().alert().accept();
WebElement yy = driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]"));
yy.click();
driver.switchTo().alert().accept();
WebElement tt = driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')]"));
tt.click();
driver.switchTo().alert().accept();
	}

}
