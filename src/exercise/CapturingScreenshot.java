package exercise;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class CapturingScreenshot  extends LunchBase{

	public static void main(String[] args) throws Exception {
		
		CapturingScreenshot obj = new CapturingScreenshot();
		obj.lunchBrowser("chrome", "http://automationpractice.com/index.php");
		//obj.capturescreen();
		obj.capturescreenShot("C:\\Users\\karee\\eclipse-workspace\\SRINIVASSELENIUM\\Mainpage.png");
		
	}
//	public void capturescreen() throws Exception {
//		TakesScreenshot capture =(TakesScreenshot)driver;
//		File src = capture.getScreenshotAs(OutputType.FILE);
//		File dest = new File("C:\\Users\\karee\\eclipse-workspace\\SRINIVASSELENIUM\\homepage.png");
//		FileHandler.copy(src, dest);
//		
		
		
//	}
	public void capturescreenShot(String dest) throws Exception {
		TakesScreenshot capture =(TakesScreenshot)driver;
		File src = capture.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File (dest));
	}

}
