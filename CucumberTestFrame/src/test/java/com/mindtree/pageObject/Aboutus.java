package com.mindtree.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Aboutus {
WebDriver ldriver;
	
	public Aboutus(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	}


@FindBy(xpath="//*[@id=\"footer-links\"]/div[1]/div[1]/ul[1]/li[1]/a")
WebElement aboutus;

@FindBy(xpath="//*[@id=\"page_content\"]/div[1]/div/p[1]")
WebElement abouttext;

public void setaboutus() {
	aboutus.click();
	
}

public void setabouttext() {
	abouttext.getText();
	
	
}

}