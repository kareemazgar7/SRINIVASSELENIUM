package classwork;

import org.openqa.selenium.By;

public class UsingCSSloc extends Launch_Base{

	public static void main(String[] args) throws Exception {
		UsingCSSloc obj = new UsingCSSloc();
		obj.launchBrowser("firefox", "http://automationpractice.com/index.php");
		obj.cssLocate();
	}
	
	public void cssLocate() throws Exception {
		
		String searchInput = "div#search_block_top  input[name='search_query']"; //using id
		String searchbtn = "form > input + button ";
		//String searchInput = "input#search_query_top"; //using id
		//String searchbtn = "button.btn[name='submit_search']"; // using class
		// "input[name='search_query'][type='text']"; // using two attributes
		// input#search_query_top[name='search_query'] - using id and another attributes
		//input.search_query[name='search_query'] - using class and another attribute
		//input#search_query_top.search_query[name='search_query']- using class, id and another attribute
		//a[title^='Log in to your'] - using starts-with or prefix
		//a[title$='account'] - using ends with or suffix
		//a[title$='account'][title^='Log in'] - using both suffix and prefix
		//div > div > form#searchbox > input[name='search_query'] - using immediate parent
		//div#search_block_top  input[name='search_query'] - using ancestor ( immediate child or grand or super child)
		//div.container input[name='search_query'] - using ancestor and its class
		//form > input + input + input + input - traversing between sibling using + (down in the hierarchy)
		//form > input + button - using immediate child and sibling
		//form > input:nth-child(4) - using nth-child for a particular parent and sibling
		
		driver.findElement(By.cssSelector(searchInput)).click();
		driver.findElement(By.cssSelector(searchInput)).sendKeys("T-shirts");
		System.out.println("Entered search string");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(searchbtn)).click();
		System.out.println("Clicked on Search btn");
		Thread.sleep(5000);
		driver.quit();
		
	}

}
