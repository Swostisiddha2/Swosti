package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DelmultipleproductPOM {
	private WebDriver driver;
	public DelmultipleproductPOM(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//*[@class='fa fa-tags fw']")
private WebElement catlog;

@FindBy(xpath="//a[text()='Products']")
private WebElement products;

@FindBy(xpath="//input[ @type ='checkbox'] [@value = '1224']")
private WebElement productcheckbox;

@FindBy(xpath="//input[ @type ='checkbox'] [@value = '1300']")
private WebElement productcheckbox2;


@FindBy(xpath="//button[@class='btn btn-danger']")
private WebElement deleteProduct;

public void product() {
	this.products.click();
}
public void productCheckbox() {
	this.productcheckbox.click();
}
public void productCheckbox2() {
	this.productcheckbox2.click();
}

public void deleteProduct() {
	this.deleteProduct.click();
	
	Alert popupHandle=driver.switchTo().alert();
    popupHandle.accept();	
}




}
