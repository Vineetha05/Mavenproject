package org.samples;

import org.datas.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends BaseClass {
	
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="first_name")
	private WebElement txtFirstName;
	
	@FindBy(id="last_name")
	private WebElement txtLastName;
	
	@FindBy(id= "address")
	private WebElement txtAddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCreditCard;
	
	@FindBy(id="cc_type")
	private WebElement cardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement expiryMon;
	
	@FindBy(id="cc_exp_year")
	private WebElement expiryYear;
	
	@FindBy(id= "cc_cvv")
	private WebElement cvvNum;
	
	@FindBy(id="book_now")
	private WebElement clickBook;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCreditCard() {
		return txtCreditCard;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpiryMon() {
		return expiryMon;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCvvNum() {
		return cvvNum;
	}

	public WebElement getClickBook() {
		return clickBook;
	}
	
}
