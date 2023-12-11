package com.rozario.webofferGhosting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CandidateProfilePage {
	public WebDriver driver;
	public int ETO;
	public  CandidateProfilePage(WebDriver driver , int ETO) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.ETO = ETO;
	}
//Header 
	
	@FindBy(xpath = "//button[@aria-label='open drawer']")
	private WebElement opendrawer_btn;
	
	@FindBy(xpath = "//h3[normalize-space()='Profile']")
	private WebElement profile_txt;
	
	@FindBy(xpath = "//div[@class='MuiStack-root css-4mqu3m']")
	private WebElement muiStackrootcss4mqu3m_btn;
	

	@FindBy(xpath = "//h6[normalize-space()='Name:']")
	private WebElement name_txt;
	
	@FindBy(xpath = "//p[normalize-space()='kusuma']")
	private WebElement kusuma_txt;
	
	@FindBy(xpath = "//h6[normalize-space()='OgId:']")
	private WebElement ogId_txt;
	
	//@FindBy(xpath = "//p[normalize-space()='919145666767']")
    //private WebElement 919145666767_txt;
	
	@FindBy(xpath = "//h6[normalize-space()='Email:']")
	private WebElement email_txt;
	
	@FindBy(xpath = "//p[normalize-space()='kusumaammu.004@gmail.com']")
	private WebElement kusumaammu004gmailcom_txt;
	
	@FindBy(xpath = "//h6[normalize-space()='Phone:']")
	private WebElement phone_txt;
	
	@FindBy(xpath = "//div[contains(@class, 'MuiStack-root')]/h6[text()='Location:']")
	private WebElement muiStackrootLocation_txt;
	
	@FindBy(xpath = "//div[contains(@class, 'MuiStack-root')]/h6[text()='Industry:']")
	private WebElement muiStackrootIndustry_txt;
	
	@FindBy(xpath = "//div[contains(@class, 'MuiStack-root')]/h6[text()='Number of Employees:']")
	private WebElement muiStackrootNumberofEmployees_txt;
	
	@FindBy(xpath = "//div[contains(@class, 'MuiStack-root')]/h6[text()='Skills:']")
	private WebElement muiStackrootSkills_txt;

//	@FindBy(xpath = "//button[contains(text(),'Edit Details')]")
//	private WebElement editDetails_btn;
	//dont need it, i am  great
	

}
