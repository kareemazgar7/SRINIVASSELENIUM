package classwork.jse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


import classwork.Launch_Base;

public class JseDemo extends Launch_Base{

	public static void main(String[] args) throws Exception {
		JseDemo obj = new JseDemo();
		obj.launchBrowser("firefox", "http://automationpractice.com/index.php");
		obj.jsExec();
	}

	public void jsExec() throws Exception{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(10000);
		String url = js.executeScript("return document.URL;").toString();
		System.out.println("current url : " + url);
		Thread.sleep(2000);
		String title = js.executeScript("return document.title;").toString();
		System.out.println("current title : " + title);
		Thread.sleep(2000);
		WebElement we = driver.findElement(By.xpath("//input[@id='search_query_top']"));
		js.executeScript("arguments[0].click();", we);
		Thread.sleep(2000);
		js.executeScript("arguments[0].value='Casual Dresses';", we);
		Thread.sleep(2000);
		
		WebElement we2 = driver.findElement(By.xpath("//button[@name='submit_search']"));
		js.executeScript("arguments[0].click();", we2);
		Thread.sleep(5000);
		
		/* Scrolling */
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");//complete scroll down to bottom
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Sitemap')]")).click();
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,700)");//scroll down to some mega pixel
		Thread.sleep(5000);
		
		WebElement logo = driver.findElement(By.xpath("//a[@title='My Store']"));
//		js.executeScript("arguments[0].scrollIntoView();", logo);    // bring element into view
		scrolIntoView(logo);
//		Thread.sleep(5000);

	}
	
	public void scrolIntoView(WebElement we) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", we);
	}
}
