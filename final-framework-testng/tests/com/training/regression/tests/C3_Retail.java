package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.C3RetailPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class C3_Retail {

private WebDriver driver;
private String baseUrl;
private String baseUrl1;
private C3RetailPOM c3RetailPOM;
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
c3RetailPOM = new C3RetailPOM(driver);
baseUrl = properties.getProperty("baseURL2");
baseUrl1 = properties.getProperty("baseURL3");
screenShot = new ScreenShot(driver); 
// launching the application 
driver.get(baseUrl1);
// passing the credentials to login
c3RetailPOM.LoginName("abc@gmail.com");
c3RetailPOM.LoginPassword("Abc12345");
}

@AfterMethod
public void tearDown() throws Exception {
Thread.sleep(1000);
driver.quit();
}

@Test(dataProvider = "excel-inputs1", dataProviderClass = LoginDataProviders.class)
public void validLoginTest(String comment) throws InterruptedException {

c3RetailPOM.clickLoginBtn();
c3RetailPOM.viewOrderHistory();
c3RetailPOM.viewOrder();
c3RetailPOM.returnOrder();
c3RetailPOM.returnReason();
c3RetailPOM.productOpen();
c3RetailPOM.comment(comment);
c3RetailPOM.submit();
}

}
