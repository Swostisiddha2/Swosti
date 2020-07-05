package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteproductPOM {
private WebDriver driver;
	
	public DeleteproductPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@class='fa fa-tags fw']")
	private WebElement catlog;
	
	@FindBy(xpath="//a[text()='Products']")
	private WebElement products;
	
	@FindBy(xpath="//input[ @type ='checkbox'] [@value = '1226']")
	private WebElement productcheckbox;
	
	
	
	@FindBy(xpath="//button[@class='btn btn-danger']")
	private WebElement deleteProduct;
	
	public void product() {
		this.products.click();
	}
	public void productCheckbox() {
		this.productcheckbox.click();
	}
	public void catalogue() {
		Actions act=new Actions(driver);
        act.moveToElement(products).build().perform();
	}
	public void deleteProduct() {
		this.deleteProduct.click();
		
		Alert popupHandle=driver.switchTo().alert();
	    popupHandle.accept();	
    }
}

