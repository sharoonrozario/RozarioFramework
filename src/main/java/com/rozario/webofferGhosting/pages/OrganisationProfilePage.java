package com.rozario.webofferGhosting.pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationProfilePage {
	public WebDriver driver;
	public int ETO;
	public OrganisationProfilePage(WebDriver driver , int ETO) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.ETO = ETO;
	}
	
//header
	
	@FindBy(xpath = "//*[@data-icon='menu-fold']")
	private WebElement menufold_btn;
	
	@FindBy(xpath = "//h3[text()='Profile']")
	private WebElement profile_txt;
	
//body
	@FindBy(xpath = "(//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-1 css-tuxzvu'])[1]")
	private WebElement muiGridrootMuiGridcontainerMuiGridspacingxs1csstuxzvu1_btn;
	
	@FindBy(xpath = "//h6[text()='Organization Account']")
	private WebElement organisationAccount_txt;
	
	@FindBy(xpath = "//div[contains(@class, 'MuiStack-root')]/h6[text()='Name:']")
	private WebElement muiStackrootName_txt;
	
	@FindBy(xpath = "//div[contains(@class, 'MuiStack-root')]/h6[text()='Work Email:']")
	private WebElement muiStackrootWorkEmail_txt;
	
	@FindBy(xpath = "//div[contains(@class, 'MuiStack-root')]/h6[text()='Location:']")
	private WebElement muiStackrootLocation_txt;
	
	@FindBy(xpath = "//div[contains(@class, 'MuiStack-root')]/h6[text()='Industry:']")
	private WebElement muiStackrootIndustry_txt;
	
	@FindBy(xpath = "//div[contains(@class, 'MuiStack-root')]/h6[text()='Number of Employees:']")
	private WebElement muiStackrootNumberofEmployees_txt;
	
	@FindBy(xpath = "//div[contains(@class, 'MuiStack-root')]/h6[text()='Skills:']")
	private WebElement muiStackrootSkills_txt;

	@FindBy(xpath = "//button[contains(text(),'Edit Details')]")
	private WebElement editDetails_btn;
	
//type of industry
	
	@FindBy(xpath = "//div[@id='industry']")
	private WebElement industry_dd;
	
	@FindBy(xpath = "//li[@data-value='Aerospace and Defense']")
	private WebElement aerospaceandDefense_dd;
	
	@FindBy(xpath = "//li[@data-value='Agriculture and Agro-based']")
	private WebElement agricultureandAgrobased_dd;
	
	@FindBy(xpath = "//li[@data-value='Automotive']")
	private WebElement automotive_dd;
	
	@FindBy(xpath = "//li[@data-value='Banking and Financial Services']")
	private WebElement bankingandFinancialServices_dd;
	
	@FindBy(xpath = "//li[@data-value='Chemical']")
	private WebElement chemical_dd;
	
	@FindBy(xpath = "//li[@data-value='Education and Training']")
	private WebElement educationandTraining_dd;
	
	@FindBy(xpath = "//li[@data-value='Energy']")
	private WebElement energy_dd;
	
	@FindBy(xpath = "//li[@data-value='Food and Beverage']")
	private WebElement foodandBeverage_dd;
	
	@FindBy(xpath = "//li[@data-value='Healthcare']")
	private WebElement healthcare_dd;
	
	@FindBy(xpath = "//li[@data-value='Hospitality and Tourism']")
	private WebElement hospitalityandTourism_dd;
	
	@FindBy(xpath = "//li[@data-value='Information Technology (IT)']")
	private WebElement informationTechnologyIT_dd;
	
	@FindBy(xpath = "//li[@data-value='Logistics and Transportation']")
	private WebElement logisticsandTransportation_dd;
	
	@FindBy(xpath = "//li[@data-value='Manufacturing']")
	private WebElement manufacturing_dd;
	
	@FindBy(xpath = "//li[@data-value='Media and Entertainment']")
	private WebElement mediaandEntertainment_dd;
	
	@FindBy(xpath = "//li[@data-value='Mining and Minerals']")
	private WebElement miningandMinerals_dd;
	
	@FindBy(xpath = "//li[@data-value='Pharmaceuticals']")
	private WebElement pharmaceuticals_dd;
	
	@FindBy(xpath = "//li[@data-value='Real Estate and Construction']")
	private WebElement realEstateandConstruction_dd;
	
	@FindBy(xpath = "//li[@data-value='Retail']")
	private WebElement retail_dd;
	
	@FindBy(xpath = "//li[@data-value='Telecommunications']")
	private WebElement telecommunications_dd;
	
	@FindBy(xpath = "//li[@data-value='Textile']")
	private WebElement textile_dd;
	
