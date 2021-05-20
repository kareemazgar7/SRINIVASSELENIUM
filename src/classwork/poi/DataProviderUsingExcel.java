package classwork.poi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DataProviderUsingExcel {

	public WebDriver driver;
	public String btype = "firefox";
	public String url = "http://automationpractice.com/index.php";
	
	@Test(priority=1)
	public void launchBrowser() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTraining\\softwares\\driverexes\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\SeleniumTraining\\softwares\\driverexes\\geckodriver.exe");
		
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
	
	@Test(priority=3, dataProvider="searchData", dataProviderClass=ExcelDataProvider.class)
	public void search(String searchStr, String mail) throws Exception {
		String searchInput = "//input[@name='search_query']"; 
		String searchbtn = "form > input + button ";
		driver.findElement(By.xpath(searchInput)).click();
		driver.findElement(By.xpath(searchInput)).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath(searchInput)).sendKeys(searchStr);
		System.out.println("Entered search string");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(searchbtn)).click();
		System.out.println("Clicked on Search btn");
		System.out.println(mail);
		driver.findElement(By.xpath(searchInput)).clear();
		Thread.sleep(3000);
	}
	
	@Test(priority=5)
	public void quitBrowser() throws Exception {
		//System.out.println(mail);
		Thread.sleep(2000);
		driver.quit();
	}
	
	

}
