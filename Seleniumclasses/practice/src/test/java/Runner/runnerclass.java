package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\vicky\\eclipse-workspace\\Seleniumclasses\\practice\\featurefile\\opengoogle.feature", glue="Stepdefinitions")
public class runnerclass {

}
