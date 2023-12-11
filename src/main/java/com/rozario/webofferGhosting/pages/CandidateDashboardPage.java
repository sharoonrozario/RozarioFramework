package com.rozario.webofferGhosting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CandidateDashboardPage {
	public WebDriver driver;
	public int ETO;
	public CandidateDashboardPage(WebDriver driver , int ETO) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.ETO = ETO;
	}
	
	@FindBy(xpath = "//a[@href='/dashboard']")
	private WebElement dashboard_btn;
	
//header	
	
	@FindBy(xpath = "//h3[text()='Dashboard']")
	private WebElement dashboard_txt;
	
	@FindBy(xpath = "//button[@aria-label='open drawer']")
	private WebElement opendrawer_btn;
	
	@FindBy(xpath = "//h1[normalize-space()='Welcome kusuma!']")
	private WebElement welcomekusuma_txt;
	
	@FindBy(xpath = "//button[@aria-label='open profile']")
	private WebElement openprofile_btn;
	
	@FindBy(xpath = "//h5[normalize-space()='Statistics']")
	private WebElement statistics_txt;
	
	
	

}
