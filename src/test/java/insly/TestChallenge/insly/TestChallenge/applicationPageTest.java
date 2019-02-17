package insly.TestChallenge.insly.TestChallenge;

import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import insly.TestChallenge.insly.TestChallenge.ScreenShot.TakeScreenShot;
import insly.TestChallenge.insly.TestChallenge.application.applicationPage;
import insly.TestChallenge.insly.TestChallenge.codeBase.Base;


@Listeners(insly.TestChallenge.insly.TestChallenge.ExtentReportListener.ExtentReportNG.class)
public class applicationPageTest extends Base
    
{
applicationPage appPage;
	
    public applicationPageTest() throws Exception
    {
    	initialisation();
    }

    @BeforeMethod
    public void setUp() throws Exception { 	
    	appPage= new applicationPage();
    	
    	
    }

    @Test(priority=1)
	public void signUpStartUsingMethodTest() throws InterruptedException {
    	
    	boolean flag = appPage.signUpStarUsingtMethod();
	Assert.assertEquals(flag,true);	
	log.info("code came to signUpStartUsingMethodTest");
	}
    
    @Test(priority=2)
    public void companyFillingMethodTest() throws InterruptedException {
    	log.info("code came to companyFillingMethodTest");
    String result=appPage.companyFillingMethod();
    Assert.assertEquals(result, "Done");
     	
     }
    
    @Test(priority=3)
    public void adminAccntDetailMethodTest() throws InterruptedException {
    	log.info("code came to adminAccntDetailMethodTest");
    String result=appPage.adminAcctDetMethod();
    Assert.assertEquals(result, "Done");
     	
     }
    
    @Test(priority=4)
    public void termConditionMethodTest() throws InterruptedException {
    	log.info("code came to termConditionMethodTest");
    	String result=appPage.termConditionMethod();
    	Assert.assertEquals(result, "Done");
     	
     }
    
    @Test(priority=5)
    public void dashoboardloadinMethodTest() throws InterruptedException {
    	log.info("code came to dashoboardloadinMethodTest");
    	String result=appPage.dashBoardLoadwaitMethod();
    	Assert.assertEquals(result, "Done");
     	
     }
    
    @Test(priority=6)
    public void dashoboardMethodTest() throws InterruptedException {
    	log.info("code came to dashoboardMethodTest");
    String result=appPage.dasBoardiFrameMethod();
    	Assert.assertEquals(result, "Done");
     	
     }
    
    @Test(priority=7)
    public void checkUrlDahMethodTest() throws InterruptedException {
    	log.info("code came to checkUrlDahMethodTest");
    	boolean dashflag=appPage.checkUrlDashMethod();
    Assert.assertEquals(dashflag, true);
     	
     }
    
    @Test(priority=8)
    public void checkUrlMethodTest() throws InterruptedException, URISyntaxException {
    	log.info("code came to checkUrlMethodTest"); 
    	String urlflag= appPage.checkURLMethod();
     Assert.assertEquals(urlflag,prop.getProperty("company_name").toLowerCase()+prop.getProperty("insly_addr")+".insly.com");
     System.out.println("Value of urlflag:"+urlflag);;
     	
     }
    
    @AfterMethod
	public void tearDown(ITestResult result) {
		TakeScreenShot.captureScreenshot(driver,result.getName(),result.getStatus());
	}
    
    @AfterClass
    public void tearDownClass() {
    	driver.quit();
    }
    
}
