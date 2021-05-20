package classwork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Base {
	
	public WebDriver driver;
	
	public void launchBrowser(String btype, String url) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karee\\OneDrive\\Desktop\\Chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\karee\\OneDrive\\Desktop\\FireFoxDriver\\geckodriver.exe");
		
		if(btype.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}
		
		driver.get(url);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);

	}

}

