package com.rozario.webofferGhosting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordEmailPage {
public WebDriver driver;
public int ETO;
public ForgotPasswordEmailPage(WebDriver driver,int ETO) {
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

//email and password

@FindBy(xpath = "//h3[text()='Log In']")
private WebElement logIn_txt1;

@FindBy(xpath = "//a[text()='Register.']")
private WebElement register_btn;

@FindBy(xpath = "//input[@id='email-login']")
private WebElement emaillogin_tb;

@FindBy(xpath = "//input[@id='-password-login']")
private WebElement passwordlogin_tb;

@FindBy(xpath = "//button[text()='Login']")
private WebElement login_btn;

@FindBy(xpath = "//p[text()='Forgot Password?']")
private WebElement forgotPassword_btn;

@FindBy(xpath = "//span[text()='Go Back']")
private WebElement goBack_btn;

//forgotPassword
@FindBy(xpath = "//input[@id='email-login']")
private WebElement emailLogin_tb;

@FindBy(xpath = "//button[text()='Reset Password']")
private WebElement resetPassword_btn;

@FindBy(xpath = "//h6[text()=' Back to Login']")
private WebElement backtoLogin_btn;
}
