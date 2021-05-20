package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class draganddrop extends LunchBase{

	public static void main(String[] args) throws Exception{
		draganddrop obj = new draganddrop();
		obj.lunchBrowser("chrome", "https://jqueryui.com/droppable/");
        obj.danddrop();
	}
	
	public void danddrop() throws Exception {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
	
		
		
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		System.out.println("switicing to frame");
		
	
		WebElement src	= driver.findElement(By.id("draggable"));
	
		WebElement target = driver.findElement(By.id("droppable"));
	  
//		Actions builder = new Actions(driver);
//		Action myaction = builder.dragAndDrop(src, target).build();
//		myaction.perform();
		//Thread.sleep(3000);
	
     	new Actions(driver).dragAndDrop(src, target).build().perform();
		//new Actions(driver).dragAndDropBy(src, src.getLocation().getX()+50, src.getLocation().getY()+50).build().perform();
     	
     	driver.switchTo().defaultContent();
		
	}

}
