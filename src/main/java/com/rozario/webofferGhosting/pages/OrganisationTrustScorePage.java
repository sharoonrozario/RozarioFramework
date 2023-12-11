package com.rozario.webofferGhosting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationTrustScorePage {
	public WebDriver driver;
	public int ETO;
	public OrganisationTrustScorePage(WebDriver driver , int ETO) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.ETO = ETO;
	}
	
	//Header
	
	@FindBy(xpath = "//span[@aria-label='menu-fold']")
	private WebElement meanufold_btn;
	
	@FindBy(xpath = "//h3[text()='Find Candidate Trust Score']")
	private WebElement findCandidateTrustScore_txt;
	
	@FindBy(xpath = "//p[text()='Trust Score']")
	private WebElement trustScore_txt;
	
	@FindBy(xpath = "//*[@data-testid='InfoIcon']")
	private WebElement infoIcon_txt;
	
	//Body
	
	@FindBy(xpath = "//input[@placeholder='Email / PAN card / SSN ']")
	private WebElement emailPANcardSSN_txt;
	
	@FindBy(xpath = "//*[@data-testid='SearchIcon']")
	private WebElement searchIcon_btn;
	
//	@FindBy(xpath = "//h6[text()='Sumeru Digital Solutions']")
//	private WebElement sumeruDigita
//	
	
	
}
