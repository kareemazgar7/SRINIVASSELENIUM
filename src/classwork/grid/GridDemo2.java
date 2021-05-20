package classwork.grid;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;


public class GridDemo2 {

	public WebDriver driver;
	public String bname = "Chrome";
	public String url = "http://automationpractice.com/";
	public String hubUrl = "http://localhost:4444/wd/hub";
	public String execSwitch="remote";
	
	@BeforeClass
	public void launchBrowser() throws Exception {
		
		
		if(execSwitch.equalsIgnoreCase("remote")) {
			 if(bname.equalsIgnoreCase("firefox")) {
				 FirefoxOptions opt = new FirefoxOptions();
				 driver = new RemoteWebDriver(new URL(hubUrl), opt);
			 } else if (bname.equalsIgnoreCase("chrome")) {
				 ChromeOptions opt = new ChromeOptions();
				 driver = new RemoteWebDriver(new URL(hubUrl), opt);
			 }
		} else {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\karee\\OneDrive\\Desktop\\Chromedriver\\chromedriver.exe");
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\karee\\OneDrive\\Desktop\\FireFoxDriver\\geckodriver.exe");
				 if(bname.equalsIgnoreCase("firefox")) {
					 driver = new FirefoxDriver();

				 } else if (bname.equalsIgnoreCase("chrome")) {
					 driver = new ChromeDriver();
				 }
		}
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.MINUTES);
	}
	
	@Test(priority=1)
	public void searchDress() throws Exception {

		String searchXpath = "//input[@name='search_query']";
		String submitXpath = "//button[@class='btn btn-default button-search'][@name='submit_search']";
		
		driver.findElement(By.xpath(searchXpath)).click();
		driver.findElement(By.xpath(searchXpath)).clear();
		driver.findElement(By.xpath(searchXpath)).sendKeys("Casual dresses");
		Thread.sleep(3000);
		System.out.println("Entered search string");
		driver.findElement(By.xpath(submitXpath)).click();
		Thread.sleep(3000);
		System.out.println("clicked on serach button");
	}
	
	@Test(priority=2)
	public void createUser() throws Exception {
		/* Launch user page*/
		String signXpath = "//a[normalize-space(text())='Sign in']";
		String emailXpath = "//input[@id='email_create']";
		String crAcctXpath = "//button[@name='SubmitCreate']";
		driver.findElement(By.xpath(signXpath)).click();
		System.out.println("Clicked in Signin link");
		Thread.sleep(2000);
		driver.findElement(By.xpath(emailXpath)).sendKeys("te7234@ts9123.com");
		System.out.println("Entered email");
		driver.findElement(By.xpath(crAcctXpath)).click();
		System.out.println("Cicked on create button");
		
		/* Use information*/
		String mrradioX="//input[@id='id_gender1']";
		String mrsradioX="//input[@id='id_gender2']";
		String firstnameX="//input[@name='customer_firstname']";
		String lastnameX="//input[@name='customer_lastname']";
		String useEmailX="//input[@id='email']";
		String pwdX="//input[(@type='password') and (@id='passwd')]";
		String daysX="//select[@name='days']";
		String monthsX="//select[@name='months']";
		String yearsX="//select[@name='years']";
		String nlchkbX="//input[@type='checkbox' and @name='newsletter']";
		String opnsChkbX="//input[@type='checkbox' and @name='optin']";
		String adrsFNX="//input[@id='firstname']";
		String adrsLNX="//input[@id='lastname']";
		String addresX="//input[@id='address1']";
		String cityX="//input[@id='city']";
		String stateX="//select[@name='id_state']";
		String zipX="//input[@name='postcode']";
		String cntryX="//select[@name='id_country']";
		String adinTxtAreaX="//textarea[@name='other']";
		String mobileX="//input[@name='phone_mobile']";
		String nameAliasX="//input[@name='alias']";
		String submitX="//button[@name='submitAccount']";
		
		driver.findElement(By.xpath(mrradioX)).click();
		System.out.println("Selected Mr Radio");
		driver.findElement(By.xpath(firstnameX)).sendKeys("John");
		System.out.println("Entered first name");
		driver.findElement(By.xpath(lastnameX)).sendKeys("Mc");
		System.out.println("Entered last name");
		String eVal = driver.findElement(By.xpath(useEmailX)).getAttribute("value");
		System.out.println("email found : " + eVal);
		if(eVal.equalsIgnoreCase("test234@tst123.com")) {
			System.out.println("Email validation successful");
		} else {
			System.out.println("Email validation failed");
		}
		driver.findElement(By.xpath(pwdX)).sendKeys("Test123");
		System.out.println("Entered password");
		
		Select day = new Select(driver.findElement(By.xpath(daysX)));
		day.selectByIndex(10);
		Select month = new Select(driver.findElement(By.xpath(monthsX)));
		month.selectByValue("10");
		Select year = new Select(driver.findElement(By.xpath(yearsX)));
		year.selectByValue("2000");
		
		if (!driver.findElement(By.xpath(nlchkbX)).isSelected()) {
			System.out.println("Selecting chkbx1..");
			driver.findElement(By.xpath(nlchkbX)).click();
		} else {
			System.out.println("chkbx1 already selected");
		}
		
		if (!driver.findElement(By.xpath(opnsChkbX)).isSelected()) {
			System.out.println("Selecting chkbx2..");
			driver.findElement(By.xpath(opnsChkbX)).click();
		} else {
			System.out.println("chkbx2 already selected");
		}
		driver.findElement(By.xpath(adrsFNX)).sendKeys("John");
		System.out.println("Entered adress first name");
		driver.findElement(By.xpath(adrsLNX)).sendKeys("Mc");
		System.out.println("Entered adress last name");
		driver.findElement(By.xpath(addresX)).sendKeys("1 MG Road");
		System.out.println("Entered adress ");
		driver.findElement(By.xpath(cityX)).sendKeys("Bangalore");
		System.out.println("Entered City ");
		
		Select state = new Select(driver.findElement(By.xpath(stateX)));
		state.selectByVisibleText("Florida");
		System.out.println("Selected State");
		driver.findElement(By.xpath(zipX)).sendKeys("56788");
		System.out.println("Entered Zip");
		
		driver.findElement(By.xpath(adinTxtAreaX)).sendKeys("1 MG Road \n Brigade Road \n Bangalore");
		System.out.println("Entered textarea");
		driver.findElement(By.xpath(mobileX)).sendKeys("5634534878");
		System.out.println("Entered mobile");
		driver.findElement(By.xpath(nameAliasX)).sendKeys("Jo");
		System.out.println("Entered alias");
		driver.findElement(By.xpath(submitX)).click();
		System.out.println("Cicked on submmit button");
		
		String signoutX= "//a[normalize-space(text())='Sign out']";
		boolean sFlag = driver.findElement(By.xpath(signoutX)).isDisplayed();
		if(sFlag) {
			System.out.println("User Created successfully");
		} else {
			System.out.println("User Creation failed");
		}
		
	}
	
	@Test(priority=3)
	public void close() throws Exception {
		Thread.sleep(5000);
		System.out.println("closing browser");
		driver.quit();
	}
}
