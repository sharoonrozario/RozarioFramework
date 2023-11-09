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
	public WebDriver getDriver() {
		return driver;
	}

	public int getETO() {
		return ETO;
	}

	public WebElement getEnterPanCardDetail_tb() {
		return enterPanCardDetail_tb;
	}

	public WebElement getSearch_btn() {
		return search_btn;
	}

	public WebElement getCandidateName_tb() {
		return candidateName_tb;
	}

	public WebElement getEnterPersonalemail_tb() {
		return enterPersonalemail_tb;
	}

	public WebElement getEnter10DigitNumber_tb() {
		return enter10DigitNumber_tb;
	}
	
	@FindBy(xpath = "//li[text()='Internship']")
	private WebElement intership_btn;
	
	@FindBy(xpath = "//li[text()='Part Time'] ")
	private WebElement partime_btn;
	
	@FindBy(xpath = "Contractual")
	private WebElement contractual_btn;
	
	@FindBy(xpath = "Full Time")
	private WebElement fullTime_btn;
	
	@FindBy(xpath = "//span[text()='Type of Employment']")
	private WebElement typeOfEmployment_btn;
	
	public WebElement getIntership_btn() {
		return intership_btn;
	}

	public WebElement getPartime_btn() {
		return partime_btn;
	}

	public WebElement getContractual_btn() {
		return contractual_btn;
	}

	public WebElement getFullTime_btn() {
		return fullTime_btn;
	}

	public WebElement getTypeOfEmployment_btn() {
		return typeOfEmployment_btn;
	}
	@FindBy(xpath = "//input[@id='free-solo-dialog-demo']")
	private WebElement jobRole_btn;
	
	
}
