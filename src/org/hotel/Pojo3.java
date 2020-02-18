package org.hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo3 extends Base {
	
	public Pojo3() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="radiobutton_0")
	WebElement radio;
	@FindBy(id="continue")
	WebElement ok;
	public WebElement getRadio() {
		return radio;
	}
	public WebElement getOk() {
		return ok;
	}

}
