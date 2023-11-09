package com.rozario.web.webaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class CommonAction {
	public static WebDriver driver;
	public static int ETO;
	public WebDriverWait explicitWait;
	public Actions action;

	public CommonAction(WebDriver driver, Actions action) {
		this.driver = driver;
		this.ETO = ETO;
		this.explicitWait = explicitWait;
		this.action = action;
		
	}


	/***
	 * @author : SharoonRozario
	 * @Description : Method to Perform Send Keys or send the values to the WebElements
	 * @param : Webelement 
	 */
	public void inputValue(WebElement element , String value) {
		waitAndSendKeys(element,value);
	}

	/***
	 * @author sharoonrozario
	 * @Description : waits Until The Element is displayed and then clicks
	 */
	private void waitAndSendKeys(WebElement element , String value) {
		try {
			explicitWait.until(ExpectedConditions.visibilityOf(element));
			element.click();
			element.sendKeys(value);
		}
		catch(Exception e) {
			Reporter.log("Couldnt find the Element to Send the Values",true);
		}
	}

	/***
	 * @author sharoonrozario
	 * @Description : Waits until the element is visible
	 */
	private void waitUntilVisible(WebElement element) {
		try {
			explicitWait.until(ExpectedConditions.visibilityOf(element));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/***
	 * @author sharoonrozario
	 * @Description : Wait until it is clickable
	 */
	private void waitUntilClickable(WebElement element) {
		try {
			explicitWait.until(ExpectedConditions.elementToBeClickable(element));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/***
	 * @author sharoonrozario
	 * @Description : Wait And clicks
	 */
	
	public void click(WebElement element) {
		waitUntilVisible(element);
		waitUntilClickable(element);
		element.click();
	}
	
	
	
}
