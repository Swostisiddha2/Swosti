package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProddetailstorePOM {
private WebDriver driver;
	
	public ProddetailstorePOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@class='fa fa-tags fw']")
	private WebElement catlog;
	
	@FindBy(xpath="//a[text()='Products']")
	private WebElement products;
	
	@FindBy(xpath="//*[@class='fa fa-plus']")
	private WebElement addnewicon;
	
	@FindBy(xpath="//input[@id='input-name1']")
	private WebElement productname;
	
	@FindBy(xpath="//input[@id='input-meta-title1']")
	private WebElement metatag;
	
	@FindBy(xpath="//a[contains(text(),'Data')]")
	private WebElement datatab;
	
	@FindBy(xpath="//input[@id='input-model']")
	private WebElement modeltab;
	
	@FindBy(xpath="//input[@id='input-price']")
	private WebElement pricetextbox;
	
	@FindBy(xpath="//input[@id='input-quantity']")
	private WebElement quantity;
	
	@FindBy(xpath="//a[contains(text(),'Links')]")
	private WebElement links;
	
	@FindBy(xpath=" //input[@id='input-category']")
	private WebElement categories;
	
	@FindBy(xpath="//a[contains(text(),'EARRINGS')]")
	private WebElement earrrings;
	
	@FindBy(xpath="//div[@class='pull-right']//button[@class='btn btn-primary']")
	private WebElement saveicon;
	
	}