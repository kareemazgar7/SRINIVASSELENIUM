package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class newActions extends LunchBase {

	public static void main(String[] args) throws Exception {
		newActions obj = new newActions();
		obj.lunchBrowser("chrome", "http://automationpractice.com/index.php");
        //obj.bulidActions();
		obj.sendkeys();
		
	}
	public void bulidActions()  throws Exception{
		
		
		WebElement search = driver.findElement(By.name("search_query"));
		WebElement searchbutton = driver.findElement(By.name("submit_search"));
		
		Actions bulider = new Actions(driver);
		
		Action myaction = bulider.click(search).pause(2000).sendKeys("t-shirt").pause(2000)
				.doubleClick(searchbutton).pause(2000).contextClick().build();
		
		myaction.perform();
		
		
    }
	public void sendkeys() {
//		WebElement searchx = driver.findElement(By.name("search_query"));
//		WebElement searchbuttonx = driver.findElement(By.name("submit_search"));
//		
		Actions bulider1 = new Actions(driver);
//		Action myaction1 = bulider1.click(searchx).pause(2000).sendKeys("dress")
//				.pause(2000).sendKeys(Keys.F12).pause(2000)
//				.sendKeys(Keys.chord(Keys.CONTROL ,"a")).build();
//		
//		myaction1.perform();
		
		WebElement we = driver.findElement(By.xpath("//h1[text()='Automation Practice Website']"));
		 String text  = driver.findElement(By.xpath("//h1[text()='Automation Practice Website']")).getText();
		System.out.println(text);
		
		Action myaction2 = bulider1.clickAndHold(we).keyDown(Keys.CONTROL)
				            .sendKeys(Keys.ARROW_RIGHT.ARROW_DOWN)
				            .sendKeys(Keys.ARROW_DOWN)
				            .sendKeys(Keys.ARROW_DOWN)
				            .keyUp(Keys.CONTROL).build();
		
		myaction2.perform();
		
	}
}
