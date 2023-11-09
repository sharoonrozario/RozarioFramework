package BasicScripting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.rozario.web.fileoperation.DataExtraction;
import com.rozario.web.webaction.CommonAction;

public class DataDriven {
	public static WebDriver driver;
	public static WebDriverWait explicitWait;
	public static final int ETO = 15;
	public static CommonAction commonAction;
	public static Actions action;
	public static DataExtraction dataExtraction;
	
	
    @org.junit.Test
	public void run() throws Exception{
		try {
			//objects 
		 driver = new ChromeDriver();
		 explicitWait = new WebDriverWait(driver,Duration.ofSeconds(ETO));
		 commonAction = new CommonAction(driver,action);
		 action = new Actions(driver);
		 dataExtraction = new DataExtraction();
		 
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ETO));
		 driver.get(dataExtraction.getDataFromProperties("url"));
		 
		}
		finally {
			driver.close();
			driver.quit();
		}
	}

}
