package com.rozario.webofferGhosting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v116.page.Page;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	public WebDriver driver;
	public int ETO;
	
	public SignUpPage(WebDriver driver,int ETO) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.ETO = ETO;
	}
	
	

}
