package exercise;

import org.openqa.selenium.By;

public class AlertClassDemo extends LunchBase {

	public static void main(String[] args) throws Exception {
		AlertClassDemo obj = new AlertClassDemo();
		obj.lunchBrowser("firefox", "file:///C:/Users/karee/OneDrive/Desktop/SRINIVAS/HTML/Alert.html");
		obj.alertdemo();
		
		
	}
	
	public void alertdemo() throws Exception {
		
		Thread.sleep(3000);
		driver.findElement(By.name("btnAlert")).click();
		Thread.sleep(3000);
		String alert1 =	driver.switchTo().alert().getText();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println(alert1);
		
	    Thread.sleep(3000);
		driver.findElement(By.name("btnConfirm")).click();
		Thread.sleep(3000);
		String alert2 =	driver.switchTo().alert().getText();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println(alert2);
		
		Thread.sleep(3000);
		driver.findElement(By.name("btnConfirm")).click();
		Thread.sleep(3000);
		alert2 = driver.switchTo().alert().getText();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		System.out.println(alert2);
		
		
		Thread.sleep(3000);
		driver.findElement(By.name("btnPrompt")).click();
		Thread.sleep(3000);
		String alert3 =	driver.switchTo().alert().getText();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("ali");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println(alert3);
		
		
		Thread.sleep(3000);
		driver.findElement(By.name("btnPrompt")).click();
		Thread.sleep(3000);
		alert3 =	driver.switchTo().alert().getText();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("ali");
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		System.out.println(alert3);
		driver.quit();
		
		
	}

}
