package org.hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo4 extends Base {
	
	public Pojo4() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="first_name")
	WebElement fname;
	@FindBy(id="last_name")
	WebElement lname;
	@FindBy(id="address")
	WebElement addr;
	@FindBy(id="cc_num")
	WebElement ccnum;
	@FindBy(id="cc_type")
	WebElement cctype;
	@FindBy(id="cc_exp_month")
	WebElement expmonth;
	@FindBy(id="cc_exp_year")
	WebElement expyear;
	@FindBy(id="cc_cvv")
	WebElement cvv_num;
	@FindBy(id="book_now")
	WebElement book;
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getAddr() {
		return addr;
	}
	public WebElement getCcnum() {
		return ccnum;
	}
	public WebElement getCctype() {
		return cctype;
	}
	public WebElement getExpmonth() {
		return expmonth;
	}
	public WebElement getExpyear() {
		return expyear;
	}
	public WebElement getCvv_num() {
		return cvv_num;
	}
	public WebElement getBook() {
		return book;
	}

}
