package com.rozario.webofferGhosting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganaisationReportedGhostingListPage {
	public WebDriver driver;
	public int ETO;
	public OrganaisationReportedGhostingListPage(WebDriver driver , int ETO) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.ETO = ETO;
	}
	//header
	@FindBy(xpath = "//*[@data-icon='menu-fold']")
	private WebElement menufold_btn;
	
	@FindBy(xpath = "//p[text()='Reported Ghosting List']")
	private WebElement reportedGhostingList_txt;
	
	//body
	@FindBy(xpath = "//input[@type='radio' and @value='Candidate']")
	private WebElement radioCandidate_rb;
	
	@FindBy(xpath = "//input[@type='radio' and @value='Employee']")
	private WebElement radioEmployee_rb;
	
	@FindBy(xpath = "//input[@placeholder='Search  name,  job role, email, phone']")
	private WebElement searchnamejobroleemailphone_tb;
}
