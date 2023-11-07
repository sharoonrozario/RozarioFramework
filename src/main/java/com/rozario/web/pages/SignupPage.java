package com.rozario.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	public WebDriver driver;
	public SignupPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	@FindBy(xpath = "//a[text()='Register.']")
	private WebElement register_txt;
	
	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 css-17pgzk8'])[2]")
	private WebElement muiTypographyrootMuiTypographybody1css17pgzk8;
	
	@FindBy(xpath = "//input[@placeholder='Enter Your Name']")
	private WebElement enterYourName;
	
	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement continueButton;

}
