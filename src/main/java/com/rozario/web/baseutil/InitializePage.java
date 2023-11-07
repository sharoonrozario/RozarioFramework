package com.rozario.web.baseutil;

import org.openqa.selenium.WebDriver;

import com.rozario.webofferGhosting.pages.SignInPage;

public class InitializePage {
	
	public SignInPage signInPage;
	
	
	public InitializePage(WebDriver driver ,int ETO) {
		signInPage = new SignInPage(driver, ETO);
	}

} 
