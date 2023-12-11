package com.rozario.webofferGhosting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
public WebDriver driver;
public int ETO;
public AdminPage(WebDriver driver,int ETO) {
	PageFactory.initElements(driver, this);
	this.driver = driver;
	this.ETO = ETO;
}

@FindBy(xpath = "//p[text()='Admin']")
private WebElement admin_btn;

//Header

@FindBy(xpath = "//h3[text()='Profile']")
private WebElement profile_txt;

@FindBy(xpath = "//h3[text()='Add user']")
private WebElement adduser_txt;

@FindBy(xpath = "//h6[text()='UserList']")
private WebElement userList_txt;

//body

@FindBy(xpath = "//input[@name='username']")
private WebElement username_tb;

@FindBy(xpath = "//input[@name='email']")
private WebElement email_tb;

@FindBy(xpath = "//input[@name='phone']")
private WebElement phone_tb;

@FindBy(xpath = "//input[@name='password']")
private WebElement password_txt;

@FindBy(xpath = "//button[text()='Submit']")
private WebElement submit_btn;



}
