package org.samples;

import org.datas.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {
	
	public SelectHotel() {
		PageFactory.initElements(driver, this);
		}

	@FindBy(id="radiobutton_0")
	private WebElement clickRadBtn;
	
	@FindBy(id="continue")
	private WebElement clickContBtn;

	public WebElement getClickRadBtn() {
		return clickRadBtn;
	}

	public WebElement getClickContBtn() {
		return clickContBtn;
	}
}
