package com.mindtree.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FabricSofaPage {
WebDriver ldriver;
	
	public FabricSofaPage(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//*[@id=\"topnav_wrapper\"]/ul/li[1]/span")
	WebElement saledropdown;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/h1")
	WebElement sofaHeader;
	
	@FindBy(xpath="//*[@id=\"topnav_wrapper\"]/ul/li[1]/div/div/ul/li[1]/ul/li[1]/a/span")
	WebElement sofa;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
	WebElement addcart;

public void saledropdown()
{
	 saledropdown.click();
}
public void sofaheader()
{
	sofa.click();
	 sofa.getText();
}

}