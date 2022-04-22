package herokuapp.assignment.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import herokuapp.assignment.Business.Business;
import herokuapp.assignment.config.PropertyFile;
import herokuapp.assignment.demo.Base;

public class AcceptanceTests {
	
	private WebDriver driver;
	
	private void launghWebBrowser(String url) {
		Base base = new Base();
		driver =  base.getDriver();	
		PropertyFile data = new  PropertyFile();
		data.readPropertiesFile();
		String baseURL = data.getPropertyValue(url);
		driver.get(baseURL);
		driver.manage().window().maximize();
	}
	

	@Test(priority = 0)
	public void verifyLoginFailure(){
	launghWebBrowser("loginURL");
	
	Business business =PageFactory.initElements(driver,Business.class);
	business.loginFailure();		
    Assert.assertEquals(business.getErrorMessage().getText().replace("\n"+"×", ""), "Your username is invalid!");
	
	}

	@Test(priority = 1)
	public void verifyLoginSuccess(){
	Business business =PageFactory.initElements(driver,Business.class);
	business.LoginSuccess();		
	Assert.assertEquals(business.getSecureAreaMessage().getText().replace("\n"+"×", ""), "You logged into a secure area!");
	driver.close();
	}
   
	
	
	@Test(priority = 2)
	public void VerifyJSConfirm(){
	launghWebBrowser("javaScriptAlertsURL");	
	
	Business business =PageFactory.initElements(driver,Business.class);
	business.AlertJSConfirm();		
	driver.switchTo().alert().accept();
	Assert.assertEquals(business.getresultsOKMessage().getText().replace("\n"+"×", ""), "You clicked: Ok");
	}
	
	@Test(priority = 3)
	public void VerifyjsPromptText(){
	Business business =PageFactory.initElements(driver,Business.class);
	business.jsPrompt();
	driver.switchTo().alert().sendKeys("Test JS Prompt");
	driver.switchTo().alert().dismiss();
	Assert.assertEquals(business.getresultsOKMessage().getText(),"You entered: null");
	driver.close();
	}
	
	
	
	@Test(priority = 6)
	public void launchWebBrowserForImageUploadURL () throws InterruptedException{
		launghWebBrowser("uploadURL");
	
	Business business =PageFactory.initElements(driver,Business.class);
	business.fileUpload();	
	Assert.assertEquals(business.getuploadPhotoMessage().getText().replace("\n"+"burrito.jpg", ""), "File Uploaded!");
	Assert.assertEquals(business.getPhotoName().getText(),"burrito.jpg");
	
	Thread.sleep(1000);
	driver.close();
		}

	
	
	@Test(priority = 7)
	public void iframeAccesses() {
		launghWebBrowser("iframeURL");
		
		
		driver.switchTo().frame(0);
		Business business =PageFactory.initElements(driver,Business.class);
		business.iframeAccessing();	
		Assert.assertEquals(business.getiframe().getText(),"I love Pizza");
		driver.close();
	}
	
	
}
