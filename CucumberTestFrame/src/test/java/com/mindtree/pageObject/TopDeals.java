package com.mindtree.pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class TopDeals {
WebDriver ldriver;
	
	public TopDeals(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//*[@id=\"topnav_wrapper\"]/ul/li[1]/span")
	WebElement Topdeals;
	
	@FindBy(xpath="//*[@id=\"topnav_wrapper\"]/ul/li[1]/div/div/ul/li[1]/ul/li[2]/a/span")
	WebElement Tvunit;	
	
	public void setTopdeal()
	{
		 Topdeals.click();
	}
	public void setsTvunit()
	{
		 Tvunit.click();
	}

}
