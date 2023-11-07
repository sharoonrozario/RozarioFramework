package com.rozario.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	public WebDriver driver;
	public void signupPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}

}
