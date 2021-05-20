package classwork.actionapi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


import classwork.Launch_Base;

public class DradAndDropDemo extends Launch_Base {

	public static void main(String[] args) throws Exception {
		DradAndDropDemo obj = new DradAndDropDemo();
		obj.launchBrowser("Firefox", "https://jqueryui.com/droppable/");
		obj.DragDropDemo();
	}
	
	public void DragDropDemo() {
		
		driver.switchTo().frame(0);
		System.out.println("Switched to frame");
		String dragX = "//div[@id='draggable']";
		String dropX = "//div[@id='droppable']";
		
		WebElement source = driver.findElement(By.xpath(dragX));
		WebElement target = driver.findElement(By.xpath(dropX));
		
		Actions builder = new Actions(driver);
		Action myAction = builder.dragAndDrop(source, target).build();
		myAction.perform();
		
//		new Actions(driver).dragAndDrop(source, target).build().perform();
		
	//	new Actions(driver).dragAndDropBy(source, source.getLocation().getX() + 100, source.getLocation().getY()+100).build().perform();
		driver.close();
	}
	

}
