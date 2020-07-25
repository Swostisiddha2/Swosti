package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.C1RetailPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class C1_Retail {

private WebDriver driver;
private String baseUrl;
private C1RetailPOM c1RetailPOM;
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
c1RetailPOM = new C1RetailPOM(driver); 
baseUrl = properties.getProperty("baseURL2");
screenShot = new ScreenShot(driver); 
// launching the application
driver.get(baseUrl);
//passing the credentials to login
c1RetailPOM.sendUserName("admin");
c1RetailPOM.sendPassword("admin@123");
c1RetailPOM.clickLoginBtn(); 
}

@AfterMethod
public void tearDown() throws Exception {
Thread.sleep(1000);
driver.quit();
}

@Test 
public void validLoginTest() throws InterruptedException { 

c1RetailPOM.catlog();
c1RetailPOM.product();
c1RetailPOM.addNewProduct();
c1RetailPOM.sendProductName("Finger Ring");
c1RetailPOM.sendTagTitle("Finger Ring for ladies");
c1RetailPOM.ClickData();
c1RetailPOM.sendModel("SKU-012");
c1RetailPOM.sendPrice("500");
c1RetailPOM.sendQuantity("50");
c1RetailPOM.ClickLinks();
c1RetailPOM.ClickCategories();
c1RetailPOM.Attribute();
c1RetailPOM.Option();
c1RetailPOM.Recurring();
c1RetailPOM.Discount();
c1RetailPOM.Special();
c1RetailPOM.Image();
        Thread.sleep(500);
        c1RetailPOM.Reward();
        c1RetailPOM.Design();
        c1RetailPOM.Save();

}
}

