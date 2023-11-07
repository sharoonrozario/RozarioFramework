package com.rozario.web.baseutil;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.rozario.web.fileoperation.DataExtraction;

public class CreateDriver {
	private static String BROWSER_NAME = "";
	private static WebDriver driver;
	
	/*
	 * @author : SharoonRozario
	 * @Description : Launches the browser 
	 */
	public synchronized void launchBrowser() throws FileNotFoundException, IOException {
		BROWSER_NAME = new DataExtraction().getDataFromProperties("browser");
		if(BROWSER_NAME.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(BROWSER_NAME.contains("mozilla")){
			driver = new FirefoxDriver();
		}
		else if(BROWSER_NAME.equalsIgnoreCase("Safari")) {
			driver = new SafariDriver();
		}
	}
	
	public synchronized WebDriver getDriver() {
		return driver;
	}
	
	
	
}
