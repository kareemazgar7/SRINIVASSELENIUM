package classwork;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Webdriver {

	public WebDriver driver;
	String btype = "chrome";
	
	
	public  void lunchurl() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karee\\OneDrive\\Desktop\\Chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\karee\\OneDrive\\Desktop\\FireFoxDriver\\geckodriver.exe");
		
		if(btype.equalsIgnoreCase("chrome")) {
		 
		 driver=new FirefoxDriver();
		
		}else {
		 
			driver =new ChromeDriver();
		}
	
		  
		  driver.get("https://www.google.com/");
		  String  crl = driver.getCurrentUrl();
		  System.out.println("current url : "   + crl);
		  System.out.println("title :"  + driver.getTitle());
//		 String title =  driver.getTitle();
//		 System.out.println("title :"  + title);
//		 String psrc =driver.getPageSource();
//		 System.out.println("pagesource :"  + psrc);
//		 driver.manage().window().getPosition();
//		 Thread.sleep(5000);
//		 driver.manage().window().getPosition();
//		 Thread.sleep(5000);
//		 driver.manage().window().getSize();
//		 Thread.sleep(5000);
//		 driver.manage().window().maximize();
//		 Thread.sleep(5000);
//		 driver.manage().window().fullscreen();
//		 Thread.sleep(5000);
//		 driver.manage().window().setPosition(new Point (400,500));
//		 Thread.sleep(5000);
//		 driver.manage().window().setSize(new Dimension (400, 500));
//		 Thread.sleep(5000);
//		 driver.manage().window().maximize();
//		 driver.navigate().to("https://www.facebook.com/login/");
//		 Thread.sleep(5000);
//		 driver.navigate().back();
//		 Thread.sleep(5000);
//		 driver.navigate().forward();
//		 Thread.sleep(5000);
//		 driver.navigate().refresh();
		 Thread.sleep(5000);
//		 Set<Cookie> size = driver.manage().getCookies();
//		 System.out.println(size.size());
//		 
//		 System.out.println("cookiessize : "  + size);
//		
//		 driver.manage().deleteAllCookies();
//		
//	 System.out.println("after delete: "  +size);
		 
		 Set<Cookie> cset =driver.manage().getCookies();
		 System.out.println(cset.size());
		 System.out.println("cookie "  + cset);
		 cset.clear();
		 driver.manage().deleteAllCookies();
		 
		 cset =driver.manage().getCookies();
		 System.out.println("no of cooike after delete: " +cset.size());
		 System.out.println("after delete "  + cset);
		 
		 
		 
		
	}
	
	public void CloseDriver() {
		
		//driver.quit();
		driver.close();
		
	}
	
	
	public static void main(String[] args) throws Exception {
		Selenium_Webdriver obj = new Selenium_Webdriver();
		obj.lunchurl();
		obj.CloseDriver();
	}

}
