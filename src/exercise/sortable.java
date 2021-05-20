package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class sortable extends LunchBase {

	public static void main(String[] args) throws Exception {
		
		sortable obj = new sortable();
		obj.lunchBrowser("chrome", "https://jqueryui.com/sortable/");
		obj.sortableX();
	}
	
	
	public void sortableX() throws Exception {
		
		Thread.sleep(3000);
		JavascriptExecutor js=  (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		
		driver.switchTo().frame(0);
		
		//ul[@id='sortable']
		//li[text()='Item 1']
	
		WebElement mainbox = driver.findElement(By.xpath("//ul[@id='sortable']"));
		System.out.println(mainbox.getLocation());
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		System.out.println(item1.getLocation());
		WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		System.out.println(item2.getLocation());
		WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		System.out.println(item3.getLocation());
		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		System.out.println(item4.getLocation());
		WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		System.out.println(item5.getLocation());
		WebElement item6 = driver.findElement(By.xpath("//li[text()='Item 6']"));
		System.out.println(item6.getLocation());
		WebElement item7 = driver.findElement(By.xpath("//li[text()='Item 7']"));
		System.out.println(item7.getLocation());
		
		Thread.sleep(3000);
		new Actions (driver).dragAndDropBy(item1, mainbox.getLocation().getX()+11, mainbox.getLocation().getY()+253).pause(3000)
		 .dragAndDropBy(item2, mainbox.getLocation().getX()+11, mainbox.getLocation().getY()+212).pause(3000)
		 .dragAndDropBy(item3, mainbox.getLocation().getX()+11, mainbox.getLocation().getY()+171).pause(3000)
		 .dragAndDropBy(item4, mainbox.getLocation().getX()+11, mainbox.getLocation().getY()+130).pause(3000)
		 
		 .build().perform();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

	
}
