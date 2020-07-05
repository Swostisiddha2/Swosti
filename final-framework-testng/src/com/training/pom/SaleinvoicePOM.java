package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaleinvoicePOM {
private WebDriver driver;
	
	public SaleinvoicePOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@class='fa fa-shopping-cart fw']")
	private WebElement salesicon;
	
	@FindBy(xpath="//*[@id=\"menu-sale\"]/ul/li[1]/a")
	private WebElement orders;
	
	@FindBy(xpath="//*[@id=\"form-order\"]/div/table/tbody/tr[1]/td[8]/a[1]")
	private WebElement view;
	
	@FindBy(xpath="//*[@id=\"menu-report\"]/ul/li[1]/ul/li[1]/a")
	private WebElement clickOrder;
	
	@FindBy(xpath="//*[@class='fa fa-print']")
	private WebElement invoice;
	
	public void saleicon() {
		Actions act=new Actions(driver);
        act.moveToElement(salesicon).build().perform();
	}

	public void order() {
		this.orders.click();
	}
	
	public void view() {
		this.view.click();
	}
	public void invoice() {
		this.invoice.click();
	}

}



