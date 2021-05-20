package classwork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UsingSelect extends Launch_Base{

	public static void main(String[] args) throws Exception {
		UsingSelect obj = new UsingSelect();
		obj.launchBrowser("chrome", "https://jqueryui.com/selectmenu/");
		//obj.selectDemo();
		obj.multiSelectDemo();
	}
	
	public void selectDemo() throws Exception {
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		String speedBtnXpath = "//span[@id='speed-button']";
		String speedOptionsX = "//ul[@id='speed-menu']/li/div[text()='%r%']"; //dynamic xpath
		
		driver.findElement(By.xpath(speedBtnXpath)).click();
		Thread.sleep(3000);
		String faster=speedOptionsX.replace("%r%", "Faster");
		System.out.println(faster);
		driver.findElement(By.xpath(faster)).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(speedBtnXpath)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(speedOptionsX.replace("%r%", "Slower"))).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(speedBtnXpath)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(speedOptionsX.replace("%r%", "Medium"))).click();
		Thread.sleep(3000);
		
		String filesBtnX="//span[@id='files-button']";
		String filesOptionsX = "//ul[@id='files-menu']/li/div[text()='%r%']"; //dynamic xpath
		
		driver.findElement(By.xpath(filesBtnX)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(filesOptionsX.replace("%r%", "jQuery.js"))).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(filesBtnX)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(filesOptionsX.replace("%r%", "Some unknown file"))).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
	}
	
	public void multiSelectDemo() throws Exception {
		driver.get("file:///C:/Users/karee/OneDrive/Desktop/HTML/SelectDropdowns.html");
		
		String mselX="//select[@name='cars']";
		
		System.out.println("Is displayed-->" +  driver.findElement(By.xpath(mselX)).isDisplayed());
		System.out.println("Is enabled-->" +  driver.findElement(By.xpath(mselX)).isEnabled());
		System.out.println("get tagname-->" +  driver.findElement(By.xpath(mselX)).getTagName());
		System.out.println("font-family css : " + driver.findElement(By.xpath(mselX)).getCssValue("font-family"));
		System.out.println("bgcolor css : " + driver.findElement(By.xpath(mselX)).getCssValue("background"));
		System.out.println("Color css : " + driver.findElement(By.xpath(mselX)).getCssValue("color"));
		Select mSelector = new Select(driver.findElement(By.xpath(mselX)));
		
		boolean mFlag = mSelector.isMultiple();
		System.out.println("is multi selector:" + mFlag);
		
		List<WebElement> opList = mSelector.getOptions();
		for(WebElement ele:opList) {
			System.out.println(ele.getText());
		}
		
		//WebElement fopt = mSelector.getFirstSelectedOption();
		//System.out.println("First Selected option : " + fopt.getText());
		
		mSelector.selectByIndex(0);
		Thread.sleep(2000);
		mSelector.selectByVisibleText("Toyota");
		Thread.sleep(2000);
		mSelector.selectByVisibleText("Honda");
		Thread.sleep(2000);
		mSelector.selectByVisibleText("Audi");
		Thread.sleep(2000);
		mSelector.selectByValue("vw");
		Thread.sleep(5000);
		
		mSelector.deselectByIndex(0);
		Thread.sleep(2000);
		mSelector.deselectByVisibleText("Audi");
		Thread.sleep(2000);
		mSelector.deselectByValue("vw");
		Thread.sleep(2000);
		mSelector.deselectAll();
		Thread.sleep(2000);
		
		String labelX = "//select[@name='salutation']/following-sibling::label";
		
		String myText = driver.findElement(By.xpath(labelX)).getText();
		System.out.println("Get text() of label --> " + myText);
		
				
	}

}

