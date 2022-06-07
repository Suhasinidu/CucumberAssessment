package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.mindtree.pageObject.Aboutus;
import com.mindtree.pageObject.Bedroom;
import com.mindtree.pageObject.DinningPage;
import com.mindtree.pageObject.FabricSofaPage;
import com.mindtree.pageObject.LoginPage;
import com.mindtree.pageObject.SearchPage;
import com.mindtree.pageObject.StudyPage;
import com.mindtree.pageObject.TopDeals;
import com.mindtree.pageObject.WishPage;
import com.mindtree.pageObject.orderPage;

import Utils.HelperClass;
import io.cucumber.java.en.*;

public class Step {
	public String baseURL="https://www.urbanladder.com/" ;
	public String username="bandivinod2000@gmail.com";
	public String password="Test@3741";
	public static WebDriver driver;
	public static Logger log;
	public static ExtentReports report;
	public static ExtentTest Test;
	@Given("User Launch chrome driver")
	public void user_launch_chrome_driver() {
		System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(baseURL);
		driver.manage().window().maximize();
		LoginPage lp=new LoginPage(driver);
		lp.setLoginIcon();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lp.setloginbutton();
		lp.setUsername(username);
		lp.setPassword(password);
		lp.setclickbutton();
	   
	}

	@When("Testing the StudyPage test case")
	public void testing_the_study_page_test_case() {
		StudyPage sp=new StudyPage(driver);
		sp.setstdydropdown();
		sp.setstudychair();
	    HelperClass.captureScreenshots(driver);
	   
	}

	

	@When("Testing the Sofaset Test case")
	public void testing_the_sofaset_test_case() {
		FabricSofaPage fsp=new FabricSofaPage(driver);
		
		fsp.saledropdown();
		fsp.sofaheader();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
       HelperClass.captureScreenshots(driver);
	
	driver.navigate().back();	
	
	}

	@When("Testing the  About us Test case")
	public void testing_the_about_us_test_case() throws InterruptedException {
		
		
		 Aboutus abs=new  Aboutus(driver);
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		  js.executeScript("window.scrollBy(0,1000)");
		  Thread.sleep(3000);
		 abs.setaboutus();
		Thread.sleep(3000);
		 HelperClass.captureScreenshots(driver);
		
		
	   
	}

	@When("Testing the Beds Test case")
	public void testing_the_beds_test_case() {
		
		Bedroom bd=new Bedroom(driver);
		bd.beddrp();
        bd.kingbed();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
		 HelperClass.captureScreenshots(driver);
		 driver.navigate().back();
		 
		
	  
	}

	@When("Testing TopDeals Test case")
	public void testing_top_deals_test_case() {
		
    TopDeals tp=new TopDeals(driver);
    tp.setTopdeal();
    tp.setsTvunit();
   JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,1000)");
    System.out.println(driver.getWindowHandles());
    HelperClass.captureScreenshots(driver);
   driver.navigate().back();
	}

	@When("Testing the Dinning Test case")
	public void testing_the_dinning_test_case() {
		
		DinningPage Dp=new DinningPage(driver);
		Dp.setDinningdrp();
		Dp.setdinningchair();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		  js.executeScript("window.scrollBy(0,1000)");
		  HelperClass.captureScreenshots(driver);
		  driver.navigate().back();
		 
	   
	}

	@When("Testing Searcht Test case")
	public void testing_searcht_test_case() {
		
		SearchPage SP=new SearchPage(driver);
		SP.setsearchele();
		HelperClass.captureScreenshots(driver);
	  System.out.println(driver.getTitle());
	    driver.navigate().back();
	    driver.get(baseURL);
	    
	  
	}
	@When("Testing Wishlist Test case")
	public void testing_wishlist_test_case() {
	    WishPage wl=new WishPage(driver);
	    wl.wishlist();
	    driver.get(baseURL);
	}
	@When("Testing Order Test case")
	public void testing_order_test_case() {
		orderPage op=new orderPage(driver);
		op.setordPg();
		op.setordp();
		HelperClass.captureScreenshots(driver);
		
	}
	
	
	@When("closing the driver")
	public void closing_the_driver() {
	
	 driver.close();  
	}

}
