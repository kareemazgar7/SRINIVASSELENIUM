package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDropable extends LunchBase {

	public static void main(String[] args) throws Exception{
		DragandDropable obj = new DragandDropable();
		obj.lunchBrowser("chrome", "https://jqueryui.com/droppable/");
		obj.draganddrop();
	}
	
	public  void draganddrop() throws Exception {
		
		
//		  String drag = "//div[@id ='draggable']";
//		  String drop = "//div[@id ='droppable'";
		  
//		  WebElement dragable = driver.findElement(By.xpath(drag));
//		  WebElement droppable = driver.findElement(By.xpath(drop));
		driver.switchTo().frame(0);
	
		  WebElement dragable = driver.findElement(By.id("draggable"));
		  
		  WebElement droppable = driver.findElement(By.id("droppable"));
		  
		  Thread.sleep(3000);
			Actions act = new Actions(driver);
			
			Action myaction = act.dragAndDrop(dragable, droppable).build();
			
			myaction.perform();
		 
		    
		
		
		
		
	
		
		
	}

}
