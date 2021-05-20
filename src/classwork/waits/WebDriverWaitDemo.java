package classwork.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import classwork.Launch_Base;



public class WebDriverWaitDemo extends Launch_Base{

	public static void main(String[] args) throws Exception{
		WebDriverWaitDemo obj = new WebDriverWaitDemo();
		obj.launchBrowser("firefox", "http://automationpractice.com/index.php");
		obj.wdwait();

	}
	
	public void wdwait() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.name("search_query")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("search_query")).sendKeys("T-shirts");
		Thread.sleep(2000);
		driver.findElement(By.name("submit_search")).click();
		String comBtn = "//button[contains(@class,'button-medium bt_compare bt_compare')]";
		//WebDriverWait wait = new WebDriverWait(driver, 60);
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(comBtn)));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(comBtn)));
		webElementClickable(30, comBtn);
		System.out.println("Webdriver wait successful");
		Thread.sleep(2000);
		driver.quit();
	}
	
	public void webElementClickable(long secs, String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, secs);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	}

}
