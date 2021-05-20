package classwork.multiwindows;

import java.util.Set;

import org.openqa.selenium.By;

import classwork.Launch_Base;



public class HandleMultiWindows extends Launch_Base {

	public static void main(String[] args) throws Exception{
		HandleMultiWindows obj = new HandleMultiWindows();
		obj.launchBrowser("chrome", "file:///C:/Users/karee/OneDrive/Desktop/SRINIVAS/HTML/MultiWindows.html");
		obj.handleWindows();		
	}

	public void handleWindows() throws Exception {
		
		String mainWinId = driver.getWindowHandle();
		System.out.println("Main window handle id : " + mainWinId);
		
		driver.findElement(By.xpath("//button[@id='nwindow1']")).click();
		Set<String> handles = driver.getWindowHandles();
		System.out.println("Windows size :" + handles.size());
		System.out.println("Window handles : "+ handles);
		for(String winID : handles) {
			if(!winID.equalsIgnoreCase(mainWinId)) {
				System.out.println("not main window id, so swtching to it.." + winID);
				driver.switchTo().window(winID);
				break;
			}
		}
		Thread.sleep(10000);
		String curl =  driver.getCurrentUrl();
		System.out.println("New window Url : " + curl);
		driver.findElement(By.xpath("//button[contains(text(),'Browse Course')]")).click();
		//driver.close(); //close only current browser
		
		driver.switchTo().window(mainWinId);
		Thread.sleep(2000);
		curl = driver.getCurrentUrl();
		System.out.println("Main window url : " + curl);
		Thread.sleep(2000);
		driver.quit(); //close all windows opened in that run session
	}
}
