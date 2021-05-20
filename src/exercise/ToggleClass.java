package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ToggleClass  extends LunchBase {

	public static void main(String[] args) throws Exception {
		
		ToggleClass obj = new ToggleClass();
		obj.lunchBrowser("chrome", "https://jqueryui.com/toggleClass/");
		obj.TogglexClass();
	}
	
	public void TogglexClass() throws Exception {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 300)");
		Thread.sleep(3000);
		 driver.switchTo().frame(0);
		 Thread.sleep(3000);
		//div[@id='effect']
		//button[@id='button']
		 
		 WebElement display = driver.findElement(By.xpath("//div[@id='effect']"));
		 
		 WebElement runeffect = driver.findElement(By.xpath("//button[@id='button']"));
		 
		 System.out.println("before click :"  +display.getLocation());
		 
		 Thread.sleep(3000);
		
		 runeffect.click(); 
		 
		 System.out.println("after click :"  +display.getLocation());
		
		 Thread.sleep(3000);
		
		 runeffect.click();
		 
		 System.out.println("after click :"  +display.getLocation());
		 
	}
	
}
