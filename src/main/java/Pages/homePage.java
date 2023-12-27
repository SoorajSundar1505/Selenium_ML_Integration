package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.initConfig;

public class homePage extends initConfig {
	@FindBy(xpath = "//h6[text()='Dashboard']")
	private WebElement title;
	
	public homePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifyHomePage() {
		title.isDisplayed();
		System.out.println("home page verified");
	}

}
