package com.training.sanity.tests;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.LoginPOM;
import com.training.pom.ProductDisplayPOM;

import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;



public class ProductDisplay {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private ProductDisplayPOM ProductsDisplayPOM;
	private static Properties properties;

	@BeforeClass

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  @BeforeMethod
  public void setUp() throws Exception {
			driver = DriverFactory.getDriver(DriverNames.CHROME);
			loginPOM = new LoginPOM(driver); 
			ProductsDisplayPOM = new SearchProductsDisplayPOM(driver); 
			baseUrl = properties.getProperty("baseURL");
			driver.get(baseUrl);
		}
	loginPOM.moveToShopLink();
	searchProductsDisplayPOM.moveToShopLink();
	Thread.sleep(3000);
	loginPOM.moveToEthnicLinkClick();
	searchProductsDisplayPOM.moveToEthnicLinkClick();

	loginPOM.clickSortLink();
	WebElement SortBy=loginPOM.SortLink();
	searchProductsDisplayPOM.clickSortLink();
	WebElement SortBy=searchProductsDisplayPOM.SortLink();
	String dropdownvalues=SortBy.getText();
	System.out.println(dropdownvalues);
	Select SortList=new Select(SortBy);
  SortList.selectByVisibleText("Name (A - Z)");
  String selected=SortList.getFirstSelectedOption().getText();
  String expected="Name (A - Z)";
  System.out.println(selected);
  Assert.assertEquals(selected,expected);
  Thread.sleep(8000); 

  loginPOM.clickSortLink();
  searchProductsDisplayPOM.clickSortLink();
	driver.navigate().refresh();
	Select sel = new Select(SortBy);
	sel.selectByVisibleText("Rating (Highest)");
	selected=SortList.getFirstSelectedOption().getText();
	expected="Rating (Highest)";
  System.out.println(selected);
  Assert.assertEquals(selected,expected);
  Thread.sleep(3000);
}

	}

}
