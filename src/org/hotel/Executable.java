package org.hotel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Executable extends Base {
	public static void main(String[] args) throws InterruptedException {
		launch("https://adactin.com/HotelApp/");
		Pojo p=new Pojo();
		fill(p.getUser(),"greenstech7");
		fill(p.getPass(),"greens@007");
		klick(p.getBttn());
		
		
		Pojo2 p2=new Pojo2();
		selectt(p2.getLoc(),2);
		selectt(p2.getHotel(),3);
		selectt(p2.getRtype(),1);
		selectt(p2.getRno(),1);
		fill(p2.getDin(),"01/02/2020");
		fill(p2.getDout(),"02/02/2020");
		selectt(p2.getAroom(),2);
		selectt(p2.getCroom(),1);
		klick(p2.getBtn());
		
		Pojo3 p3=new Pojo3();
		klick(p3.getRadio());
		klick(p3.getOk());
		
		Pojo4 p4=new Pojo4();
		fill(p4.getFname(),"sree");
		fill(p4.getLname(),"dharan");
		fill(p4.getAddr(),"chennai");
		fill(p4.getCcnum(),"1234567890123456");
		selectt(p4.getCctype(),3);
		selectt(p4.getExpmonth(),6);
		selectt(p4.getExpyear(),8);
		fill(p4.getCvv_num(),"123");
		klick(p4.getBook());
		Thread.sleep(7000);
		
		/*JavascriptExecutor jk=(JavascriptExecutor)driver;
		Object ob = jk.executeScript("return arguments[0].getattribute", "value");
		String s=(String)ob;
		System.out.println(s);*/
		
		Pojo5 p5=new Pojo5();
		
		klick(p5.getItinerary());
			
		
		System.out.println(p5.getOrderno().getAttribute("value"));
		
		
	}
 
}
