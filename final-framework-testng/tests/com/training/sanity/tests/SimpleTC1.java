package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM1;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class SimpleTC1 {
  
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM1 loginPOM1;
	private static Properties properties;
	private ScreenShot screenShot;
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM1 = new LoginPOM1(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// launching the application
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	
	@Test
	public void validLoginTest() throws InterruptedException {
		loginPOM1.sendCustomerName("admin");
		loginPOM1.sendPassword("admin@123");
		//Customer name and password is supplied to the text boxes
		Thread.sleep(1000);
		String actualCustomername=loginPOM1.getCustomeName();
        String expectedUsername="admin";
        //Validate if entered Customer name is getting displayed in Customername textbox
        Assert.assertEquals(actualCustomername, expectedUsername);
		String actualPassword=loginPOM1.getPassword();
        String expectedPassword="admin@123";
        //Validate if entered password is getting displayed in password textbox
        Assert.assertEquals(actualPassword, expectedPassword);
        //below method clicks the login
		loginPOM1.clickLogin();
		screenShot.captureScreenShot("Login_Success");
		loginPOM1.catalogue();
		loginPOM1.selectcategory();
		   screenShot.captureScreenShot("Capturing Catalogue");
		   loginPOM1.selectCatalogue();
		   loginPOM1.deleteCatalogue();
		   
	}



}
