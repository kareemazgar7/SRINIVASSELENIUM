package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Using_ByClass extends Launch_Base{

	public static void main(String[] args) throws Exception {
		Using_ByClass obj = new Using_ByClass();
		obj.launchBrowser("firefox", "http://automationpractice.com/index.php");
		obj.searchDress();
	}
	
	public void searchDress() throws Exception {
		
		WebElement searchInput = driver.findElement(By.id("search_query_top"));
		searchInput.click();
		System.out.println("Clicked on webElement");
		searchInput.clear();
		searchInput.sendKeys("Casual Dresses");
		System.out.println("Entered search string");
		Thread.sleep(2000);
		WebElement searchBtn = driver.findElement(By.name("submit_search"));
		searchBtn.click();
		System.out.println("Clicked on search button");
		Thread.sleep(3000);
		
		WebElement cartDiv = driver.findElement(By.className("shopping_cart"));
		cartDiv.click();
		System.out.println("Clicked on Cart");
		Thread.sleep(3000);
		WebElement cntctLink = driver.findElement(By.linkText("Contact us"));
		cntctLink.click();
		Thread.sleep(3000);
		WebElement ptLink = driver.findElement(By.partialLinkText("Sign"));
		ptLink.click();
		
		WebElement btnTag = driver.findElement(By.tagName("button"));
	}

}
