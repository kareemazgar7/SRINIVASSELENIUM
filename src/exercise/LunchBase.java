package exercise;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LunchBase {

	public  WebDriver driver;
	
	public void lunchBrowser( String Btype , String url )  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karee\\OneDrive\\Desktop\\Chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\karee\\OneDrive\\Desktop\\FireFoxDriver\\geckodriver.exe");
		
		if(Btype.equalsIgnoreCase("firefox")) {
		 
		 driver=new FirefoxDriver();
		
		}else {
		 
			driver =new ChromeDriver();
		}
	
		
		 driver.get(url);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		  
		  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	        //driver.close();
		
	}
	
	

}
