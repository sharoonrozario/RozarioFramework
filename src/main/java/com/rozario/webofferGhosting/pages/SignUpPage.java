package com.rozario.webofferGhosting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v116.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	public WebDriver driver;
	public int ETO;
	
	public SignUpPage(WebDriver driver,int ETO) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.ETO = ETO;
	}
	@FindBy(xpath = "//h3[text()= 'Sign up']")
	private WebElement signUp_txt;
	
	@FindBy(xpath = "//a[text()= 'Login']")
	private WebElement login_btn;
	
	@FindBy(xpath = "//span[text()= ' Google']")
	private WebElement google_btn;
	
	@FindBy(xpath = "//span[text()= 'Microsoft']")
	private WebElement microsoft_btn;
	
	@FindBy(xpath = "//p[text()= ' Email']")
	private WebElement email_btn;
	
	@FindBy(xpath = "//a[text()= 'Terms of Service']")
	private WebElement termsofService_ta;
	
	@FindBy(xpath = "//a[text()= 'Terms of Agreement']")
	private WebElement termsofAgreement_ta;
	
	@FindBy(xpath = "//a[text()= 'Privacy Policy']")
	private WebElement privacyPolicy_ta;
	
	//singup registeration
	

	@FindBy(xpath = "//input[@placeholder='Enter Your Name']")
	private WebElement enterYourName_tb;
	
	@FindBy(xpath = "//input[@type='tel']")
	private WebElement tel_tb;
	
	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement continueButton_btn;
	
	@FindBy(xpath = "//span[text()='Go Back']")
	private WebElement goBack_btn;
	
//sg
}
