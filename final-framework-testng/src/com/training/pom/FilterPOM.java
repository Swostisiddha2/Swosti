package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterPOM {
private WebDriver driver;
	
	public FilterPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Products']")
	private WebElement products;
	
	@FindBy(id="input-name")
	private WebElement product;
	
	@FindBy(id="button-filter")	
	private WebElement filter;
	
	@FindBy(id="input-price")
	private WebElement price;
	
	
	public void product() {
		this.products.click();
		
	}
	public void sendProduct(String product) {
		this.product.clear();
		this.product.sendKeys(product);
	}
	public void sendPrice(String price) {
		this.price.clear();
		this.price.sendKeys(price);
	}

   public void applyFilter() {
		this.filter.click();
	}
}
