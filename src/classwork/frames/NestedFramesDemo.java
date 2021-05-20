package classwork.frames;

import org.openqa.selenium.By;


import classwork.Launch_Base;

public class NestedFramesDemo extends Launch_Base {

	public static void main(String[] args) throws Exception {
		NestedFramesDemo obj = new NestedFramesDemo();
		obj.launchBrowser("chrome", "file:///C:/Users/karee/OneDrive/Desktop/SRINIVAS/HTML/FramesNested.html");
		obj.nfDemo();

	}
	
	public void nfDemo() throws Exception {
		
		driver.switchTo().frame(0);//switch main -> f1
		System.out.println("Switched to F1");
		//driver.switchTo().frame(0);
		driver.switchTo().frame("iframe2");// f1 -> f2
		System.out.println("Switched to F1 -> F2");
		driver.switchTo().frame(0); // f2 -> f3
		System.out.println("Switched to F2 -> F3");
		
		String unameX = "//input[@name='userName']";
		String pwdX = "//input[@name='usePwd']";
		driver.findElement(By.xpath(unameX)).sendKeys("guest");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pwdX)).sendKeys("guest");
		System.out.println("entered username and owd in frame3");
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();// f3 -> f2
		System.out.println("Switched to Parent (f2)");
		String loginX="//button[@name='Login']";
		driver.findElement(By.xpath(loginX)).click();
		System.out.println("Clicked on login button in frame2");
		
		driver.switchTo().defaultContent();// back to main
		System.out.println("Switched to Main");
	}

}
