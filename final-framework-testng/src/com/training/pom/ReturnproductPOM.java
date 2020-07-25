package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReturnproductPOM {
private WebDriver driver;
	
	public ReturnproductPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@class=\"fa fa-user-o\"]")
	private WebElement usericon;
	
	@FindBy(xpath="//span[contains(text(),'MY ORDERS')]")
	private WebElement myorder;
	
	@FindBy(xpath="//td[@class='text-right']//a[@class='btn btn-default tb_no_text']")
	private WebElement view;
	
	@FindBy(xpath="//i[@class='fa fa-reply']")
	private WebElement return1;
	
	@FindBy(xpath="//div[3]//label[1]//input[1]")
	private WebElement reason;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement submit2;
	}