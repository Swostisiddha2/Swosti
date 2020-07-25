
package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangestatusPOM {
private WebDriver driver;
		
   public ChangestatusPOM(WebDriver driver) {
   this.driver = driver;
    PageFactory.initElements(driver, this);
}
     @FindBy(xpath="//*[@class=\"fa fa-user-o\"]")
     private WebElement usericon1;
     
     @FindBy(xpath="//span[contains(text(),'Shop')]")
     private WebElement shop;
     
     @FindBy(xpath="//span[contains(text(),'Shop')]")
     private WebElement ethnic;
     
     @FindBy(xpath="//a[contains(text(),'Integer vitae iaculis massa')]")
     private WebElement massa;
     
     @FindBy(xpath="//button[@id='button-cart']")
     private WebElement addcart;
     
     @FindBy(xpath="//*[@class='tb_icon ico-linea-ecommerce-bag']")
     private WebElement carticon;
     
     @FindBy(xpath="//a[contains(text(),'View Cart')]")
     private WebElement viewcart;
     
     @FindBy(xpath="//a[@class='btn btn-primary']")
     private WebElement checkout;
     
     @FindBy(xpath="//div[@id='collapse-checkout-option']")
     private WebElement guestcheckout;
     
     @FindBy(xpath="//div[@id='collapse-checkout-option']")
     private WebElement continue1;
     
     @FindBy(xpath="//input[@id='input-payment-firstname']")
     private WebElement firstname;
     
     @FindBy(xpath="//input[@id='input-payment-lastname']")
     private WebElement lastname;
     
     @FindBy(xpath="//input[@id='input-payment-email']")
     private WebElement email;
     
     @FindBy(xpath="//input[@id='input-payment-telephone']")
     private WebElement telephone;
     
    @FindBy(xpath="//input[@id='input-payment-address-1']")
     private WebElement address1;
     
     @FindBy(xpath="//input[@id='input-payment-city']")
     private WebElement city;
     
     @FindBy(xpath="//select[@id='input-payment-country']")
     private WebElement country;
     
     @FindBy(xpath="//select[@id='input-payment-zone']")
     private WebElement region;
     
     @FindBy(xpath="//input[@id='button-guest']")
     private WebElement continue2;
     
     @FindBy(xpath="//input[@name='shipping_address']")
     private WebElement same1;
     
     @FindBy(xpath="//textarea[@name='comment']")
     private WebElement comment;
     
     @FindBy(xpath="//input[@name='agree']")
     private WebElement agree;
     
     @FindBy(xpath="//input[@id='button-shipping-method']")
     private WebElement continue3;
     
     @FindBy(xpath="//input[@id='button-confirm']")
     private WebElement confirm;
     
     
     
     
     	
     

	    }

