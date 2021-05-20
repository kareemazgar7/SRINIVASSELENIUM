package classwork.alerts;

import org.openqa.selenium.By;

import classwork.Launch_Base;



public class HandlingDialog extends Launch_Base{

	public static void main(String[] args) throws Exception{
		HandlingDialog obj = new HandlingDialog();
		obj.launchBrowser("chrome", "file:///C:/Users/karee/OneDrive/Desktop/SRINIVAS/HTML/Dialog.html");
		obj.dialogHandling();
	}

	public void dialogHandling() throws Exception{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='myBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("guest");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("guest");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='Login']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
	
}
