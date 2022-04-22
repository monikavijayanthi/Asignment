package herokuapp.assignment.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver=null;
		public WebDriver getDriver() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mvijayanthi\\OneDrive - Infor\\Documents\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		
	
			return driver;
	}
}
