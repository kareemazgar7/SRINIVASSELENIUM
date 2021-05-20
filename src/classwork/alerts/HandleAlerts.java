package classwork.alerts;

import org.openqa.selenium.By;

import classwork.Launch_Base;



public class HandleAlerts extends Launch_Base {

	public static void main(String[] args) throws Exception{
		HandleAlerts obj = new HandleAlerts();
		obj.launchBrowser("chrome", "file:///C:/Users/karee/OneDrive/Desktop/SRINIVAS/HTML/Alert.html");
		obj.handleAlerts();
	}

	public void handleAlerts() throws Exception{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='btnAlert']")).click();
		Thread.sleep(2000);
		String a1Msg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println("alert1 accepted.. message displayed : " + a1Msg);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='btnConfirm']")).click();
		Thread.sleep(2000);
		String a2Msg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println("alert2 accepted.. message displayed : " + a2Msg);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='btnConfirm']")).click();
		Thread.sleep(2000);
		a2Msg = driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();
		System.out.println("alert2 dismissed.. message displayed : " + a2Msg);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='btnPrompt']")).click();
		Thread.sleep(2000);
		String a3Msg = driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("John");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		System.out.println("alert2 accepted.. message displayed : " + a3Msg);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='btnPrompt']")).click();
		Thread.sleep(2000);
		a3Msg = driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("John");
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		System.out.println("alert2 dismissed.. message displayed : " + a3Msg);
		Thread.sleep(2000);
		driver.quit();
	}
	
}
