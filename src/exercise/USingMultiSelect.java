package exercise;

import org.openqa.selenium.By;

import classwork.Launch_Base;
import classwork.UsingSelect;

public class USingMultiSelect extends Launch_Base{

		public static void main(String[] args) throws Exception {
			USingMultiSelect obj = new USingMultiSelect();
			obj.launchBrowser("chrome", "https://jqueryui.com/selectmenu/");
			obj.selectdemo();
		
	}
		public void selectdemo() throws Exception {
			
			String speedbuttonX   =	"//span[@id='speed-button']";
			String speedoptionX   = "//ul[@id='speed-menu']/li/div[text()='%r%']"; //dynamic xpath
			
			
			
			driver.findElement(By.xpath(speedbuttonX)).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(speedoptionX.replace("%r%", "Faster"))).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath(speedoptionX.replace("%r%", "Slower"))).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath(speedoptionX.replace("%r%", "Slow"))).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath(speedoptionX.replace("%r%", "Medium"))).click();
			
			String filesbuttonX="//span[@id='files-button']";
			String filesmenuX="//ul[@id='files-menu']/li/div[text()='%r%']";
			
			driver.findElement(By.xpath(filesbuttonX)).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(filesmenuX.replace("%r%", "jQuery.js"))).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath(speedoptionX.replace("%r%", "ui.jQuery.js"))).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath(speedoptionX.replace("%r%", "Some unknown file"))).click();
			
			
			
			
			
		}

}
