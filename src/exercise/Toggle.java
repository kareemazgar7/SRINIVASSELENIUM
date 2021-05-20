package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class Toggle extends LunchBase {

	public static void main(String[] args) throws Exception {
		
		Toggle obj = new Toggle();
		obj.lunchBrowser("chrome", "https://jqueryui.com/toggle/");
		obj.Togglex();
	}
	
	public void Togglex() throws Exception {
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0 , 300)");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		
		//div[@id='effect']
		
		Thread.sleep(3000);
		
		 boolean flag = driver.findElement(By.xpath("//div[@id='effect']")).isDisplayed();
		 System.out.println("before click:"  +flag);
		 String text = driver.findElement(By.xpath("//div[@id='effect']")).getText();
		System.out.println(text);
		
		 driver.findElement(By.xpath("//button[@id='button']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[@id='button']")).click();
		 boolean flag1 = driver.findElement(By.xpath("//div[@class='toggler']")).isDisplayed();
		 System.out.println("after click:"  +flag1);
		
		 Thread.sleep(3000);
		 
		//select[@id='effectTypes']
		 
		 Select sl = new Select(driver.findElement(By.xpath("//select[@id='effectTypes']")));
		 sl.selectByVisibleText("Bounce");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[@id='button']")).click();
	}
}
