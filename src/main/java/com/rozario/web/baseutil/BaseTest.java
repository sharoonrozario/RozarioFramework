package com.rozario.web.baseutil;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.rozario.web.fileoperation.DataExtraction;
import com.rozario.web.webaction.CommonAction;
import com.rozario.webofferGhosting.pages.SignInPage;

public class BaseTest {
	public static WebDriver driver;
	public static final int ETO = 30;
	public static final int ITO = 15;
	public static CreateDriver cd;
	public static WebDriverWait explicitWait;
	public static InitializePage pages;
	public static Actions action;
	public static DataExtraction propertyFile;
	public static CommonAction commonAction;
	
	
	@BeforeClass
	public void LaunchBrowser() throws FileNotFoundException, IOException {
		cd.launchBrowser();
		createObjects();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ITO));
	}
	
	@AfterSuite
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
	
	private void createObjects() {
		cd = new CreateDriver();
		driver = cd.getDriver();
		explicitWait = new WebDriverWait(driver, Duration.ofSeconds(ETO));
		pages = new InitializePage(driver, ETO);
		action = new Actions(driver);
		propertyFile = new DataExtraction();
		commonAction = new CommonAction(driver, action);
	}
	
	/*
	@Test
	public void run1() throws Exception{
		try {
		driver = new FirefoxDriver();
		cd = new CreateDriver();
		explicitWait = new WebDriverWait(driver, Duration.ofSeconds(ETO));
		pages = new InitializePage(driver, ETO);
		action = new Actions(driver);
		propertyFile = new DataExtraction();
		driver.get(propertyFile.getDataFromProperties("URL"));
		driver.manage().window().maximize();
		commonAction = new CommonAction(driver);
		
		
		//Scripting 
		commonAction.click(pages.signInPage.getEmail_btn());
		commonAction.inputValue(pages.signUpPage.getEnterYourName_tb(), "Sharoon");
		commonAction.click(pages.signUpPage.getContinueButton_btn());
		commonAction.inputValue(pages.signUpPage.getEnterYourName_tb(),"sharoon.rozario@allen.in");
		
		
		Thread.sleep(5000);
		}
		finally {
			driver.close();
			driver.quit();
		}
		
	}
	*/
}
