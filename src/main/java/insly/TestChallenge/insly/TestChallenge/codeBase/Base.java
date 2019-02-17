package insly.TestChallenge.insly.TestChallenge.codeBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	public static Properties prop;
	public static Logger log= LogManager.getLogger(Base.class);
	
	
	public Base(){
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.chromedriver().setup();
		
		try {
			prop =new Properties();
			
			FileInputStream ip= new FileInputStream("./src/main/java/insly/TestChallenge/insly/TestChallenge/properties/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public static void initialisation() throws Exception {
		
		
		String browserName=  prop.getProperty("browser");
		if(browserName.equals("chrome")) {

			driver= new ChromeDriver();	
		}else if(browserName.equals("FF")) {

			driver= new FirefoxDriver();
		}
		
		
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		log.info("log is working fine and coming in base Class");
		driver.get(prop.getProperty("url"));
		
	}
	
	public void waitMethod(WebElement wb ) {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOf(wb));
	}
	
	public void waitframeswitchtMethod(WebElement wb ) {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(wb));
	}
	
	public WebElement waitElementTobeClickMethod(WebElement wb ) {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		return wait.until(ExpectedConditions.elementToBeClickable(wb));
	}
	
	public void waitUrlContainMethod(String str ) {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.urlContains(str));
	}


}
