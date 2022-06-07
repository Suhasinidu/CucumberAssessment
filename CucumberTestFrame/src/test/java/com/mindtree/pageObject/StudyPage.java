package com.mindtree.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudyPage {
	WebDriver ldriver;
	
	public StudyPage(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//*[@id=\"topnav_wrapper\"]/ul/li[7]/span")
	WebElement stdydropdown;
	
	@FindBy(xpath="//*[@id=\"topnav_wrapper\"]/ul/li[7]/div/div/ul/li[2]/ul/li[1]/a/span")
	WebElement stdychair;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div/ul/li[1]/div/div[5]/div[2]/a[2]")
	WebElement stdychair1;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/h1")
	WebElement pagetitle;
	
	public void setstdydropdown()
	{
		 stdydropdown.click();
	}
	


	public void setstudychair() {
		stdychair.click();
		
	}
	
	public void SetstudyChair() {
		stdychair1.click();
		
	}
	
	public void pagetitle() {
		pagetitle.getText();
		
	}
	
	
}
