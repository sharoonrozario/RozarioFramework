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
	
	@FindBy(xpath = "//span[text()='Go Back']")////span[text()='Go Back']
	private WebElement goBack_btn;

	public WebElement getSignUp_txt() {
		return signUp_txt;
	}

	public void setSignUp_txt(WebElement signUp_txt) {
		this.signUp_txt = signUp_txt;
	}

	public WebElement getLogin_btn() {
		return login_btn;
	}

	public void setLogin_btn(WebElement login_btn) {
		this.login_btn = login_btn;
	}

	public WebElement getGoogle_btn() {
		return google_btn;
	}

	public void setGoogle_btn(WebElement google_btn) {
		this.google_btn = google_btn;
	}

	public WebElement getMicrosoft_btn() {
		return microsoft_btn;
	}

	public void setMicrosoft_btn(WebElement microsoft_btn) {
		this.microsoft_btn = microsoft_btn;
	}

	public WebElement getEmail_btn() {
		return email_btn;
	}

	public void setEmail_btn(WebElement email_btn) {
		this.email_btn = email_btn;
	}

	public WebElement getTermsofService_ta() {
		return termsofService_ta;
	}

	public void setTermsofService_ta(WebElement termsofService_ta) {
		this.termsofService_ta = termsofService_ta;
	}

	public WebElement getTermsofAgreement_ta() {
		return termsofAgreement_ta;
	}

	public void setTermsofAgreement_ta(WebElement termsofAgreement_ta) {
		this.termsofAgreement_ta = termsofAgreement_ta;
	}

	public WebElement getPrivacyPolicy_ta() {
		return privacyPolicy_ta;
	}

	public void setPrivacyPolicy_ta(WebElement privacyPolicy_ta) {
		this.privacyPolicy_ta = privacyPolicy_ta;
	}

	public WebElement getEnterYourName_tb() {
		return enterYourName_tb;
	}

	public void setEnterYourName_tb(WebElement enterYourName_tb) {
		this.enterYourName_tb = enterYourName_tb;
	}

	public WebElement getTel_tb() {
		return tel_tb;
	}

	public void setTel_tb(WebElement tel_tb) {
		this.tel_tb = tel_tb;
	}

	public WebElement getContinueButton_btn() {
		return continueButton_btn;
	}

	public void setContinueButton_btn(WebElement continueButton_btn) {
		this.continueButton_btn = continueButton_btn;
	}

	public WebElement getGoBack_btn() {
		return goBack_btn;
	}

	public void setGoBack_btn(WebElement goBack_btn) {
		this.goBack_btn = goBack_btn;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public int getETO() {
		return ETO;
	}
	
	@FindBy(xpath = "//h3[text()='Sign up']")
	private WebElement signUp_txt1;
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login_btn1;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement email_tb;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password_tb;
	
	@FindBy(xpath = "//p[text()='account']")
	private WebElement account_btn;
}


