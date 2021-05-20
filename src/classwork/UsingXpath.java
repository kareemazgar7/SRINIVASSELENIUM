package classwork;

public class UsingXpath extends Launch_Base {

	public static void main(String[] args) {
		UsingXpath obj = new UsingXpath();
		obj.xpathDemo();

	}
	
public void xpathDemo() {
		
		String abxpath= "/html/body/div/div/header/div[3]/div/div/div[2]/form/input[4]"; //absolute xpath
		String searxhinputX = "//input[@name='search_query']";
		//input[@name='search_query'][@type='text'] - with more than one attributes
		//input[(@name='search_query') and (@placeholder='Search')] - using and, expects both attributes matches
		//input[(@name='search_query') or (@placeholder='Search')] - using or, return element if any one attribute matches
		//input[not(@name='search_query') ] - using not, means, not having the attribute
		//input[not(@type='hidden') and (@class='search_query form-control ac_input')] - using both not & and 
		//input[starts-with(@class,'search_query')] - using starts-with
		//input[contains(@class,'ac_input')] - using contains, used to find substring
		//input[contains(@id,'_top') and starts-with(@class,'search')] - using and,  contains & starts-with
		//a[text()='Contact us'] - using text() function
		//a[contains(text(),'Sign in')] - using contains and text()
		//a[normalize-space(text())='Sign in'] - using normalize=space which removed leading and trailing spaces of text() or attribute val
		//a[contains(.,'Sign in')]  - we can .(dot) in place of text(). . Can used to used verify text in its child nodes also
		//button[contains(.,'Search')]
		//form[@id='searchbox']/child::button - to refer immediate child
		//form[@id='searchbox']/button - to refer immediate child
		//div[@id='search_block_top']/form/button
		//div[@id='search_block_top']//button - using // you can traverse to descendants(down in hierarchy)
		//div[@id='search_block_top']/descendant::button //you can traverse to descendants
		//button[@name='submit_search']/.. // traversing to parent or up in the level
		//button[@name='submit_search']/parent::form // traversing to parent or up in the level
		//button[@name='submit_search']/../..  - use to find ancestors
		//button[@name='submit_search']/ancestor::div[@id='search_block_top'] - use to find ancestors
		//div[@id='search_block_top']/preceding::div[1] - traverse to same level nodes
		//div[@id='search_block_top']/following::div- traverse to same level
		//div[@id='search_block_top']//input/following-sibling::input[3] - traverse between sibling in down in the order
		//button[@name='submit_search']/preceding-sibling::input - traverse between sibling in up in the order
	}
}

