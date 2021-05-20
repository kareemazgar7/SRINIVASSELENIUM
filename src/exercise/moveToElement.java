package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class moveToElement extends LunchBase {

	public static void main(String[] args) throws Exception {
		moveToElement obj = new  moveToElement();
		obj.lunchBrowser("chrome", "https://jqueryui.com/tooltip/");
		obj.tooltipdemo();
	}
	
	public void tooltipdemo() throws Exception {
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		
		WebElement toolx = driver.findElement(By.xpath("//a[text()='Tooltips']"));
		WebElement themex = driver.findElement(By.xpath("//a[text()='ThemeRoller']"));
		WebElement agex = driver.findElement(By.xpath("//input[@id='age']"));
		
		
		new Actions(driver).moveToElement(toolx).build().perform();
		//System.out.println(toolx.getText());
		
		Thread.sleep(3000);
		new Actions(driver).moveToElement(themex).build().perform();
		//System.out.println(themex.getText());
		Thread.sleep(3000);
		
		new Actions(driver).moveToElement(agex).build().perform();
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//a[text()='Menu']")).click();
		
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		
		WebElement electronics  = driver.findElement(By.xpath("//div[@id='ui-id-4']"));
		
		new Actions(driver).moveToElement(electronics).build().perform();
		
		
	}

}
