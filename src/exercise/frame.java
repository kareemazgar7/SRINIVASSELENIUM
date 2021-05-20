package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class frame extends LunchBase {
	
	

	public static void main(String[] args) throws Exception {
		frame obj = new frame();
		
		obj.lunchBrowser("chrome", "file:///C:/Users/karee/OneDrive/Desktop/HTML/Frames.html");
        obj.frameA();
}
	
	public void frameA() throws Exception {
		driver.switchTo().frame(0);
		String inputx =" //input[@id='Frame1txt']";
		driver.findElement(By.xpath(inputx)).clear();
		driver.findElement(By.xpath(inputx)).sendKeys("frame1");
		driver.switchTo().defaultContent();
		 Thread.sleep(2000);
		
		driver.switchTo().frame("frame_b");
		String frame2x ="//input[@id='Frame2txt']";
		driver.findElement(By.xpath(frame2x)).clear();
		driver.findElement(By.xpath(frame2x)).sendKeys("frame2");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		String frame3x ="//frame[@name='frame_c']";
		WebElement elm = driver.findElement(By.xpath(frame3x));
		
		driver.switchTo().frame(elm);
		
		String frame3 ="//input[@id='Frame3txt']";
		driver.findElement(By.xpath(frame3)).clear();
		driver.findElement(By.xpath(frame3)).sendKeys("frame3");
		driver.switchTo().defaultContent();
	}
	
}
