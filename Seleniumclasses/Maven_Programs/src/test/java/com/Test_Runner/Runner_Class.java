package com.Test_Runner;

import java.awt.AWTException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = "src\\test\\java\\com\\Feature_File\\adactin.feature", glue = "com.Step_Def")
@RunWith(Cucumber.class)
public class Runner_Class {
	public static WebDriver driver;

	@BeforeClass
	public static void strat_up() throws AWTException {
		driver = Base_Class.browserLaunch();

	}

	@AfterClass
	public static void end() {
	//A ver.close();
	}
}