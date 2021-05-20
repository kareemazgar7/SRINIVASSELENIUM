package exercise;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practise {

	public WebDriver driver;
	String browsername = "chrome";
	

	public  void lunchurl() throws Exception  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karee\\OneDrive\\Desktop\\Chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\karee\\OneDrive\\Desktop\\FireFoxDriver\\geckodriver.exe");
		
		if(browsername.equalsIgnoreCase("firefox")) {
		 
		 driver=new FirefoxDriver();
		
		}else {
		 
			driver =new ChromeDriver();
		}
	
		  
		driver.get("https://www.google.com/");
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
//	    
//		Set <Cookie>  cset = driver.manage().getCookies();
//		System.out.println(cset.size());
//		System.out.println(cset);
//		driver.manage().deleteAllCookies();
		
	  //driver.manage().getCookies().size();
		System.out.println("size  :"  + driver.manage().getCookies().size());
		driver.manage().deleteAllCookies();
		
		System.out.println("size  :"  + driver.manage().getCookies().size());
		
		driver.close();
		
	}
	
		public static void main(String[] args) throws Exception {
		
			Practise obj = new Practise();
			obj.lunchurl();
		
		

	}

}
