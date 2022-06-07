package com.mindtree.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishPage {
WebDriver ldriver;
	
	public WishPage(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//a[@title='Wishlist']")
	WebElement wishbtn;
	@FindBy(xpath="//a[@title='cart']")
	WebElement cartbtn;
	
	public void wishlist()
	{
		 wishbtn.click();
	}

public void setcart() {
		cartbtn.click();
		
	}
	
}
