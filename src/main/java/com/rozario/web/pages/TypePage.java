package com.rozario.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
// radioButton --> rb
// textbox--->tb
//textarea--->ta
//checkbox--->cb
//button-->btn 
//text --> txt
//DropDown-->dd


public class TypePage {
	public WebDriver driver;
	public TypePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	
	@FindBy(xpath = "//input[@value='Online']")
	private WebElement online_rb;
	
	@FindBy(xpath = "//h2[text()='Where would you like your appointment?']")
	private WebElement wherewouldyoulikeyourappointment_txt;
	
	@FindBy(xpath = "//input[@value='In Person']")
	private WebElement inPerson_rb;
	
	@FindBy(xpath = "//a[text()='Previous']")
	private WebElement previous_btn;
	
	@FindBy(xpath = "//a[text()='Next']")
	private WebElement next_btn;
	
	@FindBy(xpath = "//h2[text()='Please choose your country. We will show the cities where the ayurveda vaidyas are available']")
	private WebElement pleasechooseyourcountryWewillshowthecitieswheretheayurvedavaidyasareavailable_txt ;
	
	@FindBy(xpath ="//select[@placeholder='Select your country']")
	private WebElement selectyourcountry_dd;
	
	@FindBy(xpath ="//select[@placeholder='Select your City']")
	private WebElement selectyourCity_dd;
	
	//HEADER
	
	@FindBy(xpath ="(//i[@class='fab fa-facebook-f fs-13'])[1]")
	private WebElement fabfafacebookffs13_txt;
	
	@FindBy(xpath ="(//i[@class='fab fa-twitter fs-13'])[1]")
	private WebElement fabfatwitterfs13_txt;
	
	@FindBy(xpath ="(//i[@class='fab fa-youtube fs-13'])[1]")
	private WebElement fabfayoutubefs13_txt;
	
	@FindBy(xpath ="(//i[@class='fab fa-instagram fs-13'])[1]")
	private WebElement fabfainstagramfs13_txt;
	
	@FindBy(xpath ="//select[@name='lang_id']")
	private WebElement langid_dd;
	
	@FindBy(xpath ="//span[text()=' Book Now']")
	private WebElement bookNow_txt;
	
	@FindBy(id ="[id='cart-count']")
	private WebElement cartcount_txt;
	
	@FindBy(xpath="//a[text()=' Sign Up']")
	private WebElement signUp_txt;
	
	@FindBy(xpath="//a[text()=' Sign In']")
	private WebElement signIn_txt;
	
	
	//Footer

	@FindBy(xpath="//h3[text()='About Service']")
	private WebElement aboutService_txt;
	
	@FindBy(xpath="//h3[text()='Website Navigation Links']")
	private WebElement websiteNavigationLinks_txt;
	
	@FindBy(xpath="//a[text()='Home']")
	private WebElement home_txt;
	
	@FindBy(xpath="//a[text()='Our Team']")
	private WebElement ourTeam_txt;
	
	@FindBy(xpath="//a[text()='Photo Gallery']")
	private WebElement photoGallery_txt;
	
	@FindBy(xpath="//a[text()='FAQ']")
	private WebElement fqa_txt;
	
	@FindBy(xpath="//a[text()='Vouchers']")
	private WebElement vouchers_txt;
	
	@FindBy(xpath="About Us")
	private WebElement aboutUs;
	
	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement contactUs_txt;
	
	@FindBy(xpath="//a[text()='Terms & Conditions']")
	private WebElement termsConditions_txt;
	
	@FindBy(xpath="//h3[text()='Contact Information']")
	private WebElement contactInformation_txt;
	
	@FindBy(linkText="Phone : +67 0112 11111")
	private WebElement phone_txt;
	
	@FindBy(linkText="Email to : demo@example.com")
	private WebElement emailto_txt;
	
	@FindBy(linkText ="Website : www.example.com")
	private WebElement website;
	
	@FindBy(linkText ="Address : Example address")
	private WebElement address;
	
	@FindBy(xpath="//h3[text()='Payment Method']")
	private WebElement paymentMethod_txt;
	
	@FindBy(xpath="(//i[@class='fab fa-instagram fs-13'])[2]")
	private WebElement fabfainstagramfs13_txt1;
	
	@FindBy(xpath ="(//i[@class='fab fa-twitter fs-13'])[1]")
	private WebElement fabfatwitterfs13_txt1;
	
	@FindBy(xpath ="(//i[@class='fab fa-youtube fs-13'])[1]")
	private WebElement fabfayoutubefs13_txt1;
	
	@FindBy(xpath ="(//i[@class='fab fa-facebook-f fs-13'])[1]")
	private WebElement fabfafacebookffs13_txt1;	

	
		
}
