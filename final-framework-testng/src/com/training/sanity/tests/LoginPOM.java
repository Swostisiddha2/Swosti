package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginPOM {
private WebDriver driver;
private String baseUrl;
private LoginPOM loginPOM;
private static Properties properties;
private ScreenShot screenShot;
private CatlogPOM CatlogPOM;

@BeforeClass
public static void setUpBeforeClass() throws IOException {
properties = new Properties();
FileInputStream inStream = new FileInputStream("./resources/others.properties");
properties.load(inStream);
}

@BeforeMethod
public void setUp() throws Exception {
driver = DriverFactory.getDriver(DriverNames.CHROME);
loginPOM = new LoginPOM(driver);
baseUrl = properties.getProperty("baseURL");
screenShot = new ScreenShot(driver);
// open the browser
driver.get(baseUrl);
}

/*@AfterMethod
public void tearDown() throws Exception {
Thread.sleep(1000);
driver.quit();
}*/

@Test (priority = 1)
public void validLoginTest() {
loginPOM.sendUserName("admin");
loginPOM.sendPassword("admin@123");
loginPOM.clickLoginBtn();
screenShot.captureScreenShot("First");
WebElement catlog=driver.findElement(By.xpath("//*[@class='fa fa-tags fa-fw']"));
        Actions act=new Actions(driver);
        act.moveToElement(catlog).build().perform();
        driver.findElement(By.xpath("//a[text()='Categories']")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
        Alert alertpop=driver.switchTo().alert();
        alertpop.accept();
       // String actualResult=driver.findElement(By.xpath("//*[@class='fa fa-check-circle']")).getText();
        //System.out.println(actualResult);
        //String expectedResult="Success: You have modified categories!";
        //Assert.assertEquals(actualResult, expectedResult);
}
/*@Test (priority = 2)
public void CatlogCheck() {
WebElement catlog=driver.findElement(By.xpath("//*[@class='fa fa-tags fa-fw']"));
        Actions act=new Actions(driver);
        act.moveToElement(catlog).build().perform();
/*CatlogPOM.catlog();
screenShot.captureScreenShot("Second");
}*/
}}