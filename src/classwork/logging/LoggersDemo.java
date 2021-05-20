package classwork.logging;


import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class LoggersDemo {

	public WebDriver driver;
	public String bname = "Firefox";
	public String url = "http://automationpractice.com/";
	public Logger log;
	
	
	@BeforeTest
	public void launchBrowser() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karee\\OneDrive\\Desktop\\Chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\karee\\OneDrive\\Desktop\\FireFoxDriver\\geckodriver.exe");
			
		if(bname.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.MINUTES);
	}
	
    @BeforeClass
    public void initLoggers() throws Exception {
    	
    	String Filename =".\\logs\\" + LoggersDemo.class.getName() + ".txt";
    	log = Logger.getLogger(Filename);
    	log.setLevel(Level.ALL);
    	FileHandler handler = new FileHandler(Filename);
    	log.addHandler(handler);
    	handler.setFormatter(new SimpleFormatter());
    	
    }
    
    @AfterClass
    public void closelog() {
    	Handler[] handels =log.getHandlers();
    	
    	for (Handler Myhandel :handels) {
    		Myhandel.close();
    	}
    }
	@Test(priority=1)
	public void searchDress() throws Exception {
		log.severe("This is severe message");
		log.warning("this is warning message");
		log.info("This is info message");
		log.config("this is config message");
		log.fine("this is fine message");
		log.finer("this is finer message ");
		log.finest("this is finest message");
		
		String searchXpath = "//input[@name='search_query']";
		String submitXpath = "//button[@class='btn btn-default button-search'][@name='submit_search']";
		
		driver.findElement(By.xpath(searchXpath)).click();
		driver.findElement(By.xpath(searchXpath)).clear();
		driver.findElement(By.xpath(searchXpath)).sendKeys("casual dresses");
		Thread.sleep(3000);
		log.info("Enterd the search String");
		driver.findElement(By.xpath(submitXpath)).click();
		Thread.sleep(3000);
		log.info("cliecked on search button");
	}
	
	@Test(priority=2)
	public void createUser() throws Exception {
		/* Launch user page*/
		String signXpath = "//a[normalize-space(text())='Sign in']";
		String emailXpath = "//input[@id='email_create']";
		String crAcctXpath = "//button[@name='SubmitCreate']";
		driver.findElement(By.xpath(signXpath)).click();
		log.info("Clicked in Signin link");
		Thread.sleep(2000);
		driver.findElement(By.xpath(emailXpath)).sendKeys("test787@tst787.com");
		log.info("Entered email");
		driver.findElement(By.xpath(crAcctXpath)).click();
		log.info("Cicked on create button");
		
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
		log.info("Selected Mr Radio");
		driver.findElement(By.xpath(firstnameX)).sendKeys("John");
		log.info("Entered first name");
		driver.findElement(By.xpath(lastnameX)).sendKeys("Mc");
		log.info("Entered last name");
		String eVal = driver.findElement(By.xpath(useEmailX)).getAttribute("value");
		log.info("email found : " + eVal);
		if(eVal.equalsIgnoreCase("test234@tst123.com")) {
			log.info("Email validation successful");
		} else {
			log.info("Email validation failed");
		}
		driver.findElement(By.xpath(pwdX)).sendKeys("Test123");
		log.info("Entered password");
		
		Select day = new Select(driver.findElement(By.xpath(daysX)));
		day.selectByIndex(10);
		Select month = new Select(driver.findElement(By.xpath(monthsX)));
		month.selectByValue("10");
		Select year = new Select(driver.findElement(By.xpath(yearsX)));
		year.selectByValue("2000");
		
		if (!driver.findElement(By.xpath(nlchkbX)).isSelected()) {
			log.info("Selecting chkbx1..");
			driver.findElement(By.xpath(nlchkbX)).click();
		} else {
			log.info("chkbx1 already selected");
		}
		
		if (!driver.findElement(By.xpath(opnsChkbX)).isSelected()) {
			log.info("Selecting chkbx2..");
			driver.findElement(By.xpath(opnsChkbX)).click();
		} else {
			log.info("chkbx2 already selected");
		}
		driver.findElement(By.xpath(adrsFNX)).sendKeys("John");
		log.info("Entered adress first name");
		driver.findElement(By.xpath(adrsLNX)).sendKeys("Mc");
		log.info("Entered adress last name");
		driver.findElement(By.xpath(addresX)).sendKeys("1 MG Road");
		log.info("Entered adress ");
		driver.findElement(By.xpath(cityX)).sendKeys("Bangalore");
		log.info("Entered City ");
		
		Select state = new Select(driver.findElement(By.xpath(stateX)));
		state.selectByVisibleText("Florida");
		log.info("Selected State");
		driver.findElement(By.xpath(zipX)).sendKeys("56788");
		log.info("Entered Zip");
		
		driver.findElement(By.xpath(adinTxtAreaX)).sendKeys("1 MG Road \n Brigade Road \n Bangalore");
		log.info("Entered textarea");
		driver.findElement(By.xpath(mobileX)).sendKeys("5634534878");
		log.info("Entered mobile");
		driver.findElement(By.xpath(nameAliasX)).sendKeys("Jo");
		log.info("Entered alias");
		driver.findElement(By.xpath(submitX)).click();
		log.info("Cicked on submmit button");
		
		String signoutX= "//a[normalize-space(text())='Sign out']";
		boolean sFlag = driver.findElement(By.xpath(signoutX)).isDisplayed();
		if(sFlag) {
			log.info("User Created successfully");
		} else {
			log.info("User Creation failed");
		}
}
	@Test(priority=3)
	public void close() throws Exception {
		Thread.sleep(5000);
		log.info("closing browser");
		driver.quit();
	}
	
	}
