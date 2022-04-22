package herokuapp.assignment.Business;

import org.openqa.selenium.WebDriver;

import herokuapp.assignment.page.Locators;


public class Business extends Locators{
	public Business(WebDriver driver) {
		super(driver);		
	}
	public void loginFailure(){
		getSubmit().click();		
	}
	
	
	public void LoginSuccess(){
		getUserName().sendKeys("tomsmith");
		getPassword().sendKeys("SuperSecretPassword!");
		getSubmit().click();		
	}
	public void AlertJSConfirm(){
		getjsOnClickConfirmButton().click();
	
	}	
	
	public void jsPrompt(){
		getClickjsPromptButton().click();
	
	}
	
	public void fileUpload(){
	    getChooseFileButton().sendKeys("C:\\Users\\mvijayanthi\\OneDrive - Infor\\Desktop\\burrito.jpg");
		getClickuploadPhotoButton().click();
				
	}
	
	public void iframeAccessing(){
		getiframe().clear();
		getiframe().sendKeys("I love Pizza");
		
				
	}
	
	
	
	
	
}
