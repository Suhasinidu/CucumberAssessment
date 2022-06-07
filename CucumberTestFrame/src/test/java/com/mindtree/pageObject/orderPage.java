package com.mindtree.pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderPage {
WebDriver ldriver;
	
	public orderPage(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//*[@id=\"header\"]/section/div/ul[2]/li[2]/a")
	WebElement order;
	@FindBy(xpath="//*[@id=\"app-container\"]/div/footer/section/div[1]/section[1]/ul/li[8]/a")
	WebElement pri;
	public void setordPg()
	{
		 order.click();
	}
	


	public void setordp() {
		pri.click();
		
	}
	

}
