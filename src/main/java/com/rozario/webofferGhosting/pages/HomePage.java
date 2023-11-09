package com.rozario.webofferGhosting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	public int ETO;
	public HomePage(WebDriver driver , int ETO) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.ETO = ETO;
	}
	
	@FindBy(xpath = "//p[text()='Report Ghosting']")
	private WebElement reportGhosting_btn;
	public WebElement getReportGhosting_btn() {
		return reportGhosting_btn;
	}
	
}
