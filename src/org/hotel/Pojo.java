package org.hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends Base {
	public Pojo() {
		PageFactory.initElements(driver, this);
		
	}
@FindBy(id="username") 
private WebElement user;
@FindBy(id="password") 
private WebElement pass;	
@FindBy(id="login") 
private WebElement bttn;
public WebElement getUser() {
	return user;
}
public WebElement getPass() {
	return pass;
}
public WebElement getBttn() {
	return bttn;
}	
	
	
}
