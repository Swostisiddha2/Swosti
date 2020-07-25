package com.training.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C1RetailPOM {

private WebDriver driver; 

public C1RetailPOM(WebDriver driver) {
this.driver = driver; 
PageFactory.initElements(driver, this);
}

//-----------variables----------------------

@FindBy(id="input-username")
private WebElement userName; 

@FindBy(id="input-password")
private WebElement password;

@FindBy(xpath="//button[@type='submit']") 
private WebElement loginBtn;

//----------------------------------

@FindBy(xpath="//*[@class='fa fa-tags fw']")
private WebElement catalog; 

@FindBy(xpath="//a[text()='Products']")
private WebElement products;

//------------------------------------

@FindBy(xpath="//*[@class='fa fa-plus']")
private WebElement addNew;

@FindBy(id="input-name1")
private WebElement addProductName;

@FindBy(id="input-meta-title1")
private WebElement addTagName;

@FindBy(xpath="//a[text()='Data']")
private WebElement Data;

@FindBy(id="input-model")
private WebElement model;

@FindBy(id="input-price")
private WebElement price;

@FindBy(id="input-quantity")
private WebElement quantity;

@FindBy(xpath="//a[text()='Links']") 
private WebElement links;

@FindBy(id="input-category")
private WebElement category;

@FindBy(xpath="//a[text()='Attribute']")
private WebElement attribute;

@FindBy(xpath="//a[text()='Option']")
private WebElement option;

@FindBy(xpath="//a[text()='Recurring']")
private WebElement recurring;

@FindBy(xpath="//a[text()='Discount']")
private WebElement discount;

@FindBy(xpath="//a[text()='Special']")
private WebElement special;

@FindBy(xpath="//a[text()='Image']")
private WebElement image;

@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[10]/a")
private WebElement reward;

@FindBy(xpath="//a[text()='Design']")
private WebElement design;

@FindBy(xpath="//*[@class='fa fa-save']")
private WebElement save;

//--------methods for login------------------

public void sendUserName(String userName) {
this.userName.clear();
this.userName.sendKeys(userName);
}

public String getUserName() {
return this.userName.getAttribute("value");
}

public String getPassword() {
return this.password.getAttribute("value");
}

public void sendPassword(String password) {
this.password.clear(); 
this.password.sendKeys(password); 
}

public void clickLoginBtn() {
this.loginBtn.click(); 
}

//---- methods for catlog click action-------------------

public void catlog() {
Actions act=new Actions(driver);
        act.moveToElement(catalog).build().perform();
    }

public void product() {
this.products.click();
}

//--- methods for adding product-----------------

public void addNewProduct() {
this.addNew.click(); 
}

public void sendProductName(String addProductName) {
this.addProductName.clear();
this.addProductName.sendKeys(addProductName);
}

public void sendTagTitle(String addTagName) {
this.addTagName.clear();
this.addTagName.sendKeys(addTagName);
}

public void ClickData() {
this.Data.click();
}

public void sendModel(String model) {
this.model.clear();
this.model.sendKeys(model);
}


public void sendPrice(String price) {
this.price.clear();
this.price.sendKeys(price);
}

public String getPrice() {
return this.price.getAttribute("value"); 
}

public void sendQuantity(String quantity) {
this.quantity.clear();
this.quantity.sendKeys(quantity);
}

public String getQuanity() {
return this.quantity.getAttribute("value"); 
}

public void ClickLinks() {
this.links.click();
}

public void ClickCategories(){
        Actions act= new Actions(driver);
        act.contextClick(category).build().perform();
        Robot robot = null;
try {
robot = new Robot();
} catch (AWTException e) {
e.printStackTrace();
}
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);       
}

public void sendCategories(String category) {
this.category.clear();
this.category.sendKeys(category);
}

public void Attribute() {
this.attribute.click();
}

public void Option() {
this.option.click();
}

public void Recurring() {
this.recurring.click();
}

public void Discount() {
this.discount.click();
}

public void Special() {
this.special.click();
}

public void Image() {
this.image.click();
}

public void Reward() {
this.reward.click();
}

public void Design() {
this.design.click();
}

public void Save() {
this.save.click();
}

}

