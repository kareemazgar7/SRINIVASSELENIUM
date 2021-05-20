package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassSiri extends LunchBase{

	public static void main(String[] args)  {
		ActionsClassSiri obj = new ActionsClassSiri();
		obj.lunchBrowser("chrome", "https://www.amazon.com/");
        obj.ActClass();
       
	}
	public void ActClass() {
		Actions obj1 = new Actions (driver);
		WebElement accountAndList = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	    WebElement account = driver.findElement(By.xpath("//span[text()='Account']"));
		 WebElement prime = driver.findElement(By.xpath("//span[text()='Prime']"));
		 // WebElement searchx = driver.findElement(By.xpath("//*[@name='email']"));
		  obj1.moveToElement(accountAndList).pause(2000).click(account).contextClick(prime).click(prime).build().perform();
		  
		  
		  
	}

}
