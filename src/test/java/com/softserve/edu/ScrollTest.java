package com.softserve.edu;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollTest {
	private WebDriver driver;
	
	 @BeforeClass
	    public void beforeClass() {
		   WebDriverManager.chromedriver().setup();
		  /// WebDriverManager.firefoxdriver().setup();
	    	driver = new ChromeDriver();
		//	driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.selenium.dev/downloads/");
			System.out.println("\t\t@BeforeClass");
	    }

	    @AfterClass
	    public void afterClass() {
	    	driver.quit();
	        System.out.println("\t\t@AfterClass");
	    }
	    
	    @Test
	    public void f1() throws InterruptedException {
	    	
	    	System.out.println("\t\t\t\t@Test f1()");
	    }
	    @Test
	    public void f3() throws InterruptedException {
	    	
	    	WebElement link = driver.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]"));
	    	Thread.sleep(1000);//for presentation only
	    	
	    	// scroll via action class
	    	Actions action = new Actions(driver);
	    	action.moveToElement(link).perform();
	    	
	    	// scroll via js injection
	    	//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link);
	    	
	    	//Assert.assertTrue(price.getText().contains("472.33"));
	    	Thread.sleep(4000);//for presentation only
	    	System.out.println("\t\t\t\t@Test f3()");
	    }
}

