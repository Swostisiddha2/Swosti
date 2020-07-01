package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.LoginPOM;
import com.training.pom.PasswordValidationPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class PasswordValidation {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private PasswordValidationPOM PasswordValidationPOM;
	private static Properties properties;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		PasswordValidationPOM = new PasswordValidationPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		driver.get(baseUrl);
	}
	public void validLoginTest() throws InterruptedException {
	 
		loginPOM.moveToAccountLink();
		PasswordValidationPOM.moveToAccountLink();
		Thread.sleep(3000);
		loginPOM.moveToLoginLinkClick();	
		loginPOM.sendUserEmail("swosti.nayak@gmail.com");
		loginPOM.sendUserEmailPassword("1234Swos");
		loginPOM.clickEmailLoginBtn();
		PasswordValidationPOM.moveToLoginLinkClick();	
		PasswordValidationPOM.sendUserEmail("swosti.nayak@gmail.com");
		PasswordValidationPOM.sendUserEmailPassword("1234Swos");
		PasswordValidationPOM.clickEmailLoginBtn();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Change your password")).click();
		loginPOM.sendUserEmailPassword("manipal");
		loginPOM.sendUserEmailConfirmPassword("manipal2");
		loginPOM.clickEmailLoginBtn();
		PasswordValidationPOM.sendUserEmailPassword("manipal");
		PasswordValidationPOM.sendUserEmailConfirmPassword("manipal2");
		PasswordValidationPOM.clickEmailLoginBtn();
		String actualResult = driver.findElement(By.xpath("//div[@class='text-danger']")).getText();
		System.out.println(actualResult);
		String expectedResult="Password confirmation does not match password!";
}
	}