package org.samples;

import org.datas.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking extends BaseClass {

	public Booking() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private WebElement orderNo;
	
	@FindBy(id="logout")
	private WebElement clickLogout;

	public WebElement getOrderNo() {
		return orderNo;
	}

	public WebElement getClickLogout() {
		return clickLogout;
	}
}
