package com.mindtree.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SearchPage {
WebDriver ldriver;
	
	public SearchPage(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);

	}
	
	@FindBy(xpath="//input[@id='search']") WebElement search_ele;
    @FindBy(xpath="//a[@data-id='96076']") WebElement Balnket;

    
    public void setsearchele()
	{
		 search_ele.sendKeys("Blanket");
		 search_ele.sendKeys(Keys.ENTER);

	}
	


	public void setbalnket() {
		Balnket.click();
		
	}
}
