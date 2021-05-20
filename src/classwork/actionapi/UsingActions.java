package classwork.actionapi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import classwork.Launch_Base;



public class UsingActions extends Launch_Base{

	public static void main(String[] args) throws Exception {
		UsingActions obj = new UsingActions();
		obj.launchBrowser("chrome", "http://automationpractice.com/index.php");
		obj.buildActs();
	}
	
	public void buildActs() throws Exception{
		
		String searchXpath = "//input[@name='search_query']";
		String sbtmXpath = "//button[@name='submit_search']";
		WebElement search = driver.findElement(By.xpath(searchXpath));
		WebElement sbtn = driver.findElement(By.xpath(sbtmXpath));
		Actions builder = new Actions(driver);
		
		Action myAction = builder.click(search).pause(2000).sendKeys("T-Shirts").pause(2000).contextClick(search).build();
		myAction.perform();
		
		Thread.sleep(3000);
		
		Action myAction2 = builder.doubleClick(sbtn).build();
		myAction2.perform();
		Thread.sleep(5000);
		Action myAction3 = builder.click()
								  .sendKeys(Keys.F12)
								  .sendKeys(Keys.chord(Keys.CONTROL, "a"))
								  .build();
		myAction3.perform();
		Thread.sleep(5000);
		WebElement we = driver.findElement(By.xpath("//a[contains(.,'Faded Short Sleeve T-shirts')]"));
		
		Action myAction4 = builder.click(we).pause(3000)
								  .keyDown(Keys.CONTROL)
								  .sendKeys(Keys.ARROW_DOWN)
								  .sendKeys(Keys.ARROW_DOWN)
								  .sendKeys(Keys.ARROW_DOWN)
								  .keyUp(Keys.CONTROL)
								  .build();
		myAction4.perform();
	}

}
