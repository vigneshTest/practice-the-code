package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {

	public static WebDriver driver;
	public static Actions actn;
	public static Robot key;
	public static JavascriptExecutor scroll;

	public static WebDriver browserLaunch() throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vicky\\eclipse-workspace\\Seleniumclasses\\Maven_Programs\\Driver1\\chromedriver.exe");
		driver = new ChromeDriver();
		actn = new Actions(driver);
		key = new Robot();
		scroll = (JavascriptExecutor) driver;
		return driver;
	}

	public static void openurl(String url) {
		driver.get(url);

	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void navigateto(String url) {
		driver.navigate().to(url);
	}

	public static void navigateback() {
		driver.navigate().back();
	}

	public static void navigateforward() {
		driver.navigate().forward();
	}

	public static void navigaterefresh() {
		driver.navigate().refresh();
	}

	public static void geturl(String url) {
		driver.getCurrentUrl();
		System.out.println(url);
	}

	public static void gettitle(String title) {
		driver.getTitle();
		System.out.println(title);
	}

	public static void getpagesource() {
		driver.getPageSource();
	}

	public static void gettext() {
		driver.switchTo().activeElement().getText();
	}

	public static void dropdown(WebDriver driver, WebElement element, int value ) {

		Select dropdown1 = new Select(element);

		dropdown1.selectByIndex(value);
	}

	public static void SendKeys(WebElement ele, String text) {
		ele.sendKeys(text);
	}

	public static void click(WebElement ele) {
		ele.click();
	}

	/*
	 * public static void getoptions(WebElement element) { s = new Select(element);
	 * getoptions = s.getoptions(); }
	 * 
	 * public static void getallselectionoption() { s = new
	 * Select(multipledropdown); allselectoptions = s.getallselectedoptions(); }
	 * 
	 * public static void getfirstselectedoptions() { s = new
	 * select(multipledropdown); firstselectedoption = s.getfirstselectedoptions();
	 * }
	 * 
	 * public static void ismultiple(boolean multiple) { s = new Select(element);
	 * multiple = s.ismultiple(); }
	 */

	public static void alertaccept() {
		driver.switchTo().alert().accept();
	}

	public static void alertdismiss() {
		driver.switchTo().alert().dismiss();
	}

	public static void actionscontextclick() {

		actn.contextClick().build().perform();
	}

	public static void sendkeys() {

	}

	public static void actiondraganddrop() {
		WebElement source;
		// actn.dragAndDrop(source, target).build().perform();
	}

	public static void keydownandenter() {

		key.keyPress(KeyEvent.VK_DOWN);
		key.keyRelease(KeyEvent.VK_DOWN);
		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void windowhandle(String url) {
		String windowHandle = driver.getWindowHandle();
	}

	public static void windowhandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String title : windowHandles) {
			String gettitle = driver.switchTo().window(title).getTitle();
			System.out.println(gettitle);
		}
	}

	public static void implicitlywait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void explicitwait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void scrolldown() {
		scroll.executeScript("window.scroll(0,1000)", "");
	}

	public static void scrollup() {
		scroll.executeScript("window.scroll(0,0)", "");
	}

	public static void specific_Scroll(WebElement ele) {
		scroll.executeScript("arguments[0].scrolltoview(true)", ele);
	}

	public static void screenshot() {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File screenshotAs = ss.getScreenshotAs(OutputType.FILE);

	}

	public static void singleframe(WebElement arg0) {
		driver.switchTo().frame(arg0);
	}

	public static void exitframe() {
		driver.switchTo().defaultContent();
	}

	private void exittosingleframe() {
		driver.switchTo().parentFrame();
	}
}