//number of the employees
	
/*	@FindBy(xpath = "//li[@data-value='1-50']")
	private WebElement _dd;
	
	@FindBy(xpath = "//li[@data-value='51-100']")
	private WebElement _dd;
	
	@FindBy(xpath = "//li[@data-value='201-500']")
	private WebElement _dd;
	
	@FindBy(xpath = "//li[@data-value='501-1000']")
	private WebElement _dd;
	
	@FindBy(xpath = "//li[@data-value='1001-Above']")
	private WebElement _dd;
	*/
	
//skills dropdwon	
	

	@FindBy(xpath = "//div[text()='Java']")
	private WebElement java_dd;
	
	@FindBy(xpath = "//div[text()='Python']")
	private WebElement python_dd;
	
	@FindBy(xpath = "//div[text()='JavaScript']")
	private WebElement javaScript_dd;
	
	@FindBy(xpath = "//div[text()='C++']")
	private WebElement cpulspuls_dd;
	
	@FindBy(xpath = "//div[text()='C#']")
	private WebElement chashtag_dd;
	
	@FindBy(xpath = "//div[text()='Ruby']")
	private WebElement ruby_dd;
	
	@FindBy(xpath = "//div[text()='PHP']")
	private WebElement php_dd;
	
	@FindBy(xpath = "//div[text()='Swift']")
	private WebElement swift_dd;
	
	@FindBy(xpath = "//div[text()='HTML5']")
	private WebElement html5_dd;
	
	@FindBy(xpath = "//div[text()='CSS3']")
	private WebElement css3_dd;
	
	@FindBy(xpath = "//div[text()='React']")
	private WebElement react_dd;
	
	@FindBy(xpath = "//div[text()='Angular']")
	private WebElement angular_dd;
	
	@FindBy(xpath = "//div[text()='Node.js']")
	private WebElement nodejs_dd;
	
	@FindBy(xpath = "//div[text()='ASP.NET']")
	private WebElement aspNET_dd;
	/*
	@FindBy(xpath = "//div[text()='PHP']")
	private WebElement _dd;
	
	@FindBy(xpath = "//div[text()='PHP']")
	private WebElement _dd;
	
	@FindBy(xpath = "//div[text()='PHP']")
	private WebElement _dd;
	
	@FindBy(xpath = "//div[text()='PHP']")
	private WebElement _dd;
	
	@FindBy(xpath = "//div[text()='PHP']")
	private WebElement _dd;
	
	@FindBy(xpath = "//div[text()='PHP']")
	private WebElement _dd;
	
	@FindBy(xpath = "//div[text()='PHP']")
	private WebElement _dd;
	
	@FindBy(xpath = "//div[text()='PHP']")
	private WebElement _dd;
	*/
	@FindBy(xpath = "(//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-1 css-tuxzvu'])[2]")
	private WebElement muiGridrootMuiGridcontainerMuiGridspacingxs1csstuxzvu2_btn;
	
	@FindBy(xpath = "(//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-1 css-tuxzvu'])[3]")
	private WebElement muiGridrootMuiGridcontainerMuiGridspacingxs1csstuxzvu3_btn;
	
}
