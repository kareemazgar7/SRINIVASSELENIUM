package exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UsingByClass extends LunchBase {
	
	

	public static void main(String[] args) {
		
		UsingByClass obj = new UsingByClass();
		
		obj.lunchBrowser("chrome", "http://automationpractice.com/index.php");
		
			obj.searchDress();
		
		
	}

	public void searchDress()  {
		
	WebElement 	inputsearch = driver.findElement(By.id("search_query_top"));
	inputsearch.click();
	System.out.println("clicked on webelemnt");
	inputsearch.clear();
	inputsearch.sendKeys("casual");
	System.out.println("enterd search string");
	
	WebElement searchbutton = driver.findElement(By.name("submit_search"));
	searchbutton.click();
	
	
	List<WebElement> inputelem = driver.findElements(By.tagName("input"));
	inputelem.size();
	System.out.println("size " + inputelem);
	
	for(WebElement myelem :inputelem ) {
		System.out.println(myelem.getLocation());
	}
	
	
	
	
	}
}
