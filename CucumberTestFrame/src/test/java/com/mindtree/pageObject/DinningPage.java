package com.mindtree.pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class DinningPage {
	
WebDriver ldriver;
	
	public DinningPage(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	}

	
	@FindBy(xpath="//*[@id=\"topnav_wrapper\"]/ul/li[5]/span")
	WebElement  DinningPg;
	
	@FindBy(xpath="//*[@id=\"topnav_wrapper\"]/ul/li[5]/div/div/ul/li[2]/ul/li[1]/a/span")
	WebElement dinningchair;
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div/ul/li[1]/div/div[6]")
	WebElement wishlist;
	
	public void setDinningdrp()
	{
		 DinningPg.click();
	}
	

	public void setdinningchair() {
		dinningchair.click();
		
	}
	public void setwishlist() {
		wishlist.click();
		
	}
	
	
}
