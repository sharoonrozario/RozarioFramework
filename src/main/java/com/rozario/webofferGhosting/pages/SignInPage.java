package com.rozario.webofferGhosting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	public WebDriver driver;
	public int ETO;
	public SignInPage(WebDriver driver , int ETO) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.ETO = ETO;
	}
	@FindBy(xpath = "//a[text()='Register.']")
	private WebElement register_txt;
	
	@FindBy(xpath = "//h3[text()='Log In']")
	private WebElement logIn_txt;
	
	@FindBy(xpath = "//span[text()=' Google']")
	private WebElement google_btn;
	
	@FindBy(xpath = "//span[text()='Microsoft']")
	private WebElement microsoft_btn;
	
	@FindBy(xpath = "//p[text()= ' Email']")
	private WebElement email_btn;
	
	public WebElement getRegister_txt() {
		return register_txt;
	}

	public void setRegister_txt(WebElement register_txt) {
		this.register_txt = register_txt;
	}

	public WebElement getLogIn_txt() {
		return logIn_txt;
	}

	public void setLogIn_txt(WebElement logIn_txt) {
		this.logIn_txt = logIn_txt;
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

	public WebDriver getDriver() {
		return driver;
	}

	public int getETO() {
		return ETO;
	}
	
	
	
	
}
