package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class selectandhold extends LunchBase {

	public static void main(String[] args) throws Exception {
		selectandhold obj = new selectandhold();
		obj.lunchBrowser("chrome", "https://jqueryui.com/selectable/#display-grid");
		obj.clickHold();
		//obj.clickandDrag();	
			
	}
	
	//li[@class='ui-state-default ui-selectee ui-selected']
	//li[text()='2']
	//li[text()='3']
	//li[text()='5']
	//li[text()='7']
	//li[text()='9']
	
	
	public void clickHold() throws Exception {
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(3000);
	
		driver.switchTo().frame(0);
		WebElement onex =driver.findElement(By.xpath("//li[text()='1']"));
		
		WebElement twox =driver.findElement(By.xpath("//li[text()='2']"));
		
		WebElement threex =driver.findElement(By.xpath("//li[text()='3']"));
		WebElement fivex =driver.findElement(By.xpath("//li[text()='5']"));
		WebElement sevenx =driver.findElement(By.xpath("//li[text()='7']"));
		WebElement ninex =driver.findElement(By.xpath("//li[text()='9']"));
		Thread.sleep(3000);
		
		new Actions(driver).keyDown(Keys.CONTROL).click(onex).pause(3000).click(twox)
		.pause(3000).click(threex).pause(3000).click(fivex).pause(3000)
		.click(sevenx).pause(3000).click(ninex).pause(2000).click(sevenx).pause(2000).click(ninex)
		.pause(2000).click(fivex).pause(2000).click(threex).pause(2000).click(twox).pause(2000)
		.click(onex).keyUp(Keys.CONTROL).build().perform();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(4000);
		
		driver.quit();
	}
	
	public void clickandDrag() throws Exception {
	  
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(3000);
	
		driver.switchTo().frame(0);
	
		WebElement onex =driver.findElement(By.xpath("//li[text()='1']"));
		WebElement twox =driver.findElement(By.xpath("//li[text()='2']"));
		WebElement threex =driver.findElement(By.xpath("//li[text()='3']"));
		WebElement fourx =driver.findElement(By.xpath("//li[text()='4']"));
		WebElement fivex =driver.findElement(By.xpath("//li[text()='5']"));
		WebElement sixx =driver.findElement(By.xpath("//li[text()='6']"));
		WebElement sevenx =driver.findElement(By.xpath("//li[text()='7']"));
		WebElement eightx =driver.findElement(By.xpath("//li[text()='8']"));
		WebElement ninex =driver.findElement(By.xpath("//li[text()='9']"));
		WebElement tenx =driver.findElement(By.xpath("//li[text()='10']"));
		WebElement elevenx =driver.findElement(By.xpath("//li[text()='11']"));
		WebElement twelevex =driver.findElement(By.xpath("//li[text()='12']"));
		
		
		Thread.sleep(3000);
		new Actions(driver).clickAndHold(onex).release(twelevex).build().perform();
		Thread.sleep(3000);
		new Actions(driver).clickAndHold(onex).release(fourx).build().perform();
		Thread.sleep(3000);
		new Actions(driver).clickAndHold(fivex).release(eightx).build().perform();
		Thread.sleep(3000);
		new Actions(driver).clickAndHold(ninex).release(twelevex).build().perform();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		driver.quit();
	}

}
