package org.samples;

import org.datas.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {
	
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id= "location")
	private WebElement locat;
	
	@FindBy(id= "hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id= "room_nos")
	private WebElement noOfRoom;
	
	@FindBy(id="datepick_in")
	private WebElement checkInDate;
	
	@FindBy(id= "datepick_out")
	private WebElement checkOutDate;
	
	@FindBy(id="adult_room")
	private WebElement adultPerRoom;
	
	@FindBy(id= "child_room")
	private WebElement childPerRoom;
	
	@FindBy(id="Submit")
	private WebElement searchClick;

	public WebElement getLocat() {
		return locat;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNoOfRoom() {
		return noOfRoom;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}

	public WebElement getChildPerRoom() {
		return childPerRoom;
	}

	public WebElement getSearchClick() {
		return searchClick;
	}

	
	
}
