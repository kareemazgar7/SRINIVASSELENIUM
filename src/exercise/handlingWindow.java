package exercise;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class handlingWindow extends LunchBase{

	public static void main(String[] args) throws Exception{
		
		handlingWindow obj = new handlingWindow();
		obj.lunchBrowser("chrome", "file:///C:/Users/karee/OneDrive/Desktop/SRINIVAS/HTML/MultiWindows.html");
		obj.windowhandle();
	}
	
	public void windowhandle() throws Exception{
		Thread.sleep(2000);
		String mainwinid = driver.getWindowHandle();
		System.out.println("main window: "  +mainwinid );
		String curl = driver.getCurrentUrl();
		System.out.println("mainwindow url :"  +curl);
		
		Thread.sleep(2000);
		driver.findElement(By.id("nwindow1")).click();
		
		Thread.sleep(2000);
		Set<String> secondwinid = driver.getWindowHandles();
		System.out.println(secondwinid.size());
		System.out.println("secondwindid: "  +secondwinid);
		for(String handles :secondwinid){
			if(!handles.equalsIgnoreCase(mainwinid)) {
				System.out.println(handles);
				driver.switchTo().window(handles);
				break;
			}

			
		}
		String TwoWindId = driver.getWindowHandle();
		Thread.sleep(2000);
		String curl2 = driver.getCurrentUrl();
		System.out.println("secondurl: "  + curl2);
		String title = driver.getTitle();
		System.out.println("secondwinddows tilte: "   +curl2);
		
		Thread.sleep(3000);
		
		
		
	  driver.findElement(By.xpath("(//*[starts-with(@class,'btn')])[4]")).click();
		
		driver.close();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(mainwinid);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.findElement(By.id("nTab")).click();
		Thread.sleep(2000);
		Set<String> lastwindid = driver.getWindowHandles();
		System.out.println(lastwindid.size());
		System.out.println("lastwindow id: " + lastwindid);
		for(String finalwindid : lastwindid) {
			if(!finalwindid.equalsIgnoreCase(mainwinid) && !finalwindid.equalsIgnoreCase(TwoWindId)){
				System.out.println("final window :"  +finalwindid);
				driver.switchTo().window(finalwindid);
				break;
			}
			
		}
		Thread.sleep(2000);
		String finalurl = driver.getCurrentUrl();
		System.out.println("final url :"  +finalurl);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2500)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div/b[text()='MORE NEWS']")).click();
		Thread.sleep(5000);
		driver.switchTo().window(mainwinid);
		Thread.sleep(4000);
		
	   driver.quit();
		
	}

	

}
