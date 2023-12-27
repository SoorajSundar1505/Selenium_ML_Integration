package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.initConfig;

public class loginPage extends initConfig{

	@FindBy(xpath = "//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;
	
	public loginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void loginToApp() {
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		submit.click();
	}
}
