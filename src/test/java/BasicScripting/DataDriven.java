package BasicScripting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.rozario.web.fileoperation.DataExtraction;
import com.rozario.web.webaction.CommonAction;
import com.rozario.webofferGhosting.pages.ForgotPasswordEmailPage;
import com.rozario.webofferGhosting.pages.HomePage;
import com.rozario.webofferGhosting.pages.ReportGhostingPage;
import com.rozario.webofferGhosting.pages.SignInPage;
import com.rozario.webofferGhosting.pages.SignUpPage;

public class DataDriven {
	public static WebDriver driver;
	public static WebDriverWait explicitWait;
	public static final int ETO = 15;
	public static CommonAction commonAction;
	public static Actions action;
	public static DataExtraction dataExtraction;
	public static SignUpPage signUpPage;
	public static SignInPage signInPage;
	public static ForgotPasswordEmailPage forgotPasswordEmailPage;
	public static HomePage homePage;
	public static ReportGhostingPage reportGhostingPage;
	
	
    @org.junit.Test
	public void run() throws Exception{
		try {
			//objects 
		 driver = new FirefoxDriver();
		 explicitWait = new WebDriverWait(driver,Duration.ofSeconds(ETO));
		 commonAction = new CommonAction(driver,action,explicitWait);
		 action = new Actions(driver);
		 dataExtraction = new DataExtraction();
		 signUpPage = new SignUpPage(driver, ETO);
		 signInPage = new SignInPage(driver, ETO);
		 forgotPasswordEmailPage = new ForgotPasswordEmailPage(driver, ETO);
		 homePage = new HomePage(driver, ETO);
		 reportGhostingPage = new ReportGhostingPage(driver, ETO);
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ETO));
		 driver.get(dataExtraction.getDataFromProperties("url"));//Data is driven From property 
		 commonAction.click(signInPage.getEmail_btn());
		 commonAction.inputValue(signUpPage.getEmail_tb(), "ananya@sumerudigital.com");
		 commonAction.inputValue(signUpPage.getPassword_tb(), "Abjgd##1008");
		 commonAction.click(signUpPage.getLogin_btn());
		 commonAction.click(homePage.getReportGhosting_btn());
		 commonAction.inputValue(reportGhostingPage.getEnterPanCardDetail_tb(), "BB12FF12Y");
		 commonAction.inputValue(reportGhostingPage.getCandidateName_tb(),"Ananya");
		 commonAction.inputValue(reportGhostingPage.getEnterPersonalemail_tb(), "ananya@sumerudigital.com");
		 
		 selectJobType("Internship");
		 
		}
		finally {
			driver.close();
			driver.quit();
		}
	}
    
    public void selectJobType(String name) throws Exception{
    	commonAction.click(reportGhostingPage.getTypeOfEmployment_btn());
    	Thread.sleep(2000);
    	if(name.contains("Internship")) {
    		commonAction.click(reportGhostingPage.getIntership_btn());
    		System.out.println("jjjghhkhkjhkj");
    	}
    	else if(name.contains("Contractual")) {
    		commonAction.click(reportGhostingPage.getContractual_btn());
    	}
    	else if(name.contains("Part Time")) {
    		commonAction.click(reportGhostingPage.getPartime_btn());
    	}
    	else {
    		commonAction.click(reportGhostingPage.getFullTime_btn());
    	}
    }

}
