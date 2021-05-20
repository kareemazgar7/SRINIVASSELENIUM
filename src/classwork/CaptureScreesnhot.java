package classwork;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreesnhot extends Launch_Base{

	public static void main(String[] args) throws Exception {
		CaptureScreesnhot obj = new CaptureScreesnhot();
		obj.launchBrowser("firefox", "http://automationpractice.com/index.php");
		//obj.captureScreen();
		obj.captureScreenShot("D:\\SeleniumTraining\\8PMBatch\\JavaSelenium\\LaunchPage.png");
	}
	
	public void captureScreen() throws Exception {
		
		TakesScreenshot capture = (TakesScreenshot) driver;
		File src = capture.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\SeleniumTraining\\8PMBatch\\JavaSelenium\\homepage.png");
		FileHandler.copy(src, dest);
		
	}
	
	public void captureScreenShot(String dest) throws IOException {
		TakesScreenshot capture = (TakesScreenshot) driver;
		File src = capture.getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(src, new File(dest));
		Path srcFilePath = Paths.get(src.getAbsolutePath());
		Path destDir = Paths.get(dest);
		Files.copy(srcFilePath, destDir, StandardCopyOption.REPLACE_EXISTING);

	}
	
	

}
