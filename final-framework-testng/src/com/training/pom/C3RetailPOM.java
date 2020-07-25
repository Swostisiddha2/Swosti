package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C3RetailPOM {

private WebDriver driver; 

public C3RetailPOM(WebDriver driver) {
this.driver = driver; 
PageFactory.initElements(driver, this);
}

//-------------variables----------------------

@FindBy(id="input-email")
private WebElement userName; 

@FindBy(id="input-password")
private WebElement password;

@FindBy(xpath="//input[@type='submit'][@value='Login']")
private WebElement loginBtn; 

//------------------------------------

@FindBy(xpath="//a[text()='View your order history']")
private WebElement viewOrderHistory; 

@FindBy(xpath="//*[@class='fa fa-eye']")
private WebElement viewOrder; 

@FindBy(xpath="//*[@class='fa fa-reply']")
private WebElement returnOrder; 

@FindBy(name="return_reason_id")
private WebElement returnReason; 

@FindBy(xpath="//input[@type='radio'][@name='opened']")
private WebElement productOpen; 

@FindBy(xpath="//textarea[@name='comment']")
private WebElement comment; 

@FindBy(xpath="//input[@type='submit'][@value='Submit']")
private WebElement submit; 

//---------------methods--------------

public void LoginName(String userName) {
this.userName.clear();
this.userName.sendKeys(userName);
}

public void LoginPassword(String password) {
this.password.clear(); 
this.password.sendKeys(password); 
}

public void clickLoginBtn() {
this.loginBtn.click(); 
}

//----------------------------------------

public void viewOrderHistory() {
this.viewOrderHistory.click(); 
}

public void viewOrder() {
this.viewOrder.click(); 
}

public void returnOrder() {
this.returnOrder.click(); 
}

public void returnReason() {
this.returnReason.click(); 
}

public void productOpen() {
this.productOpen.click(); 
}

public void comment(String comment) {
this.comment.clear(); 
this.comment.sendKeys(comment); 
}

public void submit() {
this.submit.click();
}

}


