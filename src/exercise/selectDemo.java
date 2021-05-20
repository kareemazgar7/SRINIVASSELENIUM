package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class selectDemo extends LunchBase{

	public static void main(String[] args) {
		selectDemo obj =  new selectDemo();
		obj.lunchBrowser("chrome", "http://automationpractice.com/index.php");
		obj.select();

	}
	public void select() {
		//input[@id='email_create']
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		driver.findElement(By.xpath("//input[@name='email_create']")).click();
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("abcd07@gmail.com");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Select sl = new Select(driver.findElement(By.xpath("//*[@id = 'days']")));
		sl.selectByValue("5");
		Select month = new Select(driver.findElement(By.xpath("//*[@id = 'months']")));
		month.selectByValue("4");
		Select year = new Select(driver.findElement(By.xpath("//*[@id = 'years']")));
		year.selectByIndex(3);
		
		
		
	}

}
