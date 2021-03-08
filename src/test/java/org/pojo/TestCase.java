package org.pojo;

import org.datas.BaseClass;
import org.openqa.selenium.WebDriver;
import org.samples.BookHotel;
import org.samples.Booking;
import org.samples.Login;
import org.samples.SearchHotel;
import org.samples.SelectHotel;

public class TestCase extends BaseClass {

	public static void main(String[] args) {
		
		lauchBrowser();
		loadUrl("http://www.adactin.com/HotelApp/");
		maxBrowser();
		setWait();
		
		//obj Creation for Login page
		Login l= new Login();
		fill(l.getTxtUser(), "Vineetha");
		fill(l.getTxtPswd(), "4776IE");
		btnClick(l.getBtnClick());
		
		// obj Creation for SearchHotel page
		SearchHotel s= new SearchHotel ();
		performSelectByVisibleText(s.getLocat(), "Sydney");
		performSelectByVisibleText(s.getHotel(), "Hotel Sunshine");
		performSelectByVisibleText(s.getRoomtype(), "Double");
		performSelectByVisibleText(s.getNoOfRoom(), "2 - Two");
		fill(s.getCheckInDate(), "27/10/2020");
		fill(s.getCheckOutDate(), "06/11/2020");
		performSelectByVisibleText(s.getAdultPerRoom(), "2 - Two");
		performSelectByVisibleText(s.getChildPerRoom(), "1 - One");
		btnClick(s.getSearchClick());
		
		//obj Creation for SelectHotel page
		SelectHotel sel = new SelectHotel();
		btnClick(sel.getClickRadBtn());
		btnClick(sel.getClickContBtn());
		
		//obj Creation for BookHotel page
		BookHotel b= new BookHotel();
		fill(b.getTxtFirstName(), "Vineetha");
		fill(b.getTxtLastName(), "UnniKrishnan");
		fill(b.getTxtAddress(), "Coimbatore");
		fill(b.getTxtCreditCard(), "1234567890123456");
		performSelectByVisibleText(b.getCardType(), "Master Card");
		performSelectByVisibleText(b.getExpiryMon(), "March");
		performSelectByVisibleText(b.getExpiryYear(), "2021");
		fill(b.getCvvNum(), "123");
		btnClick(b.getClickBook());
		
		//obj Creation for BookHotel page
		Booking book = new Booking();
		takeTextGetAttribute(book.getOrderNo());
		
		
		
	}
}
