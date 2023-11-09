package com.rozario.webofferGhosting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportGhostingPage {
	public WebDriver driver;
	public int ETO;
	public ReportGhostingPage(WebDriver driver , int ETO) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.ETO = ETO;
	}
	
	@FindBy(xpath = "//input[@placeholder ='Enter PAN Card details']")
	private WebElement enterPanCardDetail_tb;

	@FindBy(xpath = "//button[text()='search']")
	private WebElement search_btn;
	
	@FindBy(xpath = "//input[@name='candidateName']")
	private WebElement candidateName_tb;
	
	@FindBy(xpath = "//input[@placeholder='Enter Personal Email']")
	private WebElement enterPersonalemail_tb;
	
	@FindBy(xpath = "//input[@placeholder='Enter 10 Digit Number']")
	private WebElement enter10DigitNumber_tb;
	
}
