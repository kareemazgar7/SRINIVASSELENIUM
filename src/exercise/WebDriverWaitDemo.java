package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitDemo extends LunchBase{

	public static void main(String[] args) throws Exception {
		WebDriverWaitDemo obj = new WebDriverWaitDemo();
		obj.lunchBrowser("chrome", "http://automationpractice.com/index.php");
		obj.wdwait();
		
		
		
		
	}
	public void wdwait() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.name("search_query")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("search_query")).sendKeys("t-shirt");
		Thread.sleep(2000);
		driver.findElement(By.name("submit_search")).click();
		//driver.findElement(By.xpath("(//button[contains(@class,'bt_compare ')])[1]"));
		String comparebtnX = "(//button[contains(@class,'bt_compare ')])[1]";
		
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(comparebtnX)));
		//boolean sflag = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(comparebtnX))).isEnabled();
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(comparebtnX)));
		//System.out.println(sflag);
		System.out.println("webdriverwait successful");
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
