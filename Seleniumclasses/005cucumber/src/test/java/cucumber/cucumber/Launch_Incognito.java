package cucumber.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_Incognito {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		  EdgeOptions options = new EdgeOptions();
	        options.addArguments("--inprivate");

	        EdgeDriver driver = new EdgeDriver(options);
	        driver.get("http://www.example.com");

	        // Perform your test operations

	        driver.quit();
		
		
		
WebDriverManager.chromedriver().clearDriverCache().setup();

//System.setProperties("C:\\Users\\vicky\\Downloads\\chromedriver-win64\\chromedriver.exe");
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vicky\\\\Downloads\\\\chromedriver-win64\\\\chromedriver.exe");
ChromeOptions option = new ChromeOptions();
options.addArguments("--incognito");
DesiredCapabilities cap = new DesiredCapabilities();
cap.setCapability(ChromeOptions.CAPABILITY, options);
options.merge(cap);
WebDriver driver1 = new ChromeDriver(option);
Thread.sleep(1000);
driver1.get("http://www.facebook.com");

	}

}
