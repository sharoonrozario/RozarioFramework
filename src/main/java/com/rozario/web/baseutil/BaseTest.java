package com.rozario.web.baseutil;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

import com.rozario.web.fileoperation.DataExtraction;
import com.rozario.webofferGhosting.pages.SignInPage;

public class BaseTest {
	public static WebDriver driver;
	public static final int ETO = 30;
	public static final int ITO = 15;
	public static CreateDriver cd;
	public static WebDriverWait explicitWait;
	
	
	@BeforeTest
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
		
	}
	
	
	
}
