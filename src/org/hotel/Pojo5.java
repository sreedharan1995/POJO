package org.hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo5 extends Base {
	public Pojo5(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_id_328667")
	WebElement orderno;	
		
		
	
	public WebElement getOrderno() {
		return orderno;
	}

	@FindBy(id="my_itinerary")
	WebElement itinerary;
	public WebElement getItinerary() {
		return itinerary;
	}

}
