package com.rozario.webofferGhosting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganistionDashboardPage {
	public WebDriver driver;
	public int ETO;
	public OrganistionDashboardPage(WebDriver driver , int ETO) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.ETO = ETO;
	}
	
	@FindBy(xpath = "//h6[text()='Total Organizations']")
	private WebElement totalOrganizations_txt;
	
	@FindBy(xpath = "//h6[text()='Total Candidates']")
	private WebElement totalCandidate_txt;
	
	@FindBy(xpath = "//h6[text()='Total Ghosting Reported']")
	private WebElement totalGhostingReported_txt;
	
	@FindBy(xpath = "//h6[text()='Total Candidate Status']")
	private WebElement totalCandidateStatus_txt;
	
	@FindBy(xpath = "//h6[text()='Total Employee Status']")
	private WebElement totalEmployeeStatus_txt;
	
	@FindBy(xpath = "(//h6[text()='Total Ghosting Reported'])[2]")
	private WebElement totalGhostingReported1_txt;
	
	@FindBy(xpath = "//h6[text()='Total Subscription Limit']")
	private WebElement totalSubscriptionCount_txt;
	
	@FindBy(xpath = "//h6[text()='Subscription Count']")
	private WebElement subscriptionCount_txt;
	
	

}
