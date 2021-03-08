package org.samples;

import org.datas.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass {
	
	public Login() {
	
		PageFactory.initElements(driver, this);
		}

	@FindBy(id= "username")
	private WebElement txtUser;
	
	@FindBy(id= "password")
	private WebElement txtPswd;
	
	@FindBy(id= "login")
	private WebElement btnClick;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPswd() {
		return txtPswd;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}
}
