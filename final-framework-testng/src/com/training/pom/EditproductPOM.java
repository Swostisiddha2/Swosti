package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditproductPOM {
private WebDriver driver;
	
	public EditproductPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@class='fa fa-tags fw']")
	private WebElement catlog;
	
	@FindBy(xpath="//a[text()='Products']")
	private WebElement products;
	
	@FindBy(xpath="//button[@class='btn btn-primary'][@type ='submit']")
	private WebElement saveproducts;
	
	@FindBy(xpath="//*[@id=\"form-product\"]/div/table/tbody/tr[1]/td[8]/a")
	private WebElement editproducts;
	
	@FindBy(xpath="//a[contains(text(),'Data')]")
	private WebElement datatab;
	
	@FindBy(xpath="//input[@id='input-quantity']")
	private WebElement quantitytext;
	
	public void selectCatlog() {
		this.catlog.click();
	}
	public void product() {
		this.products.click();
		
	}
	public void editproduct() {
		this.editproducts.click();
	
	}

	public void clickdata() {
		this.datatab.click();
	}
	public void sendquantitytext(String quantitytext) {
		this.quantitytext.clear();
		this.quantitytext.sendKeys(quantitytext);
	}
	
	public void productsaved() {
		this.saveproducts.click();
	}
	
	}
	
	
	


