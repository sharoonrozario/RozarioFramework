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
	
}
