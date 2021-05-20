package exercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataProviderusingExcel {

	public class Data_ProviderDemo {
		public WebDriver driver;
		public String btype = "firefox";
		public String url = "http://automationpractice.com/index.php";
		
		@BeforeClass
		public void launch() throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\karee\\OneDrive\\Desktop\\Chromedriver\\chromedriver.exe");
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\karee\\OneDrive\\Desktop\\FireFoxDriver\\geckodriver.exe");
		
			if(btype.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			} else {
				driver = new ChromeDriver();
			}
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get(url);
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		}
		
	
		@Test( dataProvider= "searchData", dataProviderClass = Exceltodataprovider.class)
		public void search(String searchstr, String email) throws Exception {
			String searchInput = "div#search_block_top  input[name='search_query']"; //using id
			String searchbtn = "form > input + button ";
			driver.findElement(By.cssSelector(searchInput)).click();
			driver.findElement(By.cssSelector(searchInput)).clear();
			Thread.sleep(3000);
			driver.findElement(By.cssSelector(searchInput)).sendKeys(searchstr);
			System.out.println("Entered search string");
			Thread.sleep(3000);
			driver.findElement(By.cssSelector(searchbtn)).click();
			System.out.println("Clicked on Search btn");
			System.out.println(email);

		}
	
		@AfterClass
		public void quitBrowser() throws Exception {
			Thread.sleep(2000);
			driver.quit();
		}
		
	
}
	}
