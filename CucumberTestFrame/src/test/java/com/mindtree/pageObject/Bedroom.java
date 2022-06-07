package com.mindtree.pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bedroom {
  public WebDriver ldriver;
	
	public Bedroom(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	}
	
	
	@FindBy(xpath="//*[@id=\"topnav_wrapper\"]/ul/li[3]/span") 
	WebElement Bed_click;
	@FindBy(xpath="//*[@id=\"topnav_wrapper\"]/ul/li[3]/div/div/ul/li[1]/ul/li[1]/a/span") 
	WebElement king_bed;

	public void beddrp()
	{
		 Bed_click.click();
	}
	public void kingbed()
	{
		 king_bed.click();
	}
	
}
