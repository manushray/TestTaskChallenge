package insly.TestChallenge.insly.TestChallenge.application;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;


import insly.TestChallenge.insly.TestChallenge.codeBase.Base;
	
	public class applicationPage extends Base{

		@FindBy(name="broker_name")
		WebElement companyname;
		
		@FindBy(name="broker_address_country")
		WebElement country;
		
		@FindBy(name="broker_tag")
		WebElement inslyaddr;
		
		@FindBy(name="prop_company_profile")
		WebElement companyProfile;
		
		@FindBy(xpath="//option[contains(@value,'SDC')]")
		WebElement companyProfiledropdownValue;
		
		@FindBy(name="prop_company_no_employees")
		WebElement noOfEmp;
		
		@FindBy(name="prop_company_person_description")
		WebElement descUrSlf;
		
		@FindBy(xpath="//td[contains(text(),'Administrator account details')]")
		WebElement adminaccntdet;
		
		@FindBy(name="broker_admin_email")
		WebElement adminemailid;
		
		@FindBy(name="broker_admin_name")
		WebElement adminaccmgrname;
		
		@FindBy(name="broker_person_password")
		WebElement accmgrpwd;
		
		@FindBy(name="broker_person_password_repeat")
		WebElement accmgrpwdrepeat;

		@FindBy(name="broker_admin_phone")
		WebElement accmgrphnnmbr;
		
		@FindBy(xpath="//a[contains(text(),'terms and conditions')]")
		WebElement termcond;
		
		@FindBy(xpath="//span[contains(@class,'icon-check-empty')]")
		WebElement chkbox;
		
		@FindBy(name="agree_privacypolicy")
		WebElement termcondpp;
		
		
		@FindBy(xpath="//a[contains(text(),'privacy policy')]")
		WebElement pripol;
		
		@FindBy(xpath="//h1[contains(text(),'Sign up and start using')]")
		WebElement signupHeader;
			
		@FindBy(xpath="//button[contains(text(),'I agree')]")
		WebElement termconditionIagree;
		
		@FindBy(css="#field_terms > td:nth-child(2) > div > div > label:nth-child(4) > span")
		WebElement chkbox2;
		
		@FindBy(css="body > div:nth-child(6) > div.ui-dialog-titlebar.ui-widget-header.ui-corner-all.ui-helper-clearfix > a > span")
		WebElement crossbtn;
		
		@FindBy(css="#document-content > h3:nth-child(40)")
		WebElement lastwbele;
		
		@FindBy(xpath="//div[contains(@id,'dialog_32877')]")
		WebElement clkinside;
		
		@FindBy(css="#field_terms > td:nth-child(2) > div > div > label:nth-child(6) > span")
		WebElement chkbox3;
		
		
		@FindBy(css="#document-content > h3:nth-child(5)")
		WebElement insidepp;
		
		@FindBy(name="submit_save")
		WebElement submitbtn;
		
		@FindBy(css="body > appcues > cue > div > div.appcues-actions-right > a")
		WebElement next1;
		
		@FindBy(xpath="//a[contains(text(),'Start using Insly')]")
		WebElement startusinginsly;
		
		@FindBy(className="image")
		WebElement iframeele;
		
		@FindBy(id="document-content")
		WebElement elepp;
		
		@FindBy(xpath="//div[@id='document-content']/*[last()]")
		WebElement pripolilastele;
		
		@FindBy(css="body > div.appcues > appcues-container > iframe")
		WebElement iframewebele;
	
			//Initializing the Page Object 
			public applicationPage() {
				PageFactory.initElements(driver, this);//this is pointing to current class object
			
		}
			
			public boolean signUpStarUsingtMethod() throws InterruptedException {
				
				waitMethod(signupHeader);
				return (signupHeader.isDisplayed());
		}
			
			public String companyFillingMethod() throws InterruptedException {
				
				companyname.sendKeys(prop.getProperty("company_name"));
				country.click();
				drpdwnclkmethod(country,prop.getProperty("country_name"));
				inslyaddr.clear();
				inslyaddr.sendKeys(prop.getProperty("insly_addr"));
				companyProfile.click();
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				companyProfiledropdownValue.click();
				noOfEmp.click();
				drpdwnclkmethod(noOfEmp,prop.getProperty("no_of_emp"));
				drpdwnclkmethod(descUrSlf,prop.getProperty("desc_urself"));
				return ("Done");
				
		}	

			public String adminAcctDetMethod() throws InterruptedException {
			
				JavascriptExecutor js = ((JavascriptExecutor) driver);
				js.executeScript("arguments[0].scrollIntoView(true);",adminaccntdet);
				adminemailid.sendKeys(prop.getProperty("admin_mail_id"));
				adminaccmgrname.sendKeys(prop.getProperty("admin_mgr_name"));
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

				accmgrpwd.sendKeys(prop.getProperty("admin_pwd"));
				accmgrpwdrepeat.sendKeys(prop.getProperty("admin_pwd_re"));
				accmgrphnnmbr.sendKeys(prop.getProperty("admin_phn"));
				return ("Done");
			}
			
			public String termConditionMethod() {
			
				termcond.click();
				driver.switchTo().defaultContent();
				WebElement tc=waitElementTobeClickMethod(termconditionIagree);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				tc.click(); 
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				chkbox.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				pripol.click();
				driver.switchTo().defaultContent();				
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				waitMethod(elepp);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", pripolilastele);
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				crossbtn.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				chkbox2.click();
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				chkbox3.click();
				submitbtn.click();
				return ("Done");
			}
			
			public String dashBoardLoadwaitMethod() {
				waitUrlContainMethod(prop.getProperty("url_contains"));
				return ("Done");
			}
			
			public String dasBoardiFrameMethod() {
				
				waitframeswitchtMethod(iframewebele);
				WebElement divsec = driver.findElement(By.tagName("appcues"));
				divsec.click();
				next1.click();
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				next1.click();
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				next1.click();
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				next1.click();
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				startusinginsly.click();
				return ("Done");
			}
			
			
			public boolean checkUrlDashMethod() {
				
				String url = driver.getCurrentUrl();
				 boolean flagdashboard = url.toLowerCase().contains("/dashboard");
				return flagdashboard;
			}
			
			public String checkURLMethod() throws URISyntaxException {
				
				String url=driver.getCurrentUrl();
				URI uri=new URI(url);
				String hostname=uri.getHost();
				System.out.println("Hostname is:"+hostname);
				return hostname;
			}
			
			public void drpdwnclkmethod(WebElement wb,String val) {
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				Select drpdwn=new Select(wb);
				drpdwn.selectByValue(val);
				
			}
			

	}
