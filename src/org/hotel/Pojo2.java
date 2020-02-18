package org.hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo2 extends Base {
	
		public Pojo2() {
			PageFactory.initElements(driver, this);
			
		}
@FindBy(id="location") WebElement loc;
@FindBy(id="hotels") WebElement hotel;
@FindBy(id="room_type") WebElement rtype;
@FindBy(id="room_nos") WebElement rno;
@FindBy(id="datepick_in") WebElement din;
@FindBy(id="datepick_out") WebElement dout;
@FindBy(id="adult_room") WebElement aroom;
@FindBy(id="child_room") WebElement croom;
@FindBy(id="Submit") WebElement btn;
public WebElement getLoc() {
	return loc;
}
public WebElement getHotel() {
	return hotel;
}
public WebElement getRtype() {
	return rtype;
}
public WebElement getRno() {
	return rno;
}
public WebElement getDin() {
	return din;
}
public WebElement getDout() {
	return dout;
}
public WebElement getAroom() {
	return aroom;
}
public WebElement getCroom() {
	return croom;
}
public WebElement getBtn() {
	return btn;
}
		
		
		
}
