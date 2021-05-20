package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Resizeable extends LunchBase{

	public static void main(String[] args) throws Exception {
		Resizeable obj = new Resizeable();
		obj.lunchBrowser("chrome", "https://jqueryui.com/resizable/");
		obj.resizeable();
	}
	
	public void resizeable() throws Exception {
		
//		h3[contains(text(),'Resizable')]
//		div[contains(@class,'ui-resizable-handle ui-resizable-se ui-icon')]
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		
		WebElement resizeX= driver.findElement(By.xpath("//div[@id='resizable']"));
		WebElement dragable= driver.findElement(By.xpath("//div[contains(@class,'ui-resizable-handle ui-resizable-se ui-icon')]"));
		
		new Actions(driver).clickAndHold(dragable).dragAndDropBy(dragable, resizeX.getLocation().getX()+100, resizeX.getLocation().getY()+100).release().build().perform();
		Thread.sleep(10000);
		driver.switchTo().defaultContent();
		
		
	}	

}
