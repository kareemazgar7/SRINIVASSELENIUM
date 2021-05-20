package classwork.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import classwork.Launch_Base;

public class FramesDemo extends Launch_Base{

	public static void main(String[] args) throws Exception {
		
		FramesDemo obj = new FramesDemo();
		obj.launchBrowser("chrome", "file:///C:/Users/karee/OneDrive/Desktop/SRINIVAS/HTML/Frames.html");
		obj.fdemo();
	}
	
public void fdemo() throws Exception {
		
		driver.switchTo().frame(0); //switch to frame1 using index
		String f1inputX="//input[@id='Frame1txt']";
		driver.findElement(By.xpath(f1inputX)).clear();
		driver.findElement(By.xpath(f1inputX)).sendKeys("Frame1 text");
		driver.switchTo().defaultContent(); // takes to main
		Thread.sleep(2000);
		
		driver.switchTo().frame("frame_b"); // switch to frame2 using name (or id)
		String f2inpitX = "//input[@id='Frame2txt']";
		driver.findElement(By.xpath(f2inpitX)).clear();
		driver.findElement(By.xpath(f2inpitX)).sendKeys("Frame2 text");
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame(); // takes to main
		Thread.sleep(2000);
		
		String f3X = "//frame[@name='frame_c']";
		WebElement f3 = driver.findElement(By.xpath(f3X));
		driver.switchTo().frame(f3); //switch to frame3 using webelement
		String f3inpitX = "//input[@id='Frame3txt']";
		driver.findElement(By.xpath(f3inpitX)).clear();
		driver.findElement(By.xpath(f3inpitX)).sendKeys("Frame3 text");
		driver.switchTo().defaultContent(); // takes to main
	}


}
