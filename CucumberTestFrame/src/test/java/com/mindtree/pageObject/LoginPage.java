package com.mindtree.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
 WebDriver ldriver;
 
 public LoginPage(WebDriver rdriver)
 {
	 ldriver=rdriver;
	 PageFactory.initElements(rdriver,this);
	 
	 
 }

	@FindBy(xpath="//span[@class='header-icon-link user-profile-icon']")
	WebElement loginicon;
	
	
	@FindBy(xpath="//a[contains(text(),'Log In')]")
	WebElement loginbutton;
	
	@FindBy(xpath="//div[@id='password-credentials']//input[@id='spree_user_email']")
	WebElement Usrname;
	
	@FindBy(xpath="//div[@class='password']//input[@class='required input_authentication']")
	WebElement pwd;
	@FindBy(xpath="//input[@id='ul_site_login']")
	WebElement loginbtn;
	@FindBy(xpath="//*[@id=\"spree_user_email\"]")
	WebElement texticon;

	public void setLoginIcon()
	{
		 loginicon.click();	
		//x1.click();
	}
	public void setUsername(String uname)
	{
		Usrname.sendKeys("bandivinod2000@gmail.com");
	}

	public void setPassword(String pwd1)
	{
		 pwd.sendKeys("Test@3741");
	}

	public void setloginbutton()
	{
		loginbutton.click();
	}
	
	public void setclickbutton()
	{
		loginbtn.click();
	}
	public void texticon()
	{
		texticon.click();
	}
	
}

