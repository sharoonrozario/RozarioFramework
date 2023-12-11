package com.rozario.webofferGhosting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationCandidateListPage {
	public WebDriver driver;
	public int ETO;
	public OrganisationCandidateListPage(WebDriver driver , int ETO) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.ETO = ETO;
	}
	
	@FindBy(xpath = "//a[@href='/CandidateList']")
	private WebElement candidateList_btn;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement checkbox_cb;
	
	@FindBy(xpath = "//button[normalize-space()='Send Mail To Candidate']")
	private WebElement sendMailToCandidate_btn;
	
	@FindBy(xpath = "//input[@id='header-search']")
	private WebElement headersearch_tb;
	
}
