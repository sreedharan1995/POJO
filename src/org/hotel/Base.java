package org.hotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	static WebDriver driver;
	
	public static void launch(String s) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sreedharan\\eclipse-workspace\\POJO\\DRIVER\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(s);
		}
	public static void fill(WebElement w,String s) {
		w.sendKeys(s);
		}
	public static void klick(WebElement w) {
		w.click();
		
	}
	
	public static void selectt(WebElement w,int a) {
		Select x=new Select(w);
		x.selectByIndex(a);
		System.out.println("updated line");
		System.out.println("updated line2");
		
	}
	

}
