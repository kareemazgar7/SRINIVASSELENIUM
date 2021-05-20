package exercise;

import java.util.Set;

import org.openqa.selenium.By;

public class windowHandle extends LunchBase{

	public static void main(String[] args) {
		windowHandle obj = new windowHandle();
		obj.lunchBrowser("chrome", "file:///C:/Users/karee/OneDrive/Desktop/SRINIVAS/HTML/MultiWindows.html");
		obj.windowhandless();

	}
	public void windowhandless() {
		String mainwindID = driver.getWindowHandle();
		System.out.println("main window id :"  + mainwindID);
		driver.findElement(By.id("nwindow1")).click();
		
		
		Set<String> secondwindid  = driver.getWindowHandles();
		System.out.println("windowsize:" +secondwindid.size());
		System.out.println("bothwindows id:"  + secondwindid);
		for (String  twowindid :secondwindid){
//			if(!twowindid.equalsIgnoreCase(mainwindID)) {
//				System.out.println(twowindid);
//				driver.switchTo().window(twowindid);
//			}
			driver.switchTo().window(twowindid);
			
			break;
		
		}
		
		
		String url = driver.getCurrentUrl();
		System.out.println("curl:  "  +url);
		String title = driver.getTitle();
		System.out.println("title:  "  +title);
		driver.findElement(By.xpath("//button[starts-with(@class,'btn btn-primary font-600')]")).click();
		driver.switchTo().window(mainwindID);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
		
		
		 
		
		
		
	}

}
