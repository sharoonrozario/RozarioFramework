package com.rozario.web.baseutil;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.rozario.web.fileoperation.DataExtraction;

public class BaseTest {
	public static WebDriver driver;
	
	@Test
	public void run() throws FileNotFoundException, IOException {
		CreateDriver cd = new CreateDriver();
		cd.launchBrowser();
		driver = cd.getDriver();
	}
	
}
