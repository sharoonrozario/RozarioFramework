package com.rozario.webofferGhosting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	public WebDriver driver;
	public SignInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
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
	
	//assd
	
	
}
