package herokuapp.assignment.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class Locators extends Base{
	public WebDriver driver;
	public Locators (WebDriver driver){
		this.driver = driver;		
	}
	public By username = By.cssSelector("input[type='text']");
	public WebElement getUserName(){
		return driver.findElement(username);
	}
	public By password = By.cssSelector("input[type='password']");
	public WebElement getPassword(){
		return driver.findElement(password);
	}
	public By submit = By.cssSelector("button[type='submit']");
	public WebElement getSubmit(){
		return driver.findElement(submit);
	}
		
	public By errorMessage = By.cssSelector("div[class='flash error']");
	public WebElement getErrorMessage(){
		return driver.findElement(errorMessage);
		
	}
	public By secureAreaMessage = By.cssSelector("div[id='flash']");
	public WebElement getSecureAreaMessage(){
		return driver.findElement(secureAreaMessage);
		
	}
	
	public By jsOnClickConfirmButton = By.cssSelector("button[onclick='jsConfirm()']");
	public WebElement getjsOnClickConfirmButton(){
		return driver.findElement(jsOnClickConfirmButton);
		
	}
	public By resultsOK = By.cssSelector("p[id='result']");
	public WebElement getresultsOKMessage(){
		return driver.findElement(resultsOK);
	}
	

	public By ClickjsPrompt = By.cssSelector("button[onclick='jsPrompt()']");
	public WebElement getClickjsPromptButton(){
		return driver.findElement(ClickjsPrompt);
		
	}
	public By ClickjsPromptMessage = By.cssSelector("p[id='result']");
	public WebElement getClickjsPromptMessage(){
		return driver.findElement(ClickjsPromptMessage);
	}
	
	public By chooseFile = By.cssSelector("input[type='file']");
	public WebElement getChooseFileButton(){
		return driver.findElement(chooseFile);
	}
	public By uploadPhoto = By.cssSelector("input[type='submit']");
	public WebElement getClickuploadPhotoButton(){
		return driver.findElement(uploadPhoto);
	}
	
	public By uploadPhotoMessage = By.cssSelector("div[class='example']");
	public WebElement getuploadPhotoMessage(){
		return driver.findElement(uploadPhotoMessage);
	}
	
	public By PhotoName = By.cssSelector("div[id='uploaded-files']");
	public WebElement getPhotoName(){
		return driver.findElement(PhotoName);
	}
	
	public By iframe = By.cssSelector("body[id='tinymce']");
	public WebElement getiframe(){
		return driver.findElement(iframe);
	}
	
	
}
