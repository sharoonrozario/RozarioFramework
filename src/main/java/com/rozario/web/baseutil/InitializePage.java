package com.rozario.web.baseutil;

import org.openqa.selenium.WebDriver;

import com.rozario.webofferGhosting.pages.SignInPage;
import com.rozario.webofferGhosting.pages.SignUpPage;

public class InitializePage {
	
	public SignInPage signInPage;
	public SignUpPage signUpPage;
	
	public InitializePage(WebDriver driver ,int ETO) {
		signInPage = new SignInPage(driver, ETO);
		signUpPage = new SignUpPage(driver, ETO);
	}

} 
