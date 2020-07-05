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
import com.training.pom.FilterPOM;
import com.training.pom.LoginPOM1;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class SimpleTC2 {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM1 loginPOM1;
	private FilterPOM filterPOM;
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
		filterPOM = new FilterPOM(driver);
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
		loginPOM1.clickLogin();
		screenShot.captureScreenShot("Login_Success");
		loginPOM1.catalogue();
		filterPOM.product();
		filterPOM.sendProduct("Integer vitae iaculis massa");
		filterPOM.applyFilter();
		filterPOM.sendPrice("515");
		filterPOM.applyFilter();
		
		   
	}


}
